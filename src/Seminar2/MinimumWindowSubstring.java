//Напишите программу, чтобы найти наименьшее окно в строке,
// содержащей все символы другой строки.
package Seminar2;
import java.util.HashMap;
import java.util.Map;



    public class MinimumWindowSubstring {
        public static String minWindow(String s, String t) {
            if (s == null || t == null || s.length() == 0 || t.length() == 0) {
                return "";
            }

            // Счетчик частоты символов для строки t
            Map<Character, Integer> tFreq = new HashMap<>();
            for (char c : t.toCharArray()) {
                tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
            }

            // Счетчик частоты символов для текущего окна
            Map<Character, Integer> windowFreq = new HashMap<>();
            int required = tFreq.size();
            int formed = 0;

            int l = 0, r = 0;
            int[] ans = {-1, 0, 0}; // Длина, левая граница, правая граница

            while (r < s.length()) {
                char c = s.charAt(r);
                windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);

                if (tFreq.containsKey(c) && windowFreq.get(c).intValue() == tFreq.get(c).intValue()) {
                    formed++;
                }

                while (l <= r && formed == required) {
                    c = s.charAt(l);

                    if (ans[0] == -1 || r - l + 1 < ans[0]) {
                        ans[0] = r - l + 1;
                        ans[1] = l;
                        ans[2] = r;
                    }

                    windowFreq.put(c, windowFreq.get(c) - 1);
                    if (tFreq.containsKey(c) && windowFreq.get(c).intValue() < tFreq.get(c).intValue()) {
                        formed--;
                    }

                    l++;
                }

                r++;
            }

            return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
        }

        public static void main(String[] args) {
            String s = "ADOBECODFSLKGFMGKRDBHZWENFZXWERHYVIODEBAN";
            String t = "OF";
            System.out.println("Наименьшее окно: " + minWindow(s, t));
        }
    }


