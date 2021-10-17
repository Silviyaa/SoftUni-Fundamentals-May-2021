import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 000 000 000 000 000 000
        String firstNumberStr = scanner.nextLine(); //"214124124312312"
        String secondNumberStr = scanner.nextLine(); //"3"
        BigInteger firstNumber = new BigInteger(firstNumberStr);
        BigInteger secondNumber = new BigInteger(secondNumberStr);

        //System.out.println(firstNumber.add(secondNumber)); // събиране(+)
        //System.out.println(firstNumber.subtract(secondNumber)); // изваждане(-)
        //System.out.println(firstNumber.divide(secondNumber)); // деление(/)
        System.out.println(firstNumber.multiply(secondNumber)); // умноение(*)



    }
}
