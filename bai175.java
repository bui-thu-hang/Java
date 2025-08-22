import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
class Giaovien {
    String ma;
    String ten;
    String mon;
    Giaovien (String ma,String ten,String mon){
        this.ma=ma;
        this.ten=ten;
        this.mon=mon;
    }
    public String mon(String s){
        String [] h=s.split("\\s+");
        String kq="";
        for (int i=0;i<h.length;i++){
            kq+=h[i].charAt(0);
        }
        kq=kq.toUpperCase();
        return kq;



    }
    public String tach (String s){
        String [] h=s.split("\\s+");
        return h[h.length-1];

    }
    public void in(){
        System.out.print (this.ma+" "+this.ten+" "+this.mon(this.mon));
    }
    public String getTen(){
        return tach (this.ten);
    }
    public String getMa(){
        return this.ma;
    }

}
public class bai175{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<Giaovien>sapxep=new ArrayList<>();

        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h='0'+h;
            String ma="GV"+h;
            String ten=sc.nextLine();
            String mon=sc.nextLine();
            Giaovien x=new Giaovien(ma, ten, mon);
            sapxep.add(x);

        }
        sapxep.sort(Comparator.comparing(Giaovien::getTen).thenComparing(Giaovien::getMa));

        for (Giaovien x:sapxep){
            x.in();
            System.out.println();
        }
    }
}