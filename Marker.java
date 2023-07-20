class Marker{

String type;
String brandName;
double price;


//default cons-user defined
public Marker(){
 this("Pigment","Pental");
System.out.println("Marker cons is invoked");
}

public Marker(String type,String brandName)
{
	//constructor chaining//means call one constructor to another is constructer chainning
	/* this method*/ 
	//this(10000.00);
	this.type=type;
	this.brandName=brandName;
	System.out.println("binacular is invoked");
}
public Marker(double price){
	
	this("Pigment","Pental");
	this.price=price;
	
	 
	 System.out.println("binacular price constuctor");
}



}

