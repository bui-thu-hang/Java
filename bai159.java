import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
class khachhang{
    String ma,ten;
    int sophong;
    long ngay;
    double tien;
    khachhang(String ma,String ten,int sophong,long ngay,double tien){
        this.ma=ma;
        this.ten=ten;
        this.sophong=sophong;
        this.ngay=ngay;
        this.tien=tien;
    }
    public void in(){
        System.out.print(this.ma+" "+this.ten+" "+this.sophong+" "+this.ngay+" ");
        System.out.printf("%.0f",tien);
        System.out.println();
    }
    public double getTien()
    {
        return this.tien;
    }

}
public class bai159{
    public static void main (String[] args)throws ParseException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<khachhang>ds=new ArrayList<>();
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h='0'+h;
            String ma="KH"+h;
            String ten=sc.nextLine();
            int sophong=sc.nextInt();
            String ep=String.valueOf(sophong);
            String tang=ep.substring (0,1);
            sc.nextLine();
            String ngaynhan=sc.nextLine();
            String ngaytra=sc.nextLine();
            Date nhan=f.parse(ngaynhan);
            Date tra=f.parse(ngaytra);
            int dv=sc.nextInt();
            double tien=0;
            sc.nextLine();
            long ngay=(tra.getTime()-nhan.getTime())/(1000*60*60*24)+1;
            if (tang.equals("1")){
                tien=ngay*25+dv;
                
            }
            else if (tang.equals("2")){
                tien=ngay*34+dv;
            }
            else if (tang.equals("3")){
                tien=ngay*50+dv;
            }
            else if (tang.equals("4")){
                tien=ngay*80+dv;
            }
            khachhang x=new khachhang(ma, ten, sophong, ngay, tien);
            ds.add(x);
        
        
        }
        ds.sort((x1,x2)->Double.compare(x2.getTien(),x1.getTien()));
        for (khachhang x:ds){
            x.in();
        }



    }
}