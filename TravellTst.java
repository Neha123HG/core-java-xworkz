class TravellTst{

public static void main(String Tname[]){
//creat ,sava,add
TravelAgency.addTravel("Sakaleshpura");
TravelAgency.addTravel("mysor");
TravelAgency.addTravel("mangalore");
TravelAgency.addTravel("yana");		
TravelAgency.addTravel("goa");
TravelAgency.addTravel("manjarabad kote");
TravelAgency.addTravel("Belur");
TravelAgency.addTravel("gokarna");

//Read,get,fetch
TravelAgency.getAllTravelAgency();
 
 //search name


//update ,editzv 
boolean isUpdated =TravelAgency.updateTravelName("gokarna","jog");
TravelAgency.getAllTravelAgency();

 //Delete, remove
   int newLength = TravelAgency.deleteStationaryItems("goa");
   
   TravelAgency.getAllStationaryItemsPostDeletion(newLength);
  
  //search name
  
 String name=TravelAgency.getAllItemByName("hassan");
System.out.println(" ");

TravelAgency.getAllTravelAgency();
   
}
}