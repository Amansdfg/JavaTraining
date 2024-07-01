public class ShowOutput18_7 {
    public static void main(String[] args){
        xMethod(5);
    }
    public static void xMethod(int number){
        if(number>0){
            xMethod(number-1);
            System.out.print(number+ " ");

        }
    }
}
