import java.util.Scanner;
import java.math.BigInteger;
public class bai64{
    public static int mod=1000000007;
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String x=sc.next();
            String y=sc.next();
            BigInteger a=new BigInteger(x);
            BigInteger b=new BigInteger(y);
            BigInteger c=a.subtract(b);
            System.out.println (c);




        }
    }
}