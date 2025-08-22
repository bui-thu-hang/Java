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
    int ung;
    nhanvien(String ma,String ten,String chuc,int luong,int cong){
        this.ma=ma;
        this.ten=ten;
        this.chuc=chuc;
        this.luong=luong;
        this.cong=cong;
        this.chinh=luong*cong;
    }
    public void in(){
        System.out.print (this.ma+" "+this.ten+" ");
        int pc=0;
        if (this.chuc.equals ("GD"))pc=500;
        else if (this.chuc.equals("PGD"))pc=400;
        else if (this.chuc.equals("TP"))pc=300;
        else if (this.chuc.equals("KT"))pc=250;
        else pc=100;
        System.out.print(pc+" "+this.chinh+" ");
        long h=(pc+this.chinh)*2/3;
        if (h<25000){
            h=Math.round(h/1000)*1000;
            System.out.print (h+" "+(this.chinh-h+pc));
        }
        else {
            System.out.print (25000+" "+(this.chinh-25000+pc));
        }      


    }
    public int getChinh(){
        return this.chinh;
    }
    public String getMa(){
        return this.ma;
    }
}
public class bai193{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List <nhanvien>s=new ArrayList<>();
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
        s.sort(Comparator.comparing(nhanvien::getChinh).reversed().thenComparing(nhanvien::getMa));
        for (nhanvien x:s){
            x.in();
            System.out.println();
        }

    }
}