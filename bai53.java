import java.util.Scanner;
import java.math.BigInteger;
public class bai53{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String a=sc.next();
            String b=sc.next();
            BigInteger x=new BigInteger(a);
            BigInteger y=new BigInteger(b);
            BigInteger u= x.gcd (y);
            System.out.println (u);
        }
    }
}