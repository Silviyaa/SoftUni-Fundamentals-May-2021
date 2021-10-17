import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //"sh, too_long_username, !lleg@l ch@rs, jeffbutt"
        String[] words = input.split(", ");

        for (String word : words) {
            //проверка дали е валидна -> print
            if(isValidWord(word)) {
                System.out.println(word);
            }
        }

    }

    private static boolean isValidWord (String word) {
        //валидна дължина -> от 3 до 16
        if (!(word.length() >= 3 && word.length() <= 16)) {
            return false;
        }
        //валидно съдържание -> letters, numbers, hyphens(-) and underscores(_)
        for (char symbol : word.toCharArray()) {
            //проверка за буква или цифра или - или _
            if(!(Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_')) {
                return false;
            }
        }
        return true;
    }
}
