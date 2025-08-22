import java.util.*;
import java.io.*;
class hi{
    String s,ten,ho,dem="";
    public String chuan(String s){
        String res=String.valueOf(s.charAt(0)).toUpperCase();
        res=res+s.substring (1).toLowerCase();
        return res;
    }
    hi(String s){
        this.s=s;
        String []h=s.split("\\s+");
        for (int i=1;i<=h.length-2;i++){
            this.dem+=chuan(h[i]);
            this.dem+=" ";
        }
        this.ho=chuan(h[0]);
        this.ten=chuan(h[h.length-1]);

    }
    public void in (){
        System.out.println (this.ho+" "+this.dem+this.ten);

    }
    public String getTen(){
        return this.ten;
    }
    public String getHo(){
        return this.ho;
    }
    public String getDem(){
        return this.dem;
    }

}
public class bai112{
    public static void main (String [] args){
        try {
            File f=new File ("DANHSACH.in");
            Scanner sc=new Scanner (f);
            List<hi>ds=new ArrayList<>();
            while (sc.hasNextLine()){
                String s=sc.nextLine();
                ds.add(new hi(s));
            }
            ds.sort(Comparator.comparing (hi::getTen).thenComparing (hi::getHo).thenComparing (hi::getDem));
            for (hi x:ds){
                x.in();
            }
        }
        catch(Exception e){

        }
    }
}