import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class bai63{
    public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    String s=sc.nextLine();
    Set<Character>h=new HashSet<>();
    for (int i=0;i<s.length();i++){
        h.add(s.charAt(i));
        
    }
    System.out.print (h.size());
}}