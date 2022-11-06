public class Intersection {
    //Написать алгоритм Intersection, который принимает на вход 2 массива
    // целых чисел и возвращает массив общих элементов.
    //
    //Test Data:
    //{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
    //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
    //{1, 2, 4, 5, 89}, {8, 9, 45} → {}

    public int[] intersection(int[] array1, int[] array2) {
        if (array1 != null && array1.length > 0 && array2 != null && array2.length > 0) {
            int count = 0;

            //           int compareLengh = Math.max(array1.length, array2.length);
            //нам нужно именно пройтись по двум массивам, чтобы узнать сколько совпадений
            // кол-во совпадений станет длинной общего массива
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        // commonDigitsAr[i] = array1[i];
                        count++;
                    }
                }
            }
            //проходимся по новому массиву и еще раз параллельно по двум другим, чтобы записать
            // cовпадения в новый массив
            int[] commonDigitsAr = new int[count];
            for (int k = 0; k < count; ) {
                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array2.length; j++) {
                        if (array1[i] == array2[j]) {
                            commonDigitsAr[k] = array1[i];
                            k++;// переменная k инкриментируется только после совпадений
                            // поэтому перемещена в конец
                        }
                    }

                }
                if (count != 0) {

                    return commonDigitsAr;
                } else {
                    return new int[0];
                }
            }

            return commonDigitsAr;
        } else {

            return new int[0];
        }
    }

//    public int[] intersection(int[] array1, int[] array2) {
//        if (array1 != null && array1.length > 0 && array2 != null && array2.length > 0) {
//            int count = 0;
//            int[] commonDigitsAr = new int[count];
//            int compareLengh = Math.max(array1.length, array2.length);
//            for (int i = 0; i < compareLengh; i++) {
//                if (array1[i] == array2[i]) {
//                    commonDigitsAr[i] = array1[i];
//                    count++;
//                }
//
//            }
//
//            return commonDigitsAr;
//        } else {
//            return new int[0];
//        }
//
//    }
}