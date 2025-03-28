package org.example.product;

import java.math.BigDecimal;

public interface Product {
    BigDecimal calculatePrice();
    long getTotalQuantity();
}
