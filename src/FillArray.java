public class FillArray {
    public static void main(String[] args){
        int[] numbers1 ={2,1,2,1,3,3,1,2};
        int[] numbers2 ={2,32,132,32,2,13};
        java.util.Arrays.fill(numbers1,0,1,5);
        for(int i=0;i<numbers1.length;i++){
            System.out.print(numbers1[i]+ " ");
        }
    }
}
