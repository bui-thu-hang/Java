import java.util.*;
class hocsinh{
    String ma;
    String ten;
    String sdt;
    int sttn;
    hocsinh(String ma,String ten,String sdt,int sttn){
        this.ma=ma;
        this.ten=ten;
        this.sdt=sdt;
        this.sttn=sttn;
    }
}
class baitap{
    String tt;
    String ten;
    baitap(String tt,String ten){
        this.tt=tt;
        this.ten=ten;
    }
}
public class bai222{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        int h=sc.nextInt();
        sc.nextLine();
        Map<String,List<hocsinh>>ds=new HashMap<>();
        while (t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String sdt=sc.nextLine();
            int sttn=sc.nextInt();
            String doi=String.valueOf(sttn);
            sc.nextLine();
            if (!ds.containsKey(doi)){
                ds.put(doi,new ArrayList<>());
            }
            ds.get(doi).add(new hocsinh(ma, ten, sdt, sttn));
        
        }
        Map<String,baitap>s=new HashMap<>();
        for (int i=1;i<=h;i++){
            String tt=String .valueOf(i);
            String ten=sc.nextLine();
            s.put(tt,new baitap(tt, ten));
            
        }
        String truyvan1=sc.nextLine();
        String truyvan2=sc.nextLine();
        List<hocsinh> m=ds.get(truyvan1);
        if (m!=null){
            System.out.println("DANH SACH NHOM "+m.get(0).sttn+":");
            for (hocsinh x:m){
                System.out.println(x.ma+" "+x.ten+" "+x.sdt);
            }
        }
        baitap x=s.get(truyvan2);
        if (x!=null){
            System.out.println("Bai tap dang ky: "+x.ten);
        }
        



    }
}