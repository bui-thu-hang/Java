import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class xang{
    String ma;
    int sl;
    String hang;
    long dongia;
    double thue;
    long tong;
    xang(String  ma,int sl){
        this.ma=ma;
        this.sl=sl;
        if (ma.substring (3).equals("BP"))this.hang="British Petro";
        else if (ma.substring (3).equals("ES"))this.hang="Esso";
        else if (ma.substring (3).equals("SH"))this.hang="Shell";
        else if (ma.substring (3).equals("CA"))this.hang="Castrol";
        else if (ma.substring (3).equals("MO"))this.hang="Mobil";
        else if (ma.substring(3).equals("TN")){
            this.hang="Trong Nuoc";
            this.thue=0;
        }
        if (ma.charAt(0)=='X'){
            this.dongia=128000;
            if (!this.hang.equals("Trong Nuoc")){
            this.thue=this.dongia*sl*0.03;
        }}
        else if (ma.charAt(0)=='D'){
            this.dongia=11200;
            if (!this.hang.equals("Trong Nuoc")){
            this.thue=this.dongia*sl*0.035;
        }}
        else if (ma.charAt(0)=='N'){
            this.dongia=9700;
            if (!this.hang.equals("Trong Nuoc")){
            this.thue=this.dongia*sl*0.02;
        }}
        this.tong=(long)(this.dongia*sl+this.thue);


    
    }
    public void in(){
        System.out.printf("%s %s %d %.0f %d\n", this.ma,this.hang,this.dongia,this.thue,this.tong);
    }
    public long getTong(){
        return this.tong;
    }
}
public class bai210{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<xang>s=new ArrayList<>();
        while (t-->0){
            String ma=sc.next();
            int sl=sc.nextInt();
            sc.nextLine();
            xang x=new xang(ma, sl);
            s.add(x);

        }
        s.sort((x1,x2)->Long.compare(x2.getTong(),x1.getTong()));
        for (xang x:s){
            x.in();
        }
    }
}