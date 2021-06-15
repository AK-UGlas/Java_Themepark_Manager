package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    private Visitor olderVisitor;
    private Visitor youngerVisitor;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        olderVisitor = new Visitor(18, 205, 50);
        youngerVisitor = new Visitor(11, 90, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void isHalfPriceForUnderTwelves() {
        assertEquals(2.25, dodgems.priceFor(youngerVisitor), 0.01);
    }

    @Test
    public void isFullPriceForOverTwelves() {
        assertEquals(4.50, dodgems.priceFor(olderVisitor), 0.01);
    }
}
