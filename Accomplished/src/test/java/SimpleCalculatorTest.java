import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    SimpleCalculator simpleCalculator;

    @BeforeEach
    public void setup(){
        simpleCalculator = new SimpleCalculator();
    }

    @Test
    @DisplayName("Two plus two should equal four")
    void twoPlusTwoShouldEqualFour() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(4, simpleCalculator.add(2, 2));
    }

    @Test
    @DisplayName("Three plus three should equal to six")
    void threePlusThreeShouldEqualSix() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(6, simpleCalculator.add(3, 3));
    }
}