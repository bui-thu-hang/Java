import java.util.*;
import java.io.*;
public class bai77{
    public static void main (String [] args){
        try{
        File file=new File ("DATA.in");
        Scanner sc=new Scanner(file);
        while (true){
            String h=sc.nextLine();
            System.out.println (h);
        }
    }catch(Exception e){

    }
}
}