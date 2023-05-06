package PropertyTypes;

/**
 * This is Property Class  (an Abstract class as well as supper-class for Apartment, Condo and House Classes)
 */

public abstract class Property {

    private String propertyType;
    private String location;
    private double bedrooms;
    private double bathrooms;
    private double rentPerMonth;
    private boolean occupiedStatus;

    //Constructor, Getter and Setter Methods
    public Property(String propertyType, String location, double bedrooms, double bathrooms, double rentPerMonth, boolean occupiedStatus) {
        this.propertyType = propertyType;
        this.location = location;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.rentPerMonth = rentPerMonth;
        this.occupiedStatus = occupiedStatus;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(double bedrooms) {
        this.bedrooms = bedrooms;
    }

    public double getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(double bathrooms) {
        this.bathrooms = bathrooms;
    }

    public double getRentPerMonth() {
        return rentPerMonth;
    }

    public void setRentPerMonth(double rentPerMonth) {
        this.rentPerMonth = rentPerMonth;
    }

    public boolean isOccupiedStatus() {
        return occupiedStatus;
    }

    public void setOccupiedStatus(boolean occupiedStatus) {
        this.occupiedStatus = occupiedStatus;
    }


    @Override
    public String toString() {
        return "Property{" +
                "propertyType='" + propertyType + '\'' +
                ", location='" + location + '\'' +
                ", bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                ", rentPerMonth=" + rentPerMonth +
                ", occupiedStatus=" + occupiedStatus +
                '}';
    }
    //Abstract method to get Property Code
    public abstract String getPropertyByPropertyCode();

    //Abstract method to generate rental income
    public abstract  double getRentalIncomeForEachProperty();

    public String getAddress() {
        return null;
    }

    public String getRent() {
        return null;
    }

    public boolean isOccupied() {
        return isOccupiedStatus();
    }

    public Object getPropertyCode() {
        return null;
    }
}

