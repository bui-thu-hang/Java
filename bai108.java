import java.util.*;
import java.io.*;
class ts{
    String ma,ten;
    float d;
    String dt;
    int kv;
    float tong;
    String tt;
    ts(String ma,String ten,float d,String dt,int kv){
        this.ma=ma;
        this.ten=ten;
        this.d=d;
        this.dt=dt;
        this.kv=kv;
        if (kv==1)this.tong=d+1.5f;
        else if (kv==2)this.tong=d+1;
        else if (kv==3)this.tong=d;
        if (dt.equals("Kinh"))this.tong=this.tong+0;
        else this.tong=this.tong+1.5f;
        if (this.tong>=20.5)this.tt="Do";
        else this.tt="Truot";

    }
    public String ten(String s){
        String res=String.valueOf(s.charAt(0)).toUpperCase();
        res=res+s.substring (1).toLowerCase();
        return res;
 
    }
    public String chuan (String s){
        String [] h=s.split("\\s+");
        String tmp="";
        for (int i=0;i<h.length;i++){
            tmp+=ten(h[i]);
            tmp+=" ";
        }
        return tmp;
    }
    public void in (){
        System.out.print(this.ma+" "+chuan(this.ten));
        System.out.printf ("%.1f",this.tong);
        System.out.println(" "+this.tt);
    }
    public float getTong(){
        return this.tong;
    }
    public String getMa(){
        return this.ma;
    }
}
public class bai108{
    public static void main (String [] args){
        try{
            File f=new File("THISINH.in");
            Scanner sc=new Scanner (f);
            int t=Integer.parseInt(sc.nextLine().trim());
            List<ts>s=new ArrayList<>();
            for (int i=1;i<=t;i++){
                String h=String.valueOf(i);
                if (h.length()==1)h='0'+h;
                String ma="TS"+h;
                String ten=sc.nextLine().trim();
                float d=Float.parseFloat(sc.nextLine().trim());
                String dt=sc.nextLine().trim();
                int kv=Integer.parseInt(sc.nextLine().trim());
                s.add(new ts(ma, ten, d,dt, kv));
            }
            s.sort(Comparator.comparing (ts::getTong).reversed().thenComparing(ts::getMa));
            for (ts x:s){
                x.in();
            }
        }
        catch(Exception e){

        }
    }
}
