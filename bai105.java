import java.util.*;
import java.io.*;
class sinhvien {
    String ma,ten;
    double d1,d2,d3,tb;
    int xl;
    sinhvien (String ma,String ten,double d1,double d2,double d3){
        this.ma=ma;
        this.ten=ten;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.xl=xl;
        this.tb=(d1*3+d2*3+d3*2)/8;


    }
    public static String chuan(String s){
        String res=String.valueOf(s.charAt(0)).toUpperCase();
         res+=s.substring(1).toLowerCase();
        return res;
    }
    public static String gep (String s){
        String []h=s.trim().split("\\s+");
        String tmp="";
        for (int i=0;i<h.length;i++){
            tmp+=chuan (h[i]);
            tmp+=" ";
        }
        return tmp.trim();
    }
    public void in (){
        System.out.print(this.ma+" "+gep(this.ten)+" ");
        System.out.printf ("%.2f",tb);
        System.out.println (" "+this.xl);
    }
    public double getTb(){
        return this.tb;
    }
    public String getMa(){
        return this.ma;
    }
}
public class bai105{
    public static void main (String [] args){
        try {
            File f=new File ("BANGDIEM.in");
            Scanner sc=new Scanner (f);
            int t=sc.nextInt ();
            sc.nextLine ();
            List<sinhvien >ds=new ArrayList<>();
            for (int i=1;i<=t;i++){
                String h=String.valueOf(i);
                if (h.length()==1)h="0"+h;
                String ma="SV"+h;
                String ten=sc.nextLine();
                double d1=sc.nextDouble ();
                double d2=sc.nextDouble ();
                double d3=sc.nextDouble();
                sc.nextLine();
                ds.add(new sinhvien (ma,ten,d1,d2,d3));
            }
            int rank=1;
            for (int i=0;i<ds.size();i++){
                if (i>0 && ds.get(i).tb==ds.get(i-1).tb){
                    ds.get(i).xl=ds.get(i-1).xl;
                }
                else {
                    ds.get(i).xl=rank++;
                }
            }
            ds.sort (Comparator.comparingDouble(sinhvien ::getTb).reversed().thenComparing (sinhvien:: getMa));

            for (sinhvien x:ds){
                x.in();
            }
        }
        catch (Exception e){

        }
    }
}