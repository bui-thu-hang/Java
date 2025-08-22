import java.util.Scanner;
class NhanVien {
    String ten;
    String gt;
    String ngay;
    String dc;
    String sdt;
    String ki;
    NhanVien (String ten,String gt,String ngay,String dc, String sdt,String ki){
        this.ten=ten;
        this.gt=gt;
        this.ngay=ngay;
        this.dc=dc;
        this.sdt=sdt;
        this.ki=ki;
    }
    public String chuan(String s){
        String []h=s.split("/");
        String da=h[0];
        String t=h[1];
        String n=h[2];
        if (da.length()==1)da="0"+da;
        if (t.length()==1)t="0"+t;
        return da+"/"+t+"/"+n;
    }
    public void in (){
        System.out.print (this.ten+" "+this.gt+" "+chuan(this.ngay)+" "+this.dc+" "+this.sdt+" "+chuan(this.ki));

    }
}
public class bai164{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h="0000"+h;
            if (h.length()==2)h="000"+h;
            if (h.length()==3)h="00"+h;
            if (h.length()==4)h="0"+h;
            String ten=sc.nextLine();
            String gt=sc.nextLine();
            String ngay=sc.nextLine();
            String dc=sc.nextLine();
            String sdt=sc.nextLine();
            String ki=sc.nextLine();
            NhanVien x=new NhanVien(ten, gt, ngay, dc, sdt, ki);
            System.out.print (h+" ");
            x.in();
            System.out.println();
        
            


        }
    }
}