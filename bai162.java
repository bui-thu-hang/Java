import java.util.Scanner;
class SinhVien{
    String ten;
    String lop;
    String ngay;
    Float d;
    SinhVien (String ten, String lop,String ngay,Float d){
        this.ten=ten;
        this.lop=lop;
        this.ngay=ngay;
        this.d=d;
    }
    public String chuan(String s){
        String[] h=s.split ("/");
        String da=h[0];
        String t=h[1];
        String n=h[2];
        if (da.length()==1){
            da="0"+da;
        }
        if (t.length()==1){
            t="0"+t;
        }
        return da+"/"+t+"/"+n;
    }
    public String Chuan1(String s){
        String kq=s.substring (0,1).toUpperCase();
        if (s.length()>1){
            kq+=s.substring (1).toLowerCase();
        }
        return kq;

    }
    public String chuan2(String s){
        String kq ="";
        String [] h=s.split(" ");
        for (String word:h){
            kq+=Chuan1(word)+" ";
        }
        return kq;
    
    }
    public void in(){
        System.out.print (chuan2(this.ten)+" "+this.lop+" "+chuan(this.ngay)+" ");
        System.out.printf ("%.2f",this.d);
    }
}
public class bai162{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in );
        int t=sc.nextInt();
        sc.nextLine();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1){
                h="00"+h;
            }
            if (h.length()==2){
                h="0"+h;
            }
            String ma="B20DCCN"+h;
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String ngay=sc.nextLine();
            Float d=sc.nextFloat();
            sc.nextLine();
            SinhVien x=new SinhVien(ten, lop, ngay, d);
            System.out.print (ma+" ");
            x.in();
            System.out.println();


        }
    }
}