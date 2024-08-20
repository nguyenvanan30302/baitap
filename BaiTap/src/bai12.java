import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        System.out.printf("Nhap x va n ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (int) Math.pow(x, i);
        }
        System.out.printf("S = %d",sum);
    }

}
