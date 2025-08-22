import java.util.*;
class nhanvien {
    String ma;
    String ten;
    String chuc;
    String sohieu;
    String bacluong;
    nhanvien(String ma,String ten){
        this.ma=ma;
        this.ten=ten;
        this.chuc=ma.substring(0,2);
        this.sohieu=ma.substring(4);
        this.bacluong=ma.substring(2,4);
    }
    public void in(){
        System.out.println (this.ten+" "+this.chuc+" "+this.sohieu+" "+this.bacluong);
    }
    public String getbl(){
        return this.bacluong;
    }
    public String geth(){
        return this.sohieu;
    }
}
public class bai266{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<nhanvien>ds=new ArrayList<>();
    while (t-->0){
        String ma=sc.next();
        String ten=sc.nextLine();
        ds.add(new nhanvien(ma,ten));
    }
    ds.sort(Comparator.comparing(nhanvien::getbl).reversed().thenComparing(nhanvien::geth));
    int h=sc.nextInt();
    sc.nextLine();
    while (h-->0){
        String tv=sc.nextLine().toLowerCase();
        for (nhanvien x:ds){
            if (x.ten.toLowerCase().contains(tv)){
                x.in();
            }
        }
        System.out.println();
    }
    }
