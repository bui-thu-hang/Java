package javapackage.newpackage;

import java.util.*;
import java.io.*;
class hoc{
    private String code,name;
    private int ad;
    public hoc(String code,String name,int ad){
        this.code=code;
        this.name=name;
        this.ad=ad;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return this.code+" "+this.name+" "+this.ad;
    }
    
}
public class ptit6{
    public static void main(String [] args){
        File f=new File("MONHOC.in");
        try {
            Scanner sc=new Scanner (f);
            List<hoc>list= new ArrayList<>();
            int t=Integer.parseInt(sc.nextLine());
            while (t-->0){
                String code =sc.nextLine();
                String name=sc.nextLine();
                int ad=Integer.parseInt(sc.nextLine());
            list.add(new hoc(code,name,ad));
            }
            Collections.sort(list,new Comparator<hoc>(){
                public int compare(hoc x,hoc y){
                    return x.getName().compareTo(y.getName());
                }
            });
            for (hoc x:list){
                System.out.println(x);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}