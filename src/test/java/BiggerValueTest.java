import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
    //    Test Data:
    //    3333, 9999
    //    Expected Result = 9999
    // Positive testing Happy Path
    //if(a < b)
    //return b;

    @Test
    public void testCheckBiggerNumber_HappyPath(){
        //Arrange
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;
        //act
        int actualResult = new BiggerValue().biggerValue(a, b);
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCheckEqualNumber_HappyPath(){
        //Arrange
        int a = 3333;
        int b = 3333;
        int expectedResult = 3333;
        //act
        int actualResult = new BiggerValue().biggerValue(a, b);
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }



}
