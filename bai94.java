import java.util.*;
import java.io.*;
class sinhvien{
    String ma,ten,lop,mail;
    sinhvien(String ma,String ten,String lop,String mail){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
    }
    public String chuan(String s){
        String res=String.valueOf(s.charAt(0)).toUpperCase();
        res=res+s.substring (1).toLowerCase();
        res+=" ";
        return res;

    
    }
    public void in(){
        String [] h=this.ten.split("\\s+");
        String tmp="";
        for (int i=0;i<h.length;i++){
            tmp+=chuan(h[i]);
        }
        System.out.println(this.ma+" "+tmp+this.lop+" "+this.mail);
    }
    public String getMa(){
        return this.ma;
    }
}
public class bai94{
    public static void main(String [] args){
        try{
            File file=new File("SINHVIEN.in");
            Scanner sc=new Scanner (file);
            int t=sc.nextInt();
            sc.nextLine();
            List<sinhvien>ds=new ArrayList<>();
            while (t-->0){
                String ma=sc.nextLine();
                String ten=sc.nextLine();
                String lop=sc.nextLine();
                String mail=sc.nextLine();
                ds.add(new sinhvien(ma,ten,lop,mail));
            }
            ds.sort((x1,x2)->x1.getMa().compareTo(x2.getMa()));
            for (sinhvien x:ds){
                x.in();
            }
        }
        catch(Exception e){

        }
    }
}