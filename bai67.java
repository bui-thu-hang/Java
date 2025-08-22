import java.util.Scanner;
class SinhVien {
    private String name;
    private String age;
    private String birth;
    SinhVien (){
        System.out.println  ("Hang xinh gái");
    }
    public void eat(){
        System.out.println ("hello!");
    }

}
public class bai67{
    public static void main (String[] args){
    SinhVien x =new SinhVien();
    x.eat();
    }
}