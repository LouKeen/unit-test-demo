import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    Grader grader;

    @BeforeEach
    public void setup(){
        grader = new Grader();
    }

    @Test
    @DisplayName("Fifty nine should return F")
    void fiftyNineShouldReturnF(){
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    @DisplayName("Sixty nine should return D")
    void sixtyNineShouldReturnF(){
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    @DisplayName("Seventy nine should return C")
    void seventyNineShouldReturnF(){
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    @DisplayName("Eighty nine should return B")
    void eightyNineShouldReturnF(){
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    @DisplayName("Ninety nine should return A")
    void ninetyNineShouldReturnF(){
        assertEquals('A', grader.determineLetterGrade(99));
    }

    @Test
    @DisplayName("Negative one should return IllegalArgumentException")
    void negativeOneShouldReturnIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> {
            grader.determineLetterGrade(-1);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sampleData.csv")
    public void aboveNinetyShouldReturnA(int grade){
        assertEquals('A', grader.determineLetterGrade(grade));
    }
}