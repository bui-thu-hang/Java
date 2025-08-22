import java.util.Scanner;
public class bai37{
    static int n,k;
    static int[] x;
    static int dem=0;

    public static void Try(int i){  
        for (int j=x[i-1]+1;j<=n-k+i;j++){
            x[i]=j;
            if (i==k){
                for (int l=1;l<=k;l++){
                    System.out.print(x[l]+" ");
        
                }
                dem++;
                System.out.println();
        
            }
            else Try(i+1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        x=new int[k+1];
        Try(1);
        System.out.println("Tong cong co "+dem+" to hop");

    }
}