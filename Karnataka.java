class Karnataka
{

static  String  cityAvailable[]={null,null,null,null,null,null,null,null,null,null};
static  int index;

                          //add date
public static  boolean  addCity(String city){

  boolean isAdded=false;
 
if(city!=null ){
cityAvailable[index]=city;
  index++;
  isAdded=true;
  
}else{

 System.out.println("can't add city,as it is null null");
  }
  

return isAdded;
}


public static void getAllCityAvailable(){

 System.out.println("invoking the method");
 for(int city=0;city<cityAvailable.length;city++){
   
   String ref=cityAvailable[city];
   System.out.println(""+ref   + "        "   +city);
}
System.out.println("enddes method");
}

//updated 
public static boolean updateCityName(String existingCityName,String upDateCityName){
	boolean isUpdated=false;
	for(int cityIndex=0;cityIndex< cityAvailable.length;cityIndex++)
	{
		if(cityAvailable[cityIndex].equals(existingCityName))
		{
			cityAvailable[cityIndex]=upDateCityName;
			
			isUpdated=true;
	   }
	}

	return isUpdated;
	
}
 public static int deleteCityIName(String DeletedItemName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = cityAvailable.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<cityAvailable.length; statIndex++){
		  if(cityAvailable[statIndex].equals(DeletedItemName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  //logic to remove deleted data from the array
		  //  5=6 from assigning from 6 to 5 position 
		  //6=7
		  cityAvailable[newItemIndex] = cityAvailable[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllCityNametDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(cityAvailable[itemIndex]);
	} 
		
  }
}
