import java.util.Scanner;

// Lớp Vihicle
class Vihicle {
    private String vin;
    private String manufacturer;
    private int year;
    private double cost;
    private String color;

    // Hàm khởi tạo không tham số
    public Vihicle() {
        this.vin = "";
        this.manufacturer = "";
        this.year = 0;
        this.cost = 0.0;
        this.color = "";
    }

    // Getter và Setter cho các thuộc tính
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức toString trả về thông tin của phương tiện
    @Override
    public String toString() {
        return vin + " " + manufacturer.toUpperCase() + " " + cost + " " + year + " " + color;
    }

    // Phương thức input để nhập thông tin cho phương tiện
    public void input(Scanner in) {
        vin = in.nextLine();
        manufacturer = in.nextLine();
        color = in.nextLine();
        year = in.nextInt();
        cost = in.nextDouble();
        in.nextLine();  // Đọc bỏ dòng trống
    }
}

// Lớp quản lý MS
class MS {
    private Vihicle[] a;
    private int n;  // Số lượng phương tiện

    // Hàm khởi tạo không tham số
    public MS() {
        this.a = new Vihicle[0];
        this.n = 0;
    }

    // Phương thức input để nhập số lượng phương tiện và thông tin cho từng phương tiện
    public void input(Scanner in) {
        n = in.nextInt();
        in.nextLine();  // Đọc bỏ dòng trống

        // Khởi tạo mảng a với n phần tử
        a = new Vihicle[n];

        // Nhập thông tin cho từng phương tiện
        for (int i = 0; i < n; i++) {
            a[i] = new Vihicle();
            a[i].input(in);
        }
    }

    // Phương thức out để xuất danh sách các phương tiện và số lượng
    public void out() {
        for (int i = 0; i < n; i++) {
            System.out.println(a[i].toString());
        }
        System.out.println(n);
    }
}

// Lớp chứa hàm main
public class bai9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MS ms = new MS();
        ms.input(in);
        ms.out();
    }
}
