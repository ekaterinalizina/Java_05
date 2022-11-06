public class MinMax {
//    Написать алгоритм MinMaxAve, который принимает массив чисел int[]
//    и 2 значения индексов. Алгоритм возвращает массив,
//    который содержит минимальное значение, максимальное значение,
//    и среднее среди всех значений между 2-мя индексами.
//
//    Test Data:
//            ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}


    public static int[] minMaxAve(int[] array, int index1, int index2) {
        int minIndex = Math.min(index1, index2);
        int maxIndex = Math.max(index1, index2);
        int ave = 0;
        int count = 0;
        int sum = 0;
        for (int i = minIndex; i <= maxIndex; i++, count++) {
            sum += array[i];
        }
        ave = Math.round(sum / count);

        return new int[]{array[minIndex], array[maxIndex], ave};
    }
}
