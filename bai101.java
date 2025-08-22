import java.util.*;
import java.io.*;
class hang {
    String ma,ten,nhom;
    float mua,ban,loi;
    hang(String ma,String ten,String nhom,float mua,float ban){
        this.ma=ma;
        this.ten=ten;
        this.nhom=nhom;
        this.mua=mua;
        this.ban=ban;
        this.loi=ban-mua;

    }
    public void in(){
        System.out.print(this.ma+" "+this.ten+" "+this.nhom+" ");
        System.out.printf("%.2f",this.loi);
        System.out.println();

    }
    public float getLoi(){
        return this.loi;
    }
}
public class bai101{
    public static void main (String [] args){
        try{
            File f=new File ("MATHANG.in");
            Scanner sc=new Scanner (f);
            int t=Integer.parseInt(sc.nextLine().trim());
            List<hang>s=new ArrayList<>();
            for (int i=1;i<=t;i++){
                String h=String.valueOf(i);
                if (h.length()==1)h='0'+h;
                String ma="MH"+h;
                String ten=sc.nextLine().trim();
                String nhom=sc.nextLine().trim();
                float mua=Float.parseFloat(sc.nextLine().trim());
                float ban=Float.parseFloat(sc.nextLine().trim());
                s.add(new hang(ma,ten,nhom,mua,ban));
            }
            s.sort((x1,x2)->Float.compare(x2.getLoi(),x1.getLoi()));
            for (hang x:s){
                x.in();
            }
        }
        catch(Exception e){

        }
    }
}