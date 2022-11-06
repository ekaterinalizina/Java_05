import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {
    ////Test Data:
    //    //{0, 1, 2, 3, 4, 5} → 15
    //    //{-7, -3} → -10
    //1.Positive testing Happy pass
    //if (array != null) {
    //return sum;

    @Test

    public void testArrayNotNull_HappyPath(){
        //Arrange
        int [] array = {0, 1, 2, 3, 4, 5};
        int  expectedResult = 15;
        //Act
        int actualResult = new SumArray().sumArray(array);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test

    public void testArrayNotNullNegativeNum_HappyPath(){
        //Arrange
        int [] array = {-7, -3};
        int  expectedResult = -10;
        //Act
        int actualResult = new SumArray().sumArray(array);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    //2.Negative testing NOT Happy pass
    //if (array = null) {
    //return 0;
    @Test

    public void testArrayNull_NegativePath(){
        //Arrange
        int [] array = null;
        int  expectedResult = 0;
        //Act
        int actualResult = new SumArray().sumArray(array);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    //Negative testing
    //array.length == 0
    //return 0
    @Test
    public void testEmptyArray_NegativePath(){
        //Arrange
        int [] array = {};
        int  expectedResult = 0;
        //Act
        int actualResult = new SumArray().sumArray(array);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
