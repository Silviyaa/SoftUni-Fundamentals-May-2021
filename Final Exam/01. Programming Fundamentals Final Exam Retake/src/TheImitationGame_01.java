import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("Decode")) {

            String[] splitArray = input.split("\\|");
            String keyCommand  = splitArray[0];
            if (keyCommand.equals("Move")){
                int numOfLetter = Integer.parseInt(splitArray[1]);

            }


            input = scanner.nextLine();
        }
    }
}
