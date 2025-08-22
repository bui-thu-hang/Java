import java.util.Scanner;
class SinhVien {
    String ten;
    String lop;
    String ngay;
    float gpa;
    SinhVien (String ten,String lop,String ngay,float gpa){
        this.ten=ten;
        this.lop=lop;
        this.ngay=ngay;
        this.gpa=gpa;
    }
    public String chuan (String s){
        String [] h=s.split("/");
        String d=h[0];
        String t=h[1];
        String n=h[2];
        if (d.length()==1){
            d="0"+d;
        }
        if (t.length()==1){
            t="0"+t;
        }
        return d+"/"+t+"/"+n;
    }
    public void in (){
        System.out.print (this.ten+" "+this.lop+" "+chuan(this.ngay)+" ");
        System.out.printf("%.2f",gpa);
    }
}
public class bai161{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt ();
        sc.nextLine();
        for (int i=1;i<=t;i++){
            String  h=String.valueOf(i);//chuyển số sang xâu
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
        Float gpa=sc.nextFloat();
        sc.nextLine();
        SinhVien x=new SinhVien(ten, lop, ngay, gpa);
        System.out.print (ma+" ");

        x.in();
        System.out.println();    
            
        
        }
    }
}