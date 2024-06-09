package Seminar2;

public class ReverseStringRecursively {
    // Метод для переворота строки с использованием рекурсии
    public static String reverse(String str) {
        // Базовый случай: если строка пуста или состоит из одного символа
        if (str == null || str.length() <= 1) {
            return str;
        }

        // Рекурсивный случай: переворачиваем подстроку и добавляем первый символ в конец
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverse(original);

        System.out.println("Оригинальная строка: " + original);
        System.out.println("Перевернутая строка: " + reversed);
    }
}
