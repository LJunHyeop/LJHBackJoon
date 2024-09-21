import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 K, 1 Q, 2 R, 2 B, 2 N, 8F
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int f = sc.nextInt();
        k = 1-k;
        q = 1-q; 
        r = 2-r;
        b = 2-b; 
        n = 2-n;
        f = 8-f; 
        System.out.printf("%d %d %d %d %d %d", k, q, r, b, n, f);
    }
}