package Lab10;

import java.util.Scanner;

public class Exercise3 {
    public static String Rec(int N) {
        if (N < 10) {
            return Integer.toString(N);
        }
        else {
            return Rec(N / 10) + " " + N % 10;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        System.out.print("K: "); N = in.nextInt();
        System.out.println(Rec(N));
    }
}
