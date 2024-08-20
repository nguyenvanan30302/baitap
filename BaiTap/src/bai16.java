import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        System.out.printf("Nhap so x va n");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        double sum = 0;
        int sum1 = 0;
        for(int i = 1; i <= n; i++){
            sum1 += i;
            sum += (Math.pow(x,(i+1))) /(sum1);
        }
        System.out.printf("S(%d) = %f",n, sum);
    }
}
