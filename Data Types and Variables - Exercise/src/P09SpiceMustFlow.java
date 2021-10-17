import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());
        //всеки ден -> добив - 26
        int days = 0; //общо работени дни
        int totalAmount = 0; //общ брой подправки
        //stop: yield < 100
        while(yield >= 100) {
            int workedSpices = yield - 26;
            totalAmount += workedSpices;
            yield -= 10;
            days++;
        }

        System.out.println(days);
        //ako има подправки взимат 26
        //ако няма не взимат нищо
        if(totalAmount >= 26) {
            totalAmount -= 26;
        }
        System.out.println(totalAmount);

    }
}
