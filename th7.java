import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
public class Loaiphong implements comparable<LoaiPhong>{
    private String KH;
    private String name;
    private String dongia;
    private String phi;
    public Loaiphong(String solve){
        String [] tmp=solve.split(" ");
        this.KH=tmp[0];
        this.name=tmp[1];
        this.dongia=tmp[2];
        this.phi=tmp[3];

    }
    public String getName(){
        return name;
    }
    public int compareTo(Loaiphong o){
        return getName().compareTo(o.getName());
    }
    public String toString(){
        return KH+" "+name+" "+tdongia+" "+phi;
    }
}