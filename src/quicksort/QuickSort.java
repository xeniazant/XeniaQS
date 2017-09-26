/*
 * Xenia Zantello 
 *  hw3 quicksort
 * Algorithms and Data Structures
 * Intructor - Dr. Adam Whitley
 *
 *
 */
package quicksort;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author xeniazantello
 */
public class QuickSort {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        int[] QStest0 = {6,2,21,3,8,7,9,11,4,5,6};
        int[] QStest1 = {73, 38, 64, 49, 4, 57, 60, 70, 43, 31, 15, 39, 48, 51, 56, 33, 13, 62};
        int[] QStest2 = {7, 15, 36, 11, 16, 8, 12, 27, 22, 10, 32, 38, 21, 18, 13};
        int[] QStest3 = {85, 90, 17, 60, 97, 74, 14, 66, 92, 34, 55, 88, 62, 95, 4, 57, 20, 10, 38, 81, 94};
        int[] QStest4 = {39, 15, 13, 19, 36, 9, 17, 35, 2};

        
        int[] RQStest0 = {6,2,21,3,8,7,9,11,4,5,6};
        int[] RQStest1 = {73, 38, 64, 49, 4, 57, 60, 70, 43, 31, 15, 39, 48, 51, 56, 33, 13, 62};
        int[] RQStest2 = {7, 15, 36, 11, 16, 8, 12, 27, 22, 10, 32, 38, 21, 18, 13};
        int[] RQStest3 = {85, 90, 17, 60, 97, 74, 14, 66, 92, 34, 55, 88, 62, 95, 4, 57, 20, 10, 38, 81, 94};
        int[] RQStest4 = {39, 15, 13, 19, 36, 9, 17, 35, 2};
        
        System.out.println("///--------- Normal Quick Sort test 0 -----------///");
        
        System.out.println("Initial array: " + Arrays.toString(QStest0));
        quickSort(QStest0 , 0 , QStest0.length - 1);
        System.out.println("Quick-sorted array: " + Arrays.toString(QStest0));
        
        System.out.println("///--------- Normal Quick Sort test 1 -----------///");
        
        System.out.println("Initial array: " + Arrays.toString(QStest1));
        quickSort(QStest1 , 0 , QStest1.length - 1);
        System.out.println("Quick-sorted array: " + Arrays.toString(QStest1));
        
        System.out.println("///--------- Normal Quick Sort test 2 -----------///");
        
        System.out.println("Initial array: " + Arrays.toString(QStest2));
        quickSort(QStest2 , 0 , QStest2.length - 1);
        System.out.println("Quick-sorted array: " + Arrays.toString(QStest2));
        
        System.out.println("///--------- Normal Quick Sort test 3 -----------///");
        
        System.out.println("Initial array: " + Arrays.toString(QStest3));
        quickSort(QStest3 , 0 , QStest3.length - 1);
        System.out.println("Quick-sorted array: " + Arrays.toString(QStest3));
        
        System.out.println("///--------- Normal Quick Sort test 4 -----------///");
        
        System.out.println("Initial array: " + Arrays.toString(QStest4));
        quickSort(QStest4 , 0 , QStest4.length - 1);
        System.out.println("Quick-sorted array: " + Arrays.toString(QStest4));
        
        
        
        System.out.println("///--------- Randomized Quick Sort test 0 -----------///");
        
        System.out.println("Initial array: " + Arrays.toString(RQStest0));
        randomizedQuickSort(RQStest0 , 0 , RQStest0.length -1);
        System.out.println("Randomized-Quick-sorted array: " + Arrays.toString(RQStest0));
        
        System.out.println("///--------- Randomized Quick Sort test 1 -----------///");
        
        System.out.println("Initial array: " + Arrays.toString(RQStest1));
        randomizedQuickSort(RQStest1 , 0 , RQStest1.length -1);
        System.out.println("Randomized-Quick-sorted array: " + Arrays.toString(RQStest1));
        
        System.out.println("///--------- Randomized Quick Sort test 2 -----------///");
        
        System.out.println("Initial array: " + Arrays.toString(RQStest2));
        randomizedQuickSort(RQStest2 , 0 , RQStest2.length -1);
        System.out.println("Randomized-Quick-sorted array: " + Arrays.toString(RQStest2));
        
        System.out.println("///--------- Randomized Quick Sort test 3 -----------///");
        
        System.out.println("Initial array: " + Arrays.toString(RQStest3));
        randomizedQuickSort(RQStest3 , 0 , RQStest3.length -1);
        System.out.println("Randomized-Quick-sorted array: " + Arrays.toString(RQStest3));
        
        System.out.println("///--------- Randomized Quick Sort test 4 -----------///");
        
        System.out.println("Initial array: " + Arrays.toString(RQStest4));
        randomizedQuickSort(RQStest4 , 0 , RQStest4.length -1);
        System.out.println("Randomized-Quick-sorted array: " + Arrays.toString(RQStest4));
        
        
    }
    
    
    
    /*
    12 points: Implement a recursive method named quicksort. Implement quicksort as in the slides/textbook,
    using the rightmost element of the subarray as the pivot (the "naive" pivot choice). 
    One parameter will be an array to sort. Two more parameters will be the start and end index of the subarray 
    in which to sort. It is up to you whether the upper bound is inclusive or exclusive, 
    but comment which you chose to do -- the pseudocode uses an inclusive upper bound. 
    This method will have no return value, and its only effect will be to rearrange the given array's values into 
    sorted order.
    */
    
    /**
     * 
     * @param array describes the array with values in arbitrary order to be sorted.
     * @param start describes the first index of the subproblem we are working on (0 in initial call)
     * @param end describes the last index of the subproblem we are working on (array.length - 1 at initial call)
     */
    public static void quickSort(int[] array, int start, int end ){
        if(start < end){
            int split = partition(array , start , end); //split 2 subproblems at split (which i felt was a better var name than 'q')
            quickSort(array , start , split - 1);
            quickSort(array , split + 1 , end);
        }
    }
    
    /*
    24 points: You will need to define a private (helper) method called partition as in the slides/textbook, 
    which is invoked by quicksort. The parameters are the same as quicksort, but partition also returns an 
    int index used by quicksort to divide the two recursive subproblems.
    */
    
    /**
     * 
     * @param array describes the array with values in arbitrary order to be sorted.
     * @param start describes the first index of the subproblem we are working on (0 in initial call)
     * @param end describes the last index of the subproblem we are working on (array.length - 1 at initial call)
     * @return an int value representing the index of our partition value which is placed precisely where it will remain in sorted order.
     */
    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int sb = start -1; // sb (small bucket) is a variable describing the largest inclusive index of the smaller bucket
        for(int i = start; i <= end -1; i ++){
            if(array[i] <= pivot){
                sb ++;
                int holder = array[sb]; // holder simply hold one of the values we are swapping so it is not destroyed.
                array[sb] = array[i];
                array[i] = holder;
            }
        }
        int holder1 = array[sb + 1]; //holder 1 works the same as holder except for this swap
        array[sb + 1] = array[end];
        array[end] = holder1;
        return sb + 1;
    }
    
    
    /*
    12 points: Once you get your partition and quicksort methods working correctly, create a recursive method 
    called randomizedQuicksort as in the slides/textbook, which is extremely similar to quicksort above. 
    Its parameters, return value, and purpose are the same as the above quicksort method.  The only difference is 
    the choice of pivot.  First, swap a randomly selected element in the subarray with the rightmost element of the 
    subarray, then proceed as above to use the rightmost element as the pivot, by invoking partition and recursing. 
    You may use the java.util.Random class as a random number generator.
    */
    
    /**
     * 
     * @param array describes the array with values in arbitrary order to be sorted.
     * @param start describes the first index of the subproblem we are working on (0 in initial call)
     * @param end describes the last index of the subproblem we are working on (array.length - 1 at initial call)
     */
    public static void randomizedQuickSort(int[] array, int start, int end ){
        if(start < end){
            Random rndm = new Random(); // made a new random number generator
            int ran = rndm.nextInt((end - start) + 1 ) + start;
            
            int holder = array[end]; // made a holder for swapping values so one value is not overwritten and destroyed. 
            array[end] = array[ran];
            array[ran] = holder;
            int split = partition(array , start , end); //split 2 subproblems at split (which I felt was a better var name than 'q')
            randomizedQuickSort(array , start , split - 1);
            randomizedQuickSort(array , split + 1 , end);
        }
    }
    

    
    
    /*
    12 points: In the main method, invoke both quicksort and randomizedQuicksort that you've implemented at least 
    five times each on different inputs, for testing purposes.  Alternatively, you may rig your main method to take 
    an array from the user via the Scanner class, then display the output to the console, all wrapped up in a loop 
    that continues until the user exits the program.  Write all the inputs and the results into the console. 
    This is the testing portion of the assignment.
    */
}
