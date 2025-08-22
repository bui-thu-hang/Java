import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
class sinhvien {
    String ma;
    String ten;
    String lop;
    sinhvien (String ma,String ten,String lop){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;

    }
}
public class bai215{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        int tmp=t;
        sc.nextLine();
        Map<String,sinhvien> ds=new LinkedHashMap<>();
        while (t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            ds.put(ma,new sinhvien(ma, ten, lop));
        }
        Map<String,String> diemdanh=new HashMap<>();
        for (int h=0;h<tmp;h++){
            String truyvan=sc.next();
            String dd=sc.nextLine();
            diemdanh.put(truyvan,dd);
        }
        String truyvan1=sc.nextLine().trim();
        for (sinhvien x:ds.values()){
            if (truyvan1.equals(x.lop)){
            String dd=diemdanh.get(x.ma);
            int demv=0;
            int demm=0;
            for (int i=0;i<dd.length();i++){
                if (dd.charAt(i)=='m')demm++;
                else if (dd.charAt(i)=='v')demv++;

            }
            int temp=10-demm-demv*2;
        
            if (dd!=null){
                System.out.print (x.ma+" "+x.ten+" "+x.lop+" ");
                if (temp<=0)System.out.println(0+" "+"KDDK");
                else System.out.println(temp);

            }
        }
            
    }    
        
    }
}