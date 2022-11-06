public class ManipulationsWithArrays {
    //Написать метод multiplуArrayByNumber(), который принимает на вход массив
    // целых чисел и число int number. Метод возвращает массив тех же чисел,
    // умноженных на number
    //Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
    public int[] multiplyArrayByNumber(int[] array, int number) {
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (number == 0) {
                    array[i] = 0;
                } else if (array[i] <= Integer.MAX_VALUE / number
                        && array[i] >= Integer.MIN_VALUE / number
                        && number != 0) {
                    array[i] = array[i] * number;


                } else {
                    return new int[0];// пустой массив
                }
            }

        }
        return array;
    }

    //Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
    // и возвращает массив типа double[] из тех же чисел
    //Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
    public double[] toDoubleArray(int[] array) {
        double[] arrayDouble = new double[array.length];
        if (array.length > 0) {

            for (int i = 0; i < arrayDouble.length; i++) {
                arrayDouble[i] = array[i];// автоматически добавит десятичность
                //arrayDouble[i] = (double) array[i]; тоже самое
            }
        } else {
            return new double[0];
        }
        return arrayDouble;
    }

    //Написать метод toIntArray(), который принимает на вход массив типа double[],
    // и возвращает массив типа int[] из тех же чисел
    //Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
    public int[] toIntArray(double[] arrayDouble) {
        int[] arrayInt = new int[arrayDouble.length];
        if (arrayDouble.length > 0) {
            for (int i = 0; i < arrayInt.length; i++) {
                arrayInt[i] = (int) arrayDouble[i];
            }
        } else {
            return new int[0];
        }
        return arrayInt;
    }

    //Написать метод toStringArray(), который принимает на вход массив целых чисел,
    // и возвращает массив типа String[] из тех же чисел
    // (желательно не использовать метод .toString(), нужно переводить вручную)
    //Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
    public String[] toStringArray(int[] arrayInt) {
        String[] arrayString = new String[arrayInt.length];
        if (arrayInt.length > 0) {
            for (int i = 0; i < arrayString.length; i++) {
                arrayString[i] = "" + arrayInt[i];
            }
        } else {
            return new String[0];
        }
        return arrayString;
    }

    //Перегрузить метод toStringArray() параметром double[].
    // Этот метод должен возвращать массив типа String[]
    // (желательно не использовать метод .toString(), нужно переводить вручную)
    //Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
    public String[] toStringArray(double[] arrayDouble) {
        String[] arrayString = new String[arrayDouble.length];
        if (arrayDouble.length > 0) {
            for (int i = 0; i < arrayString.length; i++) {
                arrayString[i] = "" + arrayDouble[i];
            }
        } else {
            return new String[0];
        }
        return arrayString;
    }

    //В классе ManipulationsWithArrays написать метод getTheGreaterHalf(),
    // который принимает массив целых чисел,  и возвращает  массив из
    // суммарно бОльшей первой или второй половины входящего массива

    public int[] getTheGreaterHalf(int[] array) {
        //Шаг.1 узнать четное кол-во элементов входит в изначальный массив
        //Шаг.2 посчитать сумму эл-в в каждой части массива и сравнить
        //Шаг. 3 создать новый массив
        int[] arNew = new int[0];
        int[] arNew2 = new int[0];
        int[] arNewN = new int[0];
        int[] arNew2N = new int[0];
        if (array != null || array.length > 0) {


            int sumLeft = 0;
            int sumRight = 0;
            int arL = 0;
            if (array.length % 2 == 0) {
                arL = array.length - (array.length / 2);
                arNew = new int[arL];
                for (int i = 0; i < arL; i++) {
                    sumLeft = sumLeft + arNew[i];
                }
                arNew2 = new int[arL];
                for (int i = arL; i < array.length; i++) {
                    sumRight = sumRight + arNew2[i];
                }
            } else {
                arL = array.length - (array.length / 2 - 1);
                arNewN = new int[arL];
                for (int i = 0; i < arL; i++) {
                    sumLeft = sumLeft + arNewN[i];
                }
                arNew2N = new int[arL];
                for (int i = arL; i < array.length; i++) {
                    sumRight = sumRight + arNew2N[i];
                }
            }
            int numIsGreater = Math.max(sumLeft, sumRight);
            if ((sumLeft >= sumRight) && (array.length % 2 == 0)) {

                return arNew;
            } else if ((sumLeft < sumRight) && (array.length % 2 == 0)) {

                return arNew2;
            } else if ((sumLeft >= sumRight) && (array.length % 2 != 0)) {

                return arNewN;
            } else {
                return arNew2N;
            }


        } else {
            return new int[0];
        }
    }
}