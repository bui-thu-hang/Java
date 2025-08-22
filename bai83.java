import java.util.*;
import java.io.*;
public class bai83{
    public static void main(String [] args){
        try{
            File f=new File ("VANBAN.in");
            Scanner sc=new Scanner (f);
            Set<String>ds=new HashSet<>();
            while (sc.hasNextLine()){
                String s=sc.nextLine();
                s=s.toLowerCase();
                String [] h=s.split("\\s+");
                for (int i=0;i<h.length;i++){
                    ds.add(h[i]);

                }
            }
            String [] a=ds.toArray(new String [0]);
            Arrays.sort(a);
            for (String r:a){
                System.out.println (r);
            }
        }
        catch(Exception e){

        }
    }
}