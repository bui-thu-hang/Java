import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.*;
class sinhvien {
    String ma;
    String ten;
    String lop;
    String mail;
    sinhvien (String ma,String ten,String lop,String mail){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
    }
    public void in(){
        System.out.println(this.ma+" "+this.ten+" "+this.lop+" "+this.mail);
    }

}
public class bai174{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        Map<String,List<sinhvien>>s=new HashMap<>();
        while (t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            String ngah=ma.substring (3,7);
            if (!s.containsKey(ngah)){
                s.put(ngah,new ArrayList<>());
            }
            s.get(ngah).add(new sinhvien(ma, ten, lop, mail));

        }
        int h=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<h;i++){
            String truyvan=sc.nextLine();
            truyvan=truyvan.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH "+truyvan+":");
            
                if (truyvan.equals("KE TOAN")){
                    List<sinhvien> j= s.get("DCKT");
                    for (sinhvien x:j){
                        x.in();
                    }
                }
                else if (truyvan.equals("CONG NGHE THONG TIN")){
                    List<sinhvien> l=s.get("DCCN");
                    for (sinhvien x:l){
                        if (!x.lop.substring(0,1).equals("E")){
                        x.in();
                    }}
                }
                else if (truyvan.equals("AN TOAN THONG TIN")){
                    List<sinhvien> j=s.get("DCAT");
                    for (sinhvien x:j){
                        if (!x.lop.substring(0,1).equals("E")){

                        x.in();
                    }}
                }
                else if (truyvan.equals("VIEN THONG")){
                    List<sinhvien >j=s.get("DCVT");
                    for (sinhvien x:j){
                        x.in();
                    }
                }
                else if (truyvan .equals("DIEN TU")){
                    List<sinhvien >j=s.get("DCDT");
                    for (sinhvien x:j){
                        x.in();
                    }
                }
                
            }
        
    

        }
    
}