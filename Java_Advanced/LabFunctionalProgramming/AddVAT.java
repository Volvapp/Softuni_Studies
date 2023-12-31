package LabFunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;



public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Function<String, Double> parse = str -> Double.parseDouble(str);
        UnaryOperator<Double> addVAT = d -> d * 1.2;
        Consumer<Double> print = num -> System.out.printf("%.2f%n", num);
        System.out.println("Prices with VAT:");
        Arrays.stream(scanner.nextLine().split(", "))
                .map(elem -> parse.apply(elem))
                .map(price -> addVAT.apply(price))
                .forEach(priceWithVat -> print.accept(priceWithVat));
    }
}
