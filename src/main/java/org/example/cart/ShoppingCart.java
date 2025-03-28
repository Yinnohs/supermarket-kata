package org.example.cart;

import org.example.product.Product;


public interface ShoppingCart {
    Product getLastProductInCart();
    void addProduct(Product product);
    long countProductsQuantity();
}
