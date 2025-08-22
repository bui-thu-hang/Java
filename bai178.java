import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class doanhnghiep{
    String ma;
    String ten;
    int sv;
    doanhnghiep(String ma,String ten,int sv){
        this.ma=ma;
        this.ten=ten;
        this.sv=sv;
    }
    public void in(){
        System.out.print(this.ma+" "+this.ten+" "+this.sv);
    }
    public int getSv(){
        return this.sv;
    }
}
public class bai178{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<doanhnghiep>s=new ArrayList<>();
        while (t-- >0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int sv=sc.nextInt();
            sc.nextLine();
            doanhnghiep x=new doanhnghiep(ma, ten, sv);
            s.add(x);

        }

        s.sort((x1,x2)->Integer.compare(x2.getSv(),x1.getSv()));
        for (doanhnghiep x:s){
            x.in();
            System.out.println();
        }

    }

}