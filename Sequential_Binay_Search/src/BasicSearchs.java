public class BasicSearchs {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//        System.out.println(SequentialSearch(array, 0));
//        System.out.println(SequentialSearch(array, 8));

        System.out.println(BinarySearch(array, -1));
    }

    public static int SequentialSearch(int[] array, int searchedValue) {

        int searchedIndex = -1;    //1

        for (int i = 0; i < array.length; i++) {
            if (searchedValue == array[i]) {
                searchedIndex = i;
                return searchedIndex;
            }
        }
        return searchedIndex;
    }

    public static int BinarySearch(int[] array, int searchedValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int midIndex;
        int searchedIndex = -1;


        while (startIndex <= endIndex) {

            midIndex = startIndex + (endIndex - startIndex) / 2;

            if (searchedValue == array[midIndex]) {
                searchedIndex = midIndex;
                return  searchedIndex;
            } else if (searchedValue > array[midIndex]) {
                startIndex = midIndex + 1;
            } else {
                endIndex = midIndex - 1;
            }

        }

        return searchedIndex;
    }

}