class Lenskart{

String type;
String brandName;
double price;
String color;


//default cons-user defined
public Lenskart(){
 this("Plastic","OAKLEY sunglass");
System.out.println("Lenskart cons is invoked");
}

public Lenskart(String type,String brandName)
{
	//constructor chaining//means call one constructor to another is constructer chainning
	/* this method*/ 
	//this(10000.00);
	this.type=type;
	this.brandName=brandName;
	this.color=color;
	System.out.println("Lenskart is invoked");
}
public Lenskart(double price){
	
	this("Plastic","sunglass");
	this.price=price;
	
	 
	 System.out.println("Lenskart price constuctor");
}



}

