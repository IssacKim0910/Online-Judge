import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentCnt = sc.nextInt();
        sc.nextLine(); 

        for (int cnt = 0; cnt < studentCnt; cnt++) {
            String input = sc.nextLine();
            String[] elements = input.split(" ");

            int caseCnt = Integer.parseInt(elements[0]);
            int[] numbers = new int[caseCnt];

            int sum = 0;
            for (int i = 0; i < caseCnt; i++) {
                numbers[i] = Integer.parseInt(elements[i + 1]);
                sum += numbers[i];
            }

            int avg = sum / caseCnt;
            int higher = 0;
            for (int i = 0; i < caseCnt; i++) {
                if (numbers[i] > avg) {
                    higher++;
                }
            }

            float ratio = (float) higher / caseCnt * 100;
            System.out.printf("%.3f%%\n", ratio);
        }
    }
}
