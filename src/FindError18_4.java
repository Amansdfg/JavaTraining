public class FindError18_4 {
    public static void main(String[] args){
        xMethod1(1234567);
    }
    public static void xMethod1(int number){
        if(number>0){
            System.out.println(number%10);
            xMethod1(number/10);
        }
    }
}
