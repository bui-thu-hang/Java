import java.util.Scanner;
public class bai45{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]a=new int[n+1][4];
        for(int i=1;i<=n;i++){
            for (int j=1;j<=3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int tong=0;
        for (int i=1;i<=n;i++){
            int dem=0;
            for (int j=1;j<=3;j++){
                if (a[i][j]==1){
                    dem+=a[i][j];

                }
            }
            if (dem>1){
                tong++;
            }
        }
        System.out.print(tong);
    }
}