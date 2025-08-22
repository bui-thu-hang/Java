import java.util.Scanner;
public class bai7{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int a=sc.nextInt();
            int check=1;
            for (int i=2;i<=(int)Math.sqrt(a);i++){
                if (a%i==0){
                    System.out.println("NO");
                    check=0;
                    break;
                }

            }
            if (check==1){
                System.out.println("YES");
            }
        }

    }
}