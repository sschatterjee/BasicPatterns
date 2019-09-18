package builder;

public class House {

    //@Nonnull
    private String address;

    private Integer floors;
    private Integer bathrooms;
    private Float squareFootage;
    private Boolean hasGarage;


    private House(String address, Integer floors, Integer bathrooms, Float squareFootage, Boolean hasGarage) {
        this.address = address;
        this.floors = floors;
        this.bathrooms = bathrooms;
        this.squareFootage = squareFootage;
        this.hasGarage = hasGarage;
    }

    public static class Builder {
        private String address = null;
        private Integer floors = null;
        private Integer bathrooms = null;
        private Float squareFootage = null;
        private Boolean hasGarage = null;

        public Builder atAddress(String address) {
            this.address = address;
            return this; //returning the Builder allows us to chain calls
        }

        public Builder withNumberOfFloors(int numberOfFloors) {
            floors = numberOfFloors;
            return this;
        }

        public Builder withNumberOfBathrooms(int bathrooms) {
            this.bathrooms = bathrooms;
            return this;
        }

        public Builder withSquareFootage(float squareFootage) {
            this.squareFootage = squareFootage;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            if (address == null || address.isBlank())
                throw new IllegalStateException("Address must be set");

            return new House(address, floors, bathrooms, squareFootage, hasGarage);
        }
    }
}
