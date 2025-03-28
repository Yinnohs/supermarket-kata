# Kata01: Supermarket Pricing (Coding Kata - Java)

## Overview

This kata is about implementing a supermarket pricing system in **Java** that can handle various pricing rules. Some products have simple pricing (e.g., a can of beans costs **$0.65**), while others involve complex pricing models:

- **Three for a dollar** – What happens if you buy 4 or 5?
- **$1.99 per pound** – How much does 4 ounces cost?
- **Buy two, get one free** – Does the third item have a price?

Your task is to write Java code that can process these pricing rules and compute the correct total cost for a customer's purchase.

## Rules

1. **Basic Pricing**: Each item has a base unit price.
2. **Bulk Discounts**: Some items have special pricing when bought in bulk (e.g., "3 for $1").
3. **Weight-Based Pricing**: Some items are priced per pound or kilogram.
4. **Promotions**: Offers like "Buy 2, Get 1 Free" need to be handled correctly.
5. **Rounding**: Prices should be rounded to two decimal places.

## Expected Functionality

Implement a `Supermarket` class in Java that supports the following operations:
(These are examples not the final result expected)
### 1. Add Products and Pricing
```java
Supermarket supermarket = new Supermarket();
supermarket.addProduct("beans", 0.65);
supermarket.addBulkPrice("soda", 3, 1.00);
supermarket.addWeightedPrice("apples", 1.99);
supermarket.addPromotion("chips", 2, 1); // Buy 2, Get 1 Free
```

### 2. Process a Customer's Cart
```java
Cart cart = new CustomerCart();
cart.putProduct("beans", 2.0);
cart.putProduct("soda", 4.0);
cart.putProduct("apples", 0.25); // 4 ounces (1/4 lb)
cart.putProduct("chips", 3.0);

double total = supermarket.calculateTotal(cart);
System.out.println("Total cost: " + total);
```

### 3. Edge Cases to Consider
- Buying more than the bulk discount amount.
- Weight-based products with different fractional weights.
- Rounding and floating-point accuracy.

## Goal

The goal is to **practice writing clean, maintainable, and flexible Java code** for handling various pricing models. Consider:

- How do different models handle edge cases?
- How can you ensure accuracy when working with fractional prices?
- How do you structure your code to support new pricing rules in the future?

## What is a Code Kata?

A **code kata** is a programming exercise designed to help developers improve their skills through practice. Just like **martial arts kata**, it allows you to refine techniques in a controlled environment.

### How to Approach This Kata

- Start by writing JUnit test cases for different pricing scenarios.
- Implement the simplest solution first, then refine as needed.
- Keep the code modular to allow easy addition of new pricing rules.
- Discuss your approach with others and compare solutions.

There are **many ways** to solve this kata. The key is to **experiment, learn, and iterate** on your implementation!
