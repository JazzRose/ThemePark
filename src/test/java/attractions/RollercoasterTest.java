package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(18,145,100.00);
        visitor2 = new Visitor(11,120,10.00);
        visitor3 = new Visitor(16,1150,20.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void notTallEnough(){
        assertEquals(false,rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void notOldEnough(){
        assertEquals(false,rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canRideTheRollerCoaster(){
        assertEquals(true,rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void priceForRide(){
        assertEquals(8.40,rollerCoaster.defaultPrice(),0.00);
    }

    @Test
    public void priceForRideTallPerson(){
        assertEquals(16.80,rollerCoaster.priceFor(visitor3),0.00);
    }


    @Test
    public void priceForRideShortPerson(){
        assertEquals(8.40,rollerCoaster.priceFor(visitor2),0.00);
    }
}
