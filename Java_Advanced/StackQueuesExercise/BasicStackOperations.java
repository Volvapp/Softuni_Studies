package StackQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;


public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }
        if (stack.contains(x)){
            System.out.println(true);
        }else {
            if (stack.isEmpty()){
                System.out.println(0);
                return;
            }
            System.out.println(Collections.min(stack));
        }
    }
}
