package classProblemByAmolMateSir.Day5PracticeProblemBasicCoreJava;

public class HarmonicNumber {
    public static void main(String[] args) {
        double n = 10;
        int num = 1;
        if (n >= 0) {
            for (int i = 1; i < n; i++) {
                System.out.print("1/" + i + " + ");
            }
        } else {
            System.out.println("Invalid ,please enter greater than 0");
        }
    }
}
