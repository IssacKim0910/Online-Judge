import java.util.Arrays;

class Solution {
    public String solution(String s) {
      String[] split = s.split(" ");
        int min = Integer.MAX_VALUE;  
        int max = Integer.MIN_VALUE;  

        for (String string : split) {
            int num = Integer.parseInt(string);

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("min => " + min + " max => " + max);
        return min + " " + max;
    }
}