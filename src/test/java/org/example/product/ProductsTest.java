package org.example.product;

import org.junit.Test;
import org.junit.Assert;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

    @Test
    public void should_return_correct_amount_from_weight_calculation_product(){
        //given
        Product weightedProduct = new WeightedProduct(
                "manzanas",  BigDecimal.valueOf(0.4),BigDecimal.valueOf(2.5)
        );
        BigDecimal expectedPriceCalculated = BigDecimal.valueOf(1.00).setScale(2, RoundingMode.UNNECESSARY);

        //when
        BigDecimal result = weightedProduct.calculatePrice();

        //then
        Assert.assertEquals(expectedPriceCalculated, result);
    }

    // where  here assuming that when you take the 2 for 1 only apply once per purchases
    @Test
    public void should_return_correct_amount_from_bulk_discount_price_calculation(){
        //given
        Product bulkDiscountProduct = new BulkDiscountProduct(
                "manzanas", 6L ,BigDecimal.valueOf(2.5), 4
        );
        BigDecimal expectedPriceCalculated = BigDecimal.valueOf(7.50)
                .setScale(2, RoundingMode.UNNECESSARY);

        //when
        BigDecimal result = bulkDiscountProduct.calculatePrice();

        //then
        Assert.assertEquals(expectedPriceCalculated, result);
    }
}
