import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    ArrayList attractions;
    ArrayList stalls;

    Dodgems dodgems;
    Park park;
    RollerCoaster rollerCoaster;
    Playground playground;

    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    CandyflossStall candyflossStall;


    @Before
    public void before(){

        dodgems = new Dodgems("Dodgems",4);
        rollerCoaster = new RollerCoaster("RollerCoaster",5);
        park = new Park("Park",2);
        playground = new Playground("Playground",1);

        candyflossStall = new CandyflossStall("Candy","Jazz", ParkingSpot.A1,3);
        tobaccoStall = new TobaccoStall("SirBaccaLot","John", ParkingSpot.A4,10);
        iceCreamStall = new IceCreamStall("Mr Whipsy","Stuart", ParkingSpot.B1,7);

        attractions = new ArrayList<>(
                Arrays.asList(dodgems,rollerCoaster,park,playground)
        );
       stalls = new ArrayList<>(
                Arrays.asList(iceCreamStall,tobaccoStall,candyflossStall)
        );

        themePark = new ThemePark();
    }

    @Test
    public void attractionsHasLength(){
        assertEquals(4,themePark.getAttractionsLength(attractions));
    }

    @Test
    public void stallsHasLength(){
        System.out.println(stalls);
        assertEquals(3,themePark.getAttractionsLength(stalls));
    }

    @Test
    public void allAttractionsHasLength(){
        System.out.println(themePark.getAllReviewed(stalls,attractions));
        assertEquals(7,themePark.getAllReviewedLength(stalls,attractions));
    }
}
