import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	// @Test //pass
	// public void testReverseInPlace() {
  //   int[] input1 = { 3 };
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals(new int[]{ 3 }, input1);
	// }
  // @Test //fail 
  // public void testReverseInPlace1(){
  //   int[] input1={1, 2, 3};
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals( new int[] {3, 2, 1}, input1);
  // }
  // @Test //pass
  // public void testReverseInPlace2(){
  //   int[] input1={};
  //   ArrayExamples.reverseInPlace(input1);
  //   assertEquals( new int[] {}, input1);
  // }

  // @Test //pass
  // public void testReversed() {
  //   int[] input1 = { };
  //   assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  // }
  // @Test //fail 
  // public void testReversed1(){
  //   int [] input1={1, 2, 3};
  //   assertArrayEquals(new int[]{3, 2, 1 }, ArrayExamples.reversed(input1));
  // }
  // @Test //pass
  // public void testAverageWithoutLowest(){
  //   double[] input1={0.0};
  //   assertEquals( 0.0, ArrayExamples.averageWithoutLowest(input1), .0001);
  // }
  @Test//fail 
  public void testAverageWithoutLowest1(){
    double[] input1={3.0, 3.0, 3.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), .000001);
  }
}
