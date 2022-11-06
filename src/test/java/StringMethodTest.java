import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodTest {
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
    @Test
    public void removeSpacesTheSpacesRemoved_HappyPath(){
        String text = "    Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";
        String actualResult = new StringMethods().removeSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }
    //@Ignore
    @Test
    public void removeSpacesThereIsNoSpaces_HappyPath(){
        String text = "Red Rover School";
        String expectedResult = "Пробелов не было";
        String actualResult = new StringMethods().removeSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void removeSpacesTheEmptyLine_HappyPath(){
        String text = "";
        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test Data:
    // “    Red Rover School   “ →  “Red Rover School“
    @Test
    public void removeAllAsAndSpaces_HappyPath(){
        String text = "    Red Rover School   ";
        String expectedResult = "Red Rover School";
        String actualResult = new StringMethods().removeAllAs(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //“panda   “ → “pnd”
    //“taramasalata” → “trmslt”
    @Test
    public void removeAllAsAndSpaces_HappyPath2(){
        String text = "panda   ";
        String expectedResult = "pnd";
        String actualResult = new StringMethods().removeAllAs(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //“taramasalata” → “trmslt”
    @Test
    public void removeAllAsAndSpaces_HappyPath3(){
        String text = "taramasalata";
        String expectedResult = "trmslt";
        String actualResult = new StringMethods().removeAllAs(text);
        Assert.assertEquals(actualResult, expectedResult);
    }
    ///Test Data:
    //// “3504209706040000 “ →  “35429764“
    @Test
    public void removeAllZeros_HappyPath(){
       String text =  "3504209706040000 ";
       String expectedResult = "35429764";
       String actualResult = new StringMethods().removeAllZeros(text);
       Assert.assertEquals(actualResult, expectedResult);
    }

    ////“0000000111“ → “111”
    @Test
    public void removeAllZeros_HappyPath2(){
        String text =  "0000000111";
        String expectedResult = "111";
        String actualResult = new StringMethods().removeAllZeros(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    ////“0000,000111“ → “111”
    @Test
    public void removeAllZeros_HappyPath3(){
        String text =  "0000,000111";
        String expectedResult = "String is contain some letter or symbol";
        String actualResult = new StringMethods().removeAllZeros(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //        Написать алгоритм removeAllSpaces.
//   С помощью методов из видео1,  написать алгоритм,
//   который принимает на вход строку. Если строка валидная, то метод удаляет
//   все пробелы из строки, если таковые имеются.
//   Метод возвращает обработанную строку.
//        Test Data:
// “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
//“p a     n   d a   “ → “panda”
    @Test
    public void removeAllSpaces_HappyPath(){
        //  if(!text.isEmpty()){
        String text =  "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";
        String actualResult = new StringMethods().removeAllSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //“p a     n   d a   “ → “panda”
    @Test
    public void removeAllSpaces_HappyPath2(){
        //  if(!text.isEmpty()){
        String text =  "p a     n   d a   ";
        String expectedResult = "panda";
        String actualResult = new StringMethods().removeAllSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }


//Напишите метод countAs(), который принимает на вход строку и считает,
    // сколько букв а или А содержится в строке. Метод возвращает количество
    // букв a/A,  и количество букв/знаков в слове без букв a/A.
    // Итоговый результат должен строится с помощью метода из видео 2.
    //Test Data:
    //“Abracadabra” → “5, 6”
    //“Homenum Revelio” → “0, 15”
    //“3 tarAmasAlatA” → “6, 8”
    @Test
    public void countAs_HappyPath(){
        String text = "Abracadabra";
        String expectedResult = "5, 6";
        String actualResult = new StringMethods().countAs(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //“Homenum Revelio” → “0, 15”
    @Test
    public void countAs_HappyPath2(){
        String text = "Homenum Revelio";
        String expectedResult = "0, 15";
        String actualResult = new StringMethods().countAs(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //“3 tarAmasAlatA” → “6, 8”
    @Test
    public void countAs_HappyPath3(){
        String text = "3 tarAmasAlatA";
        String expectedResult = "6, 8";
        String actualResult = new StringMethods().countAs(text);
        Assert.assertEquals(actualResult, expectedResult);
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

    @Test
    public void countJava_HappyPath1(){
        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8\n" +
                "    // are the current long-term support (LTS) versions.\n" +
                "    // Oracle released the last zero-cost public update for the legacy\n" +
                "    // version Java 8 LTS in January 2019 for commercial use, although it will\n" +
                "    // otherwise still support Java 8 with public updates for personal use indefinitely.\n" +
                "    // Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11\n" +
                "    // that are still receiving security and other upgrades.";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().countJava(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //“99 little bugs in a code.
    //99 little bugs in a code.
    //Take one down, and patch it around.
    //235 critical bugs in the code.” → false

    @Test
    public void countJava_HappyPath2(){
        String text = "99 little bugs in a code.\n" +
                "    //99 little bugs in a code.\n" +
                "    //Take one down, and patch it around.\n" +
                "    //235 critical bugs in the code.";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().countJava(text);
        Assert.assertEquals(actualResult, expectedResult);
    }
    //Test универсальный метод

    @Test
    public void countWordInText_HappyPath1(){
        String word = "Java";
        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8\n" +
                "    // are the current long-term support (LTS) versions.\n" +
                "    // Oracle released the last zero-cost public update for the legacy\n" +
                "    // version Java 8 LTS in January 2019 for commercial use, although it will\n" +
                "    // otherwise still support Java 8 with public updates for personal use indefinitely.\n" +
                "    // Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11\n" +
                "    // that are still receiving security and other upgrades.";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().countWordInText(text, word);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Напишите метод insertQuotes(), который принимает слово и возвращает строку,
    // в которой это слово “обернуто” в кавычки:
    //Test Data:
    //“Abracadabra” →  ““Abracadabra””
    @Test
    public void insertQuotes_HappyPath(){
        String text = "Abracadabra";
        String expectedResult = "\"Abracadabra\"";
        String actualResult = new StringMethods().insertQuotes(text);
        Assert.assertEquals(actualResult, expectedResult);
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
    @Test
    public void insertQuotesWithTwoText_HappyPath(){

        String text = "\"Федор Достоевский писал\",";
        String text2 = "\"Надо любить жизнь больше, чем смысл жизни.\"";
        String expectedResult = "\"Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"\"";
        String actualResult = new StringMethods().insertQuotes(text, text2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void insertQuotesWithTwoText_HappyPath2(){

        String text = "\"Наполеон Бонапарт писал\",";
        String text2 = "\"В моем словаре нет слова \"невозможно\".\"";
        String expectedResult = "\"Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"\"";
        String actualResult = new StringMethods().insertQuotes(text, text2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Напишите метод, кторый принимает на вход название города и исправляет написание:
    //Test Data:
    //“ташкент” → “Ташкент”

    @Test
    public void changeLetterCase_HappyPath(){
        String text = "ташкент";
        String expectedResult = "Ташкент";
        String actualResult = new StringMethods().changeLetterCase(text);
        Assert.assertEquals(actualResult, expectedResult);
    }
    //“ЧикаГО” → “Чикаго”
    @Test
    public void changeLetterCase_HappyPath2(){
        String text = "ЧикаГО";
        String expectedResult = "Чикаго";
        String actualResult = new StringMethods().changeLetterCase(text);
        Assert.assertEquals(actualResult, expectedResult);
    }
    //Напишите метод, который принимает на вход строку и букву-параметр,
    // и возвращает все, что находится между первой и последней буквой-параметром:
    //Test Data:
    //“Abracadabra”, “b” → “bracadab”
    //“Whippersnapper”, “p” → “ppersnapp”

    @Test
    public void useIndexOfAndLastIndexOfMethod_HappyPath(){
        String text = "Abracadabra";
        String letter = "b";
        String expectedResult = "bracadab";
        String actualResult = new StringMethods().useIndexOfAndLastIndexOfMethod(text, letter);
        Assert.assertEquals(actualResult, expectedResult);
    }

//“Whippersnapper”, “p” → “ppersnapp”
    @Test
    public void useIndexOfAndLastIndexOfMethod_HappyPath2(){
        String text = "Whippersnapper";
        String letter = "p";
        String expectedResult = "ppersnapp";
        String actualResult = new StringMethods().useIndexOfAndLastIndexOfMethod(text, letter);
        Assert.assertEquals(actualResult, expectedResult);
}

    //Напишите метод, который принимает на вход слово, и возвращает true,
    // если слово начинается и заканчивается на одинаковую букву, и false иначе
    //Test Data:
    //	“Abracadabra” → true
    @Test
    public void isFirstAnaLastLetterEqual_HappyPath(){
        String text = "Abracadabra";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().isFirstAnaLastLetterEqual(text);
        Assert.assertEquals(actualResult, expectedResult);
    }
//	“Whippersnapper” → false
    @Test
    public void isFirstAnaLastLetterEqual_HappyPath2(){
        String text = "Whippersnapper";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().isFirstAnaLastLetterEqual(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //public boolean isSameFirstLastLetterIndexOf(String str){
    //        if (str!= null && !str.trim().isEmpty() && !str.trim().contains(" ")) {
    //Test Data:
    //	“Abracadabra” → true

    @Test
    public void isSameFirstLastLetterIndexOfNotNull_HappyPath1(){
        //Arrange
        String text = "Abracadabra";
        boolean expectedResult = true;
        //Act
        boolean actualResult = new StringMethods().isSameFirstLastLetterIndexOf(text);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    //	“Whippersnapper” → false
    @Test
    public void isSameFirstLastLetterIndexOfNotNull_HappyPath2(){
        //Arrange
        String text = "Whippersnapper";
        boolean expectedResult = false;
        //Act
        boolean actualResult = new StringMethods().isSameFirstLastLetterIndexOf(text);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Напишите метод, который принимает на вход строку из двух слов,
    // разделенных пробелом, и возвращает последнее слово
    //Test Data:
    //	“Red Rover” → “Rover”

    @Test
    public void useSubstringMethod_HappyPath1(){
        String text = "Red Rover";
        String expectedResult = "Rover";
        String actualResult = new StringMethods().useSubstringMethod(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Написать метод, который принимает строку, и 2 индекса.
    // Метод удаляет все, что находится между двумя индексами включительно
    //Test Data:
    //	“Red rover”, 1, 4 → “Rover”
    @Test
    public void useSubstringMethodExcludeText_HappyPath1(){
        String text = "Red Rover";
        int index1 = 1;
        int index2 = 4;
        String expectedResult = "Rover";
        String actualResult = new StringMethods().useSubstringMethodExcludeText(text, index1, index2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения в виде массива слов
//Test Data:
//“QA for Everyone” → {“QA”, “for”, “Everyone”}
//“Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}

    @Test
    public void testUseSplitMethodToReturnArrayOfWords_HappyPath(){
        String text = "QA for Everyone";
        String [] expectedResult = {"QA", "for", "Everyone"};
        String [] actualResult = new StringMethods().useSplitMethodToReturnArrayOfWords(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //“Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}

    @Test
    public void testUseSplitMethodToReturnArrayOfWords_HappyPath2(){
        String text = "Александр Сергеевич Пушкин";
        String [] expectedResult = {"Александр", "Сергеевич", "Пушкин"};
        String [] actualResult = new StringMethods().useSplitMethodToReturnArrayOfWords(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Написать метод, который принимает на вход слово и число n,
    // и возвращает строку, где слово повторяется n раз.
    //Test Data:
    //“one”, 5 → “oneoneoneoneone”

    @Test
    public void testStringMethodToRepeatWordNtimes_HappyPath1(){
        String text = "one";
        int n = 5;
        String expectedResult = "oneoneoneoneone";
        String actualResult = new StringMethods().stringMethodToRepeatWordNtimes(text, n);
        Assert.assertEquals(actualResult, expectedResult);
    }




}
