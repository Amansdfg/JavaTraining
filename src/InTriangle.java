import java.util.Scanner;
public class InTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point's x- and y-coordinates:");

        double x =input.nextDouble();
        double y = input.nextDouble();
        int x1 = 0,y1 = 0,x2 = 0,y2 = 100,x3 = 200,y3 =0;
        double ABC = Math.abs(x1 * (y2 - y3) + x2 *(y3 - y1)+ x3 * (y1 - y2));
        double ABP =Math.abs( x1 * (y2 - y) + x2 *(y - y1)+ x * (y1 - y2));
        double APC = Math.abs(x1 * (y - y3) + x *(y3 - y)+ x3 * (y1 - y));
        double PBC = Math.abs( x1 * (y2 - y) + x2 *(y - y1)+ x * (y1 - y2));
        if(ABP + APC + PBC == ABC){
            System.out.println("The point is in triangle");
        }else{
            System.out.println("The point is not in the triangle");
        }
    }
}
