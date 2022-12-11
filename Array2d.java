package classProblemByAmolMateSir.Day5PracticeProblemBasicCoreJava.FunctionalPrograms;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        System.out.println("enter size of array M*N");
        Scanner scanner = new Scanner(System.in);
        int sizeM = scanner.nextInt();
        int sizeN = scanner.nextInt();
        int[][] arr = new int[sizeM][sizeN];

        for (int i = 0; i < sizeM; i++) {
            for (int j = i; j < sizeN; j++) {
                System.out.println("next->");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("array is ->");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(+arr[i][j] + ",");
            }
            System.out.println();
        }
    }
}
