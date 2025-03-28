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
        products.add(product);
    }

    @Override
    public long countProductsQuantity() {
        long totalAmount = 0L;
        for (Product product : products ){
            totalAmount+= product.getTotalQuantity();
        }
        return totalAmount;
    }
}
