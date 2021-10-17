import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. input -> model, radius, height
        //2. volume per keg = π * r^2 * h
        //3. max volume
        int countKegs = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxModel = "";
        for (int keg = 1; keg <= countKegs; keg++) {
            String model = scanner.nextLine(); //модел на кега
            double radius = Double.parseDouble(scanner.nextLine());//радиус
            int height = Integer.parseInt(scanner.nextLine()); //височина

            double volume = Math.PI * Math.pow(radius, 2) * height;
            //проверка дали обемът е макс
            if (volume > maxVolume) {
                maxVolume = volume;
                maxModel = model;
            }
        }

        System.out.println(maxModel);
    }
}
