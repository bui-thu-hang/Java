import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
class SinhVien {
    String ma;
    String ten;
    float d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
    float tb;
    SinhVien (String ma,String ten,float d1,float d2,float d3,float d4,float d5,float d6,float d7,float d8,float d9,float d10){
        this.ma=ma;
        this.ten=ten;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.d4=d4;
        this.d5=d5;
        this.d6=d6;
        this.d7=d7;
        this.d8=d8;
        this.d9=d9;
        this.d10=d10;
        this.tb=(d1*2+d2*2+d3+d4+d5+d6+d7+d8+d9+d10)/12;

    }
    public void in (){
        System.out.print (this.ma+" "+this.ten+" ");
        System.out.printf ("%.1f",this.tb);
        if (this.tb>=9)System.out.print (" XUAT SAC");
        else if (this.tb>=8)System.out.print (" GIOI");
        else if (this.tb>=7)System.out.print (" KHA");
        else if (this.tb>=5)System.out.print (" TB");
        else System.out.print (" YEU");


    }
    public Float getTB(){
        return this.tb;
    }
    public String getMa(){
        return this.ma;
    }
}
public class bai169{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt ();
        sc.nextLine();
        List<SinhVien>s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h='0'+h;
            String ma="HS"+h;
            String ten=sc.nextLine();
            float d1=sc.nextFloat();
            float d2=sc.nextFloat();
            float d3=sc.nextFloat();
            float d4=sc.nextFloat();
            float d5=sc.nextFloat();
            float d6=sc.nextFloat();
            float d7=sc.nextFloat();
            float d8=sc.nextFloat();
            float d9=sc.nextFloat();
            float d10=sc.nextFloat();
            sc.nextLine();
            SinhVien x=new SinhVien(ma, ten, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10);
            s.add(x);
        }
        s.sort(Comparator.comparing(SinhVien::getTB).reversed().thenComparing(SinhVien::getMa));
        for (SinhVien x:s){
            x.in();
            System.out.println();
        }

    }
}