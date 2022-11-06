import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEventValuesInArrayTest {
    //positive testing happy path
    //(arrayInt[i] % 2 ==0)
    //return int [] ={countEven, countOdd};

    @Test
     public void countEvenOddValuesInArrayTest_HappyPath() {


        int[] arr = {1, 3, 5, 6, 4};
        int[] expectedResult = {2, 3};
        int[] actualResult = new OddEvenValuesInArray().countOddEvenValuesInArray(arr);
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
