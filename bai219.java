import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;

class mon{
    String ma;
    String ten;
    String nhom;
    String gv;
    mon(String ma,String ten,String nhom,String gv){
        this.ma=ma;
        this.ten=ten;
        this.nhom=nhom;
        this.gv=gv;
    }
        public int getNhomInt() {
        return Integer.parseInt(nhom);
    }

}
public class bai219{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        Map<String,List<mon>>c=new HashMap<>();

        while (t-->0){
            String ma=sc.nextLine ();
            String ten=sc.nextLine();
            String nhom=sc.nextLine();
            String gc=sc.nextLine();
            if (!c.containsKey(ma)) {
                c.put(ma, new ArrayList<>());
            }

            c.get(ma).add(new mon(ma, ten, nhom, gc));
        }
        int k=sc.nextInt();
        sc.nextLine();
        while (k-->0){
            String truyvan=sc.nextLine();
           List< mon> ds=c.get(truyvan);

            if (ds!=null){
                System.out.println ("Danh sach nhom lop mon "+ds.get(0).ten+":");
                                Collections.sort(ds, Comparator.comparingInt(mon::getNhomInt));


                for (mon m:ds){

                System.out.println (m.nhom+" "+m.gv);
                }    
            }

        }
    }
}