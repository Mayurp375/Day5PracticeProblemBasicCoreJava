package classProblemByAmolMateSir.Day5PracticeProblemBasicCoreJava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  year = scanner.nextInt();
        if(year % 4 == 0){
            System.out.println(year + " : is a leap year");
        }else {
            System.out.println(year + " : is a not leap year");
        }
    }
}
