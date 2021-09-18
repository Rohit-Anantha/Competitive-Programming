import java.math.BigInteger;
import java.util.Scanner;

public class RatmansPuzzle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger goalInteger = new BigInteger(scan.next() + "");
        BigInteger maxInteger = new BigInteger((new BigInteger(2 + "").pow(scan.nextInt())).toString(10));
        int counter = 0;
        for (BigInteger i = new BigInteger(0 + ""); i.compareTo(maxInteger) < 0; i.add(new BigInteger("1"))) {
            for (BigInteger j = new BigInteger(i.toString()); j.compareTo(maxInteger) < 0; j.add(new BigInteger("1"))) {
                if (i.xor(j).compareTo(goalInteger) == 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}