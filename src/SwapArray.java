public class SwapArray {
    public static void main(String[] args){
        int[][] numbers =   MaxOfRowArray.arrayTwo();

        for(int i = 0;i < numbers.length ; i++){
            for(int j = 0 ; j < numbers[i].length ; j++){
                int i1= (int)(Math.random()* numbers.length-1);
                int j1 =(int)(Math.random()* numbers[i].length-1);
                int temp = numbers[i][j];
                numbers[i][j]=numbers[i1][j1];
                numbers[i1][j1]=temp;
            }
        }
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = 0 ; j < numbers[i].length ; j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }

        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        int[][] array1 = {{1, 2}, {3, 4}, {5, 6}}; int sum = 0;
        for (int i = 0; i < array1.length; i++)
            sum += array[i][0];
        System.out.println(sum);

    }
}
