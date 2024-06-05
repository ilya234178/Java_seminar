//Вывести все простые числа от 1 до 1000


package Seminar1;

import java.util.Arrays;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 1100;// Верхний предел (до 1000 включительно)
        boolean[] isPrime = new boolean[n + 1];// Создаем массив для пометки простых чисел
        Arrays.fill(isPrime,true); // Заполняем массив значением true
        isPrime[0] = false; // 0 не является простым числом
        isPrime[1] = false; // 1 не является простым числом

        // Основной цикл для "решета Эратосфена"
        for (int i = 2; i * i <= n; i++) {                  // Проходим через все числа от 2 до sqrt(n)
            if(isPrime[i]){                 // Если текущее число i является простым
                for (int j = i * i; j <= n; j += i) {        // Помечаем все кратные числа i как составные
                    isPrime[j] = false;
                }
            }
        }

        // Выводим все простые числа
        System.out.println("Простые числа от 1 до " + n + ":");         // Проходим через массив и выводим все числа, помеченные как простые
        for (int i = 2; i <= n ; i  ++) {
            if(isPrime[i]){
                System.out.print(i + " ");
            }

        }
    }
}
