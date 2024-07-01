public class Break {
    public static void main(String[] args){
        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100)
                break;
        }
        System.out.println(number);
        System.out.println(sum);
    }
}
