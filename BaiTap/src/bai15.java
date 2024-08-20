import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        System.out.printf("Nhap so n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int sum1 = 0;
        for(int i = 1; i <= n; i++){
            sum1 += i;
            sum += (double) 1 /(sum1);
        }
        System.out.printf("S(%d) = %f",n, sum);
    }
}
