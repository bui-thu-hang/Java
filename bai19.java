import java.util.Scanner;
public class bai19{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long n=sc.nextLong();
            if (n>10){
            String num=Long.toString (n);
            int d=num.length();
            int []a=new int [d];
            for (int i=0;i<d;i++){
                a[i]=num.charAt(i)-'0';
            }
            boolean check=true;
            for (int i=1;i<d;i++){
                if (Math.abs(a[i]-a[i-1])!=1){
                    check=false;
                    break;
                }
            }
            if (check)System.out.println("YES");
            else System.out.println("NO");


        }}
    }
}