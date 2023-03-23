public class BinarySearch {
    public static void main(String[] args) {




        int [] numbers = {1,2,3,4,5,6,7,8};


    }



    public static Object binarySearch(int[] numbers, int key){
         int low = 0;
         int high = numbers.length - 1;
         int mid;

         while(low <= high){
             mid = low + high / 2;
             int value = numbers[mid];
             if(value == key){
                 return mid;
             }else if (value > key) {
                 high = mid - 1;

             }else {
                 low = mid + 1;
             }

         }
        return null;
    }
}
