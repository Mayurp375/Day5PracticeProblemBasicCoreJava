package classProblemByAmolMateSir.Day5PracticeProblemBasicCoreJava;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("even number");

        }else {
            System.out.println("Odd");
        }
    }
}
