import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class sinhvien {
    int tt;
    String ten;
    String ngay;
    double d1;
    double d2;
    double d3;
    double tong;
    sinhvien (int tt,String ten,String ngay,double d1,double d2,double d3){
        this.tt=tt;
        this.ten=ten;
        this.ngay=ngay;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.tong=d1+d2+d3;

    }
    public void in(){
        System.out.print(this.tt+" "+this.ten+" "+this.ngay+" ");
        System.out.printf("%.1f",this.tong);
    }

}
public class bai166{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<sinhvien>ds=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String ngay=sc.nextLine();
            double d1=sc.nextDouble();
            double d2=sc.nextDouble();
            double d3=sc.nextDouble();
            sc.nextLine();
            sinhvien x=new sinhvien(i, ten, ngay, d1, d2, d3);
            ds.add(x);
        }
        double max=-1;
        List<sinhvien>thukhoa=new ArrayList<>();
        for (sinhvien x:ds){
            if (x.tong>max){
                max=x.tong;
                thukhoa.clear();
                thukhoa.add(x);
            }
            else if (x.tong==max){
                thukhoa.add(x);
            }
        }
        for (sinhvien x:thukhoa){
            x.in();
            System.out.println();
        }

    }
}