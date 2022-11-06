import project_utils.Utils;

public class OddEvenValuesInArray {
    //Написать метод countEvenValuesInArray(), который принимает на вход
    // массив целых чисел,  и возвращает количество четных чисел в этом массиве
    public int countEvenValuesInArray( int [] array){
        int count = 0;

        if(array.length > 0){
            for (int i = 0; i < array.length; i++) {
                if(array[i] % 2 == 0){
                    count++;
                }
            }
        } else {

            return -1;
        }

        return count;
    }

    //Написать метод countOddValuesInArray(), который принимает на вход
    // массив целых чисел,  и возвращает количество нечетных чисел в этом массиве
    public int countOddValuesInArray(int [] array){
        int count = 0;
        if (array.length > 0){
            for (int i = 0; i < array.length; i++) {
                if(array[i] % 2 != 0){
                    count++;
                }
            }
        } else {
            
            return -1;
        }
        return count;
    }
    public int countOddValuesInArray1(int [] array){
        if (array.length == 0){

            return -1;
        }

        return array.length - countEvenValuesInArray(array);
    }
    
    //В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
    // который принимает на вход массив целых чисел и число number.
    // Метод возвращает значение true, если все элементы массива больше number,
    // иначе возвращает false

    public boolean areValuesGreaterThanNumber(int [] array, int number){
        if (array.length == 0){
            return false;
        }
        int countOfBiggerElements = 0;

            for (int i = 0; i < array.length; i++) {
                if(array[i] > number){
                    countOfBiggerElements++;
                }
            }
        return countOfBiggerElements == array.length;// this should be true
    }

    public boolean areValuesGreaterThanNumber1(int [] array, int number){

        int countOfBiggerElements = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > number){
                countOfBiggerElements++;
            }
        }
        if (countOfBiggerElements == array.length){

            return true;
        }

        return false;
    }
    //В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
    // который принимает на вход массив целых чисел и возвращает массив int[2],
    // который содержит количество четных и нечетных элементов входящего массива
    public int [] countOddEvenValuesInArray(int [] arrayInt){
      int countEven = 0;
      int countOdd = 0;


        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 ==0){
                countEven++;
            } else {
                countOdd++;
            }
        }
        int [] arrayEvenAndOdd ={countEven, countOdd};

        return arrayEvenAndOdd;
    }
    //используя методы, созданные ранее в этом классе

    public int [] countEvenOddValuesInArray2(int [] array){
        int [] newArray = new int[2];
        newArray[0] = new OddEvenValuesInArray().countEvenValuesInArray(array);
        newArray[1] = new OddEvenValuesInArray().countOddValuesInArray(array);

        return newArray;
    }

    //В классе OddEvenElementsInArray написать метод createOddEvenArray(),
    // который принимает массив целых случайных чисел,
    // и возвращает двумерный массив (массив четных и массив нечетных чисел)

    public int[][] createOddEvenArray(int [] arrayInt) {

        int countEven = 0;
        int countOdd = 0;
        int[][] array = new int[0][];
        if (arrayInt == null || arrayInt.length == 0) {

            return new int[0][0];
        } else {


            for (int i = 0, j = 0; i < arrayInt.length; i++, j++) {
                if (arrayInt[i] % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
                array = new int[countEven][countOdd];
            }

            return array;
        }
    }

    public int[][] createOddEvenArrayUsingUtils(int [] arrayInt) {
//        int lenght = 7;
//        int upper = 10;
//        int lower = 2;
//        int []ar = project_utils.Utils.createArrayRandomInt(lenght, upper, lower);
        if (arrayInt == null || arrayInt.length == 0){
            return new int [0][0];
        }
        return new int[][]{Utils.createArrayEvenIntegers(arrayInt), Utils.createArrayOddIntegers(arrayInt)};
    }
}
