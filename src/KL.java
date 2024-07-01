import java.util.*;
public class KL {
    public static void main(String[] args){
        Scanner input =new  Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int number = input.nextInt();
        String[] namesOfTheCity  = new String[number];
        for(int i =0;i<namesOfTheCity.length;i++){
            namesOfTheCity[i]= input.nextLine();;
        }
        KL1.main(namesOfTheCity);

    }
}
