public class FindError18_3 {
    public static void main(String[] args){
        System.out.println("Sum is "+ xMethod(5));
    }
    public static int xMethod(int number){
        if(number==1){
            return 1;
        }else{
            return number+ xMethod(number-1);
        }
    }
}
