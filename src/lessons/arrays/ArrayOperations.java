package src.lessons.arrays;

public class ArrayOperations {
    
    public static void main(String[] args) {
        
        int[] arrayOfNums = new int[20];
        int sizeOfArray = 6;

        // printElements(arrayOfNums, sizeOfArray);

        // sizeOfArray = insertSorted(arrayOfNums, 6, 33, sizeOfArray);

        arrayOfNums[sizeOfArray] = 33;

        printElements(arrayOfNums, 20);

    }

    private static void printElements(int[] arrayOfNums, int sizeOfArray){

        for (int index = 0; index < sizeOfArray; index++){
            System.out.printf("element at position [%d] has a value of %d \n", index, arrayOfNums[index]);
        }

    }

    // Function to insert a given key in
    // the array. This function returns n+1
    // if insertion is successful, else n.
    private static int insertSorted(int arr[], int n, int key, int sizeOfArray){
 
        // Cannot insert more elements if n
        // is already more than or equal to
        // capacity
        if (n >= sizeOfArray)
            return n;
 
        arr[n] = key;
 
        return (n + 1);
    }


}
