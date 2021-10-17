

import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder username = new StringBuilder(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("Sign up")) {

            String command = input[0];

            switch (command) {
                case "Case":
                    String commandType = input[1];
                    if (commandType.equals("lower")) {
                        String tmp = username.toString();
                        tmp = tmp.toLowerCase();
                        username = new StringBuilder(tmp);

                    } else {
                        String tmp = username.toString();
                        tmp = tmp.toUpperCase();
                        username = new StringBuilder(tmp);

                    }
                    System.out.println(username);
                    break;
                case "Reverse":
                    StringBuilder tmpR = new StringBuilder();
                    int startIndex = Integer.parseInt(input[1]);
                    int endIndex = Integer.parseInt(input[2]);

                    if (startIndex >= 0 && startIndex <= username.length() - 1 && endIndex >= 0 && endIndex <= username.length()) {

                        for (int i = endIndex; i >= startIndex; i--) {
                            tmpR.append(username.charAt(i));
                        }

                        System.out.println(tmpR);
                    }

                    break;
                case "Cut":
                    StringBuilder tmpC = username;
                    String substring = input[1];

                    String check = username.toString();

                    if (check.contains(substring)) {
                        int indexOfSubstr = tmpC.indexOf(substring);
                        tmpC.delete(indexOfSubstr, substring.length() + indexOfSubstr);
                        username = tmpC;
                        System.out.println(username);
                    } else {
                        System.out.printf("The word %s doesn't contain %s.%n", username, substring);
                    }
                    break;
                case "Replace":
                    StringBuilder tmpRep = new StringBuilder(username);
                    char currentChar = input[1].charAt(0);

                    while (tmpRep.indexOf(String.valueOf(currentChar))!= -1) {
                        int indexOfChar = tmpRep.indexOf(String.valueOf(currentChar));
                        tmpRep.replace(indexOfChar, indexOfChar + 1, "*");
                    }
                    username = tmpRep;
                    System.out.println(username);
                    break;
                case "Check":
                    char givenChar = input[1].charAt(0);
                    if (username.indexOf(String.valueOf(givenChar)) != -1) {
                        System.out.println("Valid");
                    } else {
                        System.out.printf("Your username must contain %s.%n", givenChar);
                    }
                    break;
            }


            input = scanner.nextLine().split(" ");
        }


    }
}
 