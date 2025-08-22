import java.util.*;
class sinhvien {
    String ma;
    String ten;
    float t,l,h;
    double ut;
    double tong;
    sinhvien(String ma,String ten,float t,float l,float h){
        this.ma=ma;
        this.ten=ten;
        this.t=t;
        this.l=l;
        this.h=h;
        String kv=ma.substring (0,3);
        if (kv.equals ("KV1"))this.ut=0.5;
        else if (kv.equals("KV2"))this.ut=1.0;
        else if (kv.equals("KV3"))this.ut=2.5;
        else this.ut=0;
        this.tong=t*2+l+h+this.ut;
    }
        public Double getTong(){
            return this.tong;
    
        }
        public String formatFloat (double x){
            int h=(int)(x*10);
            return h%10==0 ?String.format("%.0f",x):String.format("%.1f",x);
        }
        public void in(){
            System.out.print(this.ma+" "+this.ten+" ");
            System.out.print(formatFloat(this.ut)+" ");
            System.out.print (formatFloat(this.tong)+" ");
            if (this.tong>=24)System.out.println("TRUNG TUYEN");
            else System.out.println("TRUOT");

        }
    }

public class bai206{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<sinhvien>ds=new ArrayList<>();

        while (t-->0){
           String ma=sc.nextLine();
           String ten=sc.nextLine();
           float to=sc.nextFloat();
           float l=sc.nextFloat();
           float h=sc.nextFloat();
           sc.nextLine();
           ds.add(new sinhvien(ma,ten,to,l,h)); 
        }
        ds.sort((x1,x2)->Double.compare(x2.getTong(),x1.getTong()));
        for (sinhvien x:ds){
            x.in();
        }

    }
}