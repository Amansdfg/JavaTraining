
public class MaxOfRowArray {
    public static void main(String[] args){
        int[][]aman =arrayTwo();
        int maxRow=0;
        int indexOfMaxRow=0;
        for(int i =0; i < aman[0].length; i++) {
            maxRow += aman[0][i];
        }
        for(int i =0;i<aman.length;i++) {
            int sum = 0;
            for (int j = 0; j < aman[i].length; j++){
                sum+= aman[i][j];
                if(maxRow<sum);
                maxRow=sum;
                indexOfMaxRow=i;
            }
        }
        System.out.println(maxRow+ " index is"+ indexOfMaxRow);
    }
    public static int[][] arrayTwo() {
        int[][] aman = {
                {34, 43, 9, 79, 6, 56, 43, 54},
                {76, 4, 8, 357, 4, 3, 7, 5,},
                {3, 4567, 567, 65, 67,}
        };
    return aman;
    }
}
