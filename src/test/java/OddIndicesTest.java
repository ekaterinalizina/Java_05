import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}
    //1.Positive testing Happy path
    //if (array != null && array.length > 0)
    // return newArray;

    @Test
    public void testNotNullArrayOddIndices_HappyPath(){
        // Arrange

        int [] array = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult = {590, 985, 68};
        //Act
        // OddEven     odEven       = new OddEven(); объект класса
        //Тип данных | переменная | объект с помощью конструктора
        int [] actualResult = new OddIndices().oddIndices(array);//вызываем метод через объект класса
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2.Negative testing Not happy path
    //if (array = null )
    //return new int [0];

    @Test
    public void testNullArrayOddIndices_NegativePath(){
        // Arrange

        int [] array = null;
        int [] expectedResult = {};
        //Act
        // OddEven     odEven       = new OddEven(); объект класса
        //Тип данных | переменная | объект с помощью конструктора
        int [] actualResult = new OddIndices().oddIndices(array);//вызываем метод через объект класса
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2.Negative testing Not happy path
    //if (array = null )
    //return new int [0];

    @Test
    public void testEmptyArrayOddIndices_NegativePath(){
        // Arrange

        int [] array = {};
        int [] expectedResult = {};
        //Act
        // OddEven     odEven       = new OddEven(); объект класса
        //Тип данных | переменная | объект с помощью конструктора
        int [] actualResult = new OddIndices().oddIndices(array);//вызываем метод через объект класса
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
