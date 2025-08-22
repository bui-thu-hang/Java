import java.util.*;
class nuoc{
    String ma;
    String ten;
    int cu;
    int moi;
    long tong;
    nuoc(String ma,String ten,int cu,int moi){
        this.ma=ma;
        this.ten=ten;
        this.cu=cu;
        this.moi=moi;
        int chenh=moi-cu;
        if (chenh<=50)this.tong=chenh*100+chenh*2;
        else if (chenh<=100){
            long temp=50*100+(chenh-50)*150;
            this.tong=Math.round(temp+temp*0.03);
        }
        else {
            long temp=50*100+50*150+(chenh-100)*200;
            this.tong=Math.round(temp+temp*0.05);
        }



    }
    public void in(){
        System.out.println(this.ma+" "+this.ten+" "+this.tong);
    }
    public long getTong(){
        return this.tong;
    }
}
public class bai260{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<nuoc>ds=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h='0'+h;
            String ma="KH"+h;
            String ten=sc.nextLine();
            int cu=sc.nextInt();
            int moi=sc.nextInt();
            sc.nextLine();
            ds.add(new nuoc(ma,ten,cu,moi));
        }
        ds.sort((x1,x2)->Long.compare(x2.getTong(),x1.getTong()));
        for (nuoc x:ds){
            x.in();
        }
    }
}