import java.util.Scanner;

public class P08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        int num = letter;
        if (num >= 97 && num <= 122) {
            System.out.println("lower-case");
        } else if (num >= 65 && num <= 90) {
            System.out.println("upper-case");
        }
    }
}

