import java.util.Scanner;
public class bai3{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        if ((n%400==0)||((n%4==0)&&(n%100!=0))){
            System.out.println("YES");

        }
        else {
            System.out.println("NO");
        }
        System.out.println((char)n);
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }

    }
}