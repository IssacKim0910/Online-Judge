import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int up = Integer.parseInt(arr[0]);
        int down = Integer.parseInt(arr[1]);
        int goal = Integer.parseInt(arr[2]);

        int effectiveGoal = goal - up;
        int dailyMovement = up - down;
        int days = effectiveGoal > 0 
                    ? (int) Math.ceil((double) effectiveGoal / dailyMovement) + 1 
                    : 1;

        System.out.println(days);
    }
}
