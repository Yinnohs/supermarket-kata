package org.example.product;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WeightedProduct implements Product {
    String productName;
    BigDecimal price;
    BigDecimal totalWeight;

    public WeightedProduct(String productName, BigDecimal price, BigDecimal totalWeight) {
        this.productName = productName;
        this.price = price.setScale(2, RoundingMode.UNNECESSARY);
        this.totalWeight = totalWeight.setScale(2, RoundingMode.UNNECESSARY);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }


    @Override
    public BigDecimal calculatePrice() {
        return price.multiply(totalWeight).setScale(2, RoundingMode.UNNECESSARY);
    }
}
