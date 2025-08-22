import java.util.Scanner;
public class bai10{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        long []a=new long[93];
        a[1]=1;
        a[2]=1;
        for (int i=3;i<=92;i++){
            a[i]=a[i-1]+a[i-2];
        }
        while (t-- >0){
            boolean check=false;

            long n=sc.nextLong();
            for (int i=1;i<=92;i++){
                if (a[i]==n){
                    System.out.println("YES");

                    check=true;
                    
                    
                    break;
                    
                }
                
            }
            
            if(!check)
            System.out.println("NO");
        }


    }
}