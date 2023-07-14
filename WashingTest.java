class WashingTest{

	public static void main(String a[]){
	
	System.out.println("main Started");
	boolean connected = Mixer.onOrOff();
	System.out.println("is WashingM connected"+connected);
	
	WashingM.increaseSpeed();
	WashingM.increaseSpeed();
	WashingM.increaseSpeed();
	WashingM.decreaseSpeed();
	WashingM.decreaseSpeed();
	
	boolean connected1 = Mixer.onOrOff();
	System.out.println("is WashingM connected"+connected1);
	System.out.println("main ended");
	WashingM.decreaseSpeed();
	
	}
}