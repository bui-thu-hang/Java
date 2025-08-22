import java.util.Scanner;
public class bai57{
    public static boolean check (String s){
        int le=0;
        int dai=s.length();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c!='0'&&c!='2'&&c!='4'&&c!='6'&&c!='8'){
                le++;
            }

        }
        if (dai%2!=0&&le>dai-le)return true;
        else if (dai%2==0&&le<dai-le)return true;
        else return false;
        
    }
    
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s=sc.nextLine().trim();
            boolean kt=true;
            for (int i=0;i<s.length();i++){
                if (!s.matches("\\d+")||s.charAt(0)=='0'){
                    System.out.println("INVALID");
                    kt=false;
                    break;
                }
            }
            if (kt){
                if (check(s))System.out.println("YES");
                else System.out.println("NO");
            }

        }

    }
}