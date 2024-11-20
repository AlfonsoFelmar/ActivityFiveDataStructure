package activityfivedatastructure;

import java.util.Arrays;
import java.util.Scanner;

public class ActivityFiveDataStructure {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scn.nextInt();
        }
        
        NewClass checker = new NewClass();
        boolean isSorted = checker.isSorted(array, array.length);

        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
             
    }
}


