import java.util.Scanner;

public class bai26 {
    public static void main(String[] args) {
        System.out.printf("Nhap n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i % 2 != 0) {   // tìm ước lẻ
                    System.out.printf("%d ", i);
                    sum *= i;
                }
            }
        }
        System.out.printf("%d ", sum);
    }
}
