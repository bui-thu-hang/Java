import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
class hang{
    String ma;
    String ten;
    String donvi;
    int mua;
    int ban;
    int loi;
    hang(String ma,String ten,String donvi,int mua,int ban){
        this.ma=ma;
        this.ten=ten;
        this.donvi=donvi;
        this.mua=mua;
        this.ban=ban;
        this.loi=ban-mua;
    }
    public void in(){
        System.out.println (this.ma+" "+this.ten+" "+this.donvi+" "+this.mua+" "+this.ban+" "+this.loi);
    }
    public int getLoi(){
        return this.loi;
    }
    public String getMa(){
        return this.ma;
    }
    
}
public class thuchanh10{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<hang>s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h="00"+h;
            else if (h.length()==2)h='0'+h;
            String ma="MH"+h;
            String ten=sc.nextLine();
            String donvi=sc.nextLine();
            int mua=sc.nextInt();
            int ban=sc.nextInt();
            sc.nextLine();
            hang x= new hang(ma, ten, donvi, mua, ban);
            s.add(x);
        }
        s.sort(Comparator.comparing(hang::getLoi).reversed().thenComparing (hang::getMa));
        for (hang x:s){
            x.in();
        }
    }
}