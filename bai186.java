import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class hang{
    String ma;
    String ten;
    String donvi;
    int gia;
    int soluong;
    long ship;
    long tien;
    long ban;
    hang(String ma,String ten,String donvi,int gia,int soluong){
        this.ma=ma;
        this.ten=ten;
        this.donvi=donvi;
        this.gia=gia;
        this.soluong=soluong;
        this.ship=Math.round(gia*soluong*5/100.0);
        this.tien=Math.round(gia*soluong+this.ship);
        this.ban=Math.round (Math.ceil(((this.tien+this.tien*2/100.0)/soluong)/100)*100);

    }
    public void in (){
        System.out.println (this.ma+" "+this.ten+" "+this.donvi+" "+this.ship+" "+this.tien+" "+this.ban);
    }
    public long getBan(){
        return this.ban;
    }

}
public class bai186{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<hang>s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h='0'+h;
            String ma="MH"+h;
            String ten=sc.nextLine();
            String donvi=sc.nextLine ();
            int gia=sc.nextInt();
            int soluong=sc.nextInt();
            sc.nextLine();
            hang x=new hang(ma, ten, donvi, gia, soluong);
            s.add(x);
        }
        s.sort((x1,x2)->Long.compare(x2.getBan(),x1.getBan()));
        for (hang x:s){
            x.in();
        }
    }
}