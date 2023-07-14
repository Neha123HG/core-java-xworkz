class OvenTest{

	public static void main(String a[]){
	
	System.out.println("main Started");
	boolean connected = Mixer.onOrOff();
	System.out.println("is Oven connected"+connected);
	Oven.increaseSpeed();
	Oven.increaseSpeed();
	Oven.increaseSpeed();
	Oven.decreaseSpeed();
	
	boolean connected1 = Mixer.onOrOff();
	System.out.println("is Oven connected"+connected1);
	System.out.println("main ended");
	Oven.decreaseSpeed();
	
	}
}