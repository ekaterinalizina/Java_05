import java.util.Arrays;

public class CreateArray {
    // написать в этом классе метод createIntArray(),
    // который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
    //Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}

    public int [] createIntArray(int a, int b, int c, int d, int e){

        int[] array = {a, b, c, d, e};

        return array;
    }

    //Написать метод createDoubleArray(), который принимает на вход 5 чисел
    // типа double, и возвращает массив из этих же чисел
    //Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}

    public double [] createDoubleArray(int a, int b, int c, int d, int e){

        double[] array = {a, b, c, d, e};

        return array;
    }

    //Написать метод createStringArray(), который принимает на вход 5 слов,
    // и возвращает массив из этих слов
    //Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) ->
    // {“It”, “was”, “an”, “apple”, “pie”}

    public String [] createDoubleArray(String a, String  b, String c, String d, String e){

        String [] array = {a, b, c, d, e};

        return array;
    }

    //Написать метод createArrayFromText(),
    // который принимает на вход предложение из нескольких слов
    // и возвращает массив из этих слов.
    //Например, createArrayFromText(“It was an apple pie”) ->
    // {“It”, “was”, “an”, “apple”, “pie”}
    //
    public String [] createArrayFromText(String a){

        String [] array = a.split(" ");//вызываем метод, через объект класса стринг

        for (int i = 0; i < array.length; i++) {// cоздаем массив циклом for
        }
        System.out.println(Arrays.toString(array));

        return array;
    }

    //В классе CreateArray написать метод createIntArrayFromText(),
    // который принимает на вход строку чисел (н-р, “3 4 1 8 10 12.3”)
    // и возвращает массив типа int[] из этих чисел.
    // (vожно использовать split() или toCharArray())
    public int [] createIntArrayFromText( String text){
        String [] arrayString = text.split(" ");
        int [] arrayInt = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].contains(".")){
                double temp = Double.parseDouble(arrayString[i]);
                int number = (int) temp;
                arrayInt[i] = number;
            } else{
                int temp = Integer.parseInt(arrayString[i]);
                arrayInt[i] = temp;
            }

        }
        return arrayInt;
    }

    //Разбиваем задачу на подзадачи.
    // Шаг 0. Сначала нужно создать метод который в последствии будет определять,
    // после прохождения по массиву и преобразования Стринга в Чар, это число или нет.
    // Шаг 1. Сначала нужно определить состоит ли строка из чисел (charAt метод)
    //Для этого будум использовать метод boolean
    //Шаг 2. Проверяем, есть ли в строке точка или запятая "." или ","
    //Для этого будум использовать метод boolean
    //Шаг 3. Проверяем есть ли точка между числами в строке
    //Для этого будум использовать метод boolean
    //Шаг 4. Проверяем, есть ли отрицательное числов с троке
    //Шаг 5. Написать итоговый методо подтягивающий все предыдущие шаги
    public boolean isDigit(char symbol){

        return symbol >= 0 && symbol <= 9;
    }
    public boolean isDigitInString(String str){
        if(str.length() > 0){//проверяем, что строка больше, чем 0 символов
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) >= '0') && (str.charAt(i) <= '9')){
            //charAt() возвращает символ из массива строки по указанному индексу.
                return true;
                }
            }
        }

        return false;
}

public boolean isDotOrComa (char symbol){

        return (symbol == ',' || symbol == '.');
        // должен вернуть true, если десятичное число
}

public boolean isDotBetweenDigits (String str, int index ){
        return ((index > 0) && (index < str.length() -1)
                && isDotOrComa(str.charAt(index))// узнаем есть ли точка или запятая в [i]-вом элементе
                && isDigit(str.charAt(index -1)) // это число перед [i]-вом элементом
                && isDigit(str.charAt(index + 1)));// это число после [i]-вого элемента
}

public boolean isNegativeNumber (String str, int index){
        return index < str.length()-1
                && str.charAt(index) == '-'// содержится ли символ "-" в элементе
                && isDigit(str.charAt(index + 1));// содержится ли символ "-" в следующем элементе
}

    //В классе CreateArray написать метод multiplesOf(), который принимает на вход
    // целое положительные число number в пределах от 1 включительно
    // до 10 включительно, и возвращает таблицу умножения на это число в виде массива
    //Например, multiplesOf(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

    public  int [] multipleOf(int number) {

        int[] array = new int[11];
        if (number > 0 && number <= Integer.MAX_VALUE / 10) {

            for (int i = 0; i < array.length; i++) {
                array[i] = i * number;
            }
            return array;
        }
        return new int [0];
    }

}
