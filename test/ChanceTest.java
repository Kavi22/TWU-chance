
import com.company.Chance;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ChanceTest {
    @Test
    public void shouldReturnTrueForEqualsIfItHasTheSameValue(){
        Chance chance = new Chance (0.4);
        Chance anotherChance = new Chance(0.4);
        assertEquals(chance, anotherChance);
    }

    @Test
    public void shouldReturnFalseForEqualsIfItDoesNotHaveTheSameValue(){
        Chance chance = new Chance (0.4);
        Chance anotherChance = new Chance(0.6);
        assertNotEquals(chance, anotherChance);
    }

    @Test
    public void shouldReturnComplimentaryNumber(){
        Chance chance = new Chance(0.1);
        Chance actualResult = chance.complimentaryNumber();
        Chance expectedResult = new Chance(0.9);
        assertEquals(actualResult, expectedResult);
    }
}