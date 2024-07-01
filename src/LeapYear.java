import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a mouth (1-12) :");
        int month = input.nextInt();
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:System.out.println("30");break;
            case 2:
                if(year %4 ==0 && year %100!=0 || year %400 ==0){
                    System.out.println("29");
                }else{
                    System.out.println("28");
                }
                break;
            default:
                System.out.println("31");break;
        }


    }
}
