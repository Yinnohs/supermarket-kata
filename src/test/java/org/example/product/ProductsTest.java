package org.example.product;

import org.junit.Test;
import org.junit.Assert;

import java.math.BigDecimal;

public class ProductsTest {
    @Test
    public void should_return_correct_amount_from_calculating_total_price_of_one_normal_product(){
        //given
        Product normalProduct = new NormalProduct("Mantequilla de mani 100%",5L, BigDecimal.valueOf(5L));
        BigDecimal expectedPrice = BigDecimal.valueOf(25);
        //when

        BigDecimal result = normalProduct.calculatePrice();
        //then

        Assert.assertEquals(expectedPrice, result);
    }
}
