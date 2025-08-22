import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;

class CLB {
    String ma;
    String ten;
    int ve;

    CLB(String ma, String ten, int ve) {
        this.ma = ma;
        this.ten = ten;
        this.ve = ve;
    }

    public String getTen() {
        return this.ten;
    }
}

class TranDau {
    String maTran;
    String tenCLB;
    int doanhThu;

    TranDau(String maTran, String tenCLB, int doanhThu) {
        this.maTran = maTran;
        this.tenCLB = tenCLB;
        this.doanhThu = doanhThu;
    }

    public int getDoanhThu() {
        return this.doanhThu;
    }

    public String getTenCLB() {
        return this.tenCLB;
    }

    public void in() {
        System.out.println(this.maTran + " " + this.tenCLB + " " + this.doanhThu);
    }
}

public class bai213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc thông tin đội bóng
        int doi = sc.nextInt();
        sc.nextLine();
        Map<String, CLB> ds = new HashMap<>();
        for (int i = 0; i < doi; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int ve = sc.nextInt();
            sc.nextLine();
            ds.put(ma, new CLB(ma, ten, ve));
        }

        // Đọc thông tin trận đấu
        List<TranDau> kq = new ArrayList<>();
        int h = sc.nextInt();
        sc.nextLine();
        while (h-- > 0) {
            String nhap = sc.next();
            int nguoi = sc.nextInt();
            sc.nextLine();

            String matran = nhap.substring(1, 3); // Lấy mã CLB từ mã trận
            CLB j = ds.get(matran);

            if (j != null) {
                int doanhThu = nguoi * j.ve;
                kq.add(new TranDau(nhap, j.getTen(), doanhThu));
            }
        }

        // Sắp xếp kết quả theo doanh thu giảm dần, nếu bằng nhau thì theo tên CLB
        kq.sort(Comparator.comparing(TranDau::getDoanhThu).reversed().thenComparing(TranDau::getTenCLB));

        // In kết quả
        for (TranDau tran : kq) {
            tran.in();
        }
    }
}
