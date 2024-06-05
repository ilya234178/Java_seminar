package Seminar1;

public class Lesson1 {

    static int i ='f';

    public static final int LESSON1_MAX = 12;
    public final int fg = 67;


    public static void main(String[] args) {
        int a = 12; //int 32, long 64, byte 8, short 16
        float fl =4.232f;
        double d = 213.31;
        char ch = 'd';
        boolean b = true;


        boolean[] bArray = new boolean[6];
        for (int i = 0; i < 10; i++) {
            i++;
        }
        while(a <= 46){
            a = 47;
        }


        if(bArray[2]){
            bArray[2] = false;
        }

        String str = "hello";
        String strTwo = "world";

        if(!str.equals(strTwo)){
            System.out.println("str " + str.equals(strTwo) );
        }

        String.valueOf(b);
        str.length();
        str.split(" ");
        char char1 = str.charAt(4);
        str.contains("qwer");
        str.repeat(45);
        Integer a2 = 4;
        int m  = Integer.max(3,23);
    }
}
