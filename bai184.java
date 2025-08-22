import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class sinhvien {
    String ma;
    String ten;
    int sv;
    sinhvien (String ma,String ten,int sv){
        this.ma=ma;
        this.ten=ten;
        this.sv=sv;

    }
    public void in(){
        System.out.println(this.ma+" "+this.ten+" "+this.sv);
    }
}
public class bai184{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<sinhvien>s=new ArrayList<>();
        while (t-- >0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int sv=sc.nextInt();
            sc.nextLine();
            sinhvien x=new sinhvien(ma, ten, sv);
            s.add(x);
        }
        int h=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<h;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN " +b+" SINH VIEN:");
            for (sinhvien x:s){
                if (x.sv>=a&&x.sv<=b){
                    x.in();
                }
            }
        }
    }
}