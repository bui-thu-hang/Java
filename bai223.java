import java.util.*;
class sinhvien{
    String ma;
    String ten;
    String sdt;
    int nhom;
    sinhvien(String ma,String ten,String sdt,int nhom){
        this.ma=ma;
        this.ten=ten;
        this.sdt=sdt;
        this.nhom=nhom;
    }
    public String getMa(){
        return this.ma;
    }
}
public class bai223{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine ();
        List<sinhvien>ds=new ArrayList<>();
        while (t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String sdt=sc.nextLine();
            int nhom=sc.nextInt();
            sc.nextLine();
            ds.add(new sinhvien(ma,ten,sdt,nhom));

        }
        String []bt=new String [m+1];
        for (int i=1;i<=m;i++){
            bt[i]=sc.nextLine();
        }
        ds.sort((x1,x2)->x1.getMa().compareTo(x2.getMa()));
        for (sinhvien x:ds){
            System.out.println (x.ma+" "+x.ten+" "+x.sdt+" "+x.nhom+" "+bt[x.nhom]);
        }
    }
}