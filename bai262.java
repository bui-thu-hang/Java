import java.util.*;
class sinhvien{
    String ma;
    String ten;
    double d1,d2,d3;
    double ut;
    double tong;
    sinhvien (String ma,String ten,double d1,double d2,double d3){
        this.ma=ma;
        this.ten=ten;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        String kv=ma.substring(0,3);
        if (kv.equals("KV1"))this.ut=0.5;
        else if (kv.equals("KV2"))this.ut=1;
        else if(kv.equals("KV3"))this.ut=2.5;
        this.tong=d1*2+d2+d3+this.ut;

    }
    public String chuan(double x){
        int h=(int)(x*10);
        return h%10==0?String.format("%.0f",x):String .format("%.1f",x);
    }
    public void in(){
        System.out.print (this.ma+" "+this.ten+" "+chuan(this.ut)+" "+chuan(this.tong));
    }
    public double getTong(){
        return this.tong;
    }

}
public class bai262{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<sinhvien>ds=new ArrayList<>();
        while (t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            double d1=sc.nextDouble();
            double d2=sc.nextDouble();
            double d3=sc.nextDouble();
            sc.nextLine();
            ds.add(new sinhvien(ma,ten,d1,d2,d3));
        }
        ds.sort((x1,x2)->Double.compare(x2.getTong(),x1.getTong()));
        int tieuchi=sc.nextInt();
        sc.nextLine();
        double chuan=ds.get(tieuchi-1).tong;
        System.out.printf("%.1f",chuan);
        System.out.println();
        for (sinhvien x:ds){
            x.in();
            if (x.tong>=chuan)System.out.println(" TRUNG TUYEN");
            else System.out.println(" TRUOT");
        }
        
    }
}