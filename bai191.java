import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
class nhanvien{
    String ma;
    String ten;
    String chuc;
    int luong;
    int cong;
    int chinh;
    int pc;
    int ung;
    int tong;
    nhanvien(String ma,String ten,String chuc,int luong,int cong){
        this.ma=ma;
        this.ten=ten;
        this.chuc=chuc;
        this.luong=luong;
        this.cong=cong;
        this.chinh=luong*cong;
        if (this.chuc.equals("GD"))this.pc=500;
        else if (this.chuc.equals("PGD"))this.pc=400;
        else if (this.chuc.equals("TP"))this.pc=300;
        else if (this.chuc.equals("KT"))this.pc=250;
        else this.pc=100;
        this.tong=this.chinh+this.pc;
    }
    public void in(){
        System.out.print (this.ma+" "+this.ten+" "+this.pc+" "+this.chinh+" ");
        long h=this.tong*2/3;
        if (h<25000){
            h=(int)(Math.round(h/1000.0)*1000);
            System.out.print (h+" "+(this.tong-h));
        }
        else {
            System.out.print (25000+" "+(this.tong-25000));
        }
    }
    public int getTong(){
        return this.tong;
    }
    public String getMa(){
        return this.ma;
    }
}
public class bai191{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List <nhanvien> s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h='0'+h;
            String ma="NV"+h;
            String ten=sc.nextLine();
            String chuc=sc.nextLine();
            int luong=sc.nextInt();
            int cong=sc.nextInt();
            sc.nextLine();
            nhanvien x=new nhanvien(ma, ten, chuc, luong, cong);
            s.add(x);
        }
        for (nhanvien x:s){
            x.in();
            System.out.println();
        }
    }
}