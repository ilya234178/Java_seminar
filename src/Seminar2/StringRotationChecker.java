package Seminar2;

public class StringRotationChecker {public static boolean areRotations(String s1, String s2) {
    // Проверяем, равны ли длины строк и не пустые ли они
    if (s1.length() != s2.length() || s1.length() == 0) {
        return false;
    }

    // Объединяем s1 с самой собой
    String concatenated = s1 + s1;

    // Проверяем, является ли s2 подстрокой объединенной строки
    return concatenated.contains(s2);
}

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        if (areRotations(s1, s2)) {
            System.out.println(s2 + " является вращением " + s1);
        } else {
            System.out.println(s2 + " не является вращением " + s1);
        }
    }
}
