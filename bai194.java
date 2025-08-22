import java.util.Scanner;
import java. util.List;
import java.util.ArrayList;
class hang{
    String ma;
    String ten;
    int so;
    int don;
    int chiet;
    int tong;
    String kq;
    hang(String ma,String ten,int so,int don){
        this.ma=ma;
        this.ten=ten;
        this.so=so;
        this.don=don;
        int tam=don*so;
        if (this.so>10)this.chiet=tam*5/100;
        else if (this.so>=8)this.chiet=tam*2/100;
        else if (this.so>=5)this.chiet=tam*1/100;
        else this.chiet=0;
        this.tong=tam-this.chiet;
        this.kq=ma;
    }
    public void in(){
        System.out.println(this.kq+" "+this.ten+" "+this.chiet+" "+this.tong);
    }
}
public class bai194{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<hang>ds=new ArrayList<>();
        List<hang>sao=new ArrayList<>();
        while (t-->0){
            String ten=sc.nextLine();
            String [] k=ten.split("\\s+");
        
            String ma=k[0].charAt(0)+""+k[1].charAt(0);
            ma=ma.toUpperCase();
            int so=sc.nextInt();
            int don=sc.nextInt();
            sc.nextLine();
            hang x=new hang(ma, ten, so, don);
            ds.add(x);
            sao.add(x);

            
            
        }
        for (int i = 0; i <ds.size(); i++) {
            int dem = 1;
            for (int j = 0; j <i; j++) {
                if (ds.get(i).ma.equals(ds.get(j).ma)) {
                    dem++;
                }
            }
            String h = String.valueOf(dem);
            if (h.length() == 1) h = '0' + h; 
 
            ds.get(i).kq = ds.get(i).ma + h;  
        }
        for (hang x:sao){
            x.in();
        }
    }
}