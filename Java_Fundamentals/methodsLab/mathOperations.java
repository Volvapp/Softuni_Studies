package methodsLab;

import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(sum(num1, operator, num2));
    }

    public static int sum(int num1, String operator, int num2) {
        int result = 0;
        switch (operator) {
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
        }
        return result;
    }
}
