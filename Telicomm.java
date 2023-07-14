class Telicomm{

static String sims[]={null,null,null,null,null,null};
static int index;

public static boolean creatSimName(String sim){

 boolean isAdded=false;
 if(sim!=null){
 
 sims[index]=sim;
 index++;
 isAdded=true;
 
 }else{
 
 System.out.println("can't add city,as it is null null");
 
 }
 return isAdded;

}
public static void  getAllcreatSimname(){

  System.out.println("invoke method");
  
  for( int sim=0;sim<sims.length;sim++){
  
  String ref=sims[sim];
  System.out.println("Access  telicom name is "+   ref  +   "    and index at  "   + sim );

  }
  System.out.println("end of method");

}
public static boolean updateTelicomName(String existingTelicomName,String newTelicomName){
	
	boolean isUpdated=false;
	for(int TelicomIndex=0;TelicomIndex< sims.length;TelicomIndex++)
	{
		if(sims[TelicomIndex].equals(existingTelicomName))
		{
			sims[TelicomIndex]=newTelicomName;
			
			isUpdated=true;
	   }
	}

	return isUpdated;
	
}
public static int deleteStationaryItems(String deletedItemName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = sims.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<sims.length; statIndex++){
		  if(sims[statIndex].equals(deletedItemName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  //logic to remove deleted data from the array
		  //  5=6 from assigning from 6 to 5 position 
		  //6=7
		  sims[newItemIndex] = sims[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllStationaryItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(sims[itemIndex]);
	} 
		
  }

}