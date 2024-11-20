
package activityfivedatastructure;

public class NewClass {
    public boolean isSorted(int[] array, int length) {

        if (length <= 1) {
            return true;
        }
        if (array[length - 2] > array[length - 1]) {
            return false;
        }
        return isSorted(array, length - 1);
    }
    
}
