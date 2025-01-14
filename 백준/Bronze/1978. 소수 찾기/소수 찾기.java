import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(arr[i]);
            if (num > 1) {
                boolean isPrime = true;
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) cnt++;
            }
        }

        System.out.println(cnt);
    }
}