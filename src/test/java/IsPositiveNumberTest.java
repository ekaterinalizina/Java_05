import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {
    // Test data: 555, 0 и -555.
    //Positive testing happy path
    // if (num >= 0)
    // return true

    @Test

    public void testIsPositiveNumBiggerThenZero_HappyPath(){
        //Arrange
        int a = 555;
        boolean expectedResult = true;
        //Act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    //Positive testing happy path
    // if (num = 0)
    // return true

    @Test

    public void testIsPositiveNumEqualsZero_HappyPath(){
        //Arrange
        int a = 0;
        boolean expectedResult = true;
        //Act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Negative testing happy path
    // if (num = 0)
    // return true

    @Test

    public void testIsPositiveNumLessThanZero_NegativePath(){
        //Arrange
        int a = -555;
        boolean expectedResult = false;
        //Act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
