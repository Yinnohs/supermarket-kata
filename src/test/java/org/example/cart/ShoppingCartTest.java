package org.example.cart;

import org.example.product.BulkDiscountProduct;
import org.example.product.NormalProduct;
import org.example.product.Product;
import org.example.product.WeightedProduct;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart = new ClientShoppingCart();

    @Before
    public void setup(){
        Product normalProduct = new NormalProduct("Mantequilla de mani 100%",5L, BigDecimal.valueOf(5L));
        Product weightedProduct = new WeightedProduct(
                "manzanas",  BigDecimal.valueOf(0.4),BigDecimal.valueOf(2.5)
        );
        Product bulkDiscountProduct = new BulkDiscountProduct(
                "manzanas", 6L ,BigDecimal.valueOf(2.5), 4
        );
        shoppingCart.addProduct(normalProduct);
        shoppingCart.addProduct(weightedProduct);
        shoppingCart.addProduct(bulkDiscountProduct);
    }

    @Test
    public void should_calculate_total_amount_of_products_in_the_shopping_cart(){
        //given
        long expectedResult = 12;

        //when
        long result = shoppingCart.countProductsQuantity();

        //then
        Assert.assertEquals(expectedResult, result);
    }
}
