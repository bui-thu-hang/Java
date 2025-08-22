import java.util.Scanner;
class SinhVien{
    String ten;
    String lop;
    String ngay;
    Float gpa;
    SinhVien(String ten, String lop,String ngay,Float gpa){
        this.ten=ten;
        this.lop=lop;
        this.ngay=ngay;
        this.gpa=gpa;
    }
    public String chuan(String s){
        String [] h=s.split ("/");
        String date=h[0];
        String t=h[1];
        String n=h[2];
        if (date.length()==1){
            date="0"+date;
        }
        if (t.length()==1){
            t="0"+t;
        }
        return date+"/"+t+"/"+n;

    }
    public void in() {
        System.out.print ("B20DCCN001"+" "+this.ten+" "+this.lop +" "+chuan(this.ngay)+" ");
        System.out.printf ("%.2f",gpa);
    }
}
public class bai71{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String ten=sc.nextLine();
        String lop=sc.next();
        String ngay=sc.next();
        Float gpa=sc.nextFloat();
        SinhVien x=new SinhVien(ten, lop, ngay, gpa);
        x.in();
    }
}
