import java.util.Scanner;
public class bai16{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        int dem=0;
        while (t-- >0){
            long n=sc.nextLong();
            boolean check=false;
            
            for (int i=2;i<=(int)Math.sqrt(n);i++){
                if (n%i==0){
                    check=true;
                    break;

                }
            }
            if (!check)dem+=n;
            else{
                while (n%2==0){
                    dem+=2;
                    n/=2;
                }
            for (int i=3;i<=(int)Math.sqrt(n);i++){
                while (n%i==0){
                    n/=i;
                    dem+=i;
                }

            }
            if (n!=1)dem+=n;


        }}
        System.out.println (dem);
    
    }
}