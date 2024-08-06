package org.example;

public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {

        // Check if the input array is null or empty
        if (numbers == null || numbers.length == 0) {
            // Throw an IllegalArgumentException if the array is null or empty
            throw new IllegalArgumentException("Array must not be null or empty");
        }
    // Calculate the sum of all elements in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        //Return the average by dividing the sum by the number of elements

        return (double)sum/numbers.length;
    }


    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        double average = calculateAverage(numbers);
        System.out.println("Average:" + average);

        //uncomment to test
        //int[] numbersNull = null
        //calculateAverage(numbersNull);


        //int[] numbersTest = {1,2,3,4,5};
        //calculateAverageWithErrors(numbersTest);

        //uncomment to test logic error
        //System.our.println(calculateAverage(new int[] {1,2,3,4,5}));

        //6. logic error introduced here
        //return (double) sum / (numbers.length-1);

        //4. introduce null pointer exception
        //Exceptions occur at line (AverageCalculator.java:9) & (AverageCalculator.java:31)
//        int[] numbers = null;
//        double average = calculateAverage(numbers);//throws null pointer exception

        //Introduce an array index out of bounds exception
//        // occurs at line 31
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];  // Will throw ArrayIndexOutOfBoundsException


        }
    }



