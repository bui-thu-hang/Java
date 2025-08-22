import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;
public class bai27{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] a=new int [n];
        int [] b=new int [m];
        HashSet<Integer>setA=new HashSet<>();
        HashSet<Integer>giao=new HashSet<>();
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            setA.add(a[i]);
        }
        for (int i=0;i<m;i++){
            b[i]=sc.nextInt();
            if (setA.contains(b[i])){
                giao.add(b[i]);
            }
        }
        Integer []c=giao.toArray(new Integer[0]);
        Arrays.sort(c);
        for(Integer num: c){
            System.out.print (num+" ");
        }
    }
}