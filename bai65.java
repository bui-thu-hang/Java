import java.util.Scanner;
public class bai65{
    public static boolean c1(String s){
        int check=1;
        for (int i=5;i<7;i++){
            if (s.charAt(i)>= s.charAt(i+1)){
                check=0;
                break;
                
            }

        }
        int kt=1;
        if (s.charAt(9)>=s.charAt(10)){
            kt=0;

        }
        if (check==1&&kt==1)return true;
        return false;
    }
    public static boolean c3(String s){
        for (int i=5;i<=10 && i!=8;i++){
            if (s.charAt(i)!='6'&&s.charAt(i)!='8'){
                return false;
                
            }

        }
        return true;
    }
    public static boolean c4(String s){
        int check=1;
        for (int i=5;i<7;i++){
            if (s.charAt(i)!=s.charAt(i+1)){
                check=0;
                break;
            }

        }
        int kt=1;
        if (s.charAt(9)!=s.charAt(10)){
            kt=0;

        }
            if (kt==1 && check==1){
                return true;
            }
            return false;
            
        
    }
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String s=sc.next();
            if (c1(s)||c3(s)||c4(s)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}