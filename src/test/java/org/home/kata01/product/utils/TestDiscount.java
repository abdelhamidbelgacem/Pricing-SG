package org.home.kata01.product.utils;

import org.home.kata01.product.discounts.Discount;

import javax.annotation.Nonnull;

import static org.home.kata01.product.discounts.Discount.Builder.aDiscount;

public enum TestDiscount {
    FIRST(TestAmount.FIVE, TestPrice.TEN),
    SECOND(TestAmount.ONE, TestPrice.FIVE);

    private final TestAmount amount;
    private final TestPrice  price;

    TestDiscount(@Nonnull TestAmount amount, @Nonnull TestPrice price) {
        this.amount = amount;
        this.price = price;
    }

    public @Nonnull Discount toDiscount() {
        return aDiscount().forProductAmount(amount.toInt())
                          .withPrice(price.getValue())
                          .create();
    }
}