package Seminar2;

public class PerformanceComparison {
    public static void main(String[] args) {
        // Создаем строку из 10000 символов "="
        String str = "=".repeat(10000);

        // Замена с использованием String
        long startTime = System.currentTimeMillis();
        String resultStr = str.replace("=", "равно");
        long endTime = System.currentTimeMillis();
        long durationString = endTime - startTime;

        // Создаем строку из 10000 символов "=" с использованием StringBuilder
        StringBuilder sb = new StringBuilder("=".repeat(10000));

        // Замена с использованием StringBuilder
        startTime = System.currentTimeMillis();
        int index = sb.indexOf("=");
        while (index != -1) {
            sb.replace(index, index + 1, "равно");
            index += "равно".length(); // Продвигаемся дальше в строке
            index = sb.indexOf("=", index);
        }
        endTime = System.currentTimeMillis();
        long durationStringBuilder = endTime - startTime;

        // Выводим результаты
        System.out.println("Время выполнения для String: " + durationString + " мс");
        System.out.println("Время выполнения для StringBuilder: " + durationStringBuilder + " мс");
    }
}
