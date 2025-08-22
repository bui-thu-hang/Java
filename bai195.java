import java.util.*;
class hang{
    String ma;
    String ten;
    int sl;
    int dongia;
    int chiet;
    int tong;
    String kq;
    hang(String ma,String ten,int sl,int dongia){
        this.ma=ma;
        this.ten=ten;
        this.sl=sl;
        this.dongia=dongia;
        int tien=sl*dongia;
        if (sl<5)this.chiet=0;
        else if (sl<8)this.chiet=tien*1/100;
        else if (sl<=10)this.chiet=tien*2/100;
        else this.chiet=tien*5/100;
        this.tong=tien-this.chiet;
        this.kq=ma;
    }
    public void in(){
        System.out.println (this.kq+" "+this.ten+" "+this.chiet+" "+this.tong);
    }
    public int getChiet(){
        return this.chiet;
    }

}
public class bai195{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<hang>ds=new ArrayList<>();
        List<hang>copy=new ArrayList<>();
        while (t-->0){
            String ten=sc.nextLine();
            String []h=ten.split("\\s+");
            String ma="";
            for (int i=0;i<2;i++){
                ma+=h[i].charAt(0);

            }
            ma=ma.toUpperCase();
            int sl=sc.nextInt();
            int dongia=sc.nextInt();
            sc.nextLine();
            hang x=new hang(ma, ten, sl, dongia);
            ds.add(x);
            copy.add(x);
        }
        for (int i=0;i<ds.size();i++){
            int dem=1;
            for (int j=0;j<i;j++){
                if (ds.get(i).ma.equals(ds.get(j).ma)){
                    dem++;
                }
            }
            String h=String .valueOf(dem);
            if (h.length()==1)h='0'+h;
            ds.get(i).kq=ds.get(i).ma+h;
        }
        copy.sort((x1,x2)->Integer.compare(x2.getChiet(),x1.getChiet()));
        for (hang x:copy){
            x.in();
        }


    }


}