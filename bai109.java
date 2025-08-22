import java.util.*;
import java.io.*;
class thi{
    String ma,mon,ht;
    thi(String ma,String mon,String ht){
        this.ma=ma;
        this.mon=mon;
        this.ht=ht;
    }
    public void in(){
        System.out.println(this.ma+" "+this.mon+" "+this.ht);
    }
    public String getMa(){
        return this.ma;
    }

}
public class bai109{
    public static void main (String [] args){
        try{
        File f=new File ("MONHOC.in");
        Scanner sc=new Scanner (f);
        int t=Integer.parseInt(sc.nextLine().trim());
        List<thi>s=new ArrayList<>();
        while (t-->0){
            String ma=sc.nextLine().trim();
            String mon=sc.nextLine().trim();
            String ht=sc.nextLine().trim();
            s.add(new thi(ma,mon,ht));
        }
        s.sort((x1,x2)->x1.getMa().compareTo(x2.getMa()));
        for (thi x:s){
            x.in();
        }
    }
    catch(Exception e){

    }
}
}