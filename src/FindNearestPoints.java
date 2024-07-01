//import java.util.Scanner;
//public class FindNearestPoints {
//    public static Scanner input =new Scanner(System.in);
//    public static void main(String[] args){
//        System.out.print("Enter number of points: ");
//        int numberOfPoints=input.nextInt();
//        double[][] points =new double[numberOfPoints][2];
//        System.out.print("Enter " + numberOfPoints+" points:");
//        for(int i =0;i<points.length;i++){
//           points[i][0]= input.nextDouble();
//           points[i][1]= input.nextDouble();
//        }
//
//        int p1=0;
//        int p2=1;
//        double shortestDistance=shortest(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);
//        for(int i =0;i<points.length;i++){
//            for(int j =i+1;j<points.length;j++){
//                double aman =shortest(points[i][0],points[i][1],points[j][0],points[j][1]);
//                if(aman<shortestDistance){
//                    p1= i;
//                    p2 =j;
//                    shortestDistance=aman;
//                }
//            }
//        }
//        System.out.println("closest two points are ("+ points[p1][0] +", "+ points[p1][1]+ ") and("+points[p2][0]+", "+ points[p2][1]+")");
//    }
//    public static double shortest(double x1,double y1,double x2 ,double y2){
//        return (Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2 - y1),2)));
//
//    }
//}
