import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);

        int N;
        int F1;
        int F2;
        int maxSize = 0;

        N = in.nextInt();
        
        if (N >= 1 || N <= 3000) {
            for (int i = 0; i<N; i++) {
                F1 = in.nextInt();
                F2 = in.nextInt();
                if (F1 >= 1 || F1<=1000 && F2 >= 1 || F2 <=1000) {
                    maxSize = cardStacks(F1,F2);
                }
                System.out.println(maxSize );
            }
        }
    }
    
    public static int cardStacks(int c1, int c2) {
       int max = 0;
       if (c1 > c2) {
        for (int i = 1; i<= c1; i++) {
            if (c1 % i == 0) {
                if (c2 % i == 0) {
                    max = i;
                }   
            }
        }
       } else if (c2 > c1) {
        for (int j = 1; j<= c2; j++) {
            if (c2 % j == 0) {
                if (c1 % j == 0) {
                    max = j;
                }
            }
        }
       } 
       return max;
    }

}

