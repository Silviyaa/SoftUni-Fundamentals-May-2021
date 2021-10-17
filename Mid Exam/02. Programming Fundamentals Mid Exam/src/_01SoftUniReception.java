import java.util.Scanner;

public class _01SoftUniReception {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int firstLine = Integer.parseInt(scanner.nextLine());
            int secondLine = Integer.parseInt(scanner.nextLine());
            int treeLine =Integer.parseInt(scanner.nextLine());
            int fourthLine = Integer.parseInt(scanner.nextLine());

            int totalLine = firstLine+secondLine+treeLine;

            int hours = 0;

            while (fourthLine > 0){
                hours++;

                if(hours % 4 !=0){
                    fourthLine -= totalLine;
                }

            }
        System.out.printf("Time needed: %dh.",hours);
        }
}
