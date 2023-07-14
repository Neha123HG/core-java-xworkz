class Icecream{

static String typesAvailable[]={null,null,null,null,null,null};
static int index;

public static boolean flavors(String ice){

  boolean isAdded=false;
  if(ice!=null){
   typesAvailable[index]=ice;
   index++;
   isAdded=true;
  
  }else{
  
  
  System.out.println("can't add city,as it is null null");
  }

return isAdded;
}

public static void getAlltypes(){

System.out.println("invoking method");
 for(int name=0;name<typesAvailable.length;name++){
 
 
     String  creams =typesAvailable[name];
	 
	 System.out.println("Access creams are "+ creams + "index at "  + name);
 }
System.out.println("ended method");
}
public static boolean updateIceCreamName(String existingicecreamName,String upDateIcecreamName){
	
	boolean isUpdated=false;
	for(int creamIndex=0;creamIndex< typesAvailable.length;creamIndex++)
	{
		if(typesAvailable[creamIndex].equals(existingicecreamName))
		{
			typesAvailable[creamIndex]=upDateIcecreamName;
			
			isUpdated=true;
	   }
	}

	return isUpdated;
//DElete	

public static int deleteItems(String deletedItemName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = typesAvailable.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<typesAvailable.length; statIndex++){
		  if(typesAvailable[statIndex].equals(deletedItemName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  //logic to remove deleted data from the array
		  //  5=6 from assigning from 6 to 5 position 
		  //6=7
		  typesAvailable[newItemIndex] = typesAvailable[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(typesAvailable[itemIndex]);
	} 
		
  }

}