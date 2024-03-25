public class SelectionSort {

    public static void main(String[] args) {

        int[] unsortedArray = {23, 67, 21, 98, 2, 65, 44, 15, 37, 19, 87};

        // System.out.println(IndexOfMinValue(unsortedArray,8));

        DisplayArray(unsortedArray);

        SelectiveSort(unsortedArray);

        DisplayArray(unsortedArray);


    }

    public static int IndexOfMinValue(int[] array, int startIndex) {
        int minIndex = startIndex;
        int minValue = array[startIndex];

        for (int i = startIndex + 1; i < array.length; i++) {

            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    public static void SelectiveSort(int[] array) {
        int currentMinIndex;
        int temp;
//      int[] unsortedArray = {2, 67, 21, 98, 23, 65, 44,15, 37, 19, 87};
        for (int i = 0; i < array.length; i++) {
            currentMinIndex = IndexOfMinValue(array, i);  // i = 1, indmin=7, val = 15
            temp = array[i];  // temp = 67

            array[i] = array[currentMinIndex];  // 67 => 15
            array[currentMinIndex] = temp;   //  15 => 67

            System.out.println("Hapi: "+i);
            DisplayArray(array);
        }
    }

    public static void DisplayArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
}