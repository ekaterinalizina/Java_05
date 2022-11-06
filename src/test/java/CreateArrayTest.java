import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {
    @Test
    public void multipleOfTest_HappyPath(){
        int number = 3;
        int [] expectedResult = {0, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30};

        int [] actualResult = new CreateArray().multipleOf(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
