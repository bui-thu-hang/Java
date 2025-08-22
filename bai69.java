import java.util.Scanner;
class Pso {
    long tu,mau;
    public long gcd(long a,long b){
        while (b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long lcm(long a,long b){
        return a*b/gcd(a,b);
    }
    public Pso(long tu,long mau) {
        this.tu=tu;
        this.mau=mau;
    }
    public String tong (Pso b){
        long mc=lcm(this.mau,b.mau);
        long tu1=(mc/this.mau)*this.tu;
        long tu2=(mc/b.mau)*b.tu;
        long tm=tu1+tu2;
        long h=gcd(tm,mc);
        long t=tm/h;
        long m=mc/h;
        return t+"/"+m;

        
    }
    

}
public class bai69{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        long x1=sc.nextLong();
        long y1=sc.nextLong();
        long x2=sc.nextLong();
        long y2=sc.nextLong();
        Pso a=new Pso(x1,y1);
        Pso b=new Pso (x2,y2);
        System.out.print (a.tong(b));
        

    }
}