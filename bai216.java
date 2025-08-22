import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
class hang {
    String ma;
    String ten;
    String xl;
    hang (String ma,String ten,String xl){
        this.ma=ma;
        this.ten=ten;
        this.xl=xl;
    }
}
public class bai216{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        Map<String ,hang>ds=new HashMap<>();
        while (t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String xl=sc.nextLine();
            ds.put(ma,new hang(ma, ten, xl));

        }
        int h=sc.nextInt();
        sc.nextLine();
        while (h-->0){
            String mha=sc.next();
            int sl=sc.nextInt();
            int nhap=sc.nextInt();
            int xuat=sc.nextInt();
            hang j=ds.get(mha);
            int tong=0;
            if (j!=null){
                if (j.xl.equals("A"))tong=nhap*xuat+nhap*xuat*8/100;
                else if (j.xl.equals("B"))tong=nhap*xuat+nhap*xuat*5/100;
                else if (j.xl.equals("C"))tong=nhap*xuat+nhap*xuat*2/100;
                int ban=sl*nhap;
                System.out.println(j.ma+" "+j.ten+" "+ban+" "+tong);

            }


        }
    }
}