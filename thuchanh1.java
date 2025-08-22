import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class thuchanh1{
    public static void main (String [] args){
        try{
            File file =new File ("DATA.in");
            Scanner sc=new Scanner (file);


        
        while (sc.hasNextLine()){
            String line =sc.nextLine();
            System.out.println(line);
        }} 
        catch(FileNotFoundException e){
            System.out.println("File không tông tại.");
            e.printStackTrace();

        
    }
    }
}