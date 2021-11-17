package com.stream.playground;

import com.stream.model.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductStream {

    public BigDecimal calculateSumOfValues(List<Product> products) {
        return products
                .stream()
                .map(Product::getValue)
                .reduce(BigDecimal.ZERO, (totalValue, accumulator) -> totalValue.add(accumulator));
    }
}
