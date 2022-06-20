package stalls;

public class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getRating() {
        return 0;
    }
}
