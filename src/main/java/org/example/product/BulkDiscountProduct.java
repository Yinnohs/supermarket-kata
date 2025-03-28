package org.example.product;

import java.math.BigDecimal;

public class BulkDiscountProduct implements Product {
    String productName;
    Long quantity;
    BigDecimal price;
    int discount;

    public BulkDiscountProduct(String productName, Long quantity, BigDecimal price, int discount) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public BigDecimal calculatePrice() {
        return null;
    }
}
