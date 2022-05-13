package com.javafeature.lambda.exercises;


import java.util.List;
import java.util.stream.Collectors;

public class Main {



    public static void main(String[] args) {

        var orders = Testdaten.getOrders();
        var allProducts = Testdaten.getAllProducts();
        var sportsProducts = Testdaten.getSportsProducts();
        var electronicsProducts = Testdaten.getElectronicsProducts();


        List<Product> productResult = allProducts.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("electronics") && product.getPrice() > 100)
                .collect(Collectors.toList());
        for (Product product : productResult) {
            System.out.println(product);
        }

        List<Order> orderResult = orders.stream()
                .filter(order -> order.getProducts()
                        .stream()
                        .anyMatch(product -> product.getCategory().equalsIgnoreCase("ball sports")))
                .collect(Collectors.toList());
        for (Order order : orderResult) {
            System.out.println(order);
        }

    }
}
