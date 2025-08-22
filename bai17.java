import java.util.Scanner;
public class bai17{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        long t=sc.nextLong();
        while (t-- >0){
            long n=sc.nextLong();
            boolean check=false;
            for (int i=2;i<=(int)Math.sqrt(n);i++){
                if (n%i==0){
                    check=true;
                    break;
                }

            }
            if (!check)System.out.println (n);
            else {
                long max=-1;

                for (int i=2;i<=(int)Math.sqrt(n);i++){
                    while (n%i==0){
                        max=i;
                        n/=i;
                    }
                    
                }
                if (n>1){
                    max=n;
                }
                System.out.println(max);

                
            }
        }
    }
}