import java.util.Scanner;
public class bai11{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for (int j=1;j<=t;j++){
            int n=sc.nextInt();

            System.out.print("Test "+ j+ ": ");
            
            for (int i=2;i<=n;i++){
                int dem=0;
                while (n%i==0){
                    dem++;
                    n/=i;
                    

                }
                if (dem>0){
                System.out.print (i+ "("+dem+") ");
                }
            }
            System.out.printf ("\n");
        }
    }
}