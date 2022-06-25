package homework.section28;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class BasicMathTest {

  private static BasicMath basicMath = null;

  @BeforeClass
  public static void initBasicMath() {
    basicMath = new BasicMath();
  }

  @Test
  public void add() {
    assertEquals(10, basicMath.add(7, 3));
  }

  @Test
  public void sub() {
    assertEquals(4, basicMath.sub(7, 3));
  }

  @Test
  public void add2() {
    assertEquals(10, basicMath.add(3, 7));
  }

  @Test
  public void sub2() {
    assertEquals(-4, basicMath.sub(3, 7));
  }
}