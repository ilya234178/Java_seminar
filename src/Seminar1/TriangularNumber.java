//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Seminar1;

public class TriangularNumber {
    public static int calculateTriangularNumber(int n){
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        int n = 7;
        int triangularNumber = calculateTriangularNumber(n);
        System.out.println("треугольное число " + " = " + triangularNumber);
    }
}
