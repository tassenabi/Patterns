package com.javafeature.lambda.exercises;


import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

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
        //orderResult.forEach(System.out::println);

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

        //oleks.forEach(System.out::println);


        //5. Aufgabe
        //Get the cheapest products of “electronics” category
        Optional<Product> minPrice = allProducts.stream()
                .min(Comparator.comparingDouble(Product::getPrice));

        var product = minPrice.orElse(new Product(0, "kein Produkt", "keine Kategorie", 0d));

        //6. Aufgabe
        //Get the 3 most recent placed order
        var threeRecentsOrders = allOrders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate)
                        .reversed())
                .limit(3)
                .toList();


        //7. Aufgabe
        //Get a list of orders which were ordered on 15-Mar-2021, log the order records to the console and then return its product list
        var ddd = allOrders.stream().filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15))).toList();

        //ddd.forEach(System.out::println);

        //8. Aufgabe
        //Calculate total lump sum of all orders placed in Feb 2021
        Predicate<Order> orderPredicate = o ->
                o.getOrderDate().isAfter(LocalDate.of(2021, 2, 1)) &&
                        o.getOrderDate().isBefore(LocalDate.of(2021, 3, 1));

        var filteredOrdersFebruary = allOrders.stream()
                .filter(orderPredicate)
                .flatMapToDouble(order -> order.getProducts().stream().mapToDouble(Product::getPrice)).sum();


        //9. Aufgabe
        //Calculate order average payment placed on 14-Mar-2021
        Predicate<Order> march14 = o ->
                o.getOrderDate().isEqual(LocalDate.of(2021, 3, 14));

        var filteredOrdersPaymentsInMarch = allOrders.stream().
                filter(march14)
                .flatMapToDouble(order -> order.getProducts().stream().mapToDouble(Product::getPrice)).average().orElse(0.00);
    }

}