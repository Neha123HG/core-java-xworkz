class Medical{

static String medicinAvailable[]={null,null,null,null,null};
static int index;

public static boolean medecinName(String name){

boolean  isAdded=false;
if(name!=null){
 medicinAvailable[index]=name;
 index++;
 isAdded=true;
 
}else{

System.out.println("can't not add medicin");

}
return isAdded;
}
public static void getAllmedicinAvailable(){

System.out.println("involk method ");

for(int name=0;name<medicinAvailable.length;name++){
        String ref=  medicinAvailable[name] ;

 System.out.println("Access  is  "+ ref+ "  index is"+  name);		
}

}
public static boolean updateMedicalName(String existingMedicalName,String newMedicalName){
	
	boolean isUpdated=false;
	for(int MedicalIndex=0;MedicalIndex< medicinAvailable.length;MedicalIndex++)
	{
		if(medicinAvailable[MedicalIndex].equals(existingMedicalName))
		{
			medicinAvailable[MedicalIndex]=newMedicalName;
			
			isUpdated=true;
	   }
	}

	return isUpdated;
	
}
public static int deleteStationaryItems(String deletedItemName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = medicinAvailable.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<medicinAvailable.length; statIndex++){
		  if(medicinAvailable[statIndex].equals(deletedItemName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  //logic to remove deleted data from the array
		  //  5=6 from assigning from 6 to 5 position 
		  //6=7
		  medicinAvailable[newItemIndex] = medicinAvailable[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllStationaryItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(medicinAvailable[itemIndex]);
	} 
		
  }

}