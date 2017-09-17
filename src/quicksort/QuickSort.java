/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author xeniazantello
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
    
    public static void quickSort(int[] array, int start, int end ){
    
    }
    
    /*
    24 points: You will need to define a private (helper) method called partition as in the slides/textbook, 
    which is invoked by quicksort. The parameters are the same as quicksort, but partition also returns an 
    int index used by quicksort to divide the two recursive subproblems.
    */
    
    private int partition(int[] array, int start, int end){
        int pivot = array[end];
        int sb = start -1; // sb (small bucket) is a variable describing the largest inclusive index of the smaller bucket
        for(int i = start; i < end -1; i ++){
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
    
    
    /*
    12 points: In the main method, invoke both quicksort and randomizedQuicksort that you've implemented at least 
    five times each on different inputs, for testing purposes.  Alternatively, you may rig your main method to take 
    an array from the user via the Scanner class, then display the output to the console, all wrapped up in a loop 
    that continues until the user exits the program.  Write all the inputs and the results into the console. 
    This is the testing portion of the assignment.
    */
}
