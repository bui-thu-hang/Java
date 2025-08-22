import java.util.*;
import java.io.*;
class sv{
    String ma,ten,ns;
    int tuoi;
    double d1,d2,thuong,tb;
    String xl;
    sv(String ma,String ten,String ns,double d1,double d2){
        this.ma=ma;
        this.ten=ten;
        this.ns=ns;
        this.d1=d1;
        this.d2=d2;
        String [] h=ns.split("/");
        this.tuoi=2021-Integer.parseInt(h[2]);
        if (d1 >= 8 &&d2>=8){
            this.thuong=1;
        }
        else if (d1>=7.5 && d2>=7.5){
            this.thuong=0.5;
        }
        else this.thuong=0;
        this.tb=(int)Math.round ((d1+d2)/2+this.thuong);
        if (this.tb>10)this.tb=10;
        if (this.tb<5)this.xl="Truot";
        else if (this.tb>=5 &&this.tb<=6)this.xl="Trung binh";
        else if (this.tb==7)this.xl="Kha";
        else if (this.tb==8)this.xl="Gioi";
        else this.xl="Xuat sac";


    }
    public static String chuan(String s){
        String re=String.valueOf(s.charAt(0)).toUpperCase();
        re=re+s.substring (1).toLowerCase();
        return re;
    }
    public static String gep(String s){
        String []h=s.trim().split("\\s+");
        String tmp="";
        for (int i=0;i<h.length;i++){
            tmp+=chuan(h[i]);
            tmp+=" ";
        }
        return tmp.trim();
    }
    public void in(){
        System.out.println (this.ma+" "+gep(this.ten)+" "+this.tuoi+" "+this.tb+" "+this.xl);
    }

}
public class bai104{
    public static void main (String [] args){
        try {
            File f=new File ("XETTUYEN.in");
            Scanner sc=new Scanner (f);
            int t=sc.nextInt();
            sc.nextLine();
            List<sv>ds=new ArrayList<>();
            for (int i=1;i<=t;i++){
                String h=String.valueOf(i);
                if (h.length()==1)h='0'+h;
                String ma="PH"+h;
                String ten=sc.nextLine();
                String ns=sc.nextLine();
                double d1=sc.nextDouble();
                double d2=sc.nextDouble();
                sc.nextLine();
                ds.add(new sv(ma, ten, ns, d1, d2));
            }
            for (sv x:ds){
                x.in();
            }
        }
        catch(Exception e){

        }
    }
}