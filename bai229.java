import java.util.*;
import java.io.*;
class sv{
    String ma,ten,lop,ngay;
    float d;
    sv(String ma, String ten,String lop,String ngay,float d){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.ngay=ngay;
        this.d=d;
    }
    public static  String chuan (String s){
        String re=String.valueOf(s.charAt(0)).toUpperCase();
        re=re+s.substring(1).toLowerCase();
        return re;

     }
public static String n(String s){
    String [] h=s.split("/");
    if (h[0].length()==1)h[0]='0'+h[0];
    if (h[1].length()==1)h[1]='0'+h[1];
    if (h[2].length()==1)h[2]='0'+h[2];
    return h[0]+"/"+h[1]+"/"+h[2];

    
}public static String gep(String s){
    String []h=s.split("\\s+");
    String tmp="";
    for (int i=0;i<h.length;i++){
        tmp+=chuan(h[i]);
        tmp+=" ";
    }
    return tmp;
}
public void in (){
    System.out.print(this.ma+" "+gep(this.ten)+this.lop+" "+n(this.ngay)+" ");
    System.out.printf("%.2f",this.d);
    System.out.println();
}

}
public class bai229{
    public static void main (String [] args){
        try{
            File f=new File ("SINHVIEN.in");
            Scanner sc=new Scanner (f);
            int t=sc.nextInt();
            List<sv>ds=new ArrayList<>();
            sc.nextLine();
            for (int i=1;i<=t;i++){
                String h=String.valueOf(i);
                if (h.length()==1)h="00"+h;
                else if (h.length()==2)h='0'+h;
                String ma="B20DCCN"+h;
                String ten=sc.nextLine();
                String lop=sc.nextLine();
                String ngay=sc.nextLine();
                float d=sc.nextFloat();
                sc.nextLine();
                ds.add(new sv(ma, ten, lop, ngay, d));

            
            }
            for (sv x:ds){
                x.in();
            }
        }
        catch(Exception e){

        }
    }
}