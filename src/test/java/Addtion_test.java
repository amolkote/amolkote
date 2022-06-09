import Calculation_program.Addition;
import static org.junit.Assert.*;
import org.junit.Test;
public class Addtion_test {

    /** test to check addion method

    */

@Test
    public void additionTest() {

        Addition add= new Addition();
    assertEquals(add.expectAnswerofAdditionMethood, add.addition(20,10));

    }











}
