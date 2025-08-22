import java.util.Scanner;
import java.util.HashMap;
public class bai29{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int h=1;h<=t;h++){
            System.out.println("Test"+ " "+h+":");
            int n=sc.nextInt();
            int []a=new int [n];
            HashMap <Integer,Integer>dem=new HashMap<>();


            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                dem.put(a[i],dem.getOrDefault(a[i],0)+1);
            }
            for (int i=0;i<n;i++){
                if (dem.containsKey(a[i])) {


                System.out.println (a[i]+" xuat hien"+" "+dem.get(a[i])+" lan");
                dem.remove(a[i]);

                }   
            }
        }
    }
}