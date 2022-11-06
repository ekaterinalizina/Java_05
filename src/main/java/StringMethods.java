import project_utils.Utils;

import static project_utils.Utils.isStringNotNullAndNotEmpty;

public class StringMethods {
    // Написать метод removeSpaces(), который принимает на вход строку.
    //Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов в начале и в конце строки.
    //Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
    //Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
    //Если пробелов не было, вернуть сообщение “Пробелов не было”.
    //Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
    //
    //Test Data:
    //“    Red Rover School   “ → “Лишние пробелы удалены”
    //“Red Rover School“ → “Пробелов не было”
    //“” → “Строка пустая”
    public String removeSpaces(String text) {
        if (isStringNotNullAndNotEmpty(text)) {
            if (text.charAt(0) == ' ' || text.charAt(text.length() - 1) == ' ') {
                text.trim();

                return "Лишние пробелы удалены";
            }

            return "Пробелов не было";
        }

        return "Строка пустая";
    }

    //Написать алгоритм removeAllAs().
    //С помощью методов из видео1,  написать алгоритм,
    // который принимает на вход строку. Если строка валидная,
    // то метод удаляет все буквы 'a' из строки, если таковые имеются.
    // Метод возвращает обработанную строку.
    //Test Data:
    // “    Red Rover School   “ →  “Red Rover School“
    //“panda   “ → “pnd”
    //“taramasalata” → “trmslt”
    public String removeAllAs(String text) {

        if (isStringNotNullAndNotEmpty(text)) {

            String newText = text.trim();
            if (text.length() == newText.length()) {

                return "Пробелов не было";
            } else {
                text = newText;

                return "Лишние пробелы удалены";
            }

        }
        return "Строка пустая";
    }


//Написать алгоритм removeAllZeros().
//С помощью методов из видео1,  написать алгоритм, который принимает
// на вход строку, состоящую из цифр. Если строка валидная, то метод удаляет
// все пробелы из строки, если таковые имеются. Метод возвращает
// обработанную строку, в которой нет нулей. Если в строке не было нулей,
// метод возвращает сообщение “This is a valid string”.
//Test Data:
// “3504209706040000 “ →  “35429764“
//“0000000111“ → “111”

    public String removeAllZeros(String str) {
        if (isStringNotNullAndNotEmpty(str)) { //валидация на пустую строку
            if (str.contains("0")) { //валидация на содержание 0 в строке
                int count = 0;
                for (int i = 0; i < str.length(); i++) { //валидация на отсутствие символов
                    if (str.charAt(i) >= '0' && str.charAt(i) <= '9' || str.charAt(i) == ' ') {
                        count++;
                    }
                }
                if (count < str.length()) {

                    return "String is contain some letter or symbol";

                } else

                    return str.replace("0", "").trim(); //удаление внешних пробелов и 0-лей в строке
            }

            return "This is a valid string";

        }

        return "String is empty";

    }

    public String removeAllZeros1(String str) {
      if(isStringNotNullAndNotEmpty(str));
            if (str.contains("0")) { //валидация на содержание 0 в строке
                int count = 0;
                for (int i = 0; i < str.length(); i++) { //валидация на отсутствие символов
                    if (str.charAt(i) >= '0' && str.charAt(i) <= '9' || str.charAt(i) == ' ') {
                        count++;
                    }
                }
                if (count < str.length()) {

                    return "String is contain some letter or symbol";

                } else

                    return str.replace("0", "").trim(); //удаление внешних пробелов и 0-лей в строке
            }

            return "This is a valid string";

        }


    public String removeAllSpaces(String text) {
//        Написать алгоритм removeAllSpaces.
//   С помощью методов из видео1,  написать алгоритм,
//   который принимает на вход строку. Если строка валидная, то метод удаляет
//   все пробелы из строки, если таковые имеются.
//   Метод возвращает обработанную строку.
//        Test Data:
// “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
//“p a     n   d a   “ → “panda”

        if (!text.isEmpty()) {

            return text.replace(" ", "");

        }
        return "";
    }
    //Напишите метод countAs(), который принимает на вход строку и считает,
    // сколько букв а или А содержится в строке. Метод возвращает количество
    // букв a/A,  и количество букв/знаков в слове без букв a/A.
    // Итоговый результат должен строится с помощью метода из видео 2.
    //Test Data:
    //“Abracadabra” → “5, 6”
    //“Homenum Revelio” → “0, 15”
    //“3 tarAmasAlatA” → “6, 8”

    public String countAs(String text) {
        if (isStringNotNullAndNotEmpty(text)) {
                String textNew = text.trim().toLowerCase().replace("a", "");
                int count = text.length() - textNew.length();
                String result = count + ", " + textNew.length();
                return result;
            }

        return "";
    }

    public String countAs1(String text) {
        if (text != null) {
            if (!text.isEmpty()) {
                String[] arr = text.trim().toLowerCase().split("");
                int counter = 0;
                int counter2 = 0;
                String result = "";
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].equals("a")) {
                        counter++;
                    } else {
                        counter2++;
                    }
                }

                if (counter + counter2 == text.trim().length()) {
                    return result = String.valueOf(counter).concat(", ").concat(String.valueOf(counter2));
                }
            }
            return "";
        }
        return null;
    }

    public String countAs2(String text) {
        if (text != null && !text.isEmpty()) {
                text = text.trim().toLowerCase();
                int counter = 0;
                int counter2 = 0;

                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i)== ('a')) {
                        counter++;
                    } else {
                        counter2++;
                    }
                }

                if (counter + counter2 == text.trim().length()) {
                    return String.valueOf(counter).concat(", ").concat(String.valueOf(counter2));
                }
            }

        return "";
    }
    //Напишите метод countJava(), который принимает на вход текст и проверяет,
    // содержится ли в тексте хотя бы одно слово Java.
    //Test Data:
    //“As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8
    // are the current long-term support (LTS) versions.
    // Oracle released the last zero-cost public update for the legacy
    // version Java 8 LTS in January 2019 for commercial use, although it will
    // otherwise still support Java 8 with public updates for personal use indefinitely.
    // Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11
    // that are still receiving security and other upgrades.” → true
    //
    //“99 little bugs in a code.
    //99 little bugs in a code.
    //Take one down, and patch it around.
    //235 critical bugs in the code.” → false

    public  boolean countJava(String text){

        if(!text.isEmpty()){
            if (text.contains("Java")){

                return true;
            }

            return false;
        }

        return false;
    }

    public static boolean countWordInText(String text, String word){

        if(!text.isEmpty()){
            if (text.contains(word)){

                return true;
            }

            return false;
        }

        return false;
    }

    //Напишите метод insertQuotes(), который принимает слово и возвращает строку,
    // в которой это слово “обернуто” в кавычки:
    //Test Data:
    //“Abracadabra” →  ““Abracadabra””
    public String insertQuotes(String text){
        if(!text.isEmpty()){
            //символ экранирования
            String textNew = "\""+ text + "\"";
            return textNew;
        }

        return "";
    }
// Напишите метод insertQuotes(), который принимает на вход две строки,
// и добавляет знак :  после слова “писал”,  и оборачивает в кавычки вторую строку
//(результат строится с помощью метода concat())
//
//Test Data:
//“Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
//“Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
//Задание со звездочкой:
//“Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
//"Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""

    public  String insertQuotes(String text, String text2){

        if(isStringNotNullAndNotEmpty(text) && isStringNotNullAndNotEmpty(text2)){
            String textNew = text.replace("\",", ": ");
            // String textNew21 = text2.replace("\"No\"", "\"No\"");
            String textNew2 = text2.replace("\"Надо любить жизнь больше, чем смысл жизни\"", "\"Надо любить жизнь больше, чем смысл жизни.\"");

            return textNew.concat(textNew2).concat("\"");
        }

        return "";
    }
//Напишите метод, кторый принимает на вход название города и исправляет написание:
//Test Data:
//“ташкент” → “Ташкент”
//“ЧикаГО” → “Чикаго”
    public String changeLetterCase(String text){
        if(!text.isEmpty()){
            String text1 = "" + text.toUpperCase().charAt(0) + text.toLowerCase().substring(1);

            return text1;
        }

        return "";
    }

    //Напишите метод, который принимает на вход строку и букву-параметр,
    // и возвращает все, что находится между первой и последней буквой-параметром:
    //Test Data:
    //“Abracadabra”, “b” → “bracadab”
    //“Whippersnapper”, “p” → “ppersnapp”
    public String useIndexOfAndLastIndexOfMethod(String text, String letter){
        if(!text.isEmpty() && !letter.isEmpty()){
            String textNew =  text.substring(text.indexOf(letter), text.lastIndexOf(letter)+1);
        // text.lastIndexOf(letter)+1)  - "+1" т.к метод не влючит последний раз, когда использовалась буква
            return textNew;
        }
        return "";
    }
