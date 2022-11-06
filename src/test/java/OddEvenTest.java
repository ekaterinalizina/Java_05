import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {
    //1.Positive testing Happy path
    //if (num % 2 == 0)первое условие
    // return "Even"
    //Test Data:
    //-345 →  “Odd”
    //0 →  “Even”
    //222222 →  “Even”
    @Test

    public void testNumberIsEven_HappyPath(){
    // Arrange

        int num = 0;
        String expectedResult = "Even";
    //Act
       // OddEven     odEven       = new OddEven(); объект класса
        //Тип данных | переменная | объект с помощью конструктора
        String actualResult = new OddEven().oddEven(num);//вызываем метод через объект класса
    //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2.Positive testing Happy path
    //if (num % 2 != 0)второе условие
    // return "Odd"

    @Test

    public void testNumberIsOdd_HappyPath(){
        // Arrange
        int num = -345;
        String expectedResult = "Odd";
        //Act
        // OddEven     odEven       = new OddEven(); объект класса
        //Тип данных | переменная | объект с помощью конструктора
        String actualResult = new OddEven().oddEven(num);//вызываем метод через объект класса
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test

    public void testNumberIsEven_HappyPath2(){
        // Arrange

        int num = 222222;
        String expectedResult = "Even";
        //Act
        // OddEven     odEven       = new OddEven(); объект класса
        //Тип данных | переменная | объект с помощью конструктора
        String actualResult = new OddEven().oddEven(num);//вызываем метод через объект класса
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
