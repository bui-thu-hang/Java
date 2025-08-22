import java.util.Scanner ;
public class bai8{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int h=sc.nextInt();
            double k=(double)Math.sqrt((double)h*h/n);
            for (int i=1;i<n;i++){
                double kq=k*(double)Math.sqrt(i);
                System.out.printf("%.6f",kq);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}