import java.util.Scanner;
class NhanVien {
    String ten;
    String gt;
    String ns;
    String dc;
    String sdt;
    String ki;
    NhanVien (String ten,String gt,String ns,String dc,String sdt,String ki){
        this.ten=ten;
        this.gt=gt;
        this.ns=ns;
        this.dc=dc;
        this.sdt=sdt;
        this.ki=ki;
    }
    public String chuan(String s){
        String [] h=s.split("/");
        String ngay=h[0];
        String t=h[1];
        String n=h[2];
        if (ngay.length()==1){
            ngay="0"+ngay;
        }
        if (t.length()==1){
            t="0"+t;
        }
        return ngay+"/"+t+"/"+n;
    
    }
    public void in(){
        System.out.print ("00001"+" "+this.ten+" "+this.gt+" "+chuan(this.ns)+" "+this.dc+" "+this.sdt+" "+chuan(this.ki));
    }
    
}
public class bai72{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        String ten=sc.nextLine();
        String gt=sc.nextLine();
        String ns=sc.nextLine();
        String dc=sc.nextLine();
        String sdt=sc.nextLine();
        String ki=sc.next();
        NhanVien x=new NhanVien(ten, gt,ns, dc, sdt, ki);
        x.in();

    }
}