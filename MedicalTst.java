class MedicalTst{

public static void main(String medicin[]){

Medical.medecinName("dolo360");
Medical.medecinName("sipla");
Medical.medecinName("crocin");
Medical.medecinName("omd");
Medical.medecinName("dart");

Medical.getAllmedicinAvailable();

boolean isUpdated =Medical.updateMedicalName("dart","paracitalmal");
Medical.getAllmedicinAvailable();

   //Delete, remove
   int newLength = Medical.deleteStationaryItems("omd");
   
   Medical.getAllStationaryItemsPostDeletion(newLength);
   
}



}