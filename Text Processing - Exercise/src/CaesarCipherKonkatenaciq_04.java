import java.util.Scanner;

public class CaesarCipherKonkatenaciq_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String builderEncryptedText = "";

        for (char symbol : text.toCharArray()) {
            //всеки един символ да го криптираме
            char encryptedSymbol = (char)(symbol + 3);
            builderEncryptedText += encryptedSymbol;
        }

        System.out.println(builderEncryptedText);

    }

}
