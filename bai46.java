import java.util.Scanner;
public class bai46{
    public static String ch(String s){

        String kq=s.substring(0,1).toUpperCase();
            
        
        if (s.length()>1){
            kq+=s.substring(1).toLowerCase();
        }
        return kq;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String s=sc.nextLine().trim();
            String[] words=s.split("\\s+");
            for (String h:words){
                System.out.print(ch(h));
                System.out.print(" ");
            }
            System.out.println();

        
        }
    }
}