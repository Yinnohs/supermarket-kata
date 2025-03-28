package org.example.product;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BulkDiscountProduct implements Product {
    String productName;
    Long quantity;
    BigDecimal price;
    int quantityFree;

    public BulkDiscountProduct(String productName, Long quantity, BigDecimal price, int discount) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price.setScale(2, RoundingMode.UNNECESSARY);
        this.quantityFree = discount;
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
        return price.setScale(2, RoundingMode.UNNECESSARY);
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantityFree() {
        return quantityFree;
    }

    public void setQuantityFree(int quantityFree) {
        this.quantityFree = quantityFree;
    }

    @Override
    public BigDecimal calculatePrice() {
        long finalQuantity = quantity;
        if (quantity >= quantityFree){
            finalQuantity = quantity - (quantityFree - 1);
        }

        BigDecimal multiplyQuantity = BigDecimal.valueOf(finalQuantity);
        return price.multiply(multiplyQuantity).setScale(2, RoundingMode.UNNECESSARY);
    }
}
