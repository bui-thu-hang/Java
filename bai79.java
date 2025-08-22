import java.util.*;
import java.io.*;
import java.math.*;
public class bai79{
    public static void main(String [] args){
        try{
            File file=new File("DATA.in");
            Scanner sc=new Scanner(file);
            String h=sc.nextLine();

                while (h.length()>1){
                    
                    BigInteger dau=new BigInteger(h.substring(0,h.length()/2));
                    BigInteger cuoi=new BigInteger(h.substring (h.length()/2));
                    BigInteger tong=dau.add(cuoi);
                    System.out.println(tong);
                     h=tong.toString();

                    
                
            }}
            catch(Exception e){

            }
        }
    }
