package javapro;
import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}

