public class ReverseArray {
    //11.	 Написать алгоритм ReverseArray, который принимает на вход
    // массив целых чисел, и возвращает “перевернутый” массив.
    //Test Data:
    //{2, 7, 3, 10} → {10, 3, 7, 2}
    public int[] reverseArray(int[] array) {
        if (array != null && array.length > 0) {
            int arrayNew[] = new int[array.length];
            for (int i = 0; i < array.length; ) {
                for (int j = array.length - 1; j >= 0; ) {
                    arrayNew[j] = array[i];
                    //итерация и уменьшение должны происходить после сравнения
                    // нужны обязательно два эрея
                    j--;
                    i++;
                }

            }
            return arrayNew;
        } else {
            return new int[0];
        }
    }
}