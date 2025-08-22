import java.util.Scanner;
import java.lang.Math;
class Point {
    double x,y;
    public Point (double x, double y){
        this.x=x;
        this.y=y;
    }
    public double distance (Point b){
        return Math.sqrt(Math.pow((this.x-b.x),2)+Math.pow((this.y-b.y),2));
    }

}
public class bai66{
public static void main (String [] args){
    Scanner sc=new Scanner (System.in);
    int t=sc.nextInt ();
    while (t-- >0){
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double x2= sc.nextDouble();
        double y2=sc.nextDouble();
        Point p1=new Point (x1,y1);
        Point p2=new Point (x2,y2);
        double kc=p1.distance(p2);
        System.out.printf ("%.4f\n",kc);

    }
}}