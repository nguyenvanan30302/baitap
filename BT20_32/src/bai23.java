import java.util.Scanner;

public class bai23{
    public static void main(String[] args) {
        System.out.printf("Nhap n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j =0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                j++;
            }
        }
        System.out.printf("%d ", j);
    }
}
