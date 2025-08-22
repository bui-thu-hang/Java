import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class tien {
    String ma;
    String loai;
    int cu;
    int moi;
    int pt;
    int chinh;
    int tong;
    int hs;
    tien (String ma,String loai,int cu,int moi){
        this.ma=ma;
        this.loai=loai;
        this.cu=cu;
        this.moi=moi;
        if (this.loai.equals ("KD"))this.hs=3;
        else if (this.loai.equals("NN"))this.hs=5;
        else if (this.loai.equals("TT"))this.hs=4;
        else if (this.loai.equals("CN"))this.hs=2;
        this.chinh=(moi-cu)*this.hs*550;
        int h=moi-cu;
        if (h<50)this.pt=0;
        else if (h>50 && h<=100)this.pt=Math.round(this.chinh*35/100.0f);
        else if (h>100)this.pt=this.chinh;
        this.tong=this.chinh+this.pt;

    }
    public void in(){
        System.out.print (this.ma+" "+this.hs+" "+this.chinh+" "+this.pt+" "+this.tong);
        System.out.println();
    }
}
public class bai198{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        List<tien>s=new ArrayList<>();
        for (int i=1;i<=t;i++){
            String h=String .valueOf(i);
            if (h.length()==1)h='0'+h;
            String ma="KH"+h;
            String loai=sc.nextLine();
            int cu=sc.nextInt();
            int moi=sc.nextInt();
            sc.nextLine();
            tien x=new tien(ma, loai, cu, moi);
            s.add(x);
        }
        for (tien x:s){
            x.in();
        }
    }
}