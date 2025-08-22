import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class mathang{
    String ma;
    String ten;
    String donvi;
    int mua;
    int ban;
    int loi;
    mathang(String ma,String ten,String donvi,int mua,int ban){
        this.ma=ma;
        this.ten=ten;
        this.donvi=donvi;
        this.mua=mua;
        this.ban=ban;
        this.loi=ban-mua;
    }
    public void in(){
        System.out.print (this.ma+" "+this.ten+" "+this.donvi+" "+this.mua+" "+this.ban+" "+this.loi);
    }
    public int getLoi(){
        return this.loi;
    }
}
public class bai76{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<mathang>s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String .valueOf(i);
            if (h.length()==1)h="00"+h;
            else if (h.length()==2)h='0'+h;
            String ma="MH"+h;
            String ten=sc.nextLine();
            String donvi=sc.nextLine();
            int mua=sc.nextInt();
            int ban=sc.nextInt();
            sc.nextLine();
            mathang x=new mathang(ma,ten,donvi,mua,ban);
            s.add(x);
        }
        s.sort ((x1,x2)->Integer.compare (x2.getLoi(),x1.getLoi()));
        for (mathang x: s){
            x.in();
            System.out.println();
        }
    }
}
