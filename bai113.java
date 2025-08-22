import java.util.*;
import java.io.*;
class mon {
    String ma,ten,tin,lt,th;
    mon(String ma,String ten,String tin,String lt,String th){
        this.ma=ma;
        this.ten=ten;
        this.tin=tin;
        this.lt=lt;
        this.th=th;
    }
    public void in(){
        System.out.println (this.ma+" "+this.ten+" "+this.tin+" "+this.lt+" "+this.th);

    }
    public String getMa(){
        return this.ma;
    }
    public boolean Th(){
        return this.th.equals("Truc tuyen")|| this.th.endsWith(".ptit.edu.vn");//kêt thức là LÀ CÀI GÌ "endsWith"
    }
}
public class bai113{
    public static void main (String [] args){
        try {
            File f=new File ("MONHOC.in");
            Scanner sc=new Scanner (f);
            int t=sc.nextInt();
            sc.nextLine();
            List<mon>ds=new ArrayList<>();
            while (t-->0){
                String ma=sc.nextLine();
                String ten=sc.nextLine();
                String tin=sc.nextLine();
                String lt=sc.nextLine();
                String th=sc.nextLine();
                mon x=new mon(ma, ten, tin, lt, th);
                if (x.Th())
                ds.add(x);


            }
            ds.sort ((x1,x2)->x1.getMa().compareTo (x2.getMa()));
            for (mon x:ds){
                x.in();
            }
        }
        catch (Exception e){

        }
    }
}