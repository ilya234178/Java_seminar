//создать строку вывести ее наоборот
package Seminar2;

        public class StringTask {
            public static void main(String[] args) {
                String s = "hello world";
                StringBuilder stringBuilder = new StringBuilder(s);

//                for (int i = 0; i < s.length(); i++) {
//                    stringBuilder.append(s.charAt(s.length()- i - 1));
//
//                }
                System.out.println(s);
//                System.out.println(stringBuilder.toString());


                stringBuilder.reverse();
                s = stringBuilder.toString();
                System.out.println(s);


            }
}
