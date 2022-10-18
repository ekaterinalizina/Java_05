import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {
     //1.Positive testing Happy path
    //if (start <= end)первое условие
    // return array
    //1 scenario: start < end

    @Test

    public void testStartLessThanEnd_HappyPath () {
        //AAA
        //Arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz",
                "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14",
                "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"}; //должен быть стринг.

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); // статичные методы можно вызывать по классу
                                                                    //т.к FizzBuzz не статичный, то нужно создать объект
        // FizzBuzz fizzBuzz = new FizzBuzz(); "new FizzBuzz" - это конструктор по умолчанию
        // объект создается справой стороны после = new FizzBuzz();
        // т.к нам не нужна ссылка  на объект мы берем только правую часть

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
        // именно TestNG assert обычно сначала actualRes, then expectRes
    }

    //Start = end
    @Test
    public void testStartEqualsEnd_HappyPath () {
        //AAA
        //Arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"}; //должен быть стринг.

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

   // @ и вызываем Ignore, если не доработали тест
    @Test
    //start < end
    //прописать Экспектед задом наперед
    public void testStartLessThanEnd_StartEndAreNegativeHappyPath () {
        //AAA
        //Arrange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16",
                "FizzBuzz", "-14", "-13", "Fizz", "-11", "Buzz", "Fizz", "-8", "-7",
                "Fizz", "Buzz", "-4", "Fizz", "-2", "-1"}; //должен быть стринг.

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); // статичные методы можно вызывать по классу
        //т.к FizzBuzz не статичный, то нужно создать объект
        // FizzBuzz fizzBuzz = new FizzBuzz(); "new FizzBuzz" - это конструктор по умолчанию
        // объект создается справой стороны после = new FizzBuzz();
        // т.к нам не нужна ссылка  на объект мы берем только правую часть

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
        // именно TestNG assert обычно сначала actualRes, then expectRes
    }

    //2. Negative testing
    // if (start > end) меняем условие
    //return new String[0];

    @Test
    public void testStartGreaterThanEnd_NegativeTest () {
        //AAA
        //Arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {}; //должен быть стринг.// тест сначала проверяет по размеру size

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
