package Projects;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
//        int a = 10;
//
//        Integer intObj = new Integer(a);
//        System.out.println(intObj);

        //create int array
        int intArray[] = {1,2,4,5};

    /*
      To perform binary search on int array use
      int binarySearch(int[] b, int value) of Arrays class. This method searches
      the int array for specified int value using binary search algorithm.

      Please note that the int array MUST BE SORTED before it can be searched
      using binarySearch method.

      This method returns the index of the value to be searched, if found in the
      array.
      Otherwise it returns (- (X) - 1)
      where X is the index where the the search value would be inserted.
      i.e. index of first element that is grater than the search
      value or array.length, if all elements of an array are less than
      the search value.
    */

        //sort int array using Arrays.sort method
        Arrays.sort(intArray);

        //value to search
        int searchValue = 2;

        //since 2 is present in int array, index of it would be returned
        int intResult = Arrays.binarySearch(intArray,searchValue);
        System.out.println("Result of binary search of 2 is : " + intResult);

        //lets search something which is not in int array !
        searchValue = 10;
        intResult = Arrays.binarySearch(intArray,searchValue);
        System.out.println("Result of binary search of 3 is : " + intResult);
    }
}
