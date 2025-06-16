package javapro;
public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello world this is Java";
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) reversed.append(" ");
        }
        System.out.println(reversed.toString());
    }
}
