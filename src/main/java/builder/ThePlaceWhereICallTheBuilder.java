package builder;

public class ThePlaceWhereICallTheBuilder {
    public ThePlaceWhereICallTheBuilder() {

    }

    public void run() {
        //This is what a regular construction would look like
        //House house = new House("69 Dingo Cove", 2, 3, null, true)

        House house = new House.Builder()
                .atAddress("69 Dingo Cove")
                .withNumberOfFloors(2) //very obvious what we are setting
                .withNumberOfBathrooms(3)
                .hasGarage(true)
                .build();
    }
}
