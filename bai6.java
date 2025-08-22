import java.util.Scanner;
public class bai6{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
            int a;
            int b;
            a=sc.nextInt();
            b=sc.nextInt();
            if (a==0)
            {
            if(b==0){
                System.out.println("VSN");
            }
            else 
            System.out.println("VN");
        }
        else {
            float nghiem=-(float)b/a;
            System.out.printf ("%.2f",nghiem);
        }
        }
    }
