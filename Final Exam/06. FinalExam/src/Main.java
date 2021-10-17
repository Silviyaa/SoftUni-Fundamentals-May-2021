import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> messagesMap = new LinkedHashMap<>();

        String commandInput = scanner.nextLine();
        while (!commandInput.equals("Statistics")) {
            String[] commandInputArray = commandInput.split("=");
            String command = commandInputArray[0];

            switch (command) {
                case "Add":
                    String userName = commandInputArray[1];
                    if (messagesMap.containsKey(userName)) {

                    } else {
                        List<Integer> currList = new ArrayList<>();
                        currList.add(Integer.parseInt(commandInputArray[2]));
                        currList.add(Integer.parseInt(commandInputArray[3]));
                        messagesMap.put(userName, currList);
                    }
                    break;
                case "Message":
                    String sender = commandInputArray[1];
                    String receiver = commandInputArray[2];
                    int senderMessagesCount = messagesMap.get(sender).get(0) + messagesMap.get(sender).get(1);
                    int receiverMessagesCount = messagesMap.get(receiver).get(0) + messagesMap.get(receiver).get(1);
                    if ((senderMessagesCount + 1) >= capacity) {
                        messagesMap.remove(sender);
                        System.out.printf("%s reached the capacity!%n", sender);
                    } else {
                        List<Integer> newSenderList = messagesMap.get(sender);
                        newSenderList.set(0, messagesMap.get(sender).get(0) + 1);
                        messagesMap.put(sender, newSenderList);
                    }

                    if ((receiverMessagesCount + 1) > capacity) {
                        messagesMap.remove(receiver);
                        System.out.printf("%s reached the capacity!%n", receiver);
                    } else {
                        List<Integer> newReceiverList = messagesMap.get(receiver);
                        newReceiverList.set(1, messagesMap.get(receiver).get(1) + 1);
                        messagesMap.put(receiver, newReceiverList);
                    }
                    break;
                case "Empty":
                    String userToDelete = commandInputArray[1];
                    List<Integer> emptyList = new ArrayList<>();
                    emptyList.add(0);
                    emptyList.add(0);
                    if (userToDelete.equals("All")) {
                        Map<String, List<Integer>> newMap = new LinkedHashMap<>();
                        for (Map.Entry<String, List<Integer>> entry : messagesMap.entrySet()) {
                            newMap.put(entry.getKey(), emptyList);
                        }
                    } else {
                        messagesMap.put(userToDelete, emptyList);
                    }
                    break;

            }

            commandInput = scanner.nextLine();
        }
        int usersCount = messagesMap.size();
        System.out.println("Users count: " + usersCount);
        messagesMap.entrySet().stream().sorted((e1, e2) -> {
            int result = Integer.compare(e2.getValue().get(1), e1.getValue().get(1));
            if (result == 0) {
                result = e1.getKey().compareTo(e2.getKey());
            }
            return result;
        }).forEach(entry -> System.out.printf("%s - %d%n", entry.getKey(),(entry.getValue().get(0) + entry.getValue().get(1))));
    }
}