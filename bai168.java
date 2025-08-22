import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class game {
    String ma;
    String ten;
    String vao;
    String ra;
    int v;
    int r;
    int time;

    game(String ma, String ten, String vao, String ra) {
        this.ma = ma;
        this.ten = ten;
        this.vao = vao;
        this.ra = ra;
        
        // Chuyển đổi giờ vào thành phút
        String[] vaoParts = vao.split(":");
        this.v = Integer.parseInt(vaoParts[0]) * 60 + Integer.parseInt(vaoParts[1]);
        
        // Chuyển đổi giờ ra thành phút
        String[] raParts = ra.split(":");
        this.r = Integer.parseInt(raParts[0]) * 60 + Integer.parseInt(raParts[1]);
        
        // Tính thời gian chơi
        this.time = this.r - this.v;
    }

    public void in() {
        System.out.print(this.ma + " " + this.ten + " ");
        int h = this.time / 60;
        int k = this.time % 60;
        System.out.print(h + " gio " + k + " phut");
    }

    public int getTime() {
        return this.time;
    }
}

public class bai168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Bỏ dòng trống sau số lượng game thủ
        List<game> s = new ArrayList<>();
        while (t-- > 0) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String vao = sc.nextLine();
            String ra = sc.nextLine();
            game x = new game(ma, ten, vao, ra);
            s.add(x);
        }

        s.sort((x1, x2) -> Integer.compare(x2.getTime(), x1.getTime()));
        
        for (game x : s) {
            x.in();
            System.out.println();
        }
    }
}
