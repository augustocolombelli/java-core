package com.stream.playground;

import com.stream.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductStreamTest {

    @Test
    public void shouldSumValuesOfProductList(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1l, BigDecimal.valueOf(45)));
        products.add(new Product(2l, BigDecimal.valueOf(12)));
        products.add(new Product(3l, BigDecimal.valueOf(4)));

        BigDecimal result = new ProductStream().calculateSumOfValues(products);

        Assertions.assertEquals(61, result.longValue());
    }

}
