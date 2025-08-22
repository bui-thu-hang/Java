import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class giaovien{
    String ma;
    String ten;
    double hs;
    String kk;
    int gio;
    double hskk;

    double luong;
    long tong;
    giaovien(String ma,String ten,double hs,String kk,int gio){
        this.ma=ma;
        this.ten=ten;
        this.hs=hs;
        this.kk=kk;
        this.gio=gio;
        if (this.kk.equals("A"))this.hskk=1.5;
        else if (this.kk.equals("B"))this.hskk=1.2;
        else if (this.kk.equals("C"))this.hskk=1;
        this.luong=hs*this.hskk*3000;
        if (this.gio>=500)this.tong=Math.round(this.luong);
        else if (this.gio>=0&&this.gio<=100)this.tong=Math.round(this.luong-this.luong*15/100.0);
        else if (this.gio>=101&&this.gio<=350)this.tong=Math.round(this.luong-this.luong*10/100.0);
        else this.tong=Math.round (this.luong-this.luong*5/100.0);



    }
    public void in (){
        System.out.println (this.ma+" "+this.ten+" "+this.hs+" "+this.kk+" "+this.gio+" "+this.tong);
    }
}
public class thuchanhbai1{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<giaovien>s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h="00"+h;
            else if (h.length()==2)h='0'+h;
            String ma="PM"+h;
            String ten=sc.nextLine();
            double hs=sc.nextDouble();
            sc.nextLine();
            String kk=sc.nextLine();
            int gio=sc.nextInt();
            sc.nextLine();
            giaovien x=new giaovien(ma, ten, hs, kk, gio);
            s.add(x);
        }
        for (giaovien x:s){
            x.in();
        }
    }
}