package com.javafeature.lambda.exercises;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.Supplier;


@Data
@AllArgsConstructor
public class Product{

    private Integer id;
    private String name;
    private String category;
    private Double price;
}
