import java.util.Scanner;
public class DvuhmernyyMasiv {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[][] matrix={{1,2,3,2,4,445,2,43},
                        {4,233,5,3,3,1,4,1,44,21,533},
                        {43,5,4,326,54,345}
        };
        int maxRow = 0;
        int indexOfMaxRow = 0;
        // Get sum of the first row in maxRow
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }
        for (int row = 0; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++)
                totalOfThisRow += matrix[row][column];
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);

        //valid?
//        int[][] y = new int[3][];
//        int[][] z = {{1, 2}};
//        int[][] m = {{1, 2}, {2, 3}};
//        int[][] n = {{1, 2}, {2, 3}, };
//        for(int i =0;i<z.length;i++){
//            for(int j =0;j<z[i].length;j++){
//                System.out.print(z[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for(int i =0;i<m.length;i++){
//            for(int j =0;j<m[i].length;j++){
//                System.out.print(m[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for(int i =0;i<n.length;i++){
//            for(int j =0;j<n[i].length;j++){
//                System.out.print(n[i][j]+ " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Enter the row: ");
//        int row= input.nextInt();
//        System.out.print("Enter the column: ");
//        int column = input.nextInt();

        int[][] aman=new int[5][5];
        for(int i=0;i<aman.length;i++){
            for(int j =0;j<aman[i].length;j++){
                aman[i][j]=j;
            }
        }
        for(int i =0;i<aman.length;i++){
            for(int j =0;j<aman[i].length;j++){
                System.out.print(aman[i][j]);
            }
            System.out.println();
        }
    }
}
