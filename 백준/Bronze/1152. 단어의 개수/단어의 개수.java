import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        ArrayList<String> arrays = new ArrayList<>(Arrays.asList(arr));

        arrays.removeIf(a -> a.trim().isEmpty());

        System.out.println(arrays.size());
    }
}
