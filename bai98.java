import java.util.*;
import java.io.*;
class ph{
    String kh,ten;
    int don;
    float phi;
    ph(String kh,String ten,int don,float phi){
        this.kh=kh;
        this.ten=ten;
        this.don=don;
        this.phi=phi;
    }
    public void in(){
        System.out.println (this.kh+" "+this.ten+" "+this.don+" "+this.phi);
    }
    public String getTen(){
        return this.ten;
    }
}
public class bai98{
    public static void main (String [] args){
        try {
            File file =new File ("PHONG.in");
            Scanner sc=new Scanner (file);
            int t=Integer.parseInt(sc.nextLine().trim());
            List<ph>ds=new ArrayList<>();
            while (t-->0){
                String kh=sc.next();
                String ten=sc.next();
                int don=Integer.parseInt(sc.next());
                float phi=Float.parseFloat(sc.nextLine().trim());
                ds.add(new ph(kh,ten,don,phi));
            }
            ds.sort((x1,x2)->x1.getTen().compareTo(x2.getTen()));
            for (ph x:ds){
                x.in();
            }
        }
        catch(Exception e){

        }
    }
}