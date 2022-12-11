package classProblemByAmolMateSir.Day5PracticeProblemBasicCoreJava;

import java.util.Random;
import java.util.Scanner;

public class CoinNPercentage {
    public static void main(String[] args) {
        /*
         * coin feka
         * percentage kadha
         * */
        Random random = new Random();
        //desimal point will gienn by float
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of time for flip");
        int nub = scanner.nextInt();
        int head = 0;
        int tail = 0;

        if (nub >= 0) {
            for (int i = 0; i < nub; i++) {
                float num = random.nextFloat();
                if (num < 0.5) {
                    tail = tail + 1;
                } else {
                    head = head + 1;
                }
            }
            //persecentage = 100*got number/total
            System.out.println("% of tail " + 100 * tail / nub);
            System.out.println("% of head " + 100 * head / nub);
        } else {
            System.out.println(" please enter positive number");
        }
    }
}
