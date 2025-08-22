import java.util.*;
class sx{
    int h;
    int m;
    int s;
    int tong;
    sx(int h,int m,int s){
        this.h=h;
        this.m=m;
        this.s=s;
        this.tong=h*3600+m*60+s;
    }
    public void in(){
        System.out.println(this.h+" "+this.m+" "+this.s);
    }
    public int getTong(){
        return this.tong;
    }
}
public class th9{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        List<sx>ds=new ArrayList<>();
        while (t-->0){
            int h=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt();
            ds.add(new sx(h,m,s));
        }
        ds.sort((x1,x2)->Integer.compare(x1.getTong(),x2.getTong()));
        for (sx x:ds){
            x.in();
        }
    }
}