import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        //за всеки символ -> прочитаме -> сумираме int стойността
        int n = Integer.parseInt(scanner.nextLine()); //брой на символите
        int sum = 0; //сума от ascii codes
        for (int count = 1; count <= n; count++) {
            char symbol = scanner.nextLine().charAt(0);
            sum += (int)symbol;
        }

        System.out.println("The sum equals: " + sum);
        }
}
