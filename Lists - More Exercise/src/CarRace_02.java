import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> leftRacer = new ArrayList<>();
        List<Integer> rightRacer = new ArrayList<>();
        for (int i = 0; i <= (myList.size() / 2) - 1; i++) {
            leftRacer.add(myList.get(i));
        }
        for (int i = myList.size() - 1; i >= (myList.size() / 2) + 1; i--) {
            rightRacer.add(myList.get(i));
        }
        double leftRacerTime = 0;
        for (Integer currTime : leftRacer) {
            if (currTime == 0) {
                leftRacerTime *= 0.8;
            }
            leftRacerTime += currTime;
        }
        double rightRacerTime = 0;
        for (Integer currTime : rightRacer) {
            if (currTime == 0) {
                rightRacerTime *= 0.8;
            }
            rightRacerTime += currTime;
        }
        if (leftRacerTime < rightRacerTime) {
            System.out.printf("The winner is left with total time: %.1f", leftRacerTime);
        } else {
            System.out.printf("The winner is right with total time: %.1f", rightRacerTime);
        }
        System.out.println();
    }
}