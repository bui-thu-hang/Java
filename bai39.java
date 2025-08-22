import java.util.Scanner;
public class bai39{
    static int n;
    static int []x;
    static int []d;
    public static void Try(int i){
        for (int j=1;j<=n;j++){
            if (d[j]==0){
                d[j]=1;
                x[i]=j;
                if (i==n){
                    boolean check=true;
                    for (int l=1;l<n;l++){
                        if (Math.abs(x[l]-x[l+1])==1){
                            check=false;
                            break;

                        }
                    }
                    if (check==true){
                            for (int h=1;h<=n;h++){
                            System.out.print(x[h]);
                        }
                    }
                    System.out.println();

                    }

                
                else Try(i+1);
                d[j]=0;
            }
        }}
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){

            n=sc.nextInt();
            x=new int[n+1];
            d=new int[n+1];
                Try(1);
        }
        
    }
}