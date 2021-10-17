import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1-ви начин
//
//        int number = Integer.parseInt(scanner.nextLine());
//        //1 -> 10
//        int multiplier = 1;
//
//        while(multiplier <= 10){
//            //Умножаваме
//            int result = multiplier * number;
//            System.out.printf("%d X %d = %d%n", number, multiplier, result);
//            multiplier++;
//        }

//        2-ри начин
        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        do {
            int result = multiplier * number;
            System.out.printf("%d X %d = %d%n", number, multiplier, result);
            multiplier++;
        } while (multiplier <= 10);
    }
}