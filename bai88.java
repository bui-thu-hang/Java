import java.util.*;
import java.io.*;
public class bai88{
    public static String chuan(String s){
        String res=String.valueOf(s.charAt(0)).toUpperCase();
        res=res+s.substring (1).toLowerCase();
        return res;
        
    }
    public static void main(String [] args){
        try{
        File f=new File("DATA.in");
        Scanner sc=new Scanner (f);
        while (sc.hasNextLine()){
            String s=sc.nextLine();
            if (s.equals("END")){
                break;
            }
                String []h=s.split("\\s+");
                String tmp="";
                for (int i=0;i<h.length;i++){
                    tmp+=chuan(h[i]);
                    tmp+=" ";
        
                }
        
                System.out.println(tmp);

        
    }}
    catch(Exception e){

    }
    }
}