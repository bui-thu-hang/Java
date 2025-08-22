import java.util.*;
class sinhvien {
    String ten;
    float gpa;
    int rl;
    String xl;
    sinhvien (String ten,float gpa,int rl){
        this.ten=ten;
        this.gpa=gpa;
        this.rl=rl;
        this.xl="KHONG";
    }
    public void in (){
        System.out.println(this.ten+": "+this.xl);
    }
    public float getGpa(){
        return this.gpa;
    }
}
public class bai263{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        List<sinhvien>ds=new ArrayList<>();
        List<sinhvien>sx=new ArrayList<>();
        while (t-->0){
            String ten=sc.nextLine();
            float gpa=sc.nextFloat();
            int rl=sc.nextInt();
            sc.nextLine();
            sinhvien x=new sinhvien(ten, gpa, rl);
            ds.add(x);
            sx.add(x);
        }
        int dem=0;
            for (sinhvien x:ds){
                if (x.gpa>=3.6 && x.rl>=90)x.xl="XUATSAC";
                else if (x.gpa>=3.2&&x.rl>=80)x.xl="GIOI";
                else if (x.gpa>=2.5&&x.rl>=70)x.xl="KHA";
                else x.xl="KHONG";
            }
            ds.sort((x1,x2)->Float.compare(x2.getGpa(),x1.getGpa()));
            for (sinhvien x:ds){
                if (!x.xl.equals("KHONG")){
                    dem++;
                }
                if (dem>m){
                    x.xl="KHONG";
                }
            }
            for (sinhvien x:sx){
                x.in();
            }

            
        


    }
}