package project_utils;

import java.util.Arrays;

public class Utils {

    /**
     * Random number generation methods:
     */
    public static int getRandomInt(int upper, int lower) {

        return (int) (Math.random() * (upper - lower) + lower);
    }

    public static double getRandomDouble(int upper, int lower) {

        return ((Math.random() * (upper - lower) + lower));
    }

    /**
     * Method of creating an array with Random int numbers:
     */
    public static int[] createArrayRandomInt(int length, int upper, int lower) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInt(upper, lower);
        }

        return array;
    }

    /**
     * Method_2 of creating an array with Random int numbers:
     */
    public static int[] generationRandomArrayMainInt(int length, int from, int to) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = from + (int) (Math.random() * (to + 1));
        }

        return array;
    }

    /**
     * Method of creating an array with Random double numbers:
     */
    public static double[] createArrayRandomDouble(int length, int upper, int lower) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomDouble(upper, lower);
        }

        return array;
    }

    /**
     * A generic method for creating an array with any data type and any length:
     */
    public static Object[] createArray(Object... v) {
        Object[] array = new Object[v.length];
        for (int i = 0; i < v.length; i++) {
            array[i] = v[i];
        }

        return array;
    }

    /**
     * Method of creating an array of random positive numbers:
     */
    public static int[] arrayRandomPositiveNumbers(int length, int upper, int lower){
        if (length <= 0 || upper <= 0 || lower <= 0) {

            return new int[]{};
        }

        return createArrayRandomInt(length, upper, lower);
    }

    /**
     * Method of creating an array of random negative numbers:
     */
    public static int[] arrayRandomNegativeNumbers(int length, int upper, int lower){
        if (length <= 0 || upper >= 0 || lower >= 0) {
            return new int[]{};
        }

        return createArrayRandomInt(length, upper, lower);
    }

    /**
     * Method of creating a two-dimensional array:
     */
    public static int[][] integerRandomNumbers2DArray(int row, int column, int upper, int lower) {
        int[][] array = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getRandomInt(upper, lower);
            }
        }

        return array;
    }

    /**
     * Method_2 of creating a two-dimensional array:
     */
    public static int[][] array2D(int[][] arrayName) {
        for (int i = 0; i < arrayName.length; i++) {
            for (int j = 0; j < arrayName[i].length; j++) {
                arrayName[i][j] = (int) (Math.random() * 10);
            }
        }

        return arrayName;
    }

    /**
     * Method_3 of creating a two-dimensional array:
     */
    public static void random2DArray(int row, int column, int start, int end) {
        int[][] randomArrays = new int[row][column];
        int range = (end + 1 - start);

        for (int i = 0; i <= row - 1; i++) {
            for (int j = 0; j <= column - 1; j++) {

                randomArrays[i][j] = (int) (Math.random() * range) + start;
            }
        }
        for (int i = 0; i <= row - 1; i++) {
            System.out.println(Arrays.toString(randomArrays[i]));
        }
    }

    /**
     * Array printing methods (int, double, String, boolean):
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Methods to calculate the average value of the elements of the array (int, double):
     */
    public static double averageArray(int[] array) {
        double sumOfElements = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfElements = sumOfElements + array[i];
        }

        return sumOfElements / array.length;
    }

    public static double averageArray(double[] array) {
        double sumOfElements = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfElements = sumOfElements + array[i];
        }

        return sumOfElements / array.length;
    }


    /**
     * Methods for calculating the minimum value of the elements of an array (int, double):
     */
    public static int minValueInArray(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    public static double minValueInArray(double[] array) {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    /**
     * Methods for calculating the maximum value of the elements of an array (int, double):
     */
    public static int maxValueInArray(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public static double maxValueInArray(double[] array) {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    /**
     * Method for calculating the minimum value, the maximum value and average of the elements of an array:
     */
    public static int[] minMaxAverageArray(int[] nameArray) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int average;
        int sum = 0;
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i] < min) {
                min = nameArray[i];
            }
            if (nameArray[i] > max) {
                max = nameArray[i];
            }
            sum += nameArray[i];
        }
        average = sum / nameArray.length;

        int[] result = {min, max, average};

        return result;
    }

    /**
     * Methods to check whether the array is empty (int, double, String):
     */
    public static boolean checkForEmptyArray(int[] array) {

        if (array.length != 0) {

            return true;
        } else {

            return false;
        }
    }

    public static boolean checkForEmptyArray(double[] array) {

        if (array.length != 0) {

            return true;
        } else {

            return false;
        }
    }

    public static boolean checkForEmptyArray(String[] array) {

        if (array.length != 0) {

            return true;
        } else {

            return false;
        }
    }

    /**
     * Methods for calculating the length of an array (int, double, boolean, String):
     */
    public static int lengthArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }

        return count;
    }

    public static int lengthArray(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }

        return count;
    }

    public static int lengthArray(boolean[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }

        return count;
    }

    public static int lengthArray(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }

        return count;
    }

    /**
     * Methods for checking positive numbers in an array (int, double):
     */
    public static boolean checkPositiveNumbersInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {

                return true;
            }
        }

        return false;
    }

    public static boolean checkPositiveNumbersInArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0.0) {

                return true;
            }
        }

        return false;
    }

    /**
     * Methods for checking negative numbers in an array (int, double):
     */
    public static boolean checkNegativeNumbersInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {

                return true;
            }
        }

        return false;
    }

    public static boolean checkNegativeNumbersInArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0.0) {

                return true;
            }
        }

        return false;
    }

    /**
     * Methods for checking the parity of numbers in an array (int, double):
     */
    public static boolean checkEvenNumbersInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

                return true;
            }
        }

        return false;
    }

    public static boolean checkEvenNumbersInArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0.0) {

                return true;
            }
        }

        return false;
    }

    /**
     * Methods for checking the oddness of numbers in an array (int, double):
     */
    public static boolean checkOddNumbersInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {

                return true;
            }
        }

        return false;
    }

    public static boolean checkOddNumbersInArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0.0) {

                return true;
            }
        }

        return false;
    }

    /**
     * A method for calculating the quantity of even numbers in an array:
     */
    public static int countEvenNumbersInArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    /**
     * A method for calculating the quantity of odd numbers in an array:
     */
    public static int countOddNumbersInArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    /**
     * Method of creating an array of even numbers from an array of integers:
     */
    public static int[] createArrayEvenIntegers(int[] array) {
        int[] evenNumber = new int[countEvenNumbersInArray(array)];
        int evenIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumber[evenIndex] = array[i];
                evenIndex++;
            }
        }

        return evenNumber;
    }

    /**
     * Method of creating an array of odd numbers from an array of integers:
     */
    public static int[] createArrayOddIntegers(int[] array) {
        int[] oddNumber = new int[countOddNumbersInArray(array)];
        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumber[oddIndex] = array[i];
                oddIndex++;
            }
        }

        return oddNumber;
    }

    public static boolean isStringNotNullAndNotEmpty(String text) {
        if (text != null){

            return !text.trim().isEmpty();// boolean
        }

        return false;
    }

}
