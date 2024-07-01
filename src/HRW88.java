import java.util.Scanner;
public class HRW88 {
    public static void main(String[] args){
//        Scanner input= new Scanner(System.in);
//        short num = input.nextShort();
//        String binary = String.format("%16s", Integer.toBinaryString(num & 0xFFFF)).replace(' ', '0');
//        System.out.println(binary);
//        double a=input.nextDouble();
//        double b =input.nextDouble();
//        double c = input.nextDouble();
//        double d=b*b-4*a*c;
//        if(d>0){
//            double x1=(-b-Math.sqrt(d))/(2*a);
//            double x2=(-b+Math.sqrt(d))/(2*a);
//            System.out.println("The equation has two roots "+ x1+" and "+ x2);
//        }else if(d==0){
//            double x=-b/(2*a);
//            System.out.println("The equation has one root "+x);
//        }else{
//            System.out.println("The equation has no real roots");
//        }
        Scanner input= new Scanner(System.in);
        int number=input.nextInt();
        String binary=String.format("16%s",Integer.toBinaryString(number & 0xFFFF)).replace(' ','0');
    }
}
