import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
class sinhvien {
    String ma;
    String ten;
    String ns;
    float d1;
    float d2;
    int tuoi;
    double cong;
    double tb;
    String xl;
    sinhvien (String ma,String ten,String ns,float d1,float d2){
        this.ma=ma;
        this.ten=ten;
        this.ns=ns;
        this.d1=d1;
        this.d2=d2;
        String []h=ns.split("/");
        int nam=Integer.parseInt(h[2]);
        this.tuoi=2021-nam;
        if (d1>=8&&d2>=8)this.cong=1;
        else if (d1>=7.5&&d2>=7.5)this.cong=0.5;
        else this.cong=0;
        this.tb=Math.round((d1+d2)/2+this.cong);
        if (this.tb>10)this.tb=10;
        if (this.tb<5)this.xl="Truot";
        else if (this.tb==5||this.tb==6)this.xl="Trung binh";
        else if (this.tb==7)this.xl="Kha";
        else if (this.tb==8)this.xl="Gioi";
        else if (this.tb>=9)this.xl="Xuat sac";


    }
    public void in(){
        System.out.printf("%s %s %d %.0f %s\n", this.ma,this.ten,this.tuoi,this.tb,this.xl);
    }
    public double getTb(){
        return this.tb;
    }
    public String getMa(){
        return this.ma;
    }
}
public class bai208{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<sinhvien>s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String .valueOf(i);
            if (h.length()==1)h='0'+h;
            String ma="PH"+h;
            String ten=sc.nextLine();
            String ns=sc.nextLine();
            float d1=sc.nextFloat();
            float d2=sc.nextFloat();
            sc.nextLine();
            sinhvien x=new sinhvien(ma, ten, ns, d1, d2);
            s.add(x);
        }

        s.sort(Comparator.comparing(sinhvien::getTb).reversed().thenComparing(sinhvien::getMa));
        for (sinhvien x:s){
            x.in();
        }
    }
}