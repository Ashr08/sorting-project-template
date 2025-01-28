public class Main {
   public static void main(String[] args){
       // Task:
       // 1. Implement missing sorting algorithms.
       //    - InsertionSort.java
       //    - SelectionSort.java
       //
       //  2. Add a method to class Main to generate a random array.
       //  3. Provide random input to test suite and ensure your implementations
       //     of InsertionSort and Selection sort continue to work.
       //  4. Increase the loop count for TestSuite to get better performance results.


       int[] testInput = { 1, 2, 3, 1 };


       // Increase the loop count to get better results once it works.
       // TestSuite.run(testInput, 10000);
       TestSuite.run(testInput, 1);
   }
   public static int[] generateRandomArray(int size, int minValue, int maxValue) {
       Random random = new Random();
       int[] array = new int[size];


       for (int i = 0; i < size; i++) {
           array[i] = random.nextInt(maxValue - minValue + 1) + minValue;
       }


       return array;
   }


}



