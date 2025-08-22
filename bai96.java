import java.util.*;
import java.io.*;
class dn{
    String ma,ten;
    int sv;
    dn(String ma,String ten,int sv){
        this.ma=ma;
        this.ten=ten;
        this.sv=sv;
    }
    public void in(){
        System.out.println(this.ma+" "+this.ten+" "+this.sv);
    }
    public String getMa(){
        return this.ma;
    }
}
public class bai96{
    public static void main (String [] args){
        try{
            File file=new File ("DN.in");
            Scanner sc=new Scanner (file);
            int t=sc.nextInt();
            sc.nextLine();
            List<dn>ds=new ArrayList<>();
            while (t-->0){
                String ma=sc.nextLine();
                String ten=sc.nextLine();
                int sv=sc.nextInt();
                sc.nextLine();
                ds.add(new dn(ma,ten,sv));
            }
            ds.sort((x1,x2)->x1.getMa().compareTo(x2.getMa()));
            for (dn x:ds){
                x.in();
            }
        }
        catch(Exception e){

        }
    }
}