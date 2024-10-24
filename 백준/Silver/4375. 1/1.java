import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// 2와 5로 나누어 떨어지지 않는 정수n 주어졌을때 각 자릿수가 모두 1로만 이루어진 n의 배수를 찾아라

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()){
            int a = sc.nextInt();
            int num = 0;

            for (int i = 1; i <=a; i ++) {
                num = (num * 10 + 1) % a;

                if (num == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}

