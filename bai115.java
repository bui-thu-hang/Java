import java.util.*;
import java.io.*;
class sinhvien {
    String ma,full,sdt,mail,ho,dem,ten;
    sinhvien (String ma,String full,String sdt,String mail){
        this.ma=ma;
        this.full=full;
        this.sdt=sdt;
        this.mail=mail;
        String [] h=full.split("\\s+");
        for (int i=1;i<h.length;i++){
            this.dem+=h[i];
        }
        this.ho=h[0];
        this.ten=h[h.length-1];
    }
    public void in(){
        System.out.println(this.ma+" "+this.full+" "+this.sdt+" "+this.mail);
    }
    public String getTen(){
        return this.ten;
    }
    public String getDem(){
        return this.dem;
        
    }
    public String getHo(){
        return this.ho;
    }
    public String getMa(){
        return this.ma;
    }
}
public class bai115{
    public static void main (String [] args){
        try{
            File f=new File("SINHVIEN.in");
            Scanner sc=new Scanner (f);
            int t=Integer.parseInt(sc.nextLine().trim());
            List<sinhvien>s=new ArrayList<>();
            while (t-->0){
                String ma=sc.nextLine().trim();
                String full=sc.nextLine().trim();
                String sdt=sc.nextLine().trim();
                String mail=sc.nextLine().trim();
                s.add(new sinhvien(ma,full,sdt,mail));
            }
            s.sort(Comparator.comparing(sinhvien::getTen).thenComparing (sinhvien::getDem).thenComparing (sinhvien::getHo).thenComparing(sinhvien::getMa));
            for (sinhvien x:s){
                x.in();
            }
        }
        catch(Exception e){

        }
    }
}