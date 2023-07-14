class Metro1 {

static String metroStationAvailable[]={null,null,null,null,null,null,null};
static int index;

public static boolean addMetro(String station){

  boolean isAdded=false;
  if(station!=null){
  metroStationAvailable[index]=station;
  index++;
  isAdded=true;
  
  }else{
    System.out.println("con't not add station ");
  
  }
return isAdded;
}

public static void getAllMetroStation(){

System.out.println("invoked method");
for(int Mname=0;Mname<metroStationAvailable.length;Mname++){

String ref = metroStationAvailable[Mname];
System.out.println("Access statin name is   " +   ref    + "index at  "+Mname);
}
System.out.println("method ended");
}
public static boolean updateMetroName(String existingMetroName,String newMetroName){
	
	boolean isUpdated=false;
	for(int MetroIndex=0;MetroIndex< metroStationAvailable.length;MetroIndex++)
	{
		if(metroStationAvailable[MetroIndex].equals(existingMetroName))
		{
			metroStationAvailable[MetroIndex]=newMetroName;
			
			isUpdated=true;
	   }
	}

	return isUpdated;
	
}
public static int deleteStationaryItems(String deletedItemName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = metroStationAvailable.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<metroStationAvailable.length; statIndex++){
		  if(metroStationAvailable[statIndex].equals(deletedItemName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  //logic to remove deleted data from the array
		  //  5=6 from assigning from 6 to 5 position 
		  //6=7
		  metroStationAvailable[newItemIndex] = metroStationAvailable[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllStationaryItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(metroStationAvailable[itemIndex]);
	} 
		
  }

}