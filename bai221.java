import java.util.*;
import java.util.logging.SimpleFormatter;
import java.text.*;
class nguoi{
    String ma;
    String ten;
    String gt;
    String ns;
    String dc;
    Date ngs;
    nguoi(String ma,String ten,String gt,String ns,String dc) throws ParseException{
        this.ma=ma;
        this.ten=ten;
        this.gt=gt;
        this.ns=ns;
        this.dc=dc;
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        this.ngs=df.parse(ns);


    }
    public Date getNgs(){
        return this.ngs;
    }
    public String chuan(String s){
        String []h=s.split("/");
        if (h[0].length()==1)h[0]='0'+h[0];
        if (h[1].length()==1)h[1]='0'+h[1];
        return h[0]+"/"+h[1]+"/"+h[2];
    }
    public String tu(String s){
        String res=s.substring (0,1).toUpperCase();
        res+=s.substring(1).toLowerCase();
        return res;
    }
    public String chuanhoa(String s){

        String tmp="";
        String []h=s.split("\\s+");
        for (int i=0;i<h.length;i++){
            tmp+=tu(h[i]);
            if (i!=h.length-1){
                tmp+=" ";
            }

        }
        return tmp;
    }
    public void in(){
        System.out.println (this.ma+" "+chuanhoa(this.ten)+" "+this.dc+" "+chuan(this.ns));
    }

}
public class bai221{
    public static void main (String [] args)throws ParseException{
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<nguoi>ds=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h="00"+h;
            else if (h.length()==2)h='0'+h;
            String ma="KH"+h;
            String ten=sc.nextLine();
            String gt=sc.nextLine();
            String ns=sc.nextLine();
            String dc=sc.nextLine();
            ds.add(new nguoi(ma, ten, gt, ns, dc));
        }
        ds.sort(Comparator.comparing(nguoi::getNgs));
        for (nguoi x:ds){
            x.in();
        }
    }
}