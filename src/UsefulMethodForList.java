import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class UsefulMethodForList {
    public static void main(String[] args){
        String[] color ={"Red","Green","Blue"};
        ArrayList<String> aman= new ArrayList<>(Arrays.asList(color));
        System.out.println(aman.toString());
        String[] array1 =new String[aman.size()];
        aman.toArray(array1);
        Integer[] array = {2,1,2,434,5,5,67,85};
        ArrayList<Integer> aman1 =new ArrayList<>(Arrays.asList(array));
        java.util.Collections.sort(aman1);
        System.out.println(aman1);
        Integer[] array2 ={12,34,5,5,321,23,5,45,7,86,75,634,52};
        ArrayList<Integer> aman3=new ArrayList<>(Arrays.asList(array2));
        System.out.println(java.util.Collections.max(aman3));
        System.out.println(java.util.Collections.min(aman3));
    }
}
