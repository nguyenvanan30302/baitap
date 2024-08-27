import java.util.Scanner;

public class bai43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n  ");
        int n = sc.nextInt();
        int a = 0;
        while (n > 0) {
            n /= 10; // chia 10 để xoá số sau dấu phẩy,
            a++;     // mỗi 1 lần chia thành công là tăng a

        }

        System.out.println("so luong chu so n : " + a);
    }
}
