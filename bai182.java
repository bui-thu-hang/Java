import java.util.*;
class tim{
    String ten;
    String nam;
    tim(String ten,String nam){
        this.ten=ten;
        this.nam=nam;
    }
    public String chuan(String s){
        String [] h=this.nam.split("/");
        String tmp=h[2]+"/"+h[1]+"/"+h[0];
        return tmp;
        
    }
    public String getNam(){
        return chuan(this.nam);
    }
}
public class bai182{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<tim>ds=new ArrayList<>();
        while (t-->0){
            String ten=sc.next();
            String nam=sc.nextLine();
            ds.add(new tim(ten, nam));
        }
        ds.sort((x1,x2)->x2.getNam().compareTo(x1.getNam()));
            System.out.print (ds.get(0).ten);

            System.out.println();
            System.out.print (ds.get(ds.size()-1).ten);
            
            
        
    }
}


