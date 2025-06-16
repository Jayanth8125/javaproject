package javapro;
import java.util.Scanner;

public class JumpSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        int result = jumpSearch(array, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int jumpSearch(int[] arr, int key) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) return -1;
        }

        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == key) return i;
        }

        return -1;
    }
}
