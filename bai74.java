import java.util.Scanner;
class GiaoVien {
    String ma;
    String ten;
    int l;
    GiaoVien (String ma,String ten,int l){
        this.ma=ma;
        this.ten=ten;
        this.l=l;
    }
    public void in(){
        String dau=this.ma.substring(0,2);
        String cuoi=this.ma.substring(2);
        int h = Integer.parseInt(cuoi);
        System.out.print (this.ma+" "+this.ten+" "+h+" ");
        if (dau.equals("HT")){
            int tn=h*this.l+2000000;
            System.out.print ("2000000"+" "+tn);
            
        }
        if (dau.equals("HP")){
            int tn=h*this.l+900000;
            System.out.print ("900000"+" "+tn);
            
        }        
        if (dau.equals("GV")){
            int tn=h*this.l+500000;
            System.out.print ("500000"+" "+tn);
            
        }


    }
    
}
public class bai74{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        String ma=sc.nextLine();
        String ten=sc.nextLine();
        int l=sc.nextInt();
        GiaoVien x=new GiaoVien(ma, ten, l);
        x.in();

    }
}