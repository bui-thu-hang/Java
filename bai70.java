import java.util.Scanner;
class SinhVien {
    String ten;
    String ngay;
    Float d1,d2,d3;
    public String chuan(String s){
        String []h= s.split ("/");
        String ngay=h[0];
        String t=h[1];
        String n=h[2];
        if (ngay.length()==1){
            ngay="0"+ngay;
        }
        if (t.length()==1){
            t="0"+t;
        }
        return ngay+ "/" +t+ "/"+n;
        

    }
    SinhVien (String ten,String ngay,float d1,float d2,float d3){
        this.ten=ten;
        this.ngay=ngay;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        
    }
    public void in(){
        float tong=this.d1+this.d2+this.d3;
        System.out.print (this.ten+" "+chuan(this.ngay)+" ");
        System.out.printf ("%.1f",tong);

        
    }

    


}
public class bai70{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        String t=sc.nextLine();
        String n=sc.next();
        Float d1=sc.nextFloat();
        Float d2=sc.nextFloat();

        Float d3=sc.nextFloat();

        SinhVien x=new SinhVien(t,n,d1,d2,d3);
        x.in();



    }
}