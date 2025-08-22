import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Danhsach {
    int stt;
    String ten;
    String xau;
    float mua;
    float ban;
    float loi;
    Danhsach (int stt,String ten,String xau,float mua,float ban){
        this.stt=stt;
        this.ten=ten;
        this.xau=xau;
        this.mua=mua;
        this.ban=ban;
        this.loi=ban-mua;
    }
    public void in (){
        System.out.print (this.stt+" "+this.ten+" "+this.xau+" ");
        System.out.printf("%.1f",this.loi);

        
        
    }
    public float getLoi(){
        return this.loi;

    }
}
public class bai167{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<Danhsach>sapxep=new ArrayList<>();
        for (int i=1;i<=t;i++){
            
            String ten=sc.nextLine ();
            String xau=sc.nextLine();
            float mua=sc.nextFloat();
            float ban=sc.nextFloat();

            sc.nextLine();
            Danhsach x= new Danhsach(i, ten,xau, mua, ban);
            sapxep.add(x);

        }
        sapxep.sort ((x1,x2)->Float.compare (x2.getLoi(),x1.getLoi()));
        for (Danhsach x:sapxep){
            x.in();
            System.out.println();

        }
    

    }
}