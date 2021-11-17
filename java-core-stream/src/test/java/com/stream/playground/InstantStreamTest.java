package com.stream.playground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class InstantStreamTest {

    @Test
    public void shouldReturnLastInstantOfList(){
        Instant firstTime = Instant.parse("2021-12-20T10:15:30.00Z");
        Instant otherTime = Instant.parse("2021-12-20T12:15:30.00Z");
        Instant otherTime2 = Instant.parse("2021-12-20T13:15:30.00Z");
        Instant lastTime = Instant.parse("2021-12-20T16:15:30.00Z");

        List<Instant> instants = new ArrayList<>();
        instants.add(otherTime);
        instants.add(otherTime2);
        instants.add(lastTime);
        instants.add(firstTime);

        Instant elapsedTimeInHour = new InstantStream().getLastTime(instants);

        Assertions.assertEquals(lastTime, elapsedTimeInHour);
    }

    @Test
    public void shouldReturnFirstTime(){
        Instant firstTime = Instant.parse("2021-12-20T10:15:30.00Z");
        Instant otherTime = Instant.parse("2021-12-20T12:15:30.00Z");
        Instant otherTime2 = Instant.parse("2021-12-20T13:15:30.00Z");
        Instant lastTime = Instant.parse("2021-12-20T16:15:30.00Z");

        List<Instant> instants = new ArrayList<>();
        instants.add(otherTime);
        instants.add(otherTime2);
        instants.add(lastTime);
        instants.add(firstTime);

        Instant elapsedTimeInHour = new InstantStream().getFirstTime(instants);

        Assertions.assertEquals(firstTime, elapsedTimeInHour);
    }
}
