import java.util.Scanner;
class sinhvien{
    String ma;
    String ten;
    float toan;
    float ly;
    float hoa;
    double tong;
    double cong;
    sinhvien(String ma,String ten,float toan,float ly,float hoa){
        this.ma=ma;
        this.ten=ten;
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
        this.tong=toan*2+ly+hoa;
        String kv=ma.substring(0,3);
        if (kv.equals("KV1"))this.cong=0.5;
        else if(kv.equals("KV2"))this.cong=1;
        else if (kv.equals("KV3"))this.cong=2.5;
    }
    public void in (){
        System.out.print (this.ma+" "+this.ten+" ");
        int h=(int) this.cong;
        if (this.cong-h==0)System.out.print(h);
        else System.out.printf ("%.1f",this.cong);
        System.out.print (" ");
        int k=(int)this.tong;
        if (this.tong-k==0)System.out.print (k);
        else System.out.printf("%.1f",this.tong);
    
        if (this.tong+this.cong>=24)System.out.print (" TRUNG TUYEN");
        else System.out.print (" TRUỌT");
    }
}
public class bai154{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        String ma=sc.nextLine();
        String ten=sc.nextLine();
        float toan=sc.nextFloat();
        float ly=sc.nextFloat();
        float hoa=sc.nextFloat();
        if (toan>=0&&toan<=10&&ly>=0&&ly<=10&&hoa>=0&&hoa<=10){
        sinhvien x=new sinhvien(ma, ten, toan, ly, hoa);

        x.in();}
    }
}