import java.util.Scanner ;
public class bai47{
    public static String ch(String s){
        String kq=s.substring(0,1).toUpperCase();
        if (s.length()>1){
            kq+=s.substring (1).toLowerCase();
        }
        return kq;
    }
    public static void main(String[] args){
            Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String s=sc.nextLine().trim();
            String[] k=s.split("\\s+");
            for (int i=1;i<k.length;i++){
                System.out.print (ch(k[i]));
                if (i!=k.length-1)System.out.print(" ");
                else System.out.print(",");
            }
            String kq=k[0].toUpperCase();
            System.out.print(" "+kq);
            
            System.out.println();
        }
    }

}