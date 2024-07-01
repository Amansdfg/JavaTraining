
public class October_22 {
    public static void main(String[] args){
        double[] numbers= {2.3,2.22,265.45};
        System.out.println(java.util.Arrays.binarySearch(numbers,2.3));
        int[] number= {2,3,2,3,223,2,12};
        java.util.Arrays.sort(number);
        java.util.Arrays.parallelSort(number);
        System.out.println(number);
        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        java.util.Arrays.sort(chars, 1, 3);
        System.out.println(chars);
        int[] numbers1= {1,2,3,2};
        int[] numbers2 = {1,2,3,2};
        int[] numbers4 = {1,2,3,4};
        System.out.println(java.util.Arrays.equals(numbers1, numbers2));
        System.out.println(java.util.Arrays.equals(numbers1,numbers4));
    }
}
