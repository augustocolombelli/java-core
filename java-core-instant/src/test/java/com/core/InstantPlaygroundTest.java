package com.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class InstantPlaygroundTest {

    private InstantPlayground instantPlayground;

    @BeforeEach
    public void setUp(){
        instantPlayground = new InstantPlayground();
    }

    @Test
    public void shouldCalculateElapsedTimeInSeconds(){
        Instant firstTime = Instant.parse("2021-12-20T10:15:30.00Z");
        Instant lastTime = Instant.parse("2021-12-20T10:15:35.00Z");

        long elapsedTime = instantPlayground.getElapsedTimeInSeconds(firstTime, lastTime);

        Assertions.assertEquals(5, elapsedTime);
    }

    @Test
    public void shouldCalculateElapsedTimeInMinutes(){
        Instant firstTime = Instant.parse("2021-12-20T10:15:30.00Z");
        Instant lastTime = Instant.parse("2021-12-20T15:15:30.00Z");

        double elapsedTime = instantPlayground.getElapsedTimeInMinutes(firstTime, lastTime);

        Assertions.assertEquals(300d, elapsedTime);
    }

    @Test
    public void shouldCalculateElapsedTimeInHours(){
        Instant firstTime = Instant.parse("2021-12-20T10:15:30.00Z");
        Instant lastTime = Instant.parse("2021-12-20T15:15:30.00Z");

        double elapsedTimeInHour = instantPlayground.getElapsedTimeInHours(firstTime, lastTime);

        Assertions.assertEquals(5d, elapsedTimeInHour);
    }

    @Test
    public void shouldCalculateElapsedTimeInHourInListWithInstants(){
        Instant firstTime = Instant.parse("2021-12-20T10:15:30.00Z");
        Instant otherTime = Instant.parse("2021-12-20T12:15:30.00Z");
        Instant otherTime2 = Instant.parse("2021-12-20T13:15:30.00Z");
        Instant lastTime = Instant.parse("2021-12-20T16:15:30.00Z");

        List<Instant> instants = new ArrayList<>();
        instants.add(otherTime);
        instants.add(otherTime2);
        instants.add(lastTime);
        instants.add(firstTime);

        double elapsedTimeInHour = instantPlayground.getElapsedTimeInHoursInListOfInstants(instants);

        Assertions.assertEquals(6d, elapsedTimeInHour);

    }

}
