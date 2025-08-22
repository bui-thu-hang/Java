import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class SinhVien {
    String ma;
    String ten;
    String lop;
    String mail;
    SinhVien (String ma,String ten,String lop,String mail){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
    }
    public void in (){
        System.out.print (this.ma+" "+this.ten+" "+this.lop+" "+this.mail);
    }
    public String getMa(){
        return this.ma;
    }
}
public class bai171{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        List <SinhVien>sapxep =new ArrayList<>();
        while (true){
            String ma=sc.nextLine();
            if (ma.isEmpty()){
                break;
            }
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            SinhVien x=new SinhVien(ma, ten, lop, mail);
            sapxep.add(x);

        }
        sapxep.sort ((x1,x2)->x1.getMa().compareTo(x2.getMa()));
        for (SinhVien x:sapxep){
            x.in();
            System.out.println();
        }

    }
}