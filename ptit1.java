import java.util.*;
import java.io.*;
public class ptit1{
    public static void main (String []args){
        try{
            File file=new File ("DATA.in");
            Scanner sc=new Scanner (file);
            while (sc.hasNextLine()){
                String line =sc.nextLine();
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}