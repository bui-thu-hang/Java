import java.io.*;
import java.util.*;
class giangvien {
    String ma,ten;
    double hsl;
    String kk;
    int gio;
    double hs;
    int luong;
    giangvien (String ma,String ten,double hsl,String kk,int gio){
        this.ma=ma;
        this.ten=ten;
        this.hsl=hsl;
        this.kk=kk;
        this.gio=gio;
        if (kk.equals ("A"))this.hs=1.5;
        else if (kk.equals("B"))this.hs=1.2;
        else if (kk.equals ("C"))this.hs=1;
        double tam=this.hsl*this.hs*3000;
        if (this.gio>=500)this.luong=(int)Math.round(tam);
        else if (this.gio<=100)this.luong=(int)Math.round(tam-tam*0.15);
        else if (this.gio>=101 &&this.gio<=350)this.luong=(int)Math.round(tam-tam*0.1);
        else this.luong=(int)Math.round(tam-tam*0.05);

    }
    public void in (){
        System.out.println (this.ma+" "+this.ten+" "+this.hsl+" "+this.kk+" "+this.gio+" "+this.luong);
    }
}
public class th1{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
            int t=sc.nextInt ();
            List<giangvien >ds=new ArrayList<>();
            sc.nextLine ();

            for (int i=1;i<=t;i++){
                String h=String.valueOf(i);
                if (h.length()==1)h="00"+h;
                else if (h.length()==2)h='0'+h;
                String ma="PM"+h;
                String ten=sc.nextLine ();
                double hsl=sc.nextDouble();
                sc.nextLine ();
                String kk=sc.nextLine ();
                int gio=sc.nextInt();
                sc.nextLine();
                ds.add(new giangvien(ma, ten, hsl, kk, gio));

            }
            String s=sc.nextLine();
            s=s.toLowerCase();
            for (giangvien x:ds){
                
                if (x.ten.toLowerCase().contains(s))
                    x.in();
                
            
        }
    }
}