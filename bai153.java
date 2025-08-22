import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
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
public class bai153{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String ma="NV01";
        String ten=sc.nextLine();
        int cong=sc.nextInt();
        int ngay=sc.nextInt();
        sc.nextLine();
        String chucvu=sc.nextLine();
        nhanvien x=new nhanvien(ma, ten, cong, ngay, chucvu);
        x.in();
    }
}