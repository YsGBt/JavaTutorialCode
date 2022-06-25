package homework.section28;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class BasicMathTest2 {

  private static BasicMath basicMath = null;

  @BeforeClass
  public static void initBasicMath() {
    basicMath = new BasicMath();
  }

  @Test
  public void multiply() {
    assertEquals(0, basicMath.multiply(10, 0));
  }

  @Test(expected = ArithmeticException.class)
  public void divide() {
    basicMath.divide(1, 0);
  }

  @Test
  public void multiply2() {
    assertEquals(21, basicMath.multiply(7, 3));
  }

  @Test
  public void divide2() {
    assertEquals(2, basicMath.divide(7, 3));
  }
}