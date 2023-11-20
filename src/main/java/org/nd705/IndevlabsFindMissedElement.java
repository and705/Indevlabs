package org.nd705;

import java.util.Arrays;

public class IndevlabsFindMissedElement {


    public static int findMissedNumber(int[] arr) {
        Arrays.sort(arr); // in the example we see that the sequence can be mixed, so we use sorting
        int n = arr.length; //for code readability, introduce variables
        if (n < 2) { //check that the array has at least two elements
            throw new IllegalArgumentException("There is not enough elements in array, enter 2 or more elements");
        }

        int first = arr[0]; //for code readability, introduce variables - first element in array
        int end = arr[n - 1]; //for code readability, introduce variables - last element in array

        if ((end - first) != (n)) {
            throw new IllegalArgumentException("There is more than one missed element in sequence");
        }


        int expectedSum = (end - first + 1) * (first + end) / 2; //count expected sum, in the formula we take into account that the sequence may not start from 0
        int actualSum = Arrays.stream(arr).sum(); //count actual sum

        int missedNumber = expectedSum - actualSum;
        if (missedNumber - 1 == arr[missedNumber - first - 1] && missedNumber + 1 == arr[missedNumber - first]) {
            return missedNumber;
        } else {
            throw new IllegalArgumentException("The entered sequence does not meet the condition");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 0, 1, 3, 2};
        System.out.println(findMissedNumber(arr));
    }
}

