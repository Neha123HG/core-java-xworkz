class Speaker{

    static String name="jBI";
    static  int minValue;
     static  int currentVolume;
      static  int maxValue=10;
      static boolean isConnected;

public static boolean onOrOff(){

System.out.println("involking onOrOff");
System.out.println("Parameter"+ 0);
//falase==false
if(isConnected == false){
   isConnected=true;
    System.out.println("skeaker is turned on.enjoyy");
	    //true==true
}else if(isConnected == true){
       isConnected=false;
        System.out.println("skeaker is turned off");
}
return isConnected;
}
//increase
public static void increaseVolume(){
	//logic
	System.out.println("invoking increases()");
	System.out.println("list of parameter"+0);
if(isConnected == true){
	if(currentVolume < maxValue){
		currentVolume=currentVolume+1;
		System.out.println("the current value is"+currentVolume);
}
    else{
		System.out.println("max value reached");
	}
}else{
	System.out.println("Gube...speaker connect madu first u");
}
System.out.println("end with increase");
}
public static void decreaseVolume(){
	System.out.println("invoking increases()");
	System.out.println("list of parameter"+0);
	if(isConnected==true)
	{
	if(currentVolume > minValue)
	{
		currentVolume=currentVolume-1;
		System.out.println("the current value is"+currentVolume);

	}
	else
	{
	System.out.println("min value reached");
	}
	}
    else
	{
	System.out.println("The value is decrease");
	}
	System.out.println("end with decrease");
}
}

	
