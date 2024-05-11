class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int p = 0;
        int y = 0;
        String[] n = s.split("");

        for(String str : n) {
            System.out.println(str);
            if(str.equals("p") || str.equals("P")){
                p++;
            } else if (str.equals("y") || str.equals("Y")) {
                y++;
            }
        }
 
        answer = (p == y) ? true : false;
        return answer;
    }
}