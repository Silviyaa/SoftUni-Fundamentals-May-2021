import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        //1 . обходим всички стойности
        //2. за всяка стойност -> символа срещу тази стойност
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        for (int code = startNumber; code <= endNumber; code++) {
            System.out.print((char)code + " ");
        }
    }
}
