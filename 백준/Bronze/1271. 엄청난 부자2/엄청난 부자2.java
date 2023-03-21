import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();

        BigInteger cost = n.divide(m);
        BigInteger changes = n.mod(m);

        System.out.println(cost);
        System.out.println(changes);
    }
}