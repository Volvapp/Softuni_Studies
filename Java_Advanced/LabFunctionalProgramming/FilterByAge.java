package LabFunctionalProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int count = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String[] input = scanner.nextLine().split(", ");

            people.put(input[0], Integer.parseInt(input[1]));
        }
        String condition = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Integer> filter = getPredicate(condition, ageLimit);
        getPrintConsumer(format);
        Consumer<Map.Entry<String, Integer>> print = getPrintConsumer(format);

        people.entrySet()
                .stream()
                .filter(entry -> filter.test(entry.getValue()))
                .forEach(entry -> print.accept(entry));
    }

    private static Consumer<Map.Entry<String, Integer>> getPrintConsumer(String format) {

        if (format.equals("name")){
            return entry -> System.out.println(entry.getKey());
        }else if (format.equals("age")){
            return e -> System.out.println(e.getValue());
        }else if (format.equals("name age")){
            return e -> System.out.printf("%s - %d%n", e.getKey(),e.getValue());
        }
        throw new RuntimeException();
    }

    private static Predicate<Integer> getPredicate(String condition, int ageLimit) {

        if (condition.equals("older")) {
            return x -> x >= ageLimit;
        } else if (condition.equals("younger")) {
            return x -> x <= ageLimit;
        }
        throw new RuntimeException();
    }
}
