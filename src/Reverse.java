import java.util.*;
public class Reverse{
    public static void main(String[] args){
        int[] list ={1,2,3,4,2,3};
        int[] list1 = reverse(list);
        System.out.println(Arrays.toString(list1));
    }
    public static int[] reverse(int[] list){
        int []result = new int[list.length];
        for(int i =0,j=list.length-1;i<list.length;i++,j--){
            result[i] =list[j];
        }
        return result;
    }
}
