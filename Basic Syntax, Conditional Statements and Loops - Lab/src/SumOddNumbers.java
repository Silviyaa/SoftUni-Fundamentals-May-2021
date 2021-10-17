import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i<n; i++){
            System.out.print(2 * i + 1 );
            System.out.println("");
            sum += 2 * i + 1;

        }
        System.out.printf("Sum: %d",sum);
    }
}
