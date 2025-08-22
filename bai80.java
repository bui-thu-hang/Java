import java.util.*;
import java.io.*;
public class bai80{
    public static void main(String [] args){
        try{
            File file =new File ("DATA.in");
            Scanner sc=new Scanner (file);
            
            Map<Integer,Integer> dem= new HashMap<>();
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                String [] number =line.split(" ");
                for (String so:number){
                    int s=Integer.parseInt(so);
                    dem.put(s,dem.getOrDefault(s, 0)+1);


                }
            }
            sc.close();
                List<Integer>ds=new ArrayList<>(dem.keySet());
                Collections.sort(ds);
                for (int x:ds){
                    System.out.println(x+" "+dem.get(x));
                
            }
            }
        catch(Exception e){

        }
    }
}