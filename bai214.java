import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.HashMap;
class sinhvien{
    String ma;
    String ten;
    String lop;
    sinhvien (String ma,String ten,String lop){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
    }
}
public class bai214{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        Map<String,sinhvien >ds=new LinkedHashMap<>();
        int t=sc.nextInt();
        int temp=t;
        sc.nextLine ();
        while (t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            ds.put(ma,new sinhvien(ma, ten, lop));
        }
        Map<String,String >diemdanh=new HashMap<>();
        
        for (int h=0;h<temp;h++){
            String truyvan=sc.next();
            String dd=sc.nextLine();
            diemdanh.put(truyvan,dd);

        }
        for (sinhvien x:ds.values()){
            String dd=diemdanh.get(x.ma);
            int demv=0;
            int demm=0;

            for (int i=0;i<dd.length();i++){
                if (dd.charAt(i)=='v')demv++;
                else if (dd.charAt(i)=='m')demm++;
                
            }
            int cc=10-demv*2-demm;
            
            if (dd!=null){
                System.out.print (x.ma+" "+x.ten+" "+x.lop+" ");
                if (cc<=0){
                    System.out.println (0+" "+"KDDK");
                    
                }
                else System.out.println (cc);
            }
        }
            
        

    }
}