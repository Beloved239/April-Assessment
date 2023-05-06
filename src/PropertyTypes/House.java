package PropertyTypes;

import Util_PropertyCodeGenerator.PropertyCode;

/**
 * This is House Class  (sub-class of Property Class)
 */
public class House extends Property {
    private int numberOfFloors;
    private int yardSize;

    //Constructor, Getter and Setter Methods
    public House(String propertyType, String location, double bedrooms, double bathrooms, double rentPerMonth, boolean occupiedStatus, int numberOfFloors, int yardSize) {
        super(propertyType, location, bedrooms, bathrooms, rentPerMonth, occupiedStatus);
        this.numberOfFloors = numberOfFloors;
        this.yardSize = yardSize;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getYardSize() {
        return yardSize;
    }

    public void setYardSize(int yardSize) {
        this.yardSize = yardSize;
    }

    //Override method that generate propertyCode for House
    @Override
    public String getPropertyByPropertyCode() {
        return PropertyCode.generatePropertyCode("House");
    }
    //Override method that calculate rental income for House
    @Override
    public double getRentalIncomeForEachProperty() {
        return getRentPerMonth()*getBedrooms();
    }

    //This method display Properties from Property Class the Property Code,Amenities, number of Floors, Rental Income
    @Override
    public String toString() {
        return "House{" +
                super.toString()+
                "number Of Floors= " + numberOfFloors +
                ", yardSize= " + yardSize +
                ",Property Code= "+ getPropertyByPropertyCode()+
                ", Rental Income= "+ getRentalIncomeForEachProperty()+
                '}';
    }
}

