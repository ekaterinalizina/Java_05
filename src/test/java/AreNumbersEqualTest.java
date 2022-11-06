import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {
    //Test Data:
    //89, 89
    //Expected result: 0
    //-89, 89
    //Expected result: -1
    //89, -89
    //Expected result: 1

    //Positive testing happy path
    //if (a == b)
    //return 0;
    @Test
    public void testAreNumbersEqual_HappyPath(){
        //arrange
        int a = 89;
        int b = 89;
        int expectedResult = 0;
        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2.Negative testing happy path
    //if (a < b)
    //return -1;
    @Test
    public void testOneNumberIsGreater_NegativePath(){
        //arrange
        int a = -89;
        int b = 89;
        int expectedResult = -1;
        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    //if (a > b)
    //return 1;
    //2.Negative testing happy path
    //if (a < b)
    //return -1;
    @Test
    public void testOneNumberIsGreater_NegativePath2(){
        //arrange
        int a = 89;
        int b = -89;
        int expectedResult = -1;
        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
