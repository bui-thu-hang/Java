import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class giaovien {
    String ma;
    String ten;
    int luong;
    String bac;
    int pc;
    int tn;
    giaovien (String ma,String ten,int luong){
        this.ma=ma;
        this.ten=ten;
        this.luong=luong;
        this.bac=ma.substring(2);
        int hs=Integer.parseInt(bac);
        String nghe=ma.substring(0,2);
        if (nghe.equals("HT"))this.pc=2000000;
        else if (nghe.equals ("HP"))this.pc=900000;
        else if (nghe.equals("GV"))this.pc=500000;
        this.tn=this.pc+luong*hs;
    }
    public void in (){
        System.out.println(this.ma+" "+this.ten+" "+this.bac+" "+this.pc+" "+this.tn);
    }
}
public class bai209{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<giaovien>s=new ArrayList<>();
        int dem=0;
        int cnt=0;
        while (t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int luong=sc.nextInt();
            sc.nextLine();
            giaovien x=new giaovien(ma, ten, luong);
            String nghe=x.ma.substring (0,2);
            if (nghe.equals("HT")){
                if (dem<1){
                    s.add(x);
                    dem++;
                }
            }
            else if (nghe.equals("HP")){
                if (cnt<2){
                    s.add(x);
                    cnt++;
                }
            }
            else {
                s.add(x);
            }



        }
        for (giaovien x:s){
            x.in();
        }
    }
}