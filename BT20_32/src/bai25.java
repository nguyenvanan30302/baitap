import java.util.Scanner;

public class bai25 {
    public static void main(String[] args) {
        System.out.printf("Nhap n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i==0){
                if(i % 2 == 0){
                    System.out.printf("%d \n", i);
                    sum += i;
                }
            }
        }
        System.out.printf("%d ", sum);
    }
}
