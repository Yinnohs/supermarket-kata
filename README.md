# Kata01: Supermarket Pricing

## Overview

This kata explores different pricing models used in supermarkets. While some products have simple pricing (e.g., a can of beans costs **$0.65**), others involve complex rules:

- **Three for a dollar** – What happens if you buy 4 or 5?
- **$1.99 per pound** – How much does 4 ounces cost?
- **Buy two, get one free** – Does the third item have a price?

this kata usually does not involve code but the idea is give it a try with TDD - DDD (in case you know how to do it)

## Key Considerations

When designing a pricing model, think about:

- **Does fractional money exist?** Should prices allow fractions of a cent?
- **When does rounding take place?** At the item level or after totaling the cart?
- **Audit Trail:** Should pricing decisions be recorded for future reference?
- **Are costs and prices the same?** Or should they be treated as separate entities?
- **Stock Valuation:** If a shelf of 100 cans is priced as "buy two, get one free," how should the total value be calculated?

These challenges may seem simple at first but can become complex when handling real-world scenarios.

## Goal

The goal of this kata is to practice **flexible, experimental modeling**. Try different approaches to handling pricing and compare their trade-offs. Consider:

- How do different models handle edge cases?
- What methods are best for documenting pricing rules?
- How can a pricing model be validated?

### How to Approach a Code Kata

- Work in an uninterrupted environment.
- Focus on core concepts without overcomplicating.
- Reflect on your decisions and adjust as needed.
- Keep notes to track progress and insights.
- Discuss with others after completing the exercise.

There are **no right or wrong answers** in this kata. The value comes from the **process of exploration** rather than a final solution.