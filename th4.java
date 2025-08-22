package javapackage.newpackage;
import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
class sv{
    static int idx=0;
    private String id,name,lop,age;
    private double gpa;
    public sv (String name,String lop,String age,double gpa)throws ParseException{
        idx++;
        this.id="B22DCCN"+String.format("%03d",idx);
        this.name=name;
        this.lop=lop;
        this.gpa=gpa;;
        SimpleDateFormat f=new SimpleDateFormat ("dd/MM/yyyy");
        this.age=f.format(f.parse(age));
    }
        @Override
        public String toString(){
            DecimalFormat f=new DecimalFormat("#.00");
            return this.id+" "+this.name+" "+this.lop+" "+this.age+" "+f.format(gpa);
        }
    }

public class th4{
    public static void main (String [] args)throws FileNotFoundExeception ,ParseException{
        File f=new File ("SV.in");
        Scanner sc=new Scanner();
        int t=Integer.parseInt(sc.nextline());
        List<sv>list=new ArrayList<>();
        while (t-->0){
            String name=sc.nextLine();
            String lop=sc.nextLine();
            double gpa=Double.parseDouble (sc.nextLine());
            List.add(new sv(name, lop, lop, gpa));
        }
        for (sv x:list){
            System.out.println (x.toString());
        }
    }

}