package classProblemByAmolMateSir.Day5PracticeProblemBasicCoreJava;

public class Factor {
    public static void main(String[] args) {
        int number = 10;
        for(int i =2;i<= number; i++){
            if(number%i ==0){
                System.out.println(i);
            }
        }
    }
}
