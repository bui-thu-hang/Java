import java.util.Scanner;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
public class thuchanh5{
    public static String chuanhoa (String s){
        String res=s.charAt(0)+"";
        res=res.toUpperCase();
        res=res+s.substring (1);
        return res;

    }
    public static void main (String [] args){
        try {
            File file =new File ("DATA.in");
            Scanner sc=new Scanner (file);

            while (sc.hasNext()){
                String h=sc.nextLine().trim();
                h=h.toLowerCase();
                String []k=h.split("\\s+");
                for (int i=0;i<k.length;i++){
                    System.out.print (chuanhoa(k[i]));
                    System.out.print (" ");
                    

                }
                
            }

        }
        catch(Exception e){

        }
    }
}