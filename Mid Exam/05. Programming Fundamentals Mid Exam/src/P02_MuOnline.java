import java.io.Console;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> dungeonsRooms = Arrays.stream(scanner.nextLine().split("|")).collect(Collectors.toList());
        int health = 100;
        int bitcoins = 0;

        for (int i = 0; i<dungeonsRooms.size();i++){
            String[] commandArray = dungeonsRooms.stream().toArray(i);

            if("potion".equals(commandArray[0])){
                int numberForHealth = Integer.parseInt(commandArray[1]);
                int currentHealth = health;
                health = currentHealth + numberForHealth;
                if(health > 100){
                    health = 100;
                }
                if(health<100){
                    System.out.printf("You healed for %d hp.",numberForHealth);
                    System.out.printf("Current health: %d hp.",health);
                }else {
                    System.out.printf("You healed for %d hp.",100 - currentHealth);
                    System.out.printf("Current health: %d hp.",health);
                }
            }
            else if("chest".equals(commandArray[0])){
                int numberForBitcoins = scanner.nextLine(commandArray[1]);
                bitcoins = bitcoins + numberForBitcoins;
                System.out.printf("You found %d bitcoins.",numberForBitcoins);
            }else {
                String monster = commandArray[0];
                int attackTheMonster = scanner.nextLine(commandArray[1]);
                health = health - attackTheMonster;
                if(health > 0){
                    System.out.printf("You slayed %d.",monster);
                }else if(health<=0){
                    System.out.printf("You died! Killed by %d.",monster);
                    System.out.printf("Best room: %d",i+1);
                    return;
                }
            }
        }
        System.out.printf("You've made it!", "Bitcoins: %d", "Health: %d",bitcoins,health);

        System.out.printf("Bitcoins: %d",bitcoins);
        System.out.printf("Health: %d",health);
    }
}
