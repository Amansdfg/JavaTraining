import java.util.*;
public class ShuffleInArrayList {
    public static void main(String[]args){
        Integer[] numbers ={2,31,24,4,3,2,1,323,};
        ArrayList<Integer> aman = new ArrayList<>(Arrays.asList(numbers));
        java.util.Collections.shuffle(aman);
        System.out.println(aman);
        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
//        System.out.println(list);
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(array));
        System.out.println(java.util.Collections.max(list));
    }
}
