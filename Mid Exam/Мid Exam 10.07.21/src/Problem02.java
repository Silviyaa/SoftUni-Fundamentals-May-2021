import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> biscuitsList = Arrays.stream(scanner.nextLine().split(",\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("No More Money")) {
            List<String> inputList = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
            String command = inputList.get(0);
            switch (command) {
                case "OutOfStock":
                    for (int i = 0; i < biscuitsList.size(); i++) {
                        if (biscuitsList.get(i).equals(inputList.get(1))) {
                            biscuitsList.set(i, "None");
                        }
                    }
                    break;
                case "Required":
                    int index = Integer.parseInt(inputList.get(2));
                    if (index >= 0 && index < biscuitsList.size() && !biscuitsList.get(index).equals("None")) {
                        biscuitsList.set(index, inputList.get(1));
                    }
                    break;
                case "Last":
                    biscuitsList.add(inputList.get(1));
                    break;
            }
            input = scanner.nextLine();
        }
        for (String s : biscuitsList) {
            if (!s.equals("None")) {
                System.out.print(s + " ");
            }
        }
    }
}
