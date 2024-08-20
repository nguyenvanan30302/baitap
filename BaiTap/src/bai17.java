import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        System.out.printf("Nhap so x va n");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int T = 1;
        double sum = 0;
        for(int i = 1; i <= n; i++){
            T *= i;
            sum += (Math.pow(x,(i+1)))/T;
        }
        System.out.printf("T(%d) = %f",n, sum);
    }
}
