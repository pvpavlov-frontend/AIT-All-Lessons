package array;

public class Arrays {

    public static int search(int[] array, int value){
        for (int i=0; i<array.length; ++i){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }
    // array is the SORTED array!!!
    public static  int binarySearch(int[] array, int value){
        int left=0;
        int right=array.length-1;

        while (left<=right) {
            //int mid = (right + left) / 2;

            int mid = left+(right-left)/2;
            if (array[mid] == value) return mid;
            if (array[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
