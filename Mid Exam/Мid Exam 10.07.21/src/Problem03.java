import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(" ");
        List<String> list = new ArrayList<>();

        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "Chat":
                    list.add(command[1]);
                    break;

                case "Delete":
                    list.remove(command[1]);
                    break;

                case "Edit":
                    if (list.contains(command[1])) {
                        int indexOfMessage = list.indexOf(command[1]);
                        String messageToEdit = command[1];
                        String editedVersion = command[2];
                        list.add(indexOfMessage, editedVersion);
                        list.remove(messageToEdit);
                    }
                    break;

                case "Pin":
                    if (list.contains(command[1])) {
                        String messageToAdd = command[1];
                        list.remove(messageToAdd);
                        list.add(messageToAdd);
                    }
                    break;

                case "Spam":
                    for (int i = 1; i < command.length; i++) {
                        list.add(command[i]);
                    }
                    break;

                default:
                    break;
            }
            command = scanner.nextLine().split(" ");
        }
        for (String chat : list) {
            System.out.println(chat);
        }
    }
}
