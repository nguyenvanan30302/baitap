import java.util.Scanner;

public class bai18 {
    public static void  main(String[] args) {
        System.out.printf("Nhap so x va n");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int T = 1;
        double sum = 0;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                T *= (2 * j);
            }
            sum += Math.pow(x, 2 * i)/T;
        }
        System.out.printf("T(%d) = %f", n, sum);
    }
}
