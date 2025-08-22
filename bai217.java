import java.util.*;
class Ma{
    String ma;
    String ban;
    Ma(String ma,String ban){
        this.ma=ma;
        this.ban=ban;
    }
}
class nhanvien {
    String ma;
    String ten;
    int luong;
    int ngay;
    int tong;
    nhanvien(String ma,String ten,int luong,int ngay,int tong){
        this.ma=ma;
        this.ten=ten;
        this.luong=luong;
        this.ngay=ngay;
        this.tong=tong;
    }
}
public class bai217{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        Map<String,Ma>ds=new HashMap<>();
        while (t-->0){
            String ma=sc.next();
            String ban=sc.nextLine();
            ds.put(ma,new Ma(ma, ban));
        }
        Map<String,List<nhanvien>>c=new HashMap<>();
        int k=sc.nextInt();
        sc.nextLine();
        while (k-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int luong=sc.nextInt();
            int ngay=sc.nextInt();
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
            int tong=luong*ngay*hs*1000;
            if (!c.containsKey(matim)){
                c.put(matim,new ArrayList<>());
            }
            c.get(matim).add(new nhanvien(ma, ten, luong, ngay, tong));
    
            

        }
        String truyvan=sc.nextLine();
        Ma j=ds.get(truyvan);
        if (j!=null){
            List<nhanvien> m=c.get(truyvan);
            System.out.println("Bang luong phong "+j.ban+":");
            for (nhanvien x:m){

            System.out.println (x.ma+" "+x.ten+" "+x.tong);
        }
    }


    }
}