package rectangle;
import java.util.Scanner;
public class Rectangle {
    private double length;
    private double width;
    public  Rectangle(double l,double w){
        length=l;
        width= w;
        }
public  void calc(){
        double area= length*width;
        double peri=2*(length+width);
        
        System.out.println(" The area of the rectangle is :"+area);
        System.out.println(" The perimeter of the rectangle is :"+peri);
        }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        
        System.out.println("Enter the first length :");
        double length1 = a.nextDouble();
        System.out.println("Enter the first width:");
        double width1 = a.nextDouble();
        
        
         System.out.println("Enter the second length  :");
        double length2 = a.nextDouble();
        System.out.println("Enter the second width :");
        double width2 = a.nextDouble();
        Rectangle rect1 = new Rectangle (length1,width1);
       Rectangle rect2 =new Rectangle (length2,width2);
        System.out.println("result of the first  rectangle is :");
        rect1.calc();
        System.out.println("result of the second  rectangle is :");
        rect2.calc();
    }
}
