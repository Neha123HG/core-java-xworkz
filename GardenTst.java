class GardenTst{

public static void main(String Flower[]){

Garden.flowerAvailable("Ros");
Garden.flowerAvailable("lilli");
Garden.flowerAvailable("coneflower");
Garden.flowerAvailable("Hydrangea");
Garden.flowerAvailable("Aster");
Garden.flowerAvailable("marigolds");

Garden.getAllflowers();

boolean isUpdated =Garden.updateGardenName("Ros","mallige");
Garden.getAllflowers();

//Delete, remove
   int newLength = Garden.deleteItems("marigolds");
   System.out.println("Calling deleteStationaryItems");
   Garden.getAllItemsPostDeletion(newLength);
   
}


}