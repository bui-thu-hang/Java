import java.util.Scanner;
import java.math.BigInteger;
public class bai62{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String a=sc.next();
            String b=sc.next();
            BigInteger x=new BigInteger(a);
            BigInteger y=new BigInteger (b);
            BigInteger kq=x.gcd(y);
            BigInteger h=x.multiply(y);
            BigInteger c=h.divide(kq);
            System.out.println (c);

        }

        
    }
}