import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        System.out.printf("Nhap n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) (2*i+1) /(2*i+2);
        }
        System.out.printf("S(%d) = %f", n ,sum);
    }
}
