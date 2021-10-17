import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class messages {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int numberMessages = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Statistics")){
            String [] commandParts = command.split("=");
            String username = commandParts[0];
            switch (username){
                case "Add":
                    int sent = Integer.parseInt(commandParts[1]);
                    int received = Integer.parseInt(commandParts[2]);

                    break;

                case "Message":
                    String sender = commandParts[0];
                    String receiver  = commandParts[1];

                    break;

                case "Empty":

                    break;
            }

            command = scanner.nextLine();
        }
    }
}
