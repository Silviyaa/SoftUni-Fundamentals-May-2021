import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        //n -> броят числа, които ще трябва да проверим
        // за всяко едно от тях -> дали е специално
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= n ; num++) {
            int digits = num;
            int sum = 0;

            while(digits > 0){
                int currentDigit = digits % 10;
                sum = sum + currentDigit;
                digits = digits / 10;
            }

            if(sum == 5 || sum == 7 || sum == 11){
                System.out.println(num + " -> True");
            } else {
                System.out.println(num + " -> False");
            }
        }
    }
}
