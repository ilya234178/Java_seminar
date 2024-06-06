package Seminar2;

import java.util.Arrays;
import java.util.Random;

//объявить одномерный заполнить случайными числами и развернуть
public class ArrayAndReverseArray {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        reverseArray(array);
        System.out.println(Arrays.toString(array));

    }
    public static void reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

    }
}
