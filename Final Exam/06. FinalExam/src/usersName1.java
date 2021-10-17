import java.util.Scanner;

public class usersName1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        StringBuilder username1 = new StringBuilder(username);
        String command = scanner.nextLine();

        while (!command.equals("Registration")) {
            String[] commandArray = command.split(" ");
            String commandName = commandArray[0];

            switch (commandName) {
                case "Letters":
                    String commandLetters = commandArray[1];

                    for (int i = 0; i < username1.length(); i++) {
                        char currentSymbol = username1.charAt(i);
                        if (commandLetters.equals("Upper")) {
                            username1.setCharAt(i, Character.toUpperCase(currentSymbol));
                        } else if (commandLetters.equals("Lower")) {
                            username1.setCharAt(i, Character.toLowerCase(currentSymbol));
                        }
                    }
                    System.out.println(username1);
                    break;
                case "Reverse":
                    StringBuilder tmpR = new StringBuilder();
                    int startIndex = Integer.parseInt(commandArray[1]);
                    int endIndex = Integer.parseInt(commandArray[2]);

                    if (startIndex >= 0 && startIndex < username.length() - 1 && endIndex >= 0 && endIndex < username.length()) {

                        for (int i = endIndex; i >= startIndex; i--) {
                            tmpR.append(username.charAt(i));
                        }

                        System.out.println(tmpR);
                    }

                    break;

                case "Substring":
                    String substring =commandArray[1];
                    StringBuilder newSubstring = new StringBuilder(username);

                    if (username1.toString().contains(substring)) {
                        substring = newSubstring.reverse().toString();

                        startIndex = username1.indexOf(commandArray[1]);
                        endIndex = startIndex + commandArray[1].length();

                        StringBuilder updatedString = new StringBuilder(username);

                        updatedString.delete(startIndex, endIndex);


                        System.out.println(updatedString);
                    } else {
                        System.out.printf("The username %s doesn't contain %s.%n",username1,substring);
                    }

                    break;
                case "Replace":
                    String charToReplace = commandArray[1];

                    username= username.replace(charToReplace, "-");
                    System.out.println(username);
                    break;
                case "IsValid":
                    String isValid = commandArray[1];
                    if(username.contains(isValid)){
                        System.out.println("Valid username!");
                    }
                    else {
                        System.out.printf("%s must be contained in your username.",isValid);
                    }

                    break;


            }

            command = scanner.nextLine();
        }

    }

}


