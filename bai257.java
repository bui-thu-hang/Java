import java.util.*;
class giaovien{
    String tt;
    String ten;
    String ma;
    float d1;
    float d2;
    String mon;
    double tong;
    double cong;
    String kq;
    giaovien (String tt,String ten,String ma,float d1,float d2){
        this.tt=tt;
        this.ten=ten;
        this.ma=ma;
        this.d1=d1;
        this.d2=d2;
        String m1=ma.substring (0,1);
        String kv=ma.substring (1);
        if (m1.equals("A"))this.mon="TOAN";
        else if (m1.equals("B"))this.mon="LY";
        else if (m1.equals("C"))this.mon="HOA";
        if (kv.equals("1"))this.cong=2;
        else if (kv.equals("2"))this.cong=1.5;
        else if (kv.equals("3"))this.cong=1;
        else if (kv.equals("4"))this.cong=0;
        this.tong=d1*2+d2+this.cong;
        if (this.tong>=18)kq="TRUNG TUYEN";
        else kq="LOAI";
    }
    public void in(){
        System.out.print(this.tt+" "+this.ten+" "+this.mon+" ");
        System.out.printf("%.1f",this.tong);
        System.out.println(" "+this.kq);
    }
    public double getTong(){
        return this.tong;
    }
}
public class bai257{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt ();
        sc.nextLine();
        List<giaovien>ds=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h='0'+h;
            String tt="GV"+h;
            String ten=sc.nextLine();
            String ma=sc.nextLine();
            float d1=sc.nextFloat();
            float d2=sc.nextFloat();
            sc.nextLine();
            ds.add(new giaovien(tt,ten,ma,d1,d2));

        }
        ds.sort((x1,x2)->Double.compare(x2.getTong(),x1.getTong()));
        for (giaovien x:ds){
            x.in();
        }
    }
}