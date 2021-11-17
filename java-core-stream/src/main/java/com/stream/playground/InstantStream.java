package com.stream.playground;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;

public class InstantStream {

    public Instant getLastTime(List<Instant> instants) {
        return instants
                .stream()
                .max(Instant::compareTo)
                .get();
    }

    public Instant getFirstTime(List<Instant> instants) {
        return instants
                .stream()
                .min(Instant::compareTo)
                .get();
    }
}
