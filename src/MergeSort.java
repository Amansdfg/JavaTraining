import java.util.Scanner;
public class MergeSort{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int size=input.nextInt();
        int[] numbers= new int[size];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        mergeSort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void mergeSort(int[] numbers){
        if(numbers.length>1){
            int[] firstHalf =new int[numbers.length/2];
            System.arraycopy(numbers,0,firstHalf,0,numbers.length/2);
            mergeSort(firstHalf);
            int secondHalfLength=numbers.length-numbers.length/2;
            int[] secondHalf=new int[secondHalfLength];
            System.arraycopy(numbers,numbers.length/2,secondHalf,0,secondHalfLength);
            mergeSort(secondHalf);
            merge(firstHalf,secondHalf,numbers);
        }
    }
    public static void merge(int[] firstHalf , int[] secondHalf,int[] numbers){
        int currentOne=0;
        int currentTwo=0;
        int currentThree=0;
        while(currentOne< firstHalf.length && currentTwo< secondHalf.length) {
            if (firstHalf[currentOne] < secondHalf[currentTwo]) {
                numbers[currentThree++] = firstHalf[currentOne++];
            } else {
                numbers[currentThree++] = secondHalf[currentTwo++];
            }
        }
        while(currentOne<firstHalf.length){
            numbers[currentThree++]=firstHalf[currentOne++];
        }
        while(currentTwo< secondHalf.length){
            numbers[currentThree++]=secondHalf[currentTwo++];
        }
    }
}