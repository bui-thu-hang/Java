import java.util.Scanner;
public class bai14{
    public static long GCD (long a,long b){
        if (b==0)return a;
        return GCD(b,a%b);
    }
    public static void main (String [] args){
    Scanner sc=new Scanner (System.in);
    int t=sc.nextInt();
    while (t-->0){
        long a=sc.nextLong();
        long b=sc.nextLong();
        System.out.println (a*b/GCD(a,b)+" "+GCD(a,b));
    }
}}