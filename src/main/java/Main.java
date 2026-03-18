package com.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Language selection
        System.out.println("Select language: 1-English, 2-Finnish, 3-Swedish");
        int choice = scanner.nextInt();

        Locale locale;
        switch (choice) {
            case 2:
                locale = new Locale("fi", "FI");
                break;
            case 3:
                locale = new Locale("sv", "SE");
                break;
            default:
                locale = new Locale("en", "US");
        }

        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);

        System.out.println(messages.getString("enter.items"));
        int n = scanner.nextInt();

        double[] prices = new double[n];
        int[] quantities = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println(messages.getString("enter.price"));
            prices[i] = scanner.nextDouble();

            System.out.println(messages.getString("enter.quantity"));
            quantities[i] = scanner.nextInt();
        }

        ShoppingCart cart = new ShoppingCart();
        double total = cart.calculateCartTotal(prices, quantities);

        System.out.println(messages.getString("total.cost") + total);
    }
}