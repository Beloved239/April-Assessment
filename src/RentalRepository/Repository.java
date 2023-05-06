package RentalRepository;

import PropertyTypes.Apartment;
import PropertyTypes.Condo;
import PropertyTypes.House;
import PropertyTypes.Property;

/**
 * This is Repository Class where property types are stored in array.
 */
public class Repository {

        private Property[] properties;
        private int size;


        public Repository(int capacity) {
            this.properties = new Property[capacity];
            this.size = 0;
        }


        //This method create property in Repository
        public void createProperty(Property property) {
            if (size >= properties.length) {
                System.out.println("Cannot create new property because RentalRepository is full.");
                return;
            }
            properties[size] = property;
            size++;
            System.out.println("Property added successfully.");
        }

        //This method deletes property with property code
        public void deletePropertyByPropertyCode(String propertyCode){
            for (int i = 0; i < size; i++) {
                if (properties[i].getPropertyCode()==propertyCode){
                    properties[i] = properties[size - 1];
                    properties[size - 1] = null;
                    size--;
                    break;
                }
            }
            System.out.println("Property "+propertyCode+ " deleted successfully.");
        }

        //This method updates a new property in the repo
        public void updatePropertyUsingPropertyCode(String propertyCode, Property property){
            for (int i = 0; i < size; i++) {
                if (properties[i].getPropertyCode()==propertyCode){
                    properties[i]= property;
                    break;
                }
            }
            System.out.println("Property "+property+ "\n updated successfully.");
        }

        //This method display property by property code
        public void viewPropertyByPropertyCode(String propertyCode){
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (properties[i].getPropertyCode()==propertyCode){
                    System.out.println(properties[i].toString());
                    count++;
                }
            }
        }

        //This method display all properties in the repository
        public void viewAllApartments() {
            int count = 0;
            System.out.println("All Apartments in RentalRepository:");
            for (int i = 0; i < size; i++) {
                if (properties[i] instanceof Apartment) {
                    System.out.println(properties[i].toString());
                    count++;
                }
            }
            System.out.println("There are "+ count +" Apartments in the Repository");
        }

        //This method display all Houses in the Repository
        public void viewAllHouses() {
            int count =0;
            System.out.println("All Houses in RentalRepository:");
            for (int i = 0; i < size; i++) {
                if (properties[i] instanceof House) {
                    System.out.println(properties[i].toString());
                    count++;
                }
            }
            System.out.println("There are "+ count +"Houses in the Repository");
        }


    //This method display all Condos in the Repository
        public void viewAllCondos() {
            int count = 0;
            System.out.println("All Condos in RentalRepository:");
            for (int i = 0; i < size; i++) {
                if (properties[i] instanceof Condo) {
                    System.out.println(properties[i].toString());
                    count++;
                }
            }
            System.out.println("There are "+ count +"Condos in the Repository");
        }

    //This method display all Properties in the Repository
        public void viewAllProperties() {
            System.out.println("All Properties in RentalRepository:");
            for (int i = 0; i < size; i++) {
                System.out.println(properties[i].toString());
            }
        }
    //This method display all occupied Properties in the Repository
        public void viewOccupiedProperties() {
            System.out.println("All Occupied Properties in RentalRepository:");
            for (int i = 0; i < size; i++) {
                if (properties[i].isOccupied()) {
                    System.out.println(properties[i].toString());
                }
            }
        }
    //This method display all Unoccupied Properties in the Repository
        public void viewUnoccupiedProperties() {
            System.out.println("All Unoccupied Properties in RentalRepository:");
            for (int i = 0; i < size; i++) {
                if (!properties[i].isOccupied()) {
                    System.out.println(properties[i].toString());
                }
            }
        }

        //This method search all properties in a given location
        public void searchByLocation(String location) {
            System.out.println("Properties in " + location + ":");
            for (int i = 0; i < size; i++) {
                if (properties[i].getLocation().equals(location)) {
                    System.out.println(properties[i].toString());
                }
            }
        }

        //This method search property by propertycode
        public void searchByPropertyCode(String propertyCode) {
            for (int i = 0; i < size; i++) {
                if (properties[i].getPropertyCode()==propertyCode) {
                    System.out.println(properties[i].toString());
                }
            }
            System.out.println("No property with code " + propertyCode + " found.");
        }

        //This method display total Number of Bedrooms in Apartment
        public void getTotalNumberOfBedroomsInApartment(){
            int count = 0;
            for (Property property: properties){
                if (property instanceof Apartment){
                    count += ((Apartment) property).getBedrooms();
                }
            }
            System.out.println("Total number of Bedroom in Apartment is: " + count);
        }

    //This method display total Number of Bathrooms in Apartment
        public void getTotalNumberOfBathroomsInApartment(){
            int count = 0;
            for (Property property: properties){
                if (property instanceof Apartment){
                    count += ((Apartment) property).getBathrooms();
                }
            }
            System.out.println("Total number of Bathrooms in Apartment is "+count);
        }

    //This method display total Number of Bathrooms in Houses
        public void getTotalNumberOfBathroomsInHouses(){
            int count = 0;
            for (Property property : properties){
                if (property instanceof House){
                    count += ((House) property).getBathrooms();
                }
            }
            System.out.println("Total number of Bathrooms in House is "+count);
        }

    //This method display total Number of Bedrooms in Houses
        public void getTotalNumberOfBedroomsInHouse(){
            int count = 0;
            for (Property property : properties){
                if (property instanceof House){
                    count += ((House) property).getBathrooms();
                }
            }
            System.out.println("Total number of Bathrooms in Apartment is "+count);
        }
}

