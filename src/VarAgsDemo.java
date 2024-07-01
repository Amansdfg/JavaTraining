import java.util.*;
public class VarAgsDemo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
        printMax(1, 2, 2, 1, 4); printMax(new double[]{1, 2, 3});

    }


    public static void printMax(double... numbers){
        double max = numbers[0];
        for(int i =0;i<numbers.length;i++){
            if (numbers[i]>max) {
                max = numbers[i];
            }
        }
        System.out.println("The max value is "+ max);
    }
}