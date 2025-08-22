import java.util.*;
import java.io.*;
class gv{
    String ten,te,ho;
    gv(String ten){
        this.ten=ten;
        String []h=ten.trim().split("\\s+");
        this.te=h[h.length-1];
        this.ho=h[0];
    }
    public void in (){
        System.out.println(this.ten);
    }
    public String getTe(){
        return this.te;
    }
    public String getHo(){
        return this.ho;
    }

}

public class bai111{
    public static String chuan (String s){
        String tmp="";
        String [] h=s.split("\\s+");
        for (int i=0;i<h.length;i++){
            tmp+=h[i].charAt(0);
        }
        return tmp;
    }
    public static void main (String [] args){
        try {
            File f=new File ("DANHSACH.in");
            Scanner sc=new Scanner (f);
            int t=sc.nextInt();
            sc.nextLine();
            List<gv>ds=new ArrayList<>();
            while (t-->0){
                String ten=sc.nextLine();
                ds.add(new gv(ten));
                
            }
            ds.sort(Comparator.comparing(gv::getTe).thenComparing(gv::getHo));
            int h=sc.nextInt();
            sc.nextLine();
            while(h-->0){
                String s=sc.nextLine();
                String c=s.replaceAll("[^A-Z]", "");
                for (gv x:ds){
                    if (chuan(x.ten).contains(c)){
                        x.in();
                    }
                }

            }

        }
        catch (Exception e){

        }
    }
}