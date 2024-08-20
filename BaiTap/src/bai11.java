import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        System.out.printf("Nhap n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i*(i + 1);
        }
        System.out.printf("S(%d) = %d", n,sum);
    }

}
