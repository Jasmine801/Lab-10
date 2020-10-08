package Lab10;
import java.util.Scanner;
public class Exercise1 {
    public static int Rec(int num, int sum, int k, int s) {
        if (num == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c;
        if(num == 0){
            c = 1;
        }
        else{
            c = 0;
        }
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += Rec(num + 1, sum + i, k, s);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k, s;
        System.out.print("K: "); k = in.nextInt();
        System.out.print("S: "); s = in.nextInt();
        System.out.println(Rec(0, 0, k, s));
    }
}