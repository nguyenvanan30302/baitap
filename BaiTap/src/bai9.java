import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        System.out.printf("Nhap so n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = 1;

        for(int i = 1; i <= n; i++){
            T *= i;
        }
        System.out.printf("T(%d) = %d",n, T);
    }
}
