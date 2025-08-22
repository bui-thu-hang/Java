import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDataFormat;
import java.util.Date;
public class thuchanh4{
    public static void main (String [] args){
        String filename ="SV.in";
        try{
            in(filename);
        }
        catch (IOException|ParseException e){
            
        }
        public static void in(String filename) throws IOException,ParseException{
            BufferedReader reader=new BufferedReader(filename);
            String line;
            while (line= reader.readLine()!=null){
                String[] h=line.split(",");
                String id=h[0].trim();
                String name=h[1].trim();
                String lop=h[2].trim();
                String ns=h[3].trim();
                double gpa=Double.ParseDouble(h[4].trim());
                SimpleDateFormat inputFormat=new SimpleDateFormat("dd/MM/yyyy");
                Date date=inputFormat.parse(ns);
                SimpleDateFormatoutputFormat("dd-MM-yyyy");
                String formattedDate=output Format.format(date)
            }
        }

    }
}