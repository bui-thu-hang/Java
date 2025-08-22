import java.util.Scanner;
public class bai49{
    public static boolean check1(String s){
        for (int i=0;i<s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(s.length()-i-1))return false;

        }
        return true;
    }
    public static boolean check2(String s){
        int tong=0;
        for (int i=0;i<s.length();i++){
            tong+=s.charAt(i)-'0';

        }
        if (tong%10!=0)return false;
        return true;
    }
    public static boolean check3 (String s){
        if (s.charAt(0)!='8'&&s.charAt(s.length()-1)!='8'){
            return false;
        }
        return true;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- >0){
         String s=sc.nextLine().trim();
         if (check1(s)&&check2(s)&&check3(s))System.out.println("YES");
         else System.out.println("NO");
            
        }
        
    }
}