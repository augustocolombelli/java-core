package com.core;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class InstantPlayground {

    public long getElapsedTimeInSeconds(Instant firstTime, Instant lastTime) {
        return Duration.between(firstTime, lastTime).getSeconds();
    }

    public double getElapsedTimeInMinutes(Instant firstTime, Instant lastTime) {
        return getElapsedTimeInSeconds(firstTime, lastTime) / 60.0;
    }

    public double getElapsedTimeInHours(Instant firstTime, Instant lastTime) {
        return getElapsedTimeInSeconds(firstTime, lastTime) / 3600.0;
    }

    public double getElapsedTimeInHoursInListOfInstants(List<Instant> instants) {
        Instant firstTime = instants.stream().min(Instant::compareTo).get();
        Instant lastTime = instants.stream().max(Instant::compareTo).get();

        return getElapsedTimeInHours(firstTime, lastTime);
    }

}
