import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.printf("Nhap so n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.printf("S(%d) = %d",n, sum);
    }
}
