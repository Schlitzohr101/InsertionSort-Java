import java.util.Arrays;

/**
 * William Murray
 * Insertion Sort implimented within javaLangS
 */
public class Test {
    public static void main(String[] args) {
        int [] array = {2,5,3,8,6,9,7,1,0};
        System.out.println("Starting Array: ");
        for (int num : array) {
            System.out.print(num + " ,");
        }
        System.out.println();

        InsertionSort(array);

        System.out.println("\nEnd Array: ");
        for (int num : array) {
            System.out.print(num + " ,");
        }


    }

    /**
     * Insertion Sort
     * Will sort through the array given and alter it to be in ascending order
     * @param Ar
     * @return alters array by reference
     */
    public static void InsertionSort(int[] Ar) {
        //create value key to be the value to compare to
        int key;
        for (int i = 1; i < Ar.length; i++) {
            //set key to the looping index, starting at the second element
            key = Ar[i]; 
            //define and set comparer value to the index prior to the looping index
            int j = i - 1;
            System.out.println("key: "+i+" comp: "+j);
            while (j >= 0 && Ar[j] > key) { //while not out of bounds and element at comparer is greater than the key
                //swap index above with current comparer
                System.out.println("Swap: "+j+" with "+(j+1));
                Ar[j+1] = Ar[j];
                //shift the index down
                j = j - 1;
            }
            //place the key into the space above where the comparer index is left
            Ar[j+1] = key;
            System.out.println("Iteration#"+i+" "+Arrays.toString(Ar));
        }
    }
}