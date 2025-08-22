import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class nhanvien{
    String ma;
    String ten;
    int cong;
    int ngay;
    String chucvu;
    int luong;
    int thuong;
    int pc;
    int tong;
    nhanvien(String ma,String ten,int cong,int ngay,String chucvu){
        this.ma=ma;
        this.ten=ten;
        this.cong=cong;
        this.ngay=ngay;
        this.chucvu=chucvu;
        this.luong=cong*ngay;
        if (this.ngay>=25)this.thuong=this.luong*20/100;
        else if (this.ngay>=22)this.thuong=this.luong*10/100;
        else this.thuong=0;
        if (this.chucvu.equals("GD"))this.pc=250000;
        else if (this.chucvu.equals("PGD"))this.pc=200000;
        else if (this.chucvu.equals("TP"))this.pc=180000;
        else if (this.chucvu.equals("NV"))this.pc=150000;
        this.tong=this.luong+this.thuong+this.pc;
    }
    public void in (){
        System.out.println(this.ma+" "+this.ten+" "+this.luong+" "+this.thuong+" "+this.pc+" "+this.tong);

    }
}
public class bai188{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<nhanvien>s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h='0'+h;
            String ma="NV"+h;
            String ten=sc.nextLine();
            int cong=sc.nextInt();
            int ngay=sc.nextInt();
            sc.nextLine();
            String chucvu=sc.nextLine();
            nhanvien x=new nhanvien(ma, ten, cong, ngay, chucvu);
            s.add(x);
        }
        for (nhanvien x:s){
            x.in();
        }
    }
}