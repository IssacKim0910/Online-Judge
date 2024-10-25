class Solution {
    public int solution(int n) {
        int cnt = 0;
        int answer = 0;
      
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                cnt++;
            }
        }

        int[] temp = new int[cnt];

        int index = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                temp[index++] = i;
            }
        }

        answer = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < answer) {
                answer = temp[i];
            }
        }

        System.out.println("answer =>" + answer);
        return answer;
        }
}