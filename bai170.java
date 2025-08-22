import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
class sinhvien {
    String ma;
    String ten;
    String lop;
    String mail;
    sinhvien (String ma,String ten,String lop,String mail){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
    }
    public void in (){
        System.out.print (this.ma+" "+this.ten+" "+this.lop+" "+this.mail);
    }
    public String getLop(){
        return this.lop;
    }
    public String getMa(){
        return this.ma;
    }
}
public class bai170{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<sinhvien> s= new ArrayList<>();
        while (t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            sinhvien x=new sinhvien(ma, ten,lop,mail);
            s.add(x);

        }
        s.sort(Comparator.comparing(sinhvien::getLop).thenComparing(sinhvien::getMa));
        for (sinhvien x:s){
            x.in();
            System.out.println();
        }
    }
}