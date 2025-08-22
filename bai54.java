import java.util.Scanner;
import java.math.BigInteger;
public class bai54{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String x=sc.nextLine().trim();
            String y=sc.nextLine().trim();
            BigInteger a=new BigInteger(x);
            BigInteger b=new BigInteger(y);
            BigInteger kq=a.subtract(b).abs();
            String h=kq.toString();
            int k=Math.max(x.length(),y.length());
            while (h.length()<k){
                h = "0" +h;
            }
            System.out.println (h);

        }
    }
}