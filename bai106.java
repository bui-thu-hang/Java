import java.util.*;
import java.io.*;
class sv{
    String ma,ten;
    double d1,d2,d3,tb;
    String xl;
    sv(String ma,String ten,double d1,double d2,double d3){
        this.ma=ma;
        this.ten=ten;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.tb=d1*0.25+d2*0.35+d3*0.4;
        if (this.tb>=8)this.xl="GIOI";
        else if (this.tb>=6.5)this.xl="KHA";
        else if (this.tb>=5)this.xl="TRUNG BINH";
        else this.xl="KEM";


    }
    public String ten(String s){
        String res=String.valueOf(s.charAt(0)).toUpperCase();
        res=res+s.substring(1).toLowerCase();
        return res;
    }
    public String chuan(String s){
        String []h=s.split("\\s+");
        String tm="";
        for (int i=0;i<h.length;i++){
            tm+=ten(h[i]);
            tm+=" ";

        }
        return tm;

    }
    public void in(){
        System.out.print(this.ma+" "+this.chuan(this.ten));
        System.out.printf("%.2f",this.tb);
        System.out.println(" "+this.xl);

    }
    public double getTb(){
        return this.tb;
    }

}
public class bai106{
    public static void main (String [] args){
        try{
            File f=new File ("BANGDIEM.in");
            Scanner sc=new Scanner (f);
            int t=Integer.parseInt(sc.nextLine());
            List<sv>s=new ArrayList<>();
            for (int i=1;i<=t;i++){
                String h=String.valueOf(i);
                if (h.length()==1)h='0'+h;
                String ma="SV"+h;
                String ten=sc.nextLine().trim();
                double d1=Double.parseDouble (sc.nextLine().trim());
                double d2=Double.parseDouble (sc.nextLine().trim());
                double d3=Double.parseDouble (sc.nextLine().trim());
                s.add(new sv(ma, ten, d1,d2, d3));


            }
            s.sort ((x1,x2)->Double.compare(x2.getTb(),x1.getTb()));
            for (sv x:s){
                x.in();
            }
        }
        catch(Exception e){

        }
    }
}