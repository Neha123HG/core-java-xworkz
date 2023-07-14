class IcecreamTst{

public static void main(String  ices[]){
//create add,save
  Icecream.flavors("chocolate");
  Icecream.flavors("vanilla");
  Icecream.flavors("cooking and cream");
  Icecream.flavors("Butter pecan");
  Icecream.flavors("cotton candy");
  Icecream.flavors("strawberry");
 
  //Read,fetch,get
  Icecream.getAlltypes();
  

 boolean isUpdated =Icecream.updateIceCreamName("strawberry","apd");
Icecream.getAlltypes();

  
   //Delete, remove
   int newLength = Telicomm.deleteItems("chocolate");
   System.out.println("Calling deleteStationaryItems");
   Icecream.getAllItemsPostDeletion(newLength);
   
}



}