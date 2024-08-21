public class multidimensionalArrays {
    public static void main(String[] args) {


    int[][] table = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34}
    };

//    System.out.println(table[2][3]);

    for(int row=0; row < table.length; row++) {
        for(int col=0; col < table[row].length; col++) {
            System.out.print(table[row][col] + "\t");
        }
        System.out.println();
    }



    }
}
