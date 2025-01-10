import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int studentCnt = sc.nextInt();
        sc.nextLine();  // 엔터를 소모하기 위해 호출

        int cnt = 0;
        int avg = 0;
        int sum = 0;
        int higher = 0;
        float ratio = 0.0f;
        while(cnt < studentCnt) {
            String input = sc.nextLine();

            String[] elements = input.split(" ");
            int caseCnt = Integer.parseInt(elements[0]);
            int[] numbers = new int[caseCnt];

            sum = 0;
            for (int i = 0; i < caseCnt; i++) {
                numbers[i] = Integer.parseInt(elements[i+1]);
                sum += numbers[i];
            }
            avg = sum / caseCnt;
            higher = 0;
            for (int i = 0; i < caseCnt; i++) {
                if(numbers[i] > avg) {
                    higher++;
                }
            }
            ratio = (float) higher / caseCnt * 100;
            System.out.printf("%.3f%%\n", ratio);
            cnt ++;
        }
    }
}
