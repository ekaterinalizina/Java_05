import org.testng.Assert;
import org.testng.annotations.Test;

public class ConditionalActionsTest {
    //1. Positive test Happy path
//    if (m % 7 == 0 && m % 9 == 0){
//        return "Good Number";
    @Test
    public void testNumberIsMultipleOfTwoDifferentNumbers_HappyPath(){
        int a = 63;
        String expectedResult = "Good Number";

        String actualResult = new ConditionalActions().conditionalActions(a);

        Assert.assertEquals(actualResult, expectedResult);
    }
    //If M is only multiple of 9 and not of 7  then return "Bad Number"
    @Test
    public void testNumberIsMultipleOfOneNumberAndNotAnother_HappyPath(){
        int a = 27;
        String expectedResult = "Bad Number";

        String actualResult = new ConditionalActions().conditionalActions(a);

        Assert.assertEquals(actualResult, expectedResult);
    }
    //If M is only multiple of 11 then return "Poor Number"
    @Test
    public void testNumberIsMultipleOfOneNumber_HappyPath(){
        int a = 122;
        String expectedResult = "Poor Number";

        String actualResult = new ConditionalActions().conditionalActions(a);

        Assert.assertEquals(actualResult, expectedResult);
    }
   // If M doesn't satisfy any of the above conditions then return "-1"
   @Test
   public void testNumberIsNotMultipleOfAnyMentionedNumbers_NegativePath(){
       int a = 15;
       String expectedResult = "-1";

       String actualResult = new ConditionalActions().conditionalActions(a);

       Assert.assertEquals(actualResult, expectedResult);
   }
}
