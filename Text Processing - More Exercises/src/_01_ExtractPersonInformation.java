import java.util.Scanner;

public class _01_ExtractPersonInformation {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < n; i++) {
//            String input = scanner.nextLine();
//            int inputOfNameStart = input.indexOf('@');
//            int inputOfNameFinish = input.indexOf('|');
//            String name = (input.substring(inputOfNameStart+1,inputOfNameFinish-inputOfNameStart-1));
//            int indexOfAgeStart = input.indexOf('#');
//            int indexOfAgeFinish = input.indexOf('*');
//            String age = (input.substring(indexOfAgeStart+1,indexOfAgeFinish - indexOfAgeStart-1));
//            System.out.printf("%s is %s years old.",name,age);
//        }

        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numOfLines; i++) {
            boolean addToNameStringBuilder = false;
            boolean addToAgeStringBuilder = false;
            StringBuilder name = new StringBuilder();
            StringBuilder age = new StringBuilder();

            String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.charAt(j);
                if (currentChar == '@') {
                    addToNameStringBuilder = true;
                    continue;
                }
                if (currentChar == '|') {
                    addToNameStringBuilder = false;
                }
                if (currentChar == '#') {
                    addToAgeStringBuilder = true;
                    continue;
                }
                if (currentChar == '*') {
                    addToAgeStringBuilder = false;
                }
                if (addToNameStringBuilder == true) {
                    name.append(currentChar);
                }
                if (addToAgeStringBuilder) {
                    age.append(currentChar);
                }
            }
            System.out.printf("%s is %s years old.%n", name, age);

        }
    }


    }
}
