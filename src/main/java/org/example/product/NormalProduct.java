package org.example.product;

import java.math.BigDecimal;

public class NormalProduct implements Product {
    String productName;
    Long quantity;
    BigDecimal price;


    public NormalProduct(String productName, Long quantity, BigDecimal price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
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

    @Override
    public BigDecimal calculatePrice() {
        BigDecimal quantityInBigDecimal = BigDecimal.valueOf(quantity);
        return price.multiply(quantityInBigDecimal);
    }

    @Override
    public long getTotalQuantity() {
        return this.getQuantity();
    }
}
