import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class sinhvien {
    int tt;
    String ma;
    String ten;
    String lop;
    String mail;
    String dn;
    sinhvien (int tt,String ma,String ten,String lop,String mail,String dn){
        this.tt=tt;
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
        this.dn=dn;
    }
    public void in (){
        System.out.println (this.tt+" "+this.ma+" "+this.ten+" "+this.lop+" "+this.mail+" "+this.dn);
    }
    public String getMa(){
        return this.ma;
    }
}
public class thuctap{
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
        s.sort((x1,x2)->x1.getMa().compareTo(x2.getMa()));
        int h=sc.nextInt();
        for (int i=0;i<h;i++){
            String truyvan =sc.nextLine();
            for (sinhvien x:s){
                if (x.dn.equals(truyvan)){
                    x.in();
                }
            }
        }
    }
}