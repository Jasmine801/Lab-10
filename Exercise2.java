package Lab10;

import java.util.Scanner;

public class Exercise2 {
    public static int Rec(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return Rec(a, b - 1) + Rec(a - 1, b - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("K: "); a = in.nextInt();
        System.out.print("S: "); b = in.nextInt();
        System.out.println(Rec(a, b));
    }
}
