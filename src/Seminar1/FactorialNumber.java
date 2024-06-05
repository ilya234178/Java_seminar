package Seminar1;

public class FactorialNumber {
    public static int calculateFactorial(int n){
        int factorial = 1;
        for (int i = 1; i <=n ; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
            int n = 5;
            int factorial = calculateFactorial(n);
        System.out.println(n + " ! " + factorial);
    }
}
