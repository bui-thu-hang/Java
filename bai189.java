import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class nhanvien{
    String ma;
    String ten;
    int luong;
    int ngay;
    String chuc;
    int chinh;
    int thuong;
    int pc;
    int tong;
    nhanvien(String ma,String ten,int luong,int ngay,String chuc){
        this.ma=ma;
        this.ten=ten;
        this.luong=luong;
        this.ngay=ngay;
        this.chuc=chuc;
        this.chinh=luong*ngay;
        if (this.chuc.equals("GD"))this.pc=250000;
        else if (this.chuc.equals("PGD"))this.pc=200000;
        else if (this.chuc.equals("TP"))this.pc=180000;
        else if (this.chuc.equals("NV"))this.pc=150000;
        if (this.ngay>=25)this.thuong=this.chinh*20/100;
        else if (this.ngay>=22)this.thuong=this.chinh*10/100;
        else if (this.ngay<22)this.thuong=0;
        this.tong=this.chinh+this.thuong+this.pc;

    }
    public void in (){
        System.out.print (this.ma+" "+this.ten+" "+this.chinh+" "+this.thuong+" "+this.pc+" "+this.tong);
    }
    public int getTong(){
        return this.tong;
    }
}
public class bai189{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<nhanvien>s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h='0'+h;
            String ma="NV"+h;
            String ten=sc.nextLine();
            int luong=sc.nextInt();
            int cong=sc.nextInt();
            String chuc=sc.nextLine();
            sc.nextLine();
            nhanvien x=new nhanvien(ma, ten, luong, cong, chuc);
            s.add(x);
        }
        s.sort ((x1,x2)->Integer.compare(x2.getTong(),x1.getTong()));
        for (nhanvien x:s){
            x.in();
            System.out.println();
        }
    }
}