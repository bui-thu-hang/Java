import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class giaovien{
    String ma;
    String ten;
    String mon;
    giaovien(String ma,String ten,String mon){
        this.ma=ma;
        this.ten=ten;
        this.mon=mon;
    }
    public void in (){
        System.out.println(this.ma+" "+this.ten+" "+this.mon);

    }
}
public class bai176{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<giaovien>s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h='0'+h;
            String ma="GV"+h;
            String ten=sc.nextLine ();
            String mon=sc.nextLine();
            giaovien x=new giaovien(ma,ten,mon);
            s.add(x);

        }
        int h=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<h;i++){
            String truyvan=sc.nextLine();
            String temp=truyvan;
            truyvan=truyvan.toUpperCase();
            String []k=truyvan.split("\\s+");
            String kq="";
            for(String word:k){
                kq+=word.charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+kq+":");
            for (giaovien x:s){
                if (x.mon.equals(temp)){
                    x.in();
                }
            }

        }
        
    }
}