package classProblemByAmolMateSir.Day5PracticeProblemBasicCoreJava;

import java.util.Scanner;

public class PowerOTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numer to define table");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {//for loop for the
            System.out.println(i + " x " + num + " = " + i * num);
        }
    }
}
