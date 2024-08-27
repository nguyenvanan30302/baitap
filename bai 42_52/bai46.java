import java.util.Scanner;

public class bai46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n ");
        int n = sc.nextInt();
        int i = 0 ;
        while (n > 0) {
            int a = n % 10; //phep chia so nguyen, chia 10 thi phan` du la so' sau dau' phay
            if(a % 2 != 0) {
                i++;
            }
            n /= 10 ;
        }

        System.out.println("so luong so le la : " + i);
    }
}
