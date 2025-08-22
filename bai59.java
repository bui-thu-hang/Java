import java.util.Scanner;
public class bai59{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String a=sc.next();
            String b=sc.next();
            if (a.length()!=b.length()){
                int h=Math.max(a.length(),b.length());
                System.out.println (h);
            }
            else {
                int check=1;
                for(int i=0;i<a.length();i++){
                    if (a.charAt(i)!=b.charAt(i)){
                        check=0;
                        break;
                    }
                }
                if (check==0)System.out.println (a.length());
                else {
                    System.out.println(-1);
                }
            }
        }
    }
}