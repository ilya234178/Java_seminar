//заполнение массива

package Seminar2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Seminar2 {
    public static void main(String[] args) {
        int[] ar3 = new int[16];
        int[][] ar4 = new int[16][2];

        for (int i = 0; i < ar3.length; i++) {
            if (i >= ar3.length) {
                int[] tmp = new int[ar3.length + ar3.length / 2 + 1];
                ar3 = tmp;
            }
            ar3[i] = new Random().nextInt(100);
        }
//        Arrays.sort(ar3,  ar3.length / 2, ar3.length);
//        System.out.println(Arrays.toString(ar3));
//        for (int i = 0; i < ar3.length; i++) {
//            System.out.println(ar3[i]);
//        }

        //заполнение двумерного массива
        for (int i = 0; i < ar4.length; i++) {
            ar4[i][0] = new Random().nextInt(100);
            ar4[i][1] = new Random().nextInt(100);
        }
        //отсортированы [0]
        Arrays.sort(ar4, Comparator.comparingInt(a -> a[0]));
        System.out.println(Arrays.deepToString(ar4));

        String s = "hello world" + "asd";
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.append("adad");
        s = stringBuilder.toString();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            s += Character.toString(i);

        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();


        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(Character.toString(i));

        }
        System.out.println(System.currentTimeMillis() - start);
    }

}
