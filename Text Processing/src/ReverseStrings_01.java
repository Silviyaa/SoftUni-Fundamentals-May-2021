import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        while (!"end".equals(word)) {
            StringBuilder reversed = new StringBuilder(word);
            reversed.reverse();
//            for (int i = word.length() - 1; i >= 0; i--) {
//                char currentSymbol = word.charAt(i);
//                reversed.append(currentSymbol);
//            }
            System.out.printf("%s = %s%n", word, reversed);
            reversed.setLength(0);
            word = scanner.nextLine();
        }
    }
}
