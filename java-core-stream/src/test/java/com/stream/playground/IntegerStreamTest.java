package com.stream.playground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class IntegerStreamTest {


    @Test
    public void shouldReturnMaxValue(){
        IntegerStream filter = new IntegerStream();

        List<Integer> values = new ArrayList<>();
        values.add(123);
        values.add(908);
        values.add(1233);
        values.add(444);

        Integer result = filter.getMaxValue(values);

        Assertions.assertEquals(1233, result.intValue());
    }

    @Test
    public void shouldReturnMinValue(){
        IntegerStream filter = new IntegerStream();

        List<Integer> values = new ArrayList<>();
        values.add(123);
        values.add(2);
        values.add(1233);
        values.add(444);

        Integer result = filter.getMinValue(values);

        Assertions.assertEquals(2, result.intValue());
    }

}
