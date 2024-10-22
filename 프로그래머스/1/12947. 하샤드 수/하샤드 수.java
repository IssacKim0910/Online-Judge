class Solution {
    public boolean solution(int x) {
        String str = Integer.toString(x);
        String[] split = str.split("");

        int sum = 0;
        
        for (String digit : split) {
            sum += Integer.parseInt(digit);
        }

        return x % sum == 0;
    }
}