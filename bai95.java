import java.util.*;
import java.io.*;
class ten{
    String ma,mon;
    int tin;
    ten(String ma,String mon,int tin){
        this.ma=ma;
        this.mon=mon;
        this.tin=tin;
    }
    public void in(){
        System.out.println(this.ma+" "+this.mon+" "+this.tin);
    }
    public String getMon(){
        return this.mon;
    
    }
}
public class bai95{
    public static void main(String [] args){
        try{
        File file=new File("MONHOC.in");
        Scanner sc=new Scanner(file);
        
        while (sc.hasNextLine()){
            int t=sc.nextInt();
            sc.nextLine();
            List<ten>ds=new ArrayList<>();
            while (t-->0)
            {
            String ma=sc.nextLine();
            String mon=sc.nextLine();
            int tin=sc.nextInt();
            sc.nextLine();
            ds.add(new ten(ma,mon,tin));
            }   
            ds.sort((x1,x2)->x1.getMon().compareTo(x2.getMon()));
            for (ten x:ds){
                x.in();
            }
        }
    }
    catch(Exception e){
        
    }
    }
}