package Harder_Conditional_Statements_Exercises;

import java.util.Scanner;

public class Operations_Between_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double result = 0;
        String evenOrOdd = "";
        boolean isZero = false;
        if (operator == '+') {
            result = numOne + numTwo;
            if (result % 2 == 0) {
                evenOrOdd = "even";

            } else evenOrOdd = "odd";
        } else if (operator == '-') {
            result = numOne - numTwo;
            if (result % 2 == 0) {
                evenOrOdd = "even";

            } else evenOrOdd = "odd";
        } else if (operator == '*') {
            result = numOne * numTwo;
            if (result % 2 == 0) {
                evenOrOdd = "even";

            } else evenOrOdd = "odd";
        } else if (operator == '/') {
            if (numTwo == 0) {
                isZero = true;
            } else {
                result = numOne * 1.0 / numTwo;
            }
        } else if (operator == '%') {
            if (numTwo == 0) {
                isZero = true;
            } else {
                result = numOne % numTwo;
            }
        }
        if (operator == '+' || operator == '-' || operator == '*')
            System.out.printf("%d %c %d = %.0f - %s ", numOne, operator, numTwo, result, evenOrOdd);

        else if (operator == '/' && !isZero){
            System.out.printf("%d %c %d = %.2f", numOne,operator, numTwo ,result);
        }else if (operator == '%' && !isZero){
            System.out.printf("%d %c %d = %.0f",numOne,operator,numTwo,result);
        } else if (isZero && operator == '/' || operator == '%'){
            System.out.printf("Cannot divide %d by zero", numOne);

        }
    }
}
