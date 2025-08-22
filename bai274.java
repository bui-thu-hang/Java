import java.util.*;
class thongtin{
    String mamon,monhoc;
    thongtin (String mamon,String monhoc){
        this.mamon=mamon;
        this.monhoc=monhoc;
        
    }
    public String getMamon(){
        return this.mamon;
    }
}
class giaovien {
    String magv,tengv;
    giaovien (String magv,String tengv){
        this.magv=magv;
        this.tengv=tengv;
    }
    public String getMagv(){
        return this.magv;
    }
}
class tonghop{
    giaovien x;
    thongtin y;
    float gio;
    tonghop (giaovien x, thongtin y, float gio){
        this.x=x;
        this.y=y;
        this.gio=gio;
    }
    public void in (){
        System.out.print(x.tengv+" ");
        System.out.printf ("%.2f",this.gio);
        System.out.println();
    }
}
public class bai274{
public static void main (String[] args){
    Scanner sc=new Scanner (System.in);
    int t=sc.nextInt ();
    sc.nextLine();
    List<thongtin>dstt=new ArrayList<>();
    while (t-->0){
        String mamon=sc.next();
        String monhoc=sc.nextLine();
        dstt.add(new thongtin (mamon,monhoc));
        
    }
    int m=sc.nextInt ();
    sc.nextLine ();
    List<giaovien>dsgv=new ArrayList<>();
    while (m-->0){
        String magv=sc.next();
        String tengv=sc.nextLine();
        dsgv.add(new giaovien(magv,tengv));
    }
    int n=sc.nextInt ();
    sc.nextLine();
    List<tonghop>dsth=new ArrayList<>();
    while (n-->0){
        String nhap=sc.nextLine ();
        String []h=nhap.split(" ");
        String ma1=h[0];
        String ma2=h[1];
        float gio=Float.parseFloat(h[2]);
        giaovien gv=dsgv.stream().filter(x->x.getMagv().equals(ma1)).findFirst().orElse(null);
        thongtin tt=dstt.stream().filter(x->x.getMamon().equals(ma2)).findFirst().orElse(null);
        dsth.add(new tonghop(gv,tt,gio));
    }
    for (tonghop x:dsth){
        x.in();
    }
}
}