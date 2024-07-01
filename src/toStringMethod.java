import java.util.Arrays;

public class toStringMethod {
    public static void main(String[] args){
        int[] numbers ={2,1,3,2,12,};
        System.out.println(Arrays.toString(numbers));
        int[]  list = {2,3,4,6,6,7,6,5,3,5,4,5};
        System.out.println(Arrays.toString(list));
        System.out.println(java.util.Arrays.equals(list,numbers));
    }
}
