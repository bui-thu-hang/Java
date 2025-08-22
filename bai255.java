import java.util.*;
class tien{
    String ma;
    String ten;
    long sl;
    long dongia;
    long chiet;
    long tong;
    tien(String ma,String ten,long sl,long dongia,long chiet){
        this.ma=ma;
        this.ten=ten;
        this.sl=sl;
        this.dongia=dongia;
        this.chiet=chiet;
        this.tong=sl*dongia-chiet;
    }
    public void in(){
        System.out.println(this.ma+" "+this.ten+" "+this.sl+" "+this.dongia+" "+this.chiet+" "+this.tong);
    }
    public long getTong(){
        return this.tong;
    }
}
public class bai255{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<tien>ds=new ArrayList<>();
        while(t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            long sl=sc.nextLong();
            long dongia=sc.nextLong();
            long chiet=sc.nextLong();
            sc.nextLine();
            ds.add(new tien(ma,ten,sl,dongia,chiet));
        }
        ds.sort((x1,x2)->Long.compare(x2.getTong(),x1.getTong()));
        for (tien x:ds){
            x.in();
        }
    }
}