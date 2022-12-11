package classProblemByAmolMateSir.Day5PracticeProblemBasicCoreJava;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1");
        byte n1 = scanner.nextByte();
        System.out.println("2");
        byte n3 = scanner.nextByte();
        System.out.println("3");
        byte n2 = scanner.nextByte();
        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is largest");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is large");
        } else {
            System.out.println(n3 + " is latge");
        }
    }
}
