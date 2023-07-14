class KanatakaTst{

public static void main(String names[]){

Karnataka.addCity("Hassan");
Karnataka.addCity("Bangalore");
Karnataka.addCity("mysoru");
Karnataka.addCity("Mandya");
Karnataka.addCity("chikkamangalore");
Karnataka.addCity("sakleshpura");
Karnataka.addCity("belur");
Karnataka.addCity("malur");
Karnataka.addCity("udupi");
Karnataka.addCity("rajajinagar");

//Read, fetch, get
   Karnataka.getAllCityAvailable();
   
   //update, edit
   Karnataka.updateCityName("Mangalore","Alur");
   
   //Read, fetch, get
   Karnataka.getAllCityAvailable();
  
   //Delete, remove
   int newLength = Karnataka.deleteCityIName("mysoru");
   System.out.println("Calling getAllStationaryItemsPostDeletion");
  
  Karnataka.getAllCityNametDeletion(newLength);
   
 }
 
 
}
