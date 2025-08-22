import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class hang{
    String ma;
    int nhap;
    double xuat;
    int don;
    double tien;
    double thue;
    hang (String ma,int nhap){
        this.ma=ma;
        this.nhap=nhap;
        if (ma.charAt(0)=='A')this.xuat=Math.round(nhap*60/100.0);
        else if (ma.charAt(0)=='B')this.xuat=Math.round(nhap*70/100.0);
        if (ma.charAt(ma.length()-1)=='Y')this.don=110000;
        else if (ma.charAt(ma.length()-1)=='N')this.don=135000;
        this.tien=this.xuat*this.don;
        if (ma.charAt(0)=='A' && ma.charAt(ma.length()-1)=='Y')this.thue=this.tien*8/100.0;
        else if (ma.charAt(0)=='A' && ma.charAt(ma.length()-1)=='N')this.thue=this.tien*11/100.0;
        else if (ma.charAt(0)=='B' && ma.charAt(ma.length()-1)=='Y')this.thue=this.tien*17/100.0;
        else if (ma.charAt(0)=='B' && ma.charAt(ma.length()-1)=='N')this.thue=this.tien*22/100.0;


    }
    public void in (){
        System.out.printf("%s %d %.0f %d %.0f %.0f\n", this.ma,this.nhap,this.xuat,this.don,this.tien,this.thue);
    }
}
public class bai196{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<hang>s=new ArrayList<>();
        while (t-->0){
            String ma=sc.nextLine();
            int nhap=sc.nextInt();
            sc.nextLine();
            hang x=new hang(ma, nhap);
            s.add(x);

        }
        for (hang x:s){
            x.in();
        }
    }
}