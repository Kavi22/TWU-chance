import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestChance {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnTrueWhenChancesEqual() {
        Chance chance1 = new Chance(20);
        Chance chance2 = new Chance(20);
        assertEquals(chance1, chance2);
    }

    @Test
    public void shouldReturnFalseWhenChancesNotEqual() {
        Chance chance1 = new Chance(20);
        Chance chance2 = new Chance(23);
        assertNotEquals(chance1, chance2);
    }

    @Test
    public void shouldReturnFalseWhenClassesNotEqual() {
        Chance chance1 = new Chance(20);
        Object object = new Object();
        assertNotEquals(chance1, object);

    }

    @Test
    public void shouldReturnOppositeChance() {
        Chance chance1 = new Chance(20);
        Chance chance2 = new Chance(80);
        assertEquals(chance2, chance1.opposite());
    }


}
