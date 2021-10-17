import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //"P34562Z q2576f   H456z"
        String [] passwords = input.split("\\s+"); //["P34562Z", "q2576f", "H456z"]
        double totalSum = 0; //обща сума от всички пароли
        for (String password : passwords) {
            //пресмятаме стойността
            double modifiedNumber = getModifiedNumber(password);
            //сумираме
            totalSum += modifiedNumber;
        }
        System.out.printf("%.2f", totalSum);
    }

    private static double getModifiedNumber (String password) {
        //{буква}{число}{буква} -> "P34562Z"
        char firstLetter = password.charAt(0); //"P"
        char secondLetter = password.charAt(password.length() - 1);
        //първи начин: int number = Integer.parseInt(password.replace(firstLetter, ' ').replace(secondLetter, ' ').trim());
        //втори начин:
        StringBuilder builder = new StringBuilder(password);
        double number = Double.parseDouble(builder.deleteCharAt(0).deleteCharAt(builder.length() - 1).toString());
        //трети начин: int number = Integer.parseInt(password.substring(1, password.indexOf(secondLetter)));

        //проверка за първата буква
        if (Character.isUpperCase(firstLetter)) { //аски кода >= 65 и <= 90
            //позиция в азбуката
            int positionUpperLetter = (int)firstLetter - 64;
            number = number / positionUpperLetter;
        } else {
            int positionLowerLetter = (int)firstLetter - 96;
            number = number * positionLowerLetter;
        }

        //проверка за втората буква
        if(Character.isUpperCase(secondLetter)) {
            int positionUpperLetter = (int)secondLetter - 64;
            number = number - positionUpperLetter;
        } else {
            int positionLowerLetter = (int)secondLetter - 96;
            number = number + positionLowerLetter;
        }

        return number;
    }
}
