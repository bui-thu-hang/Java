import java.util.*;
class sanpham{
    String masp;
    String tensp;
    int gia1,gia2;
    sanpham (String masp,String tensp,int gia1,int gia2){
        this.masp=masp;
        this.tensp=tensp;
        this.gia1=gia1;
        this.gia2=gia2;
    }
    public String getMasp(){
        return this.masp;
    }
}
class hoadon {
    String madu;
    sanpham x;
    int soluong,giam,tien;
    hoadon (String madu,int soluong,sanpham x,int dongia){
        this.madu=madu;
        this.x=x;
        this.soluong=soluong;
        int tong=dongia*soluong;
        if (soluong>=150)this.giam=tong/2;
        else if (soluong>=100)this.giam=tong*30/100;
        else if (soluong>=50)this.giam=tong *15/100;
        else this.giam=0;
        this.tien=tong-this.giam;
    }
    public void in (){
        System.out.println (this.madu+" "+x.tensp+" "+this.giam+" "+this.tien);
    }
}
public class bai270{
    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<sanpham>dssp=new ArrayList<>();
        while (t-->0){
            String masp=sc.nextLine();
            String tensp=sc.nextLine();
            int gia1=sc.nextInt();
            int gia2=sc.nextInt();
            sc.nextLine();
            dssp.add(new sanpham(masp,tensp,gia1,gia2));
        }
        int n=sc.nextInt();
        sc.nextLine();
        List<hoadon>ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String nhap=sc.nextLine();
            String []k=nhap.split(" ");
            String madon=k[0];
            int soluong=Integer.parseInt(k[1]);
            String h=String.valueOf(i);
            
            if (h.length()==1)h="00"+h;
            else if (h.length()==2)h='0'+h;
            String madu=madon+"-"+h;
            String ma1=madon.substring(0,2);
            String loai=madon.substring (2);
            int dongia=0;
            sanpham sp=dssp.stream().filter(x->x.getMasp().equals(ma1)).findFirst().orElse(null);
            if (loai.equals("1"))dongia=sp.gia1;
            else dongia=sp.gia2;
            ds.add(new hoadon(madu,soluong,sp,dongia));
            
        }
        for (hoadon x:ds){
            x.in();
        }
    }
}