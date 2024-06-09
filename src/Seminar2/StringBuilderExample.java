package Seminar2;

public class StringBuilderExample {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 56;

        // Создание строк для арифметических выражений
        StringBuilder addition = new StringBuilder().append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2);
        StringBuilder subtraction = new StringBuilder().append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2);
        StringBuilder multiplication = new StringBuilder().append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);

        // Заменяем "=" на "равно" с использованием insert() и deleteCharAt()
        replaceWithInsertAndDelete(addition);
        replaceWithInsertAndDelete(subtraction);
        replaceWithInsertAndDelete(multiplication);

        // Выводим результаты
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);

        // Создание строк заново для второго метода
        addition = new StringBuilder().append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2);
        subtraction = new StringBuilder().append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2);
        multiplication = new StringBuilder().append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);

        // Заменяем "=" на "равно" с использованием replace()
        replaceWithReplace(addition);
        replaceWithReplace(subtraction);
        replaceWithReplace(multiplication);

        // Выводим результаты
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
    }

    // Метод для замены "=" на "равно" с использованием insert() и deleteCharAt()
    private static void replaceWithInsertAndDelete(StringBuilder sb) {
        int index = sb.indexOf("=");
        if (index != -1) {
            sb.deleteCharAt(index);  //удаление
            sb.insert(index, "равно");   //добавление нового элемента
        }
    }

    // Метод для замены "=" на "равно" с использованием replace()
    private static void replaceWithReplace(StringBuilder sb) {
        int index = sb.indexOf("=");
        if (index != -1) {
            sb.replace(index, index + 1, "равно"); //замена
        }
    }
}
