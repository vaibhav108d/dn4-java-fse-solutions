import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionTest {

    @Test
    public void testAssertions() {
        System.out.println("Running testAssertions...");

        // Assert equals
        assertEquals(5, 2 + 3);
        System.out.println("assertEquals passed");

        // Assert true
        assertTrue(5 > 3);
        System.out.println("assertTrue passed");

        // Assert false
        assertFalse(5 < 3);
        System.out.println("assertFalse passed");

        // Assert null
        Object obj1 = null;
        assertNull(obj1);
        System.out.println("assertNull passed");

        // Assert not null
        Object obj2 = new Object();
        assertNotNull(obj2);
        System.out.println("assertNotNull passed");
    }
}
