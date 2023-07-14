class AcTester{

public static void main(String test[]){
System.out.println("Main started");

 boolean connected=Ac.onOrOff();//orSpeaker.onOrOff(); 
System.out.println("is Ac connected"+connected);
 /*boolean connected1=Speaker.onOrOff();//  orSpeaker.onOrOff();
System.out.println("is speaker connected1"+connected1);*/
System.out.println("Main started");
Ac.increaseTemp();
Ac.increaseTemp();
Ac.increaseTemp();
Ac.increaseTemp();

Ac.decreaseTemp();

System.out.println("-----------------------------");
boolean connected1=Ac.onOrOff();//  orSpeaker.onOrOff();
System.out.println("is Ac connected1"+connected1);
Ac.decreaseTemp();

}


}