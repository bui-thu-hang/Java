import java.util.Scanner;
import java.math.BigInteger;
public class bai55{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String a=sc.next();
            String b=sc.next();
            BigInteger x=new BigInteger(a);
            BigInteger y=new BigInteger(b);
            BigInteger kq1=y.mod(x);

            BigInteger kq=x.mod(y);
            if (kq.equals(BigInteger.ZERO)||kq1.equals(BigInteger.ZERO)){
                System.out.println("YES");

            }
            else {
                System.out.println ("NO");
            }

        
        }

    }
}