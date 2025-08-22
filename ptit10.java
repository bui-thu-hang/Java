import java.util.*;
class sp{
    String ma,ten,mh;
    int mua;
    int ban;
    int loi;
    sp(String ma,String ten, String mh,int mua,int ban){
        this.ma=ma;
        this.ten=ten;
        this.mh=mh;
        this.mua=mua;
        this.ban=ban;
        this.loi=ban-mua;
    }
    public void in(){
        System.out.println(this.ma+" "+this.ten+" "+this.mh+" "+this.mua+" "+this.ban+" "+this.loi);
    }
    public int getLoi(){
        return this.loi;
    }
}
public class ptit10{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        List<sp>ds=new ArrayList<>();
        sc.nextLine();
        for (int i=1;i<=t;i++){
            String h=String .valueOf(i);
            if (h.length()==1)h="00"+h;
            else if (h.length()==2)h='0'+h;
            String ma="MH"+h;
            String ten=sc.nextLine();
            String mh=sc.nextLine();
            int mua=sc.nextInt();
            int ban=sc.nextInt();
            sc.nextLine();
            ds.add(new sp(ma,ten,mh,mua,ban));
        }
        ds.sort((x1,x2)->Integer.compare(x2.getLoi(),x1.getLoi()));
        for (sp x:ds)
        {
            x.in();
        }

    }
}