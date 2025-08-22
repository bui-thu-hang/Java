import java.util.*;
class dua{
    String ma;
    String ten,dc,time;
    double v;
    public String chuan(String s){
        s=s.toUpperCase();
        String []h=s.split("\\s+");
        String tmp="";
        for (int i=0;i<h.length;i++){
            tmp+=h[i].charAt(0);
        }
        return tmp;

    }

    dua(String ten,String dc,String time){
        this.ten=ten;
        this.dc=dc;
        this.time=time;
        String []h=time.split(":");
        float tg=Integer.parseInt(h[0])+(Integer.parseInt(h[1])/60.0f);
        this.v=120/(tg-6);
        this.ma=chuan(this.dc)+chuan(this.ten);

    }
    public void in(){
        System.out.print(this.ma+" "+this.ten+" "+this.dc+" ");
        System.out.printf("%.0f",this.v);
        System.out.println(" "+"Km/h");
    }
    public double getV(){
        return this.v;
    }

}
public class bai258{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<dua>ds=new ArrayList<>();
        while (t-->0){
            String ten=sc.nextLine();
            String dc=sc.nextLine();
            String time=sc.nextLine();
            ds.add(new dua(ten,dc,time));
        }
        ds.sort((x1,x2)->Double.compare(x2.getV(),x1.getV()));
        for (dua x:ds){
            x.in();
        }
    }
}