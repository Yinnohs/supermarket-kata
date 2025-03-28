package org.example.product;

import java.math.BigDecimal;

public class WeightedProduct implements Product {
    String productName;
    Long quantity;
    BigDecimal price;
    BigDecimal totalWeight;

    public WeightedProduct(String productName, Long quantity, BigDecimal price, BigDecimal totalWeight) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.totalWeight = totalWeight;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
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
        return null;
    }
}
