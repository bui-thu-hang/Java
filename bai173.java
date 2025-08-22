import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class sinhvien {
    String ma;
    String ten;
    String lop;
    String mail;
    sinhvien (String ma,String ten,String lop,String mail){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
    }
    public void in(){
        System.out.println(this.ma+" "+this.ten+" "+this.lop+" "+this.mail);
    }
}
public class bai173{
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<sinhvien>s=new ArrayList<>();
        while (t-- >0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            sinhvien x=new sinhvien(ma, ten, lop, mail);
            s.add(x);
        }
        int h=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<h;i++){
            String truyvan=sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+truyvan+":");
            for (sinhvien x:s){
                String khoa="20"+x.ma.charAt(1)+x.ma.charAt(2);
                if (khoa.equals(truyvan)){
                    x.in();
                }
            }
        }
        
        
    }
}