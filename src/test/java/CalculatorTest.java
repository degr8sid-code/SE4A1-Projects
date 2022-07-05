import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class CalculatorTest {

    @Test
    public void testAdd1() {
        Assertions.assertEquals(Calculator.add(1,3), 4);
        System.out.println("Addition Test Case 1 Status: Pass");
    }
    @Test
    public void testAdd2() {
        Assertions.assertEquals(Calculator.add(290,210), 500);
        System.out.println("Addition Test Case 2 Status: Pass");
    }

    @Test
    public void testMul1() {
        Assertions.assertEquals(Calculator.mul(2,3), 6);
        System.out.println("Multiplication Test Case 1 Status: Pass");
    }

    @Test
    public void testMul2() {
        Assertions.assertEquals(Calculator.mul(20,3), 60);
        System.out.println("Multiplication Test Case 2 Status: Pass");
    }

    @Test
    public void testSub1() {
        Assertions.assertEquals(Calculator.sub(10,2), 8);
        System.out.println("Subtraction Test Case 1 Status: Pass");
    }
    @Test
    public void testSub2() {
        Assertions.assertEquals(Calculator.sub(100,20), 80);
        System.out.println("Subtraction Test Case 2 Status: Pass");
    }

    @Test
    public void testDiv1() {
        Assertions.assertEquals(Calculator.div(10,2), 5);
        System.out.println("Division Test Case 1 Status: Pass");
    }
    @Test
    public void testDiv2() {
        Assertions.assertEquals(Calculator.div(100,20), 5);
        System.out.println("Division Test Case 2 Status: Pass");
    }


}
