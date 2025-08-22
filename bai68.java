import java.util.Scanner;
import java.math.BigInteger;
class Pso{
    long tu,mau;
    long h;
    public Pso(long tu,long mau){
        this.tu=tu;
        this.mau=mau;
        this.h=gcd(tu,mau);
    }
    public long gcd (long a,long b){
        while (b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public void rutgon() {
        long t=this.tu/h;
        long m=this.mau/h;
        System.out.print(t+"/"+m) ;
    }


}
public class bai68{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        long x=sc.nextLong();
        long y=sc.nextLong();
        Pso k= new Pso (x,y);
        k.rutgon();



    }
} 
