package com.javafeature.lambda.exercises;


import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
public class Main {
    public static void main(String[] args) {

        var allOrders = Testdaten.getOrders();
        var allProducts = Testdaten.getAllProducts();
        var sportsProducts = Testdaten.getSportsProducts();
        var electronicsProducts = Testdaten.getElectronicsProducts();


        //1. Aufgabe
        //Obtain a list of products belongs to category “Electronics” with price > 100
        Predicate<Product> electronicsGT100 = product -> product.getPrice() > 100 && product.getCategory().equalsIgnoreCase("electronics");
        List<Product> productResult = allProducts.stream()
                .filter(electronicsGT100).toList();
        productResult.forEach(System.out::println);


        //2. Aufgabe
        //Obtain a list of order with products belong to category “ball sports”
        List<Order> orderResult = allOrders.stream()
                .filter(order -> order.getProducts()
                        .stream()
                        .allMatch((product -> product.getCategory().equalsIgnoreCase("ball sports")))).toList();
        orderResult.forEach(System.out::println);

        //3. Aufgabe
        //Obtain a list of product with category = “electronics” and then apply 10% discount
        Predicate<Product> allElectronics = product -> product.getCategory().equalsIgnoreCase("electronics");
        allProducts.stream()
                .filter(allElectronics)
                .forEach(x -> x.setPrice(x.getPrice() * 0.9));


        //4. Aufgabe
        //Obtain a list of products ordered by customer of tier 1 between 01-Feb-2021 and 01-Apr-2021
        Predicate<Order> tier1Customer = x -> x.getCustomer().getTier() == 1;
        Predicate<Order> beforeDate = x -> x.getOrderDate().isBefore(LocalDate.of(2021, 04, 01));
        Predicate<Order> ç = x -> x.getOrderDate().isAfter(LocalDate.of(2021, 02, 01));

        List<Order> oleks = allOrders.stream()
                .filter(tier1Customer.and(beforeDate).and(beforeDate)).toList();

        oleks.forEach(System.out::println);


        //5. Aufgabe
        //Get the cheapest products of “electronics” category
        Optional<Product> minPrice = allProducts.stream()
                .min(Comparator.comparingDouble(Product::getPrice));

        var product = minPrice.orElse(new Product(0, "kein Produkt", "keine Kategorie", 0d));
    }
}