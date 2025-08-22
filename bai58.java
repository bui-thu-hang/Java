import java.util.Scanner;
public class bai58{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String s=sc.nextLine ().trim();
            int dem=0;
            for (int i=0;i<s.length()/2;i++){
                if (s.charAt(i)!=s.charAt(s.length()-i-1))dem++;
            }
            System.out.println(dem);
            if (dem==1||dem==0)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}