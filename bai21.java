import java.util.Scanner;
public class bai21{
    public static int mod=1000000007;
    public static void main (String[] args){
        Scanner sc =new Scanner (System.in);
        while (true){
            int a=sc.nextInt();
            long b=sc.nextLong();
            if (a==0&&b==0){
                break;
            }
            else {
            int kq=(int)Math.pow ((a%mod),(b%mod)) % mod;
            System.out.println (kq);
            }   



        }
    }
}