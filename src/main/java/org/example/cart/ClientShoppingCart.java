package org.example.cart;

import org.example.product.Product;

import java.util.Stack;

public class ClientShoppingCart implements ShoppingCart {
    private final Stack<Product> products = new Stack<>();

    @Override
    public Product getLastProductInCart() {
        return null;
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public long countProductsQuantity() {
        return 0;
    }
}
