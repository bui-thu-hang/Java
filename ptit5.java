import java.util.*;
import java.io.*;
public class ptit5{
    public static String chuanhoa(String s){
        String res=s.charAt(0)+"";
        res=res.toUpperCase();
        res=res+s.substring (1);
        return res;

    }
    public static void main(String [] args){
        try{
            FileReader file=new FileReader("DATA.in");
            BufferedReader br=new BufferedReader(file);
            String h="";
        
            
            while (true){
                 h=br.readLine();
                 if (h.contentEquals("END")){
                    break;
                 }
                
                String []k=h.trim().toLowerCase().split("\\s+");
                for (int i=0;i<k.length;i++){
                    System.out.print(chuanhoa(k[i]));
                    if (i<k.length-1){
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        catch(Exception e){

        }
    }
}