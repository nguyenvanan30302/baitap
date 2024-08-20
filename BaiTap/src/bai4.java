import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.printf("Nhap n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1/(2*i);
        }
        System.out.printf("S(%d) = %f", n,sum);
    }

}
