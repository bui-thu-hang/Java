import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
class sinhvien{
    String ten;
    int dung;
    int nop;
    sinhvien(String ten,int dung,int nop){
        this.ten=ten;
        this.dung=dung;
        this.nop=nop;
    }
    public void in(){
        System.out.print (this.ten+" "+this.dung+" "+this.nop);
    }
    public int getDung(){
        return this.dung;
    }
    public String getTen(){
        return this.ten;
    }
}
public class bai190{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<sinhvien>s=new ArrayList<>();
        while (t-- >0){
            String  ten=sc.nextLine();
            int dung=sc.nextInt();
            int nop=sc.nextInt();
            sc.nextLine();
            sinhvien x=new sinhvien(ten, dung, nop);
            s.add(x);
        }
        s.sort(Comparator.comparing(sinhvien::getDung).reversed().thenComparing(sinhvien::getTen));
        for (sinhvien x:s){
            x.in();
            System.out.println();
        }
    }
}