import java.util.Scanner;
public class bai22{
    public static String[] xau(int n){
        String [] s=new String [Math.max(3,n+1)];
        s[1]="0";
        s[2]="1";
        for (int i=3;i<=n;i++){
            s[i]=s[i-2]+s[i-1];
        }
        return s;
    
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String [] s=xau(n);
                    System.out.println(s[n].charAt(m-1));
                
            }
        }
    }
