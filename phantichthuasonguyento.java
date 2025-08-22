package javapackage;
import java.util.Scanner;
class Matran{
    private int[][] a;

    public Matran(int[][] a) {
        this.a = a;
    }

    public Matran(int n) {
        this.a=new int[n][n];
    }
    public int[][] getMatran() {
        return this.a;
    }

    public int[][] getA() {
        return a;
    }
    public int getKT() {
        return this.a.length;
    }
    public void input(Scanner in) {
        int n = this.a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.a[i][j] = in.nextInt();
            }
        }
    }
    public void out() {
        int n = this.a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(this.a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Matran tong(int[][] b) {
        int n = this.a.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = this.a[i][j] + b[i][j];
            }
        }
        return new Matran(result);
    }
}
public class phantichthuasonguyento {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //nhap kich thuoc
        int n=sc.nextInt();
        Matran m=new Matran(n);
        //nhap ma tran a
        m.input(sc);
        Matran b=new Matran(m.getKT());
        //nhap ma tran b
        b.input(sc);
        Matran t=m.tong(b.getMatran());
        //viet ra ma tran tong
        t.out();
    }
}