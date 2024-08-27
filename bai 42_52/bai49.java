import java.util.Scanner;

public class bai49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n ");
        int n = sc.nextInt();
        while (n > 0) {
            n /= 10 ;
        }
        System.out.printf("so dau tien la : " + n);
    }

}