//Напишите метод, который принимает на вход слово, и возвращает true,
// если слово начинается и заканчивается на одинаковую букву, и false иначе
    public boolean isSameFirstLastLetterIndexOf(String str){
        if (str!= null && !str.trim().isEmpty() && !str.trim().contains(" ")) {
            str = str.trim().toLowerCase();// всегда сначала trim

            return str.lastIndexOf(str.charAt(0)) == (str.length()-1);
            //взяли последн. индекс строки  буквы  и она же находится на последнем индексе слова
            // str.charAt(0) - первая буква слова
        }
        return false;
    }

    //Напишите метод, который принимает на вход слово, и возвращает true,
    // если слово начинается и заканчивается на одинаковую букву, и false иначе
    //Test Data:
    //	“Abracadabra” → true
    //	“Whippersnapper” → false

    public boolean isFirstAnaLastLetterEqual(String word){
        if(!word.isEmpty()){
            if(word.toLowerCase().charAt(0) == word.toLowerCase().charAt(word.length()-1)){

                return true;
            }

            return false;
        }
        return false;
    }

    public boolean isFirstAnaLastLetterEqual_1(String word){
        if(!word.isEmpty()){
            if(word.toLowerCase().indexOf(0) == word.toLowerCase().indexOf(word.length()-1)){

                return true;
            }

            return false;
        }
        return false;
    }

    //Напишите метод, который принимает на вход строку из двух слов,
    // разделенных пробелом, и возвращает последнее слово
    //Test Data:
    //	“Red Rover” → “Rover”
    public String useSubstringMethod(String text){
        if(!text.isEmpty()){

            return text.substring(4);
        }

        return "";
    }
    //Написать метод, который принимает строку, и 2 индекса.
    // Метод удаляет все, что находится между двумя индексами включительно
    //Test Data:
    //	“Red rover”, 1, 4 → “Rover”
    public  String useSubstringMethodExcludeText(String text, int index1, int index2){
        if(!text.isEmpty()){

            String text1 = text.substring(index1, (index2+1));
            // +1, т.к метод использует второй индекс не включительно (а первый включительно)
            // мы создаем переменную, в которую записываем, что нужно удалить
            // затем заменяем это на ""
            return text.replace(text1, "");
        }

        return "";
    }

    //Напишите метод, который принимает на вход предложение и
    // возвращает слова из этого предложения в виде массива слов
    //Test Data:
    //“QA for Everyone” → {“QA”, “for”, “Everyone”}
    //“Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}

    public String [] useSplitMethodToReturnArrayOfWords(String text) {
        // String[] array = new String[0];
        String[] array = new String[0];
        if (isStringNotNullAndNotEmpty(text)) {
            array = text.split(" ");
            for (int i = 0; i < array.length; i++) {

            }

        }
        return array;
    }

    //Написать метод, который принимает на вход предложение,
    // которое состоит из имени, фамилии, отчества и возвращает текст:
    //Test Data:
    //“Александр Сергеевич Пушкин” →
    //
    //“Имя: Александр
    //Отчество: Сергеевич
    //Фамилия: Пушкин”
    public String useSplitMethodToReturnArrayOfFirstMiddleLastNames(String text) {
        // String[] array = new String[0];
        String name = "Имя: ";
        String middlename = "Отчество: ";
        String lastName = "Фамилия: ";

        String newText = "";
        if (isStringNotNullAndNotEmpty(text)) {

            String[] array = text.split(" ");
            for (int i = 0; i < text.length(); i++) {
                newText = name + array[i] + "\n";
            }

        }
        return newText;
    }

//    public String insertQuotesInDirectSpeech(String text1, String text2) {
//        if (text1 != null && text2 != null && !text1.trim().isEmpty() && !text2.trim().isEmpty()) {
//
//            if (text1.contains("писал") && text1.lastIndexOf("писал") == text1.indexOf("писал")
//                    || (text1.trim().contains("U+00AB") && text1.trim().contains("U+00BB"))) {
//
//                return text1.trim()
//                        .concat(": ")
//                        .concat("\"")
//                        .concat(text2.trim())
//                        .concat("\"")
//                        .replace("U+00AB", "\"")
//                        .replace("U+00BB", "\"");
//
//            } else {
//
//                return text2.trim()
//                        .concat(": ")
//                        .concat("\"")
//                        .concat(text1.trim())
//                        .concat("\"")
//                        .replace("U+00AB", "\"")
//                        .replace("U+00BB", "\"");
//            }
//
//        }
//        return "String is empty";
//    }

    public static String printName (String str) {

        if (!str.trim().isEmpty() && !str.trim().isBlank()) {

            // remove punctuation and leading and trailing whitespaces
            str = str.replaceAll("\\p{Punct}","").trim();

            String [] nameArray = str.split(" ");

            // New array of keywords;
            String [] firstMiddleLastArr = {"First name: ", "Middle name: ", "Last name: "};
            // result string for name
            String personalData = "";

            for (int i = 0; i < firstMiddleLastArr.length; i++) {
                if (nameArray.length > i) {
                    personalData += firstMiddleLastArr[i] + nameArray[i] + "\n";
                } else {
                    personalData += firstMiddleLastArr[i] + "" + "\n";
                }
            }
            return personalData;
        }
        return "String is empty or blank";
    }



    //Написать метод, который принимает на вход слово и число n,
    // и возвращает строку, где слово повторяется n раз.
    //Test Data:
    //“one”, 5 → “oneoneoneoneone”

    public String stringMethodToRepeatWordNtimes(String text, int n){

        if(isStringNotNullAndNotEmpty(text) && n > 0) {
            text = text.repeat(n);
        }

        return text;
    }

    //Напишите метод, который принимает строку и index, и возвращает численное
    // значение буквы, которая находится на позиции index
    // (использовать только один метод класса String)

    public int findLetterUnderRequestedIndex(String text, int index){

        if(isStringNotNullAndNotEmpty(text) & index > 0) {

            text.indexOf(index);
        }

        return index;
    }

}