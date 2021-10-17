import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //start
        //end
        //1. отпечатам числата в диапазона [start; end]
        //2. сумирам -> отпечатвам сумата
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0; //сума

        for (int number = startNumber; number <= endNumber ; number++) {
            System.out.print(number + " ");
            sum += number; //sum = sum + number;
        }

        System.out.println();
        System.out.println("Sum: " + sum);
    }
}