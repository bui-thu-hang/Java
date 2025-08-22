import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;
class congnhan{
    String ma;
    String ten;
    String gt;
    String ns;
    String dc;
    String sdt;
    String ngay;
    Date Ngaysinh;
    congnhan (String ma,String ten,String gt,String ns,String dc,String sdt,String ngay) throws ParseException{
        this.ma=ma;
        this.ten=ten;
        this.gt=gt;
        this.ns=ns;
        this.dc=dc;
        this.sdt=sdt;
        this.ngay=ngay;
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        this.Ngaysinh=df.parse(ns);

    }
    public void in (){
        System.out.println (this.ma+" "+this.ten+" "+this.gt+" "+this.ns+" "+this.dc+" "+this.sdt+" "+this.ngay);
    }
    public Date getNgaysinh(){
        return this.Ngaysinh;
    }

}
public class bai165{
    public static void main (String[] args)throws ParseException{
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<congnhan>s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String ma=String.valueOf(i);
            if(ma.length()==1)ma="0000"+ma;
            else if (ma.length()==2)ma="000"+ma;
            else if (ma.length()==3)ma="00"+ma;
            else if (ma.length()==4)ma='0'+ma;
            String ten=sc.nextLine();
            String gt=sc.nextLine();
            String ns=sc.nextLine();
            String dc=sc.nextLine();
            String sdt=sc.nextLine();
            String ngay=sc.nextLine();
            s.add(new congnhan(ma, ten, gt, ns, dc, sdt, ngay));


        }
        s.sort (Comparator.comparing(congnhan::getNgaysinh));
        for (congnhan x:s){
            x.in();
            

        }
    }
}
