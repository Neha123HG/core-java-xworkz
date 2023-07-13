class SpeakerTester{

public static void main(String test[]){
System.out.println("Main started");

 boolean connected=Speaker.onOrOff();//orSpeaker.onOrOff(); 
System.out.println("is speaker connected"+connected);
 /*boolean connected1=Speaker.onOrOff();//  orSpeaker.onOrOff();
System.out.println("is speaker connected1"+connected1);*/
System.out.println("Main started");
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();


System.out.println("-----------------------------");
boolean connected1=Speaker.onOrOff();//  orSpeaker.onOrOff();
System.out.println("is speaker connected1"+connected1);
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
}


}