import java.util.Scanner;
public class bai491{
    public static String ch(String s){
        String kq=s.substring(0,1).toUpperCase();
        if (s.length()>1){
            kq+=s.substring (1).toLowerCase();
        }
        return kq;
    }
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String s=sc.nextLine().trim();
            String [] k=s.split("\\s+");
            String kq=k[k.length-1].toLowerCase();
            StringBuilder dau = new StringBuilder();

            for (int i=0;i<k.length-1;i++){
                dau.append(k[i].charAt(0));

            }
            String tong=kq+dau.toString().toLowerCase()+"@ptit.edu.vn";
            System.out.println (tong);
        }
    }
}