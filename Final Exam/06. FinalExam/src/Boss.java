
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Boss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        String regex = "\\|(?<Boss>[A-Z]{4,})\\|:#(?<title>[A-Za-z]+\\s[A-Za-z]+)#";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < num; i++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);

            String boss = "";
            String title = "";

            while (matcher.find()) {
                boss+= matcher.group("Boss");
                title += matcher.group("title");
            }

            int strength = boss.length();
            int armor = title.length();
            if (boss.length() > 0) {
                System.out.println(boss + ", " + "The " +title);
                System.out.println(">> Strength: " + strength);
                System.out.println(">> Armor: " + armor);
            } else {
                System.out.println("Access denied!");
            }

        }
    }
}