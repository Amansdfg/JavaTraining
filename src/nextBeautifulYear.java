import java.util.*;
public class nextBeautifulYear{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if(year>1000 && year<9000) {
            while (true) {
                year++;
                if (uniqueYear(year)) {
                    System.out.println(year);
                    break;
                }
            }
        }
    }
    public static boolean uniqueYear(int year) {
        int[] digits = new int[10];
        while (year > 0) {
            int digit = year % 10;
            if (digits[digit] > 0) {
                return false;
            }
            digits[digit]++;
            year /= 10;
        }
        return true;
    }
}