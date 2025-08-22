import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class nhanvien{
    String ma;
    String ten;
    String chuc;
    String hs;
    String sohieu;
    nhanvien (String ma,String ten){
        this.ma=ma;
        this.ten=ten;
        this.chuc=ma.substring(0,2);
        this.hs=ma.substring (2,4);
        this.sohieu=ma.substring(4);

    }
    public void in(){
        System.out.println(this.ten+" "+this.chuc+" "+this.sohieu+" "+this.hs);
    }
    public String getSohieu(){
        return this.sohieu;
    }
}
public class bai265{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<nhanvien> s=new ArrayList<>();
        while (t-- >0){
            String ma=sc.next();
            String ten=sc.nextLine();
            nhanvien x=new nhanvien(ma, ten);
            s.add(x);
        }
        s.sort((x1,x2)->x1.getSohieu().compareTo(x2.getSohieu())); 
        int h=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<=h;i++){
            String truyvan=sc.nextLine();
            for (nhanvien x:s){
                if (x.chuc.equals (truyvan)){
                    x.in();
                }
            }
            System.out.println();
        }  
     }
}

