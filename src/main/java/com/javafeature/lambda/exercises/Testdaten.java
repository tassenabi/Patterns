package com.javafeature.lambda.exercises;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Testdaten {

    public static List<Order> getOrders() {
        List<Order> orderList = new ArrayList<>();
        Customer customer1 = new Customer(1234, "Customer1", 1);
        List<Product> allProductList = getAllProducts();
        List<Product> sportsProducts = getSportsProducts();
        List<Product> electronicsProducts = getElectronicsProducts();


        orderList.add(new Order(1122, LocalDate.of(2021, 10, 1), LocalDate.of(2021, 10, 5), "delivered", customer1, allProductList ));
        orderList.add(new Order(1123, LocalDate.of(2021, 10, 5), LocalDate.of(2021, 10, 7), "delivered", customer1, sportsProducts ));
        orderList.add(new Order(1124, LocalDate.of(2021, 10, 14), LocalDate.of(2021, 10, 15), "delivered", customer1, sportsProducts ));
        orderList.add(new Order(1125, LocalDate.of(2021, 3, 7), LocalDate.of(2021, 3, 12), "delivered", customer1, electronicsProducts ));
        orderList.add(new Order(1126, LocalDate.of(2021, 5, 8), LocalDate.of(2021, 5, 11), "delivered", customer1, electronicsProducts ));

        return orderList;

    }

    public static List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(123, "Football", "ball sports", 20.00));
        productList.add(new Product(124, "Volleyball", "ball sports", 10.00));
        productList.add(new Product(125, "Laptop", "electronics", 1500.00));
        productList.add(new Product(126, "Monitor", "electronics", 800.00));
        productList.add(new Product(127, "Mouse", "electronics", 50.00));

        return productList;
    }

    public static List<Product> getSportsProducts() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(123, "Football", "ball sports", 20.00));
        productList.add(new Product(124, "Volleyball", "ball sports", 10.00));

        return productList;
    }

    public static List<Product> getElectronicsProducts() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(125, "Laptop", "electronics", 1500.00));
        productList.add(new Product(126, "Monitor", "electronics", 800.00));
        productList.add(new Product(127, "Mouse", "electronics", 50.00));

        return productList;
    }



}
