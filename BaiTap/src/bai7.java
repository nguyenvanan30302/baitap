import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        System.out.printf("Nhap n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i < n; i++) {
            sum += (double) i /(i+1);
        }
        System.out.printf("S(%d) = %f", n ,sum);
    }
}
