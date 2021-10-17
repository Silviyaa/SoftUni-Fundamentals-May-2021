import java.util.EmptyStackException;
import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Generate")) {
            // Contains>>>{substring} – проверява дали ключът за активиране съдържа дадената подниз.
            // Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}
            // Slice>>>{startIndex}>>>{endIndex}

            String[] commandParams = command.split(" >>> ");
            String commandName = commandParams[0]; // "Contains", "Flip", "Slice"

            switch (commandName) {
                case "Contains":
                    String substring = commandParams[1];
                    if (input.contains(substring)) {
                        System.out.printf("%s contains %s%n", input, substring);
                    } else {
                        System.out.printf("Substring not found!%n");
                    }
                    break;

                case "Flip":
                    String direction = commandParams[1];
                    int startIndex = Integer.parseInt(commandParams[2]);
                    int endIndex = Integer.parseInt(commandParams[3]);
                    if (direction.equals("Upper")) {
                        String flipUpperSubstring = input.substring(startIndex, endIndex).toUpperCase();
                        input = input.replace(input.substring(startIndex, endIndex), flipUpperSubstring);
                        System.out.println(input);
                    } else if (direction.equals("Lower")) {
                        String flipLowerSubstring = input.substring(startIndex, endIndex).toLowerCase();
                        input = input.replace(input.substring(startIndex, endIndex), flipLowerSubstring);
                        System.out.println(input);
                    }

                    break;

                case "Slice":
                    startIndex = Integer.parseInt(commandParams[2]);
                    endIndex = Integer.parseInt(commandParams[3]);
                    if (startIndex <= endIndex) {
                        int lengthOfStringToRemove = endIndex - startIndex;
                        String subStringToReplace = input.substring(startIndex,lengthOfStringToRemove);
                        //String myString = input.isEmpty();
                      //  input = input.replace(subStringToReplace,myString);


                    }

                    break;
            }


            command = scanner.nextLine();
        }
    }
}
