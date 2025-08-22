import java.math.BigInteger;
import java.util.Scanner;

public class bai12 {
    // Phương thức tính giai thừa
    public static BigInteger gt(int n) {
        BigInteger tich = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            tich = tich.multiply(BigInteger.valueOf(i));
        }
        return tich;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger sum = BigInteger.ZERO;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum.add(gt(i));
        }

        System.out.println(sum);
        sc.close(); // Đóng Scanner sau khi sử dụng
    }
}
