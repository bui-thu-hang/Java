import java.util.Scanner;
public class bai13{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long n=sc.nextLong();
            String numStr=Long.toString(n);
            int d=numStr.length();
            int[] a=new int[d];
            for (int i=0;i<d;i++){
                a[i]=numStr.charAt(i)-'0';
            }
            boolean check=false;
            for (int i=0;i<d;i++){
                if (a[i]!=1&&a[i]!=8&&a[i]!=9&&a[i]!=0){
                    check=true;
            
                }
            }
            if(check){
                System.out.println("INVALID");
            
            }
            else {
                for (int i=0;i<d;i++){
                    if (a[i]==1)a[i]=1;
                    else if (a[i]==9)a[i]=0;
                    else if (a[i]==8)a[i]=0;
                    else if (a[i]==0)a[i]=0;
                }
                boolean test =false;
                for (int i=0;i<d;i++){
                    if (a[i]!=0){
                        test=true;
                        break;
                    }
                }
                long num=0;

                if (!test)System.out.println("INVALID");
                else {
                    for (int i=0;i<d;i++){
                        num=num*10+a[i];
                
                    }
                    System.out.println(num);
                }
    
            }
            
        }

    }
}