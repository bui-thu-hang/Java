import java.util.*;
import java.io.*;
import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class client {
    String ma,ten,phong,den,di;
    long time;
    client (String ma,String ten,String phong,String den,String di){
        this.ma=ma;
        this.ten=ten;
        this.phong=phong;
        this.den=den;
        this.di=di;
        DateTimeFormatter f= DateTimeFormatter.ofPattern ("dd/MM/yyyy");
        LocalDate bd=LocalDate.parse (this.den,f);
        LocalDate end=LocalDate.parse(this.di,f);
        this.time=ChronoUnit.DAYS.between (bd,end);
    }
    public void in (){
        
        System.out.println (this.ma+" "+this.ten+" "+this.phong+" "+this.time);
    }
    public long getTime (){
        return this.time;
    }

}
public class bai99 {
    public static void main (String [] args){
        try {
            File f=new File ("KHACH.in");
            Scanner sc=new Scanner (f);
            int t=sc.nextInt();
            sc.nextLine();
            List<client >ds=new ArrayList<>();
            for (int i=1;i<=t;i++){
                String h=String.valueOf(i);
                if (h.length()==1)h=0+h;
                String ma="KH"+h;
                String ten=sc.nextLine();
                String phong=sc.nextLine();
                String den=sc.nextLine();
                String di=sc.nextLine();
                ds.add(new client(ma,ten,phong,den,di));

            }
            ds.sort ((x1,x2)->Long.compare(x2.getTime(),x1.getTime ()));
            for (client x: ds){
                x.in();
            }

        }
        catch (Exception e){

        }
    }
}