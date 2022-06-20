
import attractions.*;
import behaviours.IReviewed;
import org.w3c.dom.Attr;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.Stall;
import stalls.TobaccoStall;

import java.util.ArrayList;
import java.util.Arrays;

    public class ThemePark {

        private ThemePark themepark;

        private ArrayList<Attraction> attractions;
        private ArrayList<Stall> stalls;

        private Dodgems dodgems;
        private Park park;
        private RollerCoaster rollerCoaster;
        private Playground playground;

        private IceCreamStall iceCreamStall;
        private TobaccoStall tobaccoStall;
        private CandyflossStall candyflossStall;


        public ThemePark() {

            this.attractions = new ArrayList<>(
                    Arrays.asList(dodgems, rollerCoaster, park, playground)
            );
            this.stalls = new ArrayList<>(
                    Arrays.asList(iceCreamStall, tobaccoStall, candyflossStall)
            );

        }

        public int getAttractionsLength(ArrayList type) {
            return type.size();
        }

        public ArrayList getAllReviewed(ArrayList stalls,ArrayList attractions) {
            ArrayList allReviewed = new ArrayList<IReviewed>();
            for (Object stall: stalls)
                allReviewed.add(stall);
            for(Object attraction: attractions)
                allReviewed.add(attraction);

            return allReviewed;
            }


        public int getAllReviewedLength(ArrayList stalls, ArrayList attractions) {
            return getAllReviewed(stalls,attractions).size();


        }
    }


