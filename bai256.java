import java.util.*;
class tuyen{
    String ma;
    String ten;
    float d1,d2;
    float tb;
    String kq;
    public float chuan(float x){
        if (x<=10)return x;
        else return x/10;

    }
    tuyen(String ma,String ten,float d1,float d2){
        this.ma=ma;
        this.ten=ten;
        this.d1=d1;
        this.d2=d2;
        this.tb=(chuan(d1)+chuan(d2))/2;
        if (this.tb<5)this.kq="TRUOT";
        else if (this.tb<8)this.kq="CAN NHAC";
        else if (this.tb<9.5)this.kq="DAT";
        else this.kq="XUAT SAC";


    }
    public void in(){
        System.out.print(this.ma+" "+this.ten+" ");
        System.out.printf("%.2f",this.tb);
        System.out.println(" "+this.kq);
    }
    public float getTb(){
        return this.tb;
    }
}
public class bai256{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<tuyen>ds=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h='0'+h;
            String ma="TS"+h;
            String ten=sc.nextLine();
            float d1=sc.nextFloat();
            float d2=sc.nextFloat();
            sc.nextLine();
            ds.add(new tuyen(ma,ten,d1,d2));
        }
        ds.sort((x1,x2)->Float.compare(x2.getTb(),x1.getTb()));
        for (tuyen x:ds){
            x.in();
        }

    }
}