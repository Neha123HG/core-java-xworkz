class MetroTst{

public static void main(String Mstation[]){

Metro1.addMetro("rajajinagar metro station ");
Metro1.addMetro("vijayanagara metro station");
Metro1.addMetro("kengeri metro station");
Metro1.addMetro("megestic metro station");
Metro1.addMetro("industry area metro station");
Metro1.addMetro("sampige  road metro station");
Metro1.addMetro("shree ram pura metro Station");

Metro1.getAllMetroStation();

boolean isUpdated =Metro1.updateMetroName("shree ram pura metro Station","metro station");
Metro1.getAllMetroStation();

   //Delete, remove
   int newLength = Metro1.deleteStationaryItems("vijayanagara metro station");
   System.out.println("Calling getAllStationaryPostDeletion");
   Metro1.getAllStationaryItemsPostDeletion(newLength);
   
}

}