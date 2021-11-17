package com.playground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;

public class IntervalPlaygroundTest {

    @Test
    public void shouldReturnPreviousDay(){
        Clock clock = Clock.fixed(Instant.parse("2020-02-20T10:00:00Z"), ZoneOffset.UTC);

        IntervalPlayground interval = IntervalPlayground.previousDay(clock);

        Assertions.assertEquals(Instant.parse("2020-02-19T10:00:00Z"), interval.getStart());
        Assertions.assertEquals(Instant.parse("2020-02-20T10:00:00Z"), interval.getEnd());
    }

    @Test
    public void shouldReturnPreviousSevenDays(){
        Clock clock = Clock.fixed(Instant.parse("2020-02-20T10:00:00Z"), ZoneOffset.UTC);

        IntervalPlayground interval = IntervalPlayground.lastSevenDays(clock);

        Assertions.assertEquals(Instant.parse("2020-02-13T10:00:00Z"), interval.getStart());
        Assertions.assertEquals(Instant.parse("2020-02-20T10:00:00Z"), interval.getEnd());
    }

    @Test
    public void shouldReturnPreviousWeek(){
        Clock clock = Clock.fixed(Instant.parse("2021-11-17T10:00:00Z"), ZoneOffset.UTC);

        IntervalPlayground interval = IntervalPlayground.previousWeek(clock);

        Assertions.assertEquals(Instant.parse("2021-11-07T00:00:00Z"), interval.getStart());
        Assertions.assertEquals(Instant.parse("2021-11-14T00:00:00Z"), interval.getEnd());
    }


}
