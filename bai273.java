import java.util.*;
class khach {
    String mak,tenk,gt,ns,dc;
    khach(String mak,String tenk,String gt,String ns,String dc){
        this.mak=mak;
        this.tenk=tenk;
        this.gt=gt;
        this.ns=ns;
        this.dc=dc;
    }
    public String getMak(){
        return this.mak;
    }
}
class mathang{
    String mamh,tenmh,donvi;
    int giamua, giaban;
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
class hoadon{
    String mahd;
    khach x;
    mathang y;
    int soluong,tien,loi;
    hoadon (String mahd,khach x,mathang y,int soluong){
        this.mahd=mahd;
        this.x=x;
        this.y=y;
        this.soluong=soluong;
        this.tien=this.soluong*y.giaban;
        this.loi=this.soluong*(y.giaban-y.giamua);
    }
    public void in (){
        System.out.println (this.mahd+" "+x.tenk+" "+x.dc+" "+y.tenmh+" "+this.soluong+" "+this.tien+" "+this.loi);
    }
    public int getTien (){
        return this.tien;
    }
    
}
public class bai273 {
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<khach>dskh=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h="00"+h;
            else if (h.length()==2)h="0"+h;
            String mak="KH"+h;
            String tenk=sc.nextLine();
            String gt=sc.nextLine();
            String ns=sc.nextLine();
            String dc=sc.nextLine();
            dskh.add(new khach(mak,tenk,gt,ns,dc));
        }
        int m=sc.nextInt();
        sc.nextLine();
        List<mathang>dsmh=new ArrayList<>();
        for (int i=1;i<=m;i++){
            String h=String.valueOf(i);
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
        int n=sc.nextInt();
        sc.nextLine();
        List<hoadon>dshd=new ArrayList<>();
        for (int i=1;i<=n;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h="00"+h;
            else if (h.length()==2)h="0"+h;
            String mahd="HD"+h;
            String nhap=sc.nextLine();
            String []k=nhap.split(" ");
            String ma1=k[0];
            String ma2=k[1];
            int soluong=Integer.parseInt(k[2]);
            khach kh=dskh.stream().filter(x->x.getMak().equals(ma1)).findFirst().orElse(null);
            mathang mh=dsmh.stream().filter (x->x.getMamh().equals(ma2)).findFirst().orElse(null);
            dshd.add(new hoadon(mahd,kh,mh,soluong));
            
        }
        dshd.sort((x1,x2)->Integer.compare(x2.getTien(),x1.getTien()));
        for (hoadon x:dshd){
            x.in();
        }
        
    } 
}