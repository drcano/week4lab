import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] testArr = {0,1,2,3,4,5}; 
    int[] rev = {5,4,3,2,1,0}; 
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(testArr);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(testArr, rev);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] testArr = {0,1,2,3,4,5}; 
    int[] rev = {5,4,3,2,1,0};
    testArr = ArrayExamples.reversed(testArr); 
    assertArrayEquals(testArr, rev);
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
}
