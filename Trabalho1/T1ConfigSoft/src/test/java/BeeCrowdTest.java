import java.util.Scanner;

public class BeeCrowdTest {
    public static void main(String args[]) {
        int n, a, b;
        int dividendo, divisor, c;

        Scanner in = new Scanner (System.in);
        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            a = in.nextInt();
            b = in.nextInt();

            if (b > a) {
                dividendo = b;
                divisor = a;
            } else {
                dividendo = a;
                divisor = b;
            }

            while (dividendo % divisor != 0) {
                c = dividendo % divisor;
                dividendo = divisor;
                divisor = c;
            }
            System.out.println(divisor);
        }
    }
}
