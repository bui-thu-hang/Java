import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class time {
    int h;
    int phut;
    int s;
    int tong;
    time (int h,int phut,int s){
        this.h=h;
        this.phut=phut;
        this.s=s;
        this.tong=h*3600+phut*60+s;
    }
    public void in (){
        System.out.println(this.h+" "+this.phut+" "+this.s);
    }
    public int getTong(){
        return this.tong;
    }
}
public class thuchanh9{
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        List<time>ds=new ArrayList<>();
        while (t-->0){
            int h=sc.nextInt();
            int phut=sc.nextInt();
            int s=sc.nextInt();
            sc.nextLine();
            time x=new time(h, phut, s);
            ds.add(x);
        }
        ds.sort((x1,x2)->Integer.compare(x1.getTong(),x2.getTong()));
        for (time x:ds){
            x.in();
        }
    }
}