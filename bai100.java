import java.util.*;
import java.io.*;
class sp{
    String ma,ten;
    int gia,bao;
    sp(String ma,String ten,int gia,int bao){
        this.ma=ma;
        this.ten=ten;
        this.gia=gia;
        this.bao=bao;
    }
    public void in (){
        System.out.println(this.ma+" "+this.ten+" "+this.gia+" "+this.bao);
    }
    public int getGia(){
        return this.gia;
    }
    public String getMa(){
        return this.ma;
    }
}
public class bai100{
    public static void main (String [] args){
        try{
            File file =new File ("SANPHAM.in");
            Scanner sc=new Scanner (file);
            int t=Integer.parseInt(sc.nextLine().trim());
            List<sp>s=new ArrayList<>();
            while (t-->0){
                String ma=sc.nextLine().trim();
                String ten=sc.nextLine().trim();
                int gia=Integer.parseInt(sc.nextLine().trim());
                int bao=Integer.parseInt(sc.nextLine().trim());
                s.add(new sp(ma,ten,gia,bao));
            }
            s.sort (Comparator.comparingInt(sp::getGia).reversed().thenComparing(sp::getMa));
            for (sp x:s){
                x.in();
            }
        }
        catch(Exception e){

        }
    }
}