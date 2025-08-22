import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
class khach {
    String ma,ten,phong,den,di;
    long dv;
    double tong;
    long ngay,time;
    khach (String ma,String ten,String phong,String den,String di,long dv){
        this.ma=ma;
        this.ten=ten;
        this.phong=phong;
        this.den=den;
        this.di=di;
        this.dv=dv;
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/mm/yyyy");
        LocalDate bs=LocalDate.parse(this.den,f);
        LocalDate end=LocalDate.parse(this.di,f);
        this.ngay=ChronoUnit.DAYS.between (bs,end);
        this.time=this.ngay+1;
        int dongia=0;
        String map=phong.substring(0,1);
        if (map.equals("1"))dongia=25;
        else if (map.equals("2"))dongia=34;
        else if (map.equals("3"))dongia=50;
        else if (map.equals("4"))dongia=80;
        this.tong=dongia*this.time+this.dv;

        
        
        
    }
    public static String chuan (String s){
        String re=String.valueOf(s.charAt(0)).toUpperCase();
        re+=s.substring (1).toLowerCase();
        return re;
        
    }
    public static  String gep (String s){
        String [] h=s.split(" ");
        String tmp="";
        for (int i=0;i<h.length;i++){
            tmp+=chuan (h[i]);
            tmp+=" ";
        }
        return tmp.trim();
    }
    public void in (){
        System.out.print(this.ma+" "+gep(this.ten)+" "+this.phong+" "+this.time+" ");
        System.out.printf("%.0f",this.tong);
        System.out.println();
    }
    public Double getTong(){
        return this.tong;
    }
    
    
    
}
public class 5{
    public static void main (String [] args){
        try {
            File f=new File ("KHACHHANG.in");
            Scanner sc=new Scanner (f);
            int t=sc.nextInt ();
            sc.nextLine();
            List<khach>ds=new ArrayList<>();
            for (int i=1;i<=t;i++){
                String h=String.valueOf(i);
                if (h.length()==1)h="0"+h;
                String ma="KH"+h;
                String ten=sc.nextLine();
                String phong=sc.nextLine();
                String den=sc.nextLine();
                String di=sc.nextLine();
                long dv=sc.nextLong();
                ds.add(new khach (ma,ten,phong,den,di,dv));
                
            }
            ds.sort((x1,x2)->Double.compare(x2.getTong(), x1.getTong()));
            for (khach x:ds){
                x.in();
            }
            
        }
        catch (Exception e){
            
        }
    }
}