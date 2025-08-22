import java.util.*;
import java.io.*;
class thi{
    String ma,ngay,h,phong;
    thi(String ma,String ngay,String h,String phong){
        this.ma=ma;
        this.ngay=ngay;
        this.h=h;
        this.phong=phong;
    }
    public void in(){
        System.out.println (this.ma+" "+this.ngay+" "+this.h+" "+this.phong);
    }
    public String getNgay(){
        return this.ngay;
    }
    public String getMa(){
        return this.ma;
    }
    public String getH(){
        return this.h;
    }
}
public class bai110{
    public static void main(String [] args){
        try{
        File f=new File ("CATHI.in");
        Scanner sc=new Scanner (f);
        int t=Integer.parseInt(sc.nextLine().trim());
        List<thi>s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h="00"+h;
            else if (h.length()==2)h='0'+h;
            String ma="C"+h;
            String ngay=sc.nextLine().trim();
            String k=sc.nextLine().trim();
            String phong=sc.nextLine().trim();
            s.add(new thi (ma,ngay,k,phong));
        }
        s.sort(Comparator.comparing(thi::getNgay).thenComparing (thi::getH).thenComparing(thi::getMa));
        for (thi x:s){
            x.in();
        }
        }
        catch(Exception e){

        }
    }
}