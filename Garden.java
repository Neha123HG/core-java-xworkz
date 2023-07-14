class Garden{

static String flowerName[]={null,null,null,null,null,null};
static int index;

public static boolean flowerAvailable(String flower){
  boolean issave=false;
  if( flower!=null){
   flowerName[index]=flower;
   index++;
   issave=true;
  
  }else{
  
  System.out.println("don't add any flowers");
  
  }
  
return issave;

}

public static void getAllflowers(){

  System.out.println("methid is invoked");
  for(int name=0;name<flowerName.length;name++){
  
       String  ref =flowerName[name];
  
  System.out.println("access flower names is  "+  ref +"  index at   "  +    name  );
  
  }
System.out.println("ended involked");
}
public static boolean updateGardenName(String existingGardenName,String newGardenName){
	
	boolean isUpdated=false;
	for(int GardenIndex=0;GardenIndex< flowerName.length;GardenIndex++)
	{
		if(flowerName[GardenIndex].equals(existingGardenName))
		{
			flowerName[GardenIndex]=newGardenName;
			
			isUpdated=true;
	   }
	}

	return isUpdated;
	
}
public static int deleteItems(String deletedItemName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = flowerName.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<flowerName.length; statIndex++){
		  if(flowerName[statIndex].equals(deletedItemName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  //logic to remove deleted data from the array
		  //  5=6 from assigning from 6 to 5 position 
		  //6=7
		  flowerName[newItemIndex] = flowerName[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(flowerName[itemIndex]);
	} 
		
  }

}