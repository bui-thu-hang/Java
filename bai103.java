import java.util.*;
import java.io.*;
class ts{
    String ma,ten;
    double d1,d2,d3,ut,tong;
    ts(String ma,String ten,double d1,double d2,double d3){
        this.ma=ma;
        this.ten=ten;
        String kv=ma.substring (0,3);
        if (kv.equals("KV1"))this.ut=0.5;
        else if (kv.equals("KV2"))this.ut=1;
        else if (kv.equals("KV3"))this.ut=2.5;
        this.tong=d1*2+d2+d3+this.ut;
    }
    public static String chuan (String s){
        String re=String.valueOf(s.charAt(0)).toUpperCase();
        re=re+s.substring(1).toLowerCase();
        return re;
    }
    public static String gep(String s){
        String [] h=s.split("\\s+");
        String tmp="";
        for (int i=0;i<h.length;i++){
            tmp+=chuan(h[i]);
            tmp+=" ";
        }
        return tmp.trim();
    }
    public 
    
    String chu(double x){
        int h=(int)(x*10);
        return h%10==0? String.format("%.0f",x):String.format("%.1f",x);
    }
    public void in (){
        System.out.print(this.ma+" "+gep(this.ten)+" "+chu(this.ut)+" "+chu(this.tong)+" ");
    }
    public double getTong (){
        return this.tong;
    }
    public String getMa(){
        return this.ma;
    }
}
public class bai103{
    public static void main (String [] args){
        try {
            File f=new File ("THISINH.in");
            Scanner sc=new Scanner (f);
            int t=sc.nextInt();
            sc.nextLine();
            List<ts>ds=new ArrayList<>();
            while (t-->0){
                String ma=sc.nextLine();
                String ten=sc.nextLine ();
                double d1=sc.nextDouble();
                double d2=sc.nextDouble ();
                double d3=sc.nextDouble();
                sc.nextLine();
                ds.add(new ts(ma, ten, d1, d2, d3));
            }
            ds.sort(Comparator.comparing (ts::getTong).reversed().thenComparing (ts::getMa));
            int h=sc.nextInt ();
            sc.nextLine ();
            double chuan=ds.get(h-1).tong;
            System.out.printf("%.1f",chuan);
            System.out.println();
            for (ts x:ds){
                x.in();
                if (x.tong>=chuan)System.out.println("TRUNG TUYEN");
                else System.out.println("TRUOT");
            }

        }
        catch(Exception e){

        }
    }
}
/*
 * import java.util.*;
import java.io.*;

public class bai103 {
    static double diemChuan;

    private static class ThiSinh implements Comparable<ThiSinh> {
        private String ma, ten;
        private double d1, d2, d3, ut, tong;
        private String tt;

        ThiSinh(String ma, String ten, double d1, double d2, double d3) {
            this.ma = ma;
            this.ten = chuanHoaTen(ten);
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
            this.ut = 0;
            String kv = ma.substring(0, 3);
            if (kv.equals("KV1")) this.ut = 0.5;
            else if (kv.equals("KV2")) this.ut = 1.0;
            else if (kv.equals("KV3")) this.ut = 2.5;
            this.tong = d1 * 2 + d2 + d3 + this.ut;
        }

        public static String chuanHoaTen(String s) {
            s = s.trim().toLowerCase();
            StringBuilder res = new StringBuilder();
            for (String word : s.split("\\s+")) {
                if (word.length() > 0) {
                    res.append(Character.toUpperCase(word.charAt(0)))
                       .append(word.substring(1)).append(" ");
                }
            }
            return res.toString().trim();
        }

        @Override
        public int compareTo(ThiSinh o) {
            if (this.tong < o.tong) return 1;
            if (this.tong > o.tong) return -1;
            return this.ma.compareTo(o.ma);
        }

        void inThongTin() {
            System.out.print(this.ma + " " + this.ten + " ");
            if ((int) this.ut == this.ut) System.out.printf("%.0f ", this.ut);
            else System.out.printf("%.1f ", this.ut);
            if ((int) this.tong == this.tong) System.out.printf("%.0f ", this.tong);
            else System.out.printf("%.1f ", this.tong);
            this.tt = this.tong >= diemChuan ? "TRUNG TUYEN" : "TRUOT";
            System.out.println(this.tt);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("THISINH.in"));
            ArrayList<ThiSinh> ds = new ArrayList<>();
            int t = sc.nextInt();
            while (t-- > 0) {
                sc.nextLine(); // Đọc dòng mới
                ds.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            }
            int h = sc.nextInt();
            Collections.sort(ds);
            diemChuan = ds.get(h - 1).tong; // Điểm chuẩn
            System.out.printf("%.1f\n", diemChuan);
            for (ThiSinh ts : ds) 
                ts.inThongTin(); // In thông tin sinh viên
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
 */