import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class hang {
    String ten;
    String ma;
    int don;
    int sl;
    String tt;
    int sale;
    int tong;
    hang(String ten,String ma,int don,int sl){
        this.ten=ten;
        this.ma=ma;
        this.don=don;
        this.sl=sl;
        this.tt=ma.substring(1,4);
        if (ma.charAt(ma.length()-1)=='1')this.sale=don*sl/100*50;
        else if (ma.charAt(ma.length()-1)=='2')this.sale=don*sl/100*30;
        this.tong=don*sl-this.sale;
}
public void in(){
    System.out.println (this.ten+" "+this.ma+" "+this.tt+" "+this.sale+" "+this.tong);
}
}
public class bai200{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<hang>s=new ArrayList<>();
        while (t-->0){
            String ten=sc.nextLine();
            String ma=sc.nextLine();
            int don=sc.nextInt();
            int sl=sc.nextInt();
            sc.nextLine();
            hang x=new hang(ten, ma, don, sl);
            s.add(x);
        }
        for (hang x:s){
            x.in();
        }
    }
}