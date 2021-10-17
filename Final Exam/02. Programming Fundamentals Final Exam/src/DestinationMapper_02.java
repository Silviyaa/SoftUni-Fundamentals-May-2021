import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String placesStr = scanner.nextLine();
        String regex = "(?<simbol>[=/])(?<text>[A-Z][A-Za-z]{2,})\\1"; // "=Hawai=/Cyprus/=Invalid/invalid==i5valid=/I5valid/=i="
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(placesStr);

        List<String> locations = new ArrayList<>();
        while (matcher.find()) {
            locations.add(matcher.group(2));
        }

        System.out.println("Destinations: " + String.join(", ", locations));
        System.out.println("Travel Points: " +  locations.stream().mapToInt(l->l.length()).sum());


    }
}
