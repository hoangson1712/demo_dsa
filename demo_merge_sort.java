public class demo_merge_sort {

    public static void main(String[] args) {

        /**
         *      Merge Sort = recursively divide array in 2, sort, re-combine
         *                   run-time complexity = O(n log n)
         *                   space complexity = O(n)
         */

        int[] array = {8,2,5,3,4,7,6,1};
        mergeSort(array);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if(length <= 1) return; // Base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // Left array
        int j = 0; // Right array

        for(; i < length; i++){
            if(i < middle){
                leftArray[i] = array[i];
            }else{
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);

    }

    private static void merge(int[] leftArray,int[] rightArray,int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0,l = 0,r = 0; // Indices

        // Check the conditions for merging
        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }

}
