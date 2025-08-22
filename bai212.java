import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
class Clb{
    String ma;
    String ten;
    int ve;
    Clb(String ma,String ten,int ve){
        this.ma=ma;
        this.ten=ten;
        this.ve=ve;
    }

}
public class bai212{
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int doi=sc.nextInt();
        sc.nextLine();
        Map<String, Clb> c=new HashMap<>();
        for (int i=0;i<doi;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int ve=sc.nextInt();
            sc.nextLine();
            c.put(ma,new Clb(ma, ten, ve));    

        }
        int sotran=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<sotran;i++){
            String s=sc.nextLine();
            String []h=s.split(" ");
            String ma=h[0];
            int nguoi=Integer.parseInt(h[1]);
            String matran=ma.substring (1,3);
            Clb j=c.get(matran);
            if (j!=null){
            int doanhthu=j.ve*nguoi;
            
            System.out.println(ma+" "+j.ten+" "+doanhthu);
        }
    }
    }
}