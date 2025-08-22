import java.util.*;
class sinhvien {
    String ma,ten;
    float d;
    String xl;
    int tt;
    sinhvien (String ma,String ten,float d){
        this.ma=ma;
        this.ten=ten;
        this.d=d;
        if (d<5)this.xl="Yeu";
        else if (d<7)this.xl="Trung binh";
        else if (d<9)this.xl="Kha";
        else this.xl="Gioi";
        this.tt=tt;  
        
    }
    public void in (){
        System.out.println (this.ma+" "+this.ten+" "+this.d+" "+this.xl+" "+this.tt);
    }
    public float getD(){
        return this.d;
    }
}
public class bai202{
    public static void main (String[] args){
    Scanner sc=new Scanner (System.in);
    int t=sc.nextInt();
    sc.nextLine();
    List<sinhvien>ds=new ArrayList<>();
    for (int i=1;i<=t;i++){
        String h=String.valueOf(i);
        if (h.length()==1)h='0'+h;
        String ma="HS"+h;
        String ten=sc.nextLine();
        float d=sc.nextFloat();
        sc.nextLine();
        ds.add(new sinhvien(ma,ten,d));

    
    }
    List<sinhvien>dssx=new ArrayList<>(ds);

    dssx.sort((x1,x2)->Float.compare(x2.getD(),x1.getD()));
    int rank=1;
    for (int i=0;i<dssx.size();i++){
        if (i>0 && dssx.get(i).getD()==dssx.get(i-1).getD()){
            dssx.get(i).tt=dssx.get(i-1).tt;

        }
        else{
            dssx.get(i).tt=rank;
        }
        rank++;å
    }
     for (sinhvien x:ds){
        for (sinhvien sx:dssx){
            if (x.ma.equals(sx.ma)){
                x.tt=sx.tt;
            }
        }
     }
     for (sinhvien x:ds){
        x.in();
     }

}
}