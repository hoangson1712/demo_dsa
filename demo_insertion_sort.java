public class demo_insertion_sort {

    public static void main(String[] args) {

        /**
         *      Insertion Sort = after comparing elements to the left
         *                       shift elements to the right to make room to insert a value
         *
         *                       Quadratic time O(n^2)
         *                       Small data set = decent
         *                       Large data set = bad
         *
         *                       Less steps than Bubble Sort
         *                       Best case is O(n) compared to Selection Sort O(n^2)
         */

        int[] array = {9,1,8,2,7,3,6,4,5};
        insertionSort(array);

        for(int i : array){
            System.out.print(i);
        }

    }

    private static void insertionSort(int[] array) {

        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

    }

}
