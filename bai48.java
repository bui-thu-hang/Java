import java.util.Scanner;
public class bai48 {
    public static boolean kt (String s){
        for (int i=0;i<s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        
        }
        return true;
    }
    public static boolean check (String s){
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c!='0'&&c!='2'&&c!='4'&&c!='6'&&c!='8'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String s=sc.nextLine().trim();
            if (kt(s)&&check(s))System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}