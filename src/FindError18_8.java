public class FindError18_8 {
    public static void main(String[] args){
        xMethod(123456);
    }
    public static void xMethod(int number){
        if(number>0){
            System.out.print(number+ " ");
            xMethod(number/10);
        }
    }
}
