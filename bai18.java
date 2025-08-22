import java.util.Scanner;
public class bai18{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        String num=Long.toString (n);
        int d=num.length();
        int []a=new int [d];
        for (int i=0;i<d;i++){
            a[i]=num.charAt(i)-'0';
        }
        int dem=0;
        for (int i=0;i<d;i++){
            if (a[i]==4||a[i]==7){
                dem++;
            }
        }
        if (dem==4||dem==7)System.out.println("YES");
        else System.out.println("NO");
    }
}