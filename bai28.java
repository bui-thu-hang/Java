import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class bai28 {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] a=new int[n];
        int []b=new int[m];
        Set <Integer>set=new HashSet<>();
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            set.add(a[i]);

        }
        for (int i=0;i<m;i++){
            b[i]=sc.nextInt();
            set.add(b[i]);
        }
        Integer [] array=set.toArray(new Integer[0]);
        Arrays.sort(array);
        for (Integer num:array){
            System.out.print (num + " ");
        }

    }
}