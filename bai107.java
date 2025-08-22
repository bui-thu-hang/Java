import java.util.*;
import java.io.*;
class tien {
    String ma,ten,loai;
    int d,c,dm,tam,vat,vuot,tong;
    tien (String ma,String ten,String loai,int d,int c){
        this.ma=ma;
        this.ten=ten;
        this.loai=loai;
        this. d=d;
        this. c=c;
        if (loai.equals("A"))this.dm=100;
        else if (loai.equals("B"))this.dm=500;
        else if (loai.equals("C"))this.dm=200;
        int tmp=c-d;
        if (tmp<=this.dm){
            this.tam=tmp*450;
            this.vat=0;
            this.vuot=0;
            this.tong=this.tam;
        }
        else if (tmp>this.dm){
            this.tam=this.dm*450;
            this.vuot=(tmp-this.dm)*1000;
            this.vat=(tmp-this.dm)*50;
            this.tong=this.tam+this.vuot+this.vat;
        }

    }  
    public static String chuan(String s){
        String re=String.valueOf(s.charAt(0)).toUpperCase();
        re+=s.substring (1).toLowerCase();
        return re;
    

    }
    public static String gep(String s){
        String []h=s.trim().split("\\s+");
        String tmp="";
        for (int i=0;i<h.length;i++){
            tmp+=chuan(h[i]);
            tmp+=" ";
        }
        return tmp.trim();
    }
    public void in (){
        System.out.println (this.ma+" "+gep(this.ten)+" "+this.tam+" "+this.vuot+" "+this.vat+" "+this.tong);
    }
    public int getTong(){
        return this.tong;
    }
}
public class bai107{
    public static void main (String [] args){
    try {
        File f=new File ("KHACHHANG.in");
        Scanner sc=new Scanner (f);
        int t=sc.nextInt ();
        sc.nextLine ();
        List<tien>ds=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String.valueOf(i);
            if (h.length()==1)h='0'+h;
            String ma="KH"+h;
            String ten=sc.nextLine ();
            String dong=sc.nextLine ();
            String []k=dong.split("\\s+");
            String loai=k[0];
            int d=Integer.parseInt(k[1]);
            int c=Integer.parseInt(k[2]);
            ds.add(new tien(ma, ten, loai, d, c));
        }
        ds.sort ((x1,x2)->Integer.compare(x2.getTong(),x1.getTong()));
        for (tien x:ds){
            x.in();
        }
    }
    catch(Exception e){

    }
    }
}