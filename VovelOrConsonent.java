package classProblemByAmolMateSir.Day5PracticeProblemBasicCoreJava;

import java.util.Scanner;

public class VovelOrConsonent {
    public static void main(String[] args) {
        char[] ch = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Scanner scanner = new Scanner(System.in);
        char charector = scanner.next().charAt(0);
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == charector) {
                System.out.println(charector + " is Vovel");
                break;
            } else {
                System.out.println(charector + " is Consonent");
                break;
            }
        }
    }
}
