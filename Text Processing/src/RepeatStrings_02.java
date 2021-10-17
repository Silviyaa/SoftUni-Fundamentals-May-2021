import java.util.Arrays;
import java.util.Scanner;
public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Arrays.stream(words)
                .map(word -> repeatWord(word, word.length()))
                .forEach(System.out::print); //.forEach(repeatedWord -> System.out.print(repeatedWord));

    }

    private static String repeatWord(String word, int numberOfRepetitions) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOfRepetitions; i++) {
            result.append(word); // result += word;

        }
        return result.toString();
    }
}
