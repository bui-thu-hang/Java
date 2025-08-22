import java.util.Scanner;
public class bai20{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt ();
        while (t-- >0){
            long n=sc.nextLong ();
            long temp=n;
            int dem=0;
            while (temp>0){
                dem+=temp%10;
                temp/=10;
            }
            boolean check1= true;
            if (dem%10!=0){
                check1=false;
            }
            String num=Long.toString (n);
            int d=num.length();
            int []a=new int [d];
            for (int i=0;i<d;i++){
                a[i]=num.charAt(i)-'0';
            }
            boolean check=true;
            for (int i=1;i<d;i++){
                if (Math.abs(a[i]-a[i-1])!=2){
                    check=false;
                    break;
                }
            }
            if (check&&check1)System.out.println("YES");
            else System.out.println("NO");

        }
    }
}