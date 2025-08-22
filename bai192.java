import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class nhanvien{
    String ma;
    String ten;
    String chuc;
    int luong;
    int ngay;
    int pc;
    int chinh;
    int ung;
    int tong;
    nhanvien(String ma,String ten,String chuc,int luong,int ngay){
        this.ma=ma;
        this.ten=ten;
        this.chuc=chuc;
        this.luong=luong;
        this.ngay=ngay;
        if (this.chuc.equals("GD"))this.pc=500;
        else if (this.chuc.equals("PGD"))this.pc=400;
        else if (this.chuc.equals("TP"))this.pc=300;
        else if (this.chuc.equals("TK"))this.pc=250;
        else this.pc=100;
        this.chinh=luong*ngay;
        this.tong=this.chinh+this.pc;
        int h=this.tong*2/3;
        if (h<25000)this.ung=(int)(Math.round(h/1000.0*1000));
        else this.ung=25000;

    }
    public void in(){
        System.out.println(this.ma+" "+this.ten+" "+this.pc+" "+this.chinh+" "+this.ung+" "+(this.tong-this.ung));
    }

}
public class bai192{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<nhanvien>s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h="0"+h;
            String ma="NV"+h;
            String ten=sc.nextLine();
            String chuc=sc.nextLine();
            int luong=sc.nextInt();
            int cong=sc.nextInt();
            sc.nextLine();
            nhanvien x=new nhanvien(ma, ten, chuc, luong, cong);
            s.add(x);
        
        }
        String h=sc.nextLine();
        for (nhanvien x:s){
            if (x.chuc.equals(h)){
                x.in();
            }
        }
    }
}