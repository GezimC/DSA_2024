import java.util.Random;

public class ArrayBasics {
    public static void main(String[] args) {

        // Mbushja dhe shfaqja e vargut 1-D

        int[] array = new int[10];             // declare one dimensional array with length 10 (default value for int type is 0)
                                               //  {0,0,0,0,0,0,0,0,0,0}

        // FillArray(array);
        // DisplayArray(array);

        //-----------------------------------------------------------------------------------------------------------------------


        // Mbushja dhe shfaqja e vargut 2-D

        int[][] matrix = new int[5][6];                 // declare two dimensional array (matrix), filled with default values (zero)
                                                        // matrix will have 5 rows, containg indivdual 1D arrays with 6 columns
        // FillMatrix(matrix);
        // DisplayMatrix(matrix);


        //-----------------------------------------------------------------------------------------------------------------------



        // Mbushja dhe shfaqja e vargjeve te dhembezuara (jagged-arrays)

        int[][] jaggedArray = new int[5][];             // declare an matrix with 5 rows, columns to be defined later
                                                        // each row is individual 1D array, which can contain different numbers of columns
                                                        // if every row has an 1D array with same number of columns, it will be same as box matrix
                                                       // and can be declared as previous example int[][] matrix = new int[5][6]

        // FillJaggedArray(jaggedArray);
        // DisplayMatrix(jaggedArray);

        FillArray(array);
        DisplayArray(array);
        int minOfArray = FindMinValueOfArray(array);

        System.out.println("Min value: " + minOfArray);

    }

    public static void FillArray(int[] array) {

        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1, 20);
        }
    }

    public static void DisplayArray(int[] array) {

        System.out.print("1-D Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void DisplayMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void FillMatrix(int[][] m) {
        Random r = new Random();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = r.nextInt(1, 20);
            }
        }
    }

    public static void FillJaggedArray(int[][] jaggedArray) {
        Random r = new Random();
        int ColNo;

        for (int i = 0; i < jaggedArray.length; i++) {
            ColNo = r.nextInt(1, 8);
            jaggedArray[i] = new int[ColNo];

            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = r.nextInt(1, 20);
            }
        }
    }

    public static int FindMinValueOfArray(int[] array) {
        // can return index or value of min from array
        int currentMinVal = array[0];
        int currentMinIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (currentMinVal > array[i]) {
                currentMinVal = array[i];
                currentMinIndex = i;
            }
        }
        return currentMinIndex;
    }
}