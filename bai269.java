import java.util.*;
class tinh {
    String ma;
    int dongia;
    int sl;
    double thue;
    double ship;
    double tru;
    double tong;
    tinh(String ma,int dongia,int sl){
        this.ma=ma;
        this.dongia=dongia;
        this.sl=sl;
        String dau=ma.substring(0,1);
        if (dau.equals("T")){
            this.thue=0.29;
            this.ship=0.04;

        }
        else if (dau.equals("C")){
            this.thue=0.1;
            this.ship=0.03;
        }
        else if (dau.equals("D")){
            this.thue=0.08;
            this.ship=0.025;
        }else if (dau.equals("M")){
            this.thue=0.02;
            this.ship=0.005;
        }
        String cuoi=ma.substring (3);
        if (cuoi.equals("C"))this.tru=0.95;
        else if (cuoi.equals("K"))this.tru=1;
        double temp=dongia+dongia*this.thue*this.tru+dongia*this.ship;
        this.tong=temp+temp*0.2;
    
        
    }
    public void in(){
        System.out.print (this.ma+" ");
        System.out.printf("%.2f",this.tong);
        System.out.println();
    }
}
public class bai269{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<tinh>ds=new ArrayList<>();
        while (t-->0){
            String ma=sc.next();
            int dongia=sc.nextInt();
            int sl=sc.nextInt();
            sc.nextLine();
            ds.add(new tinh(ma,dongia,sl));

        }
        for (tinh x:ds){
            x.in();
        }
    }
}