import java.util.Scanner;

public class bai61 {
    public static String tach(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng new line sau khi nhập số t
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            String[] h = s.split("\\s+"); // Chỉnh lại biểu thức chính quy
            for (int i = 0; i < h.length; i++) {
                System.out.print(tach(h[i]));
                if (i < h.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Xuống dòng sau mỗi trường hợp test
        }
    }
}
