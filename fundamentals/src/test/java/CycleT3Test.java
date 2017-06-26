import org.junit.*;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class CycleT3Test {

  @Rule
  public ExpectedException expectedEx = ExpectedException.none();

  @Test
  public void testCalculate() throws Exception {
    assertTrue(CycleT3.calculate(2) - 0.349 < 0.000001);
  }


  @Test
  public void testCalculateCycleWrongParamZeroStep() throws Exception{
    expectedEx.expect(Exception.class);
    expectedEx.expectMessage("Value of step must be non-zero");
    CycleT3.calculateCycle(1, 4, 0);

  }

  @Test
  public void testCalculateCycleWrongParamBoundsAndPositiveStep() throws Exception{
    expectedEx.expect(Exception.class);
    expectedEx.expectMessage("A must be less or equal to B when step is positive");
    CycleT3.calculateCycle(7,4.9,0.3);

  }

  @Test
  public void testCalculateCycleWrongParamBoundsAndNegativeStep() throws Exception{
    expectedEx.expect(Exception.class);
    expectedEx.expectMessage("A must be bigger or equal to B when step is negative");
    CycleT3.calculateCycle(4.9,7,-0.3);

  }


  @Test
  public void testCalculateCycle() throws Exception {
    String result=CycleT3.calculateCycle(2.5, 4.5, 0.5);
    assertEquals(5,result.trim().split("\n").length);
    assertTrue(result.contains("-2,13"));
  }



}