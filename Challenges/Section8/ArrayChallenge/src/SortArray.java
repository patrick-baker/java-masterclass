public class SortArray {

    public static int[] SortArray (int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        // sets flag boolean to run while loop
        boolean flag = true;
        int temp;
        // runs if previous iteration reworked array order
        while(flag) {
            // prevents infinite loop
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                // if the next integer in array is larger than the current, their positions will be switched
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }

        }
        return sortedArray;
    }

}
