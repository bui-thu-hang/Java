import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class bai56{
    public static boolean check(String n){
        for (int i=0;i<n.length()/2;i++){
            if (n.charAt(i)!=n.charAt(n.length()-i-1)){
                return false;

            }

        }
        return true;
    }
    public static int doi(String h){
        for (int i=0;i<h.length();i++){
            char c=h.charAt(i);
            switch (c) {
                case 'A':
                case 'B':
                case 'C':
                    return 2;
                case 'D':
                case 'E':
                case 'F':
                    return 3;
                case 'G':
                case 'H':
                case 'I':
                    return 4;
                case 'J':
                case 'K':
                case 'L':
                    return 5;
                case 'M':
                case 'N':
                case 'O':
                    return 6;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    return 7;
                case 'T':
                case 'U':
                case 'V':
                    return 8;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    return 9;
               
           

    }}
}
public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String s=sc.nextLine();
            String c=s.toUpperCase();
            System.out.print(doi(c));

        }
    }
}