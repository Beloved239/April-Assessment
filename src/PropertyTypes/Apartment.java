package PropertyTypes;

import Util_PropertyCodeGenerator.PropertyCode;

public class Apartment extends Property {
    /**
     * This is Apartment Class  (Sub-class of Property Class)
     */
    private double floorNumber;

    //Constructor, Getter and Setter Methods
    public Apartment(String propertyType, String location, double bedrooms, double bathrooms, double rentPerMonth,
                     boolean occupiedStatus, double floorNumber) {
        super(propertyType, location, bedrooms, bathrooms, rentPerMonth, occupiedStatus);
        this.floorNumber = floorNumber;
    }

    public double getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(double floorNumber) {
        this.floorNumber = floorNumber;
    }


    //override Method that calculate Rental Income for Apartment
    @Override
    public double getRentalIncomeForEachProperty() {
        return getRentPerMonth()* getBedrooms();
    }

    //override method that generates property code for Apartment
    @Override
    public String getPropertyByPropertyCode() {
        return  PropertyCode.generatePropertyCode("Apartment");
    }

    //This method display Properties from Property Class the Property Code, number of Floors, Rental Income
    @Override
    public String toString() {
        return  super.toString()+
                " floorNumber= " + floorNumber +
                ", Property Code= " + getPropertyByPropertyCode()+
                ", Rental Income= " + getRentalIncomeForEachProperty()+
                '}';
    }


}
