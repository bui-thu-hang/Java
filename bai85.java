import java.util.*;
import java.io.*;
class sv{
    String ma,ten,lop, ngay;
    float gpa;
    sv(String ma,String ten,String lop,String ngay,float gpa){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.ngay=ngay;
        this.gpa=gpa;
    }
    public String chuan (String s){
        String []h=s.split("/");
        String y=h[0];
        if (y.length()==1)y='0'+y;
        String m=h[1];
        if (m.length()==1)m='0'+m;
        String d=h[2];
        if (d.length()==1)d='0'+d;
        return y+"/"+m+"/"+d;
    }
    public void in(){
        System.out.print(this.ma+" "+this.ten+" "+this.lop+" "+chuan(this.ngay)+" ");
        System.out.printf("%.2f",this.gpa);
        System.out.println();

    }
}
public class bai85{
    public static void main (String [] args){
        try{
        File f=new File ("SV.in");
        Scanner sc=new Scanner (f);
        int t=Integer.parseInt(sc.nextLine());
        List<sv>ds=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h="00"+h;
            else if (h.length()==2)h='0'+h;
            String ma="B22DCCN"+h;
            String ten=sc.nextLine().trim();
            String lop=sc.nextLine().trim();
            String ngay=sc.nextLine().trim();
            float gpa=Float.parseFloat(sc.nextLine());
            ds.add(new sv(ma,ten,lop,ngay,gpa));
        }
        for (sv x:ds){
            x.in();
        }


        }
        catch(Exception e){

        }
    }
}