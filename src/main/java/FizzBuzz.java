public class FizzBuzz {

    public String[] fizzBuzz(int start, int end){ //в основном все методы будут что-то возвращать, чтобы тестить
        if(start <= end) {
            String[] array = new String[end - start + 1]; // yниверсальная формула для всех массивов

            int number = start; // доп. переменная

            for (int i = 0; i < array.length && number <= end; i++) { //i - это индекс, кот идет до длинны массыва
                if (number % 15 == 0) {                                   // он строго меньше длинны массива
                    array[i] = "FizzBuzz";                               // а проверку мы начнем с start и добавляем условие
                } else if (number % 3 == 0) {                           //start <= end . Все до этого была подготовка к алгоритму
                    array[i] = "Fizz";                                  // number числа в последовательности
                } else if (number % 5 == 0) {                           // i - это индексы
                    array[i] = "Buzz";
                } else {
                    array[i] = String.valueOf(number);// т.к у нас String array, мы ячейку число запишем в стринг
                }

                number++;
            }

            return array; // ecли данные валидные мы вернем сам массив
        }

        return new String[0];// пустой массив, т.к. мы никогда его не будем исп-ть, мы его
                            // cоздаем "все, что мы обычно пишем в правой части после равно,
                            //т.е ему не нужно имя.

    }

}
