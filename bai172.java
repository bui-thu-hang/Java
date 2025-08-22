import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class nhanvien{
    String ma;
    String ten;
    String lop;
    String mail;
    nhanvien(String ma,String ten,String lop,String mail){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
    }
    public void in(){
        System.out.print (this.ma+" "+this.ten+" "+this.lop+" "+this.mail);
        System.out.println();
    }
}
public class bai172{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<nhanvien>s=new ArrayList<>();
        while (t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            nhanvien x=new nhanvien(ma, ten, lop, mail);
            s.add(x);
            
        }
        int h=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<h;i++){
            String truyvan=sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+truyvan+":");
            for (nhanvien x:s){
                if (x.lop.equals(truyvan)){
                    x.in();
                }
            }
        }
    }
}