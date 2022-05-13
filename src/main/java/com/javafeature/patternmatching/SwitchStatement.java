package com.javafeature.patternmatching;

public class SwitchStatement {

    public class SwitchExpression {

        public static void main(String[] args) {
            int month = 9;
            int year = 2018;
            int numDays = switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> {
                    if (java.time.Year.of(year).isLeap()) {
                        System.out.println("Wow! It's leap year!");
                        yield 29;
                    } else {
                        yield 28;
                    }
                }
                default -> {
                    System.out.println("Invalid month.");
                    yield 0;
                }
            };
            System.out.println("Number of Days = " + numDays);
        }
    }

    //zu yield: Nur bei Switch statements verwendet und gibt einen return value an.
    // Unterschied zu return? Return kommt von einer Methode.
}