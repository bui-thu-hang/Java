import java.util.Scanner;
public class bai50{
    public static boolean check (String s){
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c!='2'&&c!='3'&&c!='5'&&c!='7'){
                return false;
            }
        }
        return true;
        
    }
    public static boolean tn (String s){
        for(int i=0;i<s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String s=sc.nextLine().trim();
                if (check(s)&&tn(s)){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            


        }
    }
}