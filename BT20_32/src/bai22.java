import java.util.Scanner;

public class bai22 {
    public static void main(String[] args) {
        System.out.printf("Nhap n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum *= i;
            }
        }
        System.out.printf("sum = %d", sum);
    }
}
