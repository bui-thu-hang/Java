import java.util.Scanner;
public class bai25{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt ();
            double c=Math.sqrt(n);
            int d=(int)c;
            if (c-d==0){
                System.out.println("YES");
            
            }
            else
            System.out.println("NO");
        }
    }
}