import java.util.*;
class giaovien{
    String ma;
    String ten;
    String mon;
    giaovien (String ma,String ten,String mon){
        this.ma=ma;
        this.ten=ten;
        this.mon=mon;
        
    }
    public String chuan(String s){
        String tmp="";
        String [] h=s.split("\\s+");
        for (int i=0;i<h.length;i++){
            tmp+=h[i].substring (0,1).toUpperCase();
        }
        return tmp;

    }
    public void in (){
        System.out.println (this.ma+" "+this.ten+" "+chuan(this.mon));
    }
}
public class bai177{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<giaovien >ds=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String .valueOf(i);
            if (h.length()==1)h='0'+h;
            String ma="GV"+h;
            String ten=sc.nextLine();
            String mon=sc.nextLine();
            ds.add(new giaovien(ma, ten, mon));
        }
        int h=sc.nextInt();
        sc.nextLine();
        while (h-->0){
            String truyvan=sc.nextLine();
            System.out.println ("DANH SACH GIANG VIEN THEO TU KHOA "+truyvan+":");
            truyvan=truyvan.toLowerCase();
            for (giaovien x:ds){
                x.ten.toLowerCase();
                String tmp="";
                String []k=x.ten.split("\\s+");
                for (int i=0;i<k.length;i++){
                    tmp+=k[i];
                }
                if (tmp.contains(truyvan)){
                    x.in();
                }

            }
        }
    }
}