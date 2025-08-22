import java.util.Scanner;
import java.util.HashMap;
public class bai40{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        HashMap<Integer,Integer>dem=new HashMap<>();

        int n=sc.nextInt();
        int []a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            dem.put(a[i],dem.getOrDefault(a[i],0)+1);
        }
        int MIN=-10000000;
        for (int i=0;i<n;i++){
            if (a[i]>MIN){
                MIN=a[i];
            }
        }
        for (int i=1;i<=MIN;i++){
            dem.put(i,dem.getOrDefault(i,0)+1);
        }
        int check=0;
        for (int i=1;i<=MIN;i++){
            if (dem.getOrDefault(i,0)==1){
                System.out.println(i);
                check=1;
            }
        }
        if (check==0)System.out.println("Excellent!");

     
    }
}