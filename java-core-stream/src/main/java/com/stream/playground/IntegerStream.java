package com.stream.playground;

import java.util.List;

public class IntegerStream {

    public Integer getMaxValue(List<Integer> values) {
        return values
                .stream()
                .max(Integer::compareTo)
                .get();
    }

    public Integer getMinValue(List<Integer> values){
        return values
                .stream()
                .min(Integer::compareTo)
                .get();
    }
}
