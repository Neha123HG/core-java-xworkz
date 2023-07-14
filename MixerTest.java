class MixerTest{

	public static void main(String a[]){
	
	System.out.println("main Started");
	boolean connected = Mixer.onOrOff();
	System.out.println("is Mixer connected"+connected);
	Mixer.increaseSpeed();
	Mixer.increaseSpeed();
	Mixer.increaseSpeed();
	Mixer.decreaseSpeed();
	
	boolean connected1 = Mixer.onOrOff();
	System.out.println("is Mixer connected"+connected1);
	System.out.println("main ended");
	Mixer.decreaseSpeed();
	
	}
}