import java.util.Scanner;
import java.util.*;
class mon{
    String ma;
    String mon;
    String lop;
    String gv;
    mon(String ma,String mon,String lop,String gv){
        this.ma=ma;
        this.mon=mon;
        this.lop=lop;
        this.gv=gv;

    }
    public String getMa(){
        return this.ma;
    }
    public int getLopInt(){
        return Integer.parseInt(lop);
    }
}
public class bai220{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        Map<String,List<mon>>ds=new HashMap<>();
        while (t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String gv=sc.nextLine();
            if (!ds.containsKey(gv)){
                ds.put(ten,new ArrayList<>());

            }
            ds.get(ten).add(new mon(ma, ten, lop, gv));

        }
        int k=sc.nextInt();
        sc.nextLine();
        while (k-->0){
            String truyvan=sc.nextLine();
            List<mon>c=ds.get(truyvan);
            if (c!=null){
                System.out.print ("Danh sach cho giang vien "+c.get(0).gv+":");
                Collections.sort(c,Comparator.comparing (mon::getMa).thenComparingInt (mon::getLopInt));
                for (mon m:c){
                    System.out.println (m.ma+" "+m.mon+" "+m.lop);
                }



            }


        }
    }
}