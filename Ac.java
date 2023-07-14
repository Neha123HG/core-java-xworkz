class Ac{

    static String name="abc";
    static  int minTemp;
     static  int currentTemp;
      static  int maxTemp=4;
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
public static void increaseTemp(){
	//logic
	System.out.println("invoking increases()");
	System.out.println("list of parameter"+0);
if(isConnected == true){
	if(currentTemp < maxTemp){
		currentTemp=currentTemp+1;
		System.out.println("the current value is"+currentTemp);
}
    else{
		System.out.println("max value reached");
	}
}else{
	System.out.println("Gube...ac connect madu first u");
}
System.out.println("end with increase");
}
public static void decreaseTemp(){
	System.out.println("invoking increases()");
	System.out.println("list of parameter"+0);
	if(isConnected==true)
	{
	if(currentTemp > minTemp)
	{
		currentTemp=currentTemp-1;
		System.out.println("the current value is"+currentTemp);

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

	
