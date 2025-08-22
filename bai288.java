import java.util.*;
class phong{
    String ma;
    String ban;
    phong(String ma,String ban){
        this.ma=ma;
        this.ban=ban;
    }
}
public class bai288{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        Map<String,phong>ds=new HashMap<>();
        while (t-->0){
            String ma=sc.next();
            String ban=sc.nextLine();
            ds.put(ma,new phong(ma,ban));
        }
        int m=sc.nextInt();
        sc.nextLine();
        while (m-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int luong=sc.nextInt();
            int cong=sc.nextInt();            
            sc.nextLine();
            String matim=ma.substring (3);
            String nam=ma.substring (1,3);
            int h=Integer.parseInt(nam);
            String nhom=ma.substring (0,1);
            int hs=0;
            if(h>=1&&h<=3){
                if (nhom.equals("A"))hs=10;
                else if (nhom.equals("B"))hs=10;
                else if (nhom.equals("C"))hs=9;
                else if (nhom.equals("D"))hs=8;
            }
            else if (h>=4&&h<=8){
                if (nhom.equals("A"))hs=12;
                else if (nhom.equals("B"))hs=11;
                else if (nhom.equals("C"))hs=10;
                else if (nhom.equals("D"))hs=9;
    
    
            }
            else if (h>=9&&h<=15){
                if (nhom.equals("A"))hs=14;
                else if (nhom.equals("B"))hs=13;
                else if (nhom.equals("C"))hs=12;
                else if (nhom.equals("D"))hs=11;
    
            }
            else if (h>=16){
                if (nhom.equals("A"))hs=20;
                else if (nhom.equals("B"))hs=16;
                else if (nhom.equals("C"))hs=14;
                else if (nhom.equals("D"))hs=13;
    
            }
            int tong=luong*cong*hs*1000;
            phong j=ds.get(matim);
            if (j!=null){
                System.out.println(ma+" "+ten+" "+j.ban+" "+tong);
            }
            

        }

    }
}