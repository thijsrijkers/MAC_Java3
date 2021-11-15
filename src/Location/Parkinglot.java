package Location;

public class Parkinglot {

    private int parkingSpaces;
    private int parkingLimit;

    public Parkinglot(int parkingLimit) {
        this.parkingSpaces = parkingLimit;
        this.parkingLimit = parkingLimit;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    //Values that needs to be giving are 1 OR -1
    public void setParkingSpaces(int value) {

        if(this.parkingSpaces > 0)
            this.parkingSpaces += value;
        else if(this.parkingSpaces < parkingLimit)
            this.parkingSpaces += value;

    }
}
