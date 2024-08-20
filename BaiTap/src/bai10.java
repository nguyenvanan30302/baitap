import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        System.out.printf("Nhap so x va n ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.printf("T(%d,%d) = %f", x, n, Math.pow(x, n));
    }
}
