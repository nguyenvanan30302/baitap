import java.util.Scanner;

public class bai42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n ");
        int n = sc.nextInt();
        int k = 0;
        int S = 0;
        while (S + k + 1 < n) {
            k++;
            S += k;
        }

        System.out.println("so lon nhat la : " + k);
    }
}
