package com.playground;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class IntervalDate {

    private final static int SECONDS_IN_A_DAY = 86400; // 60 seconds * 60 minutes * 24 hours
    private final static int SECONDS_IN_A_WEEK = SECONDS_IN_A_DAY * 7;

    private final Instant end;
    private final Instant start;

    public IntervalDate(Instant start, Instant end){
        this.start = start;
        this.end = end;
    }

    public Instant getStart(){
        return this.start;
    }

    public Instant getEnd(){
        return this.end;
    }

    public static IntervalDate previousDay(Clock clock) {
        Instant start = instantMinusSeconds(clock, SECONDS_IN_A_DAY);
        Instant end = Instant.now(clock);
        return new IntervalDate(start, end);
    }

    public static IntervalDate lastSevenDays(Clock clock){
        Instant start = instantMinusSeconds(clock, SECONDS_IN_A_WEEK);
        Instant end = Instant.now(clock);
        return new IntervalDate(start, end);
    }

    public static IntervalDate previousWeek(Clock clock) {
        Instant endSunday = clock.instant().truncatedTo(ChronoUnit.DAYS);

        while (!DayOfWeek.from(endSunday.atZone(ZoneOffset.UTC)).equals(DayOfWeek.SUNDAY)){
            endSunday = endSunday.minusSeconds(SECONDS_IN_A_DAY);
        }

        Instant start = endSunday.minusSeconds(SECONDS_IN_A_WEEK);
        return new IntervalDate(start, endSunday);
    }

    private static Instant instantMinusSeconds(Clock clock, int seconds){
        return Instant.now(clock).minusSeconds(seconds);
    }
}
