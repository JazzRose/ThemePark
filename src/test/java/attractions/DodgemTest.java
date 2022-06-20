package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(5,150,5.00);
        visitor2 = new Visitor(60,200,15.00);
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
    public void getDefaultPrice(){
        assertEquals(4.50,dodgems.defaultPrice(),0.00);
    }
    @Test
    public void getPriceForYoungster(){
        assertEquals(2.25,dodgems.priceFor(visitor1),0.00);
    }

    @Test
    public void getPriceForGrandpa(){
        assertEquals(4.50,dodgems.priceFor(visitor2),0.00);
    }
}
