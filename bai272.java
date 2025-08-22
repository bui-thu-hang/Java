import java.util.*;
import java.io.*;
class khachhang {
    String mak,tenk,gioitinh,ns,dc;
    khachhang (String mak,String tenk,String gioitinh,String ns,String dc){
        this.mak=mak;
        this.tenk=tenk;
        this.gioitinh=gioitinh;
        this.ns=ns;
        this.dc=dc;

    }
    public String getMak(){
        return this.mak;
    }
}
class mathang{
    String mamh,tenmh,donvi;
    int giamua,giaban;
    mathang(String mamh,String tenmh,String donvi,int giamua,int giaban){
        this.mamh=mamh;
        this.tenmh=tenmh;
        this.donvi=donvi;
        this.giamua=giamua;
        this.giaban=giaban;
    }
    public String getMamh(){
        return this.mamh;
    }
}
class hoadon {
    String mahoadon;
    mathang x;
    khachhang y;
    int soluong;
    int tien;
    hoadon (String mahoadon,khachhang y,mathang x, int soluong){
        this.mahoadon=mahoadon;
        this.x=x;
        this.y=y;
        this.soluong=soluong;
        this.tien=soluong*x.giaban;
    }
    public void in (){
        System.out.println (this.mahoadon+" "+y.tenk+" "+y.dc+" "+x.tenmh+" "+x.donvi+" "+x.giamua+" "+x.giaban+" "+this.soluong+" "+this.tien);

    }

}
public class bai272{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt ();
        sc.nextLine ();
        List<khachhang> dskh=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf (i);
            if (h.length()==1)h="00"+h;
            else if (h.length()==2)h="0"+h;
            String mak="KH"+h;
            String tenk=sc.nextLine();
            String gioitinh=sc.nextLine ();
            String ns=sc.nextLine();
            String dc=sc.nextLine();
            dskh.add(new khachhang(mak,tenk,gioitinh,ns,dc));
        }
        int k=sc.nextInt ();
        sc.nextLine();
        List<mathang>dsmh=new ArrayList<>();
        for (int i=1;i<=k;i++){
            String h=String.valueOf (i);
            if (h.length()==1)h="00"+h;
            else if (h.length()==2)h="0"+h;
            String mamh="MH"+h;
            String tenmh=sc.nextLine();
            String donvi=sc.nextLine();
            int giamua=sc.nextInt();
            int giaban=sc.nextInt();
            sc.nextLine();
            dsmh.add(new mathang(mamh,tenmh,donvi,giamua,giaban));


        }
        int m=sc.nextInt ();
        sc.nextLine();
        List<hoadon>dshd=new ArrayList<>();
        for (int i=1;i<=m;i++){
            String h=String.valueOf (i);
            if (h.length()==1)h="00"+h;
            else if (h.length()==2)h="0"+h;
            String mahoadon="HD"+h;
            String nhap=sc.nextLine();
            String []ki=nhap.split(" ");
            String ma1=ki[0];
            String ma2=ki[1];
            int soluong=Integer.parseInt(ki[2]);
            khachhang kh=dskh.stream().filter(x->x.getMak().equals(ma1)).findFirst().orElse(null);
            mathang mh=dsmh.stream().filter(x->x.getMamh().equals(ma2)).findFirst().orElse(null);
            dshd.add(new hoadon (mahoadon,kh,mh, soluong));



        }
        for (hoadon x: dshd){
            x.in();
        }
    }
}