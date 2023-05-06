import PropertyTypes.Apartment;
import PropertyTypes.Condo;
import PropertyTypes.House;
import RentalRepository.Repository;

/**
 * This is the Main method for testing out the Program
 */


public class Main {public static void main(String[] args) {
    Repository repo = new Repository(10);

    // Create some properties inside Repository (Array)
    //With a return statement:: Property Added Successfully
    Apartment apa1 = new Apartment("Apartment","Lagos",2,3,12000,true,4);
    Apartment apa2 = new Apartment("Apartment","Lagos",2,3,12300,false,3);
    Apartment apa3 = new Apartment("Apartment","Ogun",4,3,15300,true,3);
    House hou1 = new House("House","Ogun",4,3,15300,true,3,123);
    House hou2 = new House("House","Ogun",6,3,15300,true,3,123);
    Condo cond1 = new Condo("Condo","Ogun",4,3,15300,false,3);
    Condo cond2 = new Condo("Condo","Ogun",5,3,15300,true,3);

    repo.createProperty(apa1);
    repo.createProperty(apa2);
    repo.createProperty(apa3);
    repo.createProperty(hou1);
    repo.createProperty(hou2);
    repo.createProperty(cond1);
    repo.createProperty(cond2);


    //Update a property
    // return Statement:: Property Updated Successfully
    House updatedHouse = new House("House","Ogun",4,3,15300,true,3,123);

    repo.updatePropertyUsingPropertyCode("APA0001",updatedHouse);

    //View All Properties in the Repository
    repo.viewAllProperties();
    repo.viewPropertyByPropertyCode("APA0002");

    // Delete a property with the provided Property code
    repo.deletePropertyByPropertyCode("APA0001");

    //view properties by Types: Apartment, Condos, Houses
    repo.viewAllProperties();
    repo.viewAllApartments();
    repo.viewAllCondos();
    repo.viewAllHouses();

    //View Occupied or Unoccupied Properties
    repo.viewAllProperties();
    repo.viewOccupiedProperties();
    repo.viewUnoccupiedProperties();

    //View Number of Bathrooms and Bedrooms in a Property
    repo.getTotalNumberOfBathroomsInApartment();
    repo.getTotalNumberOfBedroomsInApartment();

    //Search through Repo and display Properties by Location and Property Code
    repo.searchByPropertyCode("APA0001");
    repo.searchByLocation("Lagos");


}

}