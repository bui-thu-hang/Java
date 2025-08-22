import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class sinhvien {
    int stt;
    String ma;
    String ten;
    String lop;
    String mail;
    String dn;
    sinhvien(int stt,String ma,String ten,String lop,String mail,String dn){
        this.stt=stt;
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
        this.dn=dn;
    }
    public void in(){
        System.out.println(this.stt+" "+this.ma+" "+this.ten+" "+this.lop+" "+this.mail+" "+this.dn);
    }
    public String getTen(){
        return this.ten;
    }
}
public class bai183{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<sinhvien>s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            String dn=sc.nextLine();
            sinhvien x=new sinhvien(i, ma, ten, lop, mail, dn);
            s.add(x);
        }
        s.sort((x1,x2)->x1.getTen().compareTo(x2.getTen()));
        int h=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<h;i++){
            String truyvan=sc.nextLine();
            for (sinhvien x:s){
                if (x.dn.equals(truyvan)){
                    x.in();
                }
            }
        }
    }
}