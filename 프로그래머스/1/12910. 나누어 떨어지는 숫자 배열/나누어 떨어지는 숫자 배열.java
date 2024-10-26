import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if(list.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(list);
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));
        return result;
    }

}