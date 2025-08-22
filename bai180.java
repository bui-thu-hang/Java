import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class SinhVien {
    String ma;
    String ten;
    String lop;
    Float d1,d2,d3;
    float so;
    SinhVien (String ma,String ten,String lop,float d1,float d2,float d3){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
    }
    public void in(int stt){
        System.out.print (stt+" "+this.ma+" "+this.ten+" "+this.lop+" ");
        System.out.printf("%.1f",this.d1);
        System.out.print(" ");
        System.out.printf("%.1f",this.d2);
        System.out.print(" ");
        System.out.printf("%.1f",this.d3);
    }
    public String getTen(){
        return this.ten;
    }
}
public class bai180{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<SinhVien>sapxep= new ArrayList<>();
        for (int i=1;i<=t;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine ();
            String lop=sc.nextLine();
            Float d1=sc.nextFloat();
            Float d2=sc.nextFloat();
            Float d3=sc.nextFloat();
            sc.nextLine();
            SinhVien x=new SinhVien(ma, ten, lop, d1, d2, d3);
            sapxep.add(x);


        }
        sapxep.sort((x1,x2)->x1.getTen().compareTo(x2.getTen()));
        for (int i=0;i<sapxep.size();i++){
            sapxep.get(i).in(i+1);
            System.out.println();
        }
    }
}