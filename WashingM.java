class WashingM{
	
	static String name="abc";
	static int minSpeed;
	static int currentSpeed;
	static int maxSpeed=4;
	static boolean isConnected;
	
	//method
	public static boolean onOrOff(){
	System.out.println("Invoking onOrOff");
	System.out.println("Parameter"+0);
	if(isConnected==false){
	isConnected=true;
	System.out.println("WashingM is Turned  onn...Enjoyy");
	}else if(isConnected=true){
	isConnected=false;
	System.out.println("WashingM is Turned  offf...");
	}
	return isConnected;
}

	//increase Speed
	public static void increaseSpeed(){
		if(isConnected==true){
			if(currentSpeed<maxSpeed){
				currentSpeed=currentSpeed+1;
				System.out.println("The WashingM Speed is"+currentSpeed);
			}else{
				System.out.println("Max Speed reached");
			}
		}else {
			System.out.println("Gubee... WashingM connect madu first");
		}
	}
	
	//decrease Speed
	public static void decreaseSpeed(){
		//logic
		
		if(isConnected==true){
			if(currentSpeed>minSpeed){
				currentSpeed=currentSpeed-1;
				System.out.println("the current speed is"+currentSpeed);
			}else {
				System.out.println("min Speed reached");
			}
		}else {
			System.out.println("idiot .. WashingM connect madu first");
		}
	}
}