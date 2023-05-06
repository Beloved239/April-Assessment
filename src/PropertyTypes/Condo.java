package PropertyTypes;

import Util_PropertyCodeGenerator.PropertyCode;

/**
 * This is Condo Class  (sub-class of Property Class)
 */
public class Condo extends Property {
    private int numberOfFloors;
    private final String amenities= "Pool, Gym";

    //Constructor, Getter and Setter Methods
    public Condo(String propertyType, String location, double bedrooms, double bathrooms, double rentPerMonth, boolean occupiedStatus, int numberOfFloors) {
        super(propertyType, location, bedrooms, bathrooms, rentPerMonth, occupiedStatus);
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getAmenities() {
        return amenities;
    }

    //Method to generate Property Code for Condo Property
    @Override
    public String getPropertyByPropertyCode() {
        return PropertyCode.generatePropertyCode("Condo");
    }

    //Override method to generate rental Income for Condo
    @Override
    public double getRentalIncomeForEachProperty() {
        return getRentPerMonth()*getNumberOfFloors();
    }

    //This method display Properties from Property Class the Property Code,Amenities, number of Floors, Rental Income
    @Override
    public String toString() {
        return "Condo{" +
                super.toString()+
                "numberOfFloors=" + numberOfFloors +
                ", amenities='" + amenities + '\'' +
                ",Property Code= " + getPropertyByPropertyCode()+
                ", Rental Income= " + getRentalIncomeForEachProperty()+
                '}';
    }
}

