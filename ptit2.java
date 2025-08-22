import java.util.*;
import java.io.*;
public class ptit2{
    public static void main(String [] args){
        try {
            File file=new File ("DATA.in");
            Scanner sc=new Scanner (file);
            long tong=0;

            while (sc.hasNext()){
                if (sc.hasNextInt()){
                    tong+=sc.nextInt();
                }
                else{
                    sc.next();
            }
        }
        System.out.println (tong);

        
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}