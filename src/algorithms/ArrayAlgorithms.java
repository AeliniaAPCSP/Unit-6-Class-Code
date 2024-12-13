package algorithms;

public class ArrayAlgorithms {
    public static void main(String[] args) {
        //make a good array
        int[] myArray = {6,8,-4,0,14,200,-10,5,-3};
        String output = "";
        System.out.println(findMin(myArray));
        System.out.println(findMax(myArray));
        System.out.println(findAverage(myArray));
        int[] arrayLeft = shiftLeft(myArray);
        for(int i = 0; i < (arrayLeft.length-1); i++){
            if(i < arrayLeft.length) {
                output+=arrayLeft[i] + ", ";
            }
        }
        output+=arrayLeft[arrayLeft.length-1];
        System.out.println(output);
        output = "";
        int[] arrayRight = shiftRight(myArray);
        for(int i = 0; i < (arrayRight.length-1); i++){
            if(i < arrayRight.length) {
                output+=arrayRight[i] + ", ";
            }
        }
        output+=arrayRight[arrayRight.length-1];
        System.out.println(output);
        output = "";
        int[] arrayFlip = reverseArray(myArray);
        for(int i = 0; i < (arrayFlip.length-1); i++){
            if(i < arrayFlip.length) {
                output+=arrayFlip[i] + ", ";
            }
        }
        output+=arrayFlip[arrayFlip.length-1];
        System.out.println(output);
        output = "";
    }

    // Finds the minimum value in an array
    public static int findMin(int[] array) {
        int minValue = array[0];
        for(int num:array){
            if(num < minValue){
                minValue = num;
            }
        }
        return minValue;
    }

    // Finds the maximum value in an array
    public static int findMax(int[] array) {
        int maxValue = array[0];
        for(int num:array){
            if(num > maxValue){
                maxValue = num;
            }
        }
        return maxValue;
    }

    // Finds the average value of elements in an array
    public static double findAverage(int[] array) {
        double average = 0.0;
        for(int num:array){
            average+=num;
        }
        average/=array.length;
        return average;
    }

    // Shifts the array to the left by one position
    public static int[] shiftLeft(int[] array) {
        int[] arrayLeft = new int[array.length];
        for(int i = 0; i < array.length-1; i++) {
            arrayLeft[i] = array[i+1];
        }
        arrayLeft[array.length-1] = array[0];
        return arrayLeft;
    }

    // Shifts the array to the right by one position
    public static int[] shiftRight(int[] array) {
        int[] arrayRight = new int[array.length];
        for(int i = 0; i < array.length-1; i++) {
            arrayRight[i+1] = array[i];
        }
        arrayRight[0] = array[array.length-1];
        return arrayRight;
    }

    // Reverses the elements in the array
    public static int[] reverseArray(int[] array) {
        int[] arrayFlip = new int[array.length];
        if (array.length % 2 != 0) {
            arrayFlip[arrayFlip.length / 2] = array[array.length / 2];
        }
        for(int i = 0; i < (array.length/2); i++) {
            arrayFlip[i] = array[array.length-i-1];
        }
        for(int i = 0; i < (array.length/2); i++) {
            arrayFlip[arrayFlip.length-i-1] = array[i];
        }
        return arrayFlip;
    }
}
