class TravelAgency{

static String agencyAvailable[]={null,null,null,null,null,null,null,null};
static int index;

public static boolean addTravel(String traveller){

boolean  isAdded=false;
if(traveller!=null){
 agencyAvailable[index]=traveller;
 index++;
 isAdded=true;
 
}
return isAdded;
}
public static void getAllTravelAgency(){

System.out.println("involk methid");
for(int name=0;name<agencyAvailable.length;name++){

        String  ref =agencyAvailable[name];
		System.out.println("Acces a name is  "+  ref +  "  and index at  " +name );
}
System.out.println("involked ended");

}
public static boolean updateTravelName(String existingTravelName,String newTravelName){
	
	boolean isUpdated=false;
	for(int TravelIndex=0;TravelIndex< agencyAvailable.length;TravelIndex++)
	{
		if(agencyAvailable[TravelIndex].equals(existingTravelName))
		{
			agencyAvailable[TravelIndex]=newTravelName;
			
			isUpdated=true;
	   }
	}

	return isUpdated;
	
}
public static int deleteStationaryItems(String deletedItemName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = agencyAvailable.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<agencyAvailable.length; statIndex++){
		  if(agencyAvailable[statIndex].equals(deletedItemName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  
		  agencyAvailable[newItemIndex] = agencyAvailable[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllStationaryItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(agencyAvailable[itemIndex]);
	} 
		
  }
  public static String getAllItemByName(String itemName){
	  System.out.println("invoking getAllItemByName");
	  String sName=null;
	  for(String name:agencyAvailable){

	  //hassan.equals(hassan)
	      if(name.equals(itemName)){
		  sName=name;
		  System.out.println(" Item name found");
	  }
  }
  return sName;
  }

}