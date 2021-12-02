package com.apitest.controller.localdatetime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class LocalDateTimeControllerTest {

    @InjectMocks
    private LocalDateTimeController controller;

    private MockMvc mockMvc;

    private final String PATH = "/api/v1/localdatetime";

    @BeforeEach
    void initEach() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void shouldReturnStatusOK() throws Exception {
        String body = "" +
                "{" +
                "   \"id\": 15," +
                "   \"localDateTime\":\"2029-05-01T23:10:01\" " +
                "}";

        mockMvc.perform(post(PATH)
                .contentType(APPLICATION_JSON_VALUE)
                .content(body))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void shouldReturnBadRequestInvalidDay() throws Exception {
        String body = "" +
                "{" +
                "   \"id\": 15," +
                "   \"localDateTime\":\"2029-05-32T23:10:01\" " +
                "}";

        mockMvc.perform(post(PATH)
                .contentType(APPLICATION_JSON_VALUE)
                .content(body))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }

    @Test
    void shouldReturnBadRequestInvalidYear() throws Exception {
        String body = "" +
                "{" +
                "   \"id\": 15," +
                "   \"localDateTime\":\"000-01-01T23:10:01\" " +
                "}";

        mockMvc.perform(post(PATH)
                .contentType(APPLICATION_JSON_VALUE)
                .content(body))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }

    @Test
    void shouldReturnBadRequestInvalidMonth() throws Exception {
        String body = "" +
                "{" +
                "   \"id\": 15," +
                "   \"localDateTime\":\"2021-13-01T23:10:01\" " +
                "}";

        mockMvc.perform(post(PATH)
                .contentType(APPLICATION_JSON_VALUE)
                .content(body))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }

    @Test
    void shouldReturnBadRequestDateAfterRange() throws Exception {
        String body = "" +
                "{" +
                "   \"id\": 15," +
                "   \"localDateTime\":\"3051-01-01T23:10:01\" " +
                "}";

        mockMvc.perform(post(PATH)
                .contentType(APPLICATION_JSON_VALUE)
                .content(body))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }

    @Test
    void shouldReturnBadRequestDateBeforeRange() throws Exception {
        String body = "" +
                "{" +
                "   \"id\": 15," +
                "   \"localDateTime\":\"1299-12-31T23:10:01\" " +
                "}";

        mockMvc.perform(post(PATH)
                .contentType(APPLICATION_JSON_VALUE)
                .content(body))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }

}
