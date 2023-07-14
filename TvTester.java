class TvTester{

public static void main(String test[]){
System.out.println("Main started");

 boolean connected=Telivision.onOrOff();
System.out.println("is Telivision connected"+connected);
 
System.out.println("Main started");
Telivision.increaseVolume();
Telivision.increaseVolume();
Telivision.increaseVolume();
Telivision.increaseVolume();
Telivision.increaseVolume();
Telivision.increaseVolume();


System.out.println("-----------------------------");
boolean connected1=Telivision.onOrOff();
System.out.println("is Telivision connected1"+connected1);
Telivision.decreaseVolume();
Telivision.decreaseVolume();
Telivision.decreaseVolume();
Telivision.decreaseVolume();
Telivision.decreaseVolume();
Telivision.decreaseVolume();
}


}