package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    void testItemTotalNormal() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(20.0, cart.calculateItemTotal(10, 2));
    }

    @Test
    void testItemTotalZero() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.calculateItemTotal(10, 0));
    }

    @Test
    void testCartTotalMultipleItems() {
        ShoppingCart cart = new ShoppingCart();

        double[] prices = {10, 5, 2};
        int[] quantities = {2, 3, 5};

        assertEquals(10*2 + 5*3 + 2*5,
                cart.calculateCartTotal(prices, quantities));
    }

    @Test
    void testCartTotalEmpty() {
        ShoppingCart cart = new ShoppingCart();

        double[] prices = {};
        int[] quantities = {};

        assertEquals(0.0, cart.calculateCartTotal(prices, quantities));
    }
}