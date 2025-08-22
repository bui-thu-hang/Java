import java.util.Scanner;
public class hcn{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int a;
        int b;
        a=sc.nextInt();
        b=sc.nextInt();
        if (a>0 &&b>0){
        int chuvi=(a+b)*2;
        long dt=a*b;
        System.out.print(chuvi );
        System.out.print(" ");
        System.out.println (dt);}
        else {
            System.out.print ("0");
        }
        
    }
}