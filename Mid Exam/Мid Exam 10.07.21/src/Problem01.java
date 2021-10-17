import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biscuitsPerDayPerWorker = Integer.parseInt(scanner.nextLine());
        int  totalWorkers = Integer.parseInt(scanner.nextLine());
        int totalBiscuitsPerDay = totalWorkers * biscuitsPerDayPerWorker;
        int amountOfBiscuitsOfCompFactory = Integer.parseInt(scanner.nextLine());
        double totalBiscuits = 0;

        for (int day = 1; day <= 30; day++) {
            totalBiscuits += totalBiscuitsPerDay;
            if (day % 3 == 0) {
                totalBiscuits -= Math.ceil(0.25 * totalBiscuitsPerDay);
            }
        }
        System.out.printf("You have produced %.0f biscuits for the past month.%n", totalBiscuits);
        double difference = Math.abs(totalBiscuits - amountOfBiscuitsOfCompFactory);
        if (totalBiscuits > amountOfBiscuitsOfCompFactory) {
            double percentage = difference / amountOfBiscuitsOfCompFactory * 100;
            System.out.printf("You produce %.2f percent more biscuits.", percentage);
        } else {
            double percentage = difference / amountOfBiscuitsOfCompFactory * 100;
            System.out.printf("You produce %.2f percent less biscuits.", percentage);
        }
    }

}
