class TelComTst{


public  static void main(String com[]){

Telicomm.creatSimName("jio");
Telicomm.creatSimName("airtel");
Telicomm.creatSimName("BSNL");
Telicomm.creatSimName("vadaphone");
Telicomm.creatSimName("vi");
Telicomm.creatSimName("Idea");

Telicomm.getAllcreatSimname();

boolean isUpdated =Telicomm.updateTelicomName("vadaphone","apd");
Telicomm.getAllcreatSimname();

  
   //Delete, remove
   int newLength = Telicomm.deleteStationaryItems("Idea");
   System.out.println("Calling deleteStationaryItems");
   Telicomm.getAllStationaryItemsPostDeletion(newLength);
   
}
}