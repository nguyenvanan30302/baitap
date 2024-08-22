import java.util.Scanner;

public class bai27 {
    public static void main(String[] args) {
        System.out.printf("Nhap n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j =0;
        for (int i = 1; i <= n; i++) {
            if(n % i==0){
                if(i % 2 == 0){//tìm ước số là số chẵn
                    System.out.printf("%d ", i);
                    j++;    // lưu số lượng ước chẵn
                }
            }
        }
        System.out.printf("%d ", j);
    }
}
