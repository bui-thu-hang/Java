import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class SinhVien {
    String ma;
    String ten;
    String lop;
    String ngay;
    Float d;
    SinhVien (String ma,String ten,String lop,String ngay,Float d){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.ngay=ngay;
        this.d=d;
    }
    public String chuan (String s){
        String [] h=s.split("/");
        String da=h[0];
        String t=h[1];
        String n=h[2];
        if (da.length()==1)da="0"+da;
        if (t.length()==1)t="0"+t;
        return da+"/"+t+"/"+n;
    }
    public String kt(String s){
        String kq=s.substring(0,1).toUpperCase();
        if (s.length()>1){
            kq+=s.substring (1).toLowerCase();
        }
        return kq;
    }
    public String kq(String s){
        String kq="";
        String []h=s.trim().split("\\s+");
        for (String word:h){
            kq+=kt(word)+" ";
        }
        return kq;



    }
    public void in(){
        System.out.print (this.ma+" "+kq(this.ten)+" "+this.lop+" "+chuan(this.ngay)+" ");
        System.out.printf("%.2f",d);

    }
    public float getDiem(){
        return this.d;
    }
}
public class bai163{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<SinhVien>danhsach=new ArrayList<>();

        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h="00"+h;
            if (h.length()==2)h="0"+h;
            String ma="B20DCCN"+h;
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String ngay=sc.nextLine();
            Float d=sc.nextFloat();
            sc.nextLine();
            SinhVien x=new SinhVien(ma, ten, lop, ngay, d);
            danhsach.add(x);}
            danhsach.sort((x1,x2)->Float.compare(x2.getDiem(),x1.getDiem()));
            for (SinhVien x:danhsach){
                x.in();
                System.out.println();
            }



        
    }
}