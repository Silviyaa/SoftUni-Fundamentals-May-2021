import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean isValid = false;
        for (int i = 1; i <= number; i++) {
            int actualNum = i;
            int sum = 0;
            while (actualNum > 0) {
                sum += actualNum % 10;
                actualNum = actualNum / 10;
            }
            isValid = (sum == 5) || (sum == 7) || (sum == 11);
            if (isValid) {
                System.out.printf("%d -> True%n",i);
            } else {
                System.out.printf("%d -> False%n", i);
            }

        }
    }
}
