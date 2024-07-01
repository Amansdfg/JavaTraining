public class SecondLargestElementInArray {
    public static void main(String[] args){
        int[] numbers= {1,2,3,4,5,6,7,8};
        int first = numbers[0];
        int second = numbers[0];
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]> first){
                second= first;
                first = numbers[i];
            }else if(numbers[i]>second){
                second = numbers[i];
            }
        }
        System.out.println("The first the  largest element nt the array is "+ first);
        System.out.println("The second  the largest element nt the array is "+ second);
    }
}