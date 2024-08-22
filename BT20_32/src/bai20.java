import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        System.out.printf("Nhap n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("Cac uoc so cua n la ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {   //tìm ước của n
                System.out.printf("%d ", i);
            }
        }
    }
}
