class Zomato{

public static double search(String foodName){

if("pizza" == foodName){
System.out.println("Search food name is"+ foodName);
return 99.0;
}
if("veg biriyani" == foodName){
System.out.println("Search food name is"+ foodName);
return 245.80;
}
if("biriyani" == foodName){
System.out.println("Search food name is"+ foodName);
return 345.80;
}
if("rice bath"==foodName){
	System.out.println("search for the food name is"+ foodName);
	return 100.25;
}
if("noodles"==foodName){
	System.out.println("search for the food name is "+ foodName);
	return 200.75;

}
if("edli"==foodName){
	System.out.println("search for the food name is  "+ foodName);
	return 50.50;
}
if("maggi"==foodName){
	System.out.println("search for the food name is  "+ foodName);
	return 125.25;
}
if("egg rice"==foodName){
	System.out.println("search for the food name is  "+ foodName);
	return 95.25;
}

if("fried rice"==foodName){
	System.out.println("search for the food name is  "+ foodName);
	return 220.35;
}
if("freach fry"==foodName){
	System.out.println("search for the food name is  "+ foodName);
	return 98.25;
}
if("panipuri"==foodName){
	System.out.println("search for the food name is  "+ foodName);
	return 80.00;
}
if("gobi with noodles"==foodName){
	System.out.println("search for the food name is  "+ foodName);
	return 325.10;
}
if("north indian meals"==foodName){
	System.out.println("search for the food name is "+ foodName);
	return 100.00;
}
if("south indian meals"==foodName){
	System.out.println("search for the food name is  "+ foodName);
	return 110.25;
}
if("vangibath"==foodName){
	System.out.println("search for the food name is  "+ foodName);
	return 99.45;
}
if("soup"==foodName){
	System.out.println("search for the food name is  "+ foodName);
	return 70.15;
}
if("barger"==foodName){
	System.out.println("search for the food name is  "+ foodName);
	return 125.00;
}
if("vadapav"==foodName){
	System.out.println("search for the food name is"+ foodName);
	return 200.25;
}
if("edlivada"==foodName){
	System.out.println("search for the food name is  "+ foodName);
	return 50.00;
}
if("curd rice"==foodName){
	System.out.println("search for the food name is  "+ foodName);
	return 60.25;
}
if("vade"==foodName){
	System.out.println("search for the food name is  "+ foodName);
	return 50.25;
}
return 0.0;
}
public static double search(String foodName,int quantity){

if("pizza" == foodName){
System.out.println("Search food name and quantity is"+ foodName);
return 99.0*quantity;
}
if("veg biriyani" == foodName){
System.out.println("Search food name and quantity is"+ foodName);
return 245.80*quantity;
}
if("biriyani" == foodName){
System.out.println("Search food name and quantity is"+ foodName);
return 345.80;
}
if("rice bath"==foodName){
	System.out.println("Search food name and quantity is"+ foodName);
	return 100.25*quantity;
}
if("noodles"==foodName){
	System.out.println("Search food name and quantity is "+ foodName);
	return 200.75*quantity;

}
if("edli"==foodName){
	System.out.println("Search food name and quantity is  "+ foodName);
	return 50.50*quantity;
}
if("maggi"==foodName){
	System.out.println("Search food name and quantity is  "+ foodName);
	return 125.25*quantity;
}
if("egg rice"==foodName){
	System.out.println("search for the food name and quantity is  "+ foodName);
	return 95.25*quantity;
}

if("fried rice"==foodName){
	System.out.println("search for the food name and quantity is  "+ foodName);
	return 220.35*quantity;
}
if("freach fry"==foodName){
	System.out.println("search for the food name  and quantity is  "+ foodName);
	return 98.25*quantity;
}
if("panipuri"==foodName){
	System.out.println("search for the food name and quantity is  "+ foodName);
	return 80.00*quantity;
}
if("gobi with noodles"==foodName){
	System.out.println("search for the food name and quantity is  "+ foodName);
	return 325.10*quantity;
}
if("north indian meals"==foodName){
	System.out.println("search for the food name  and quantity is "+ foodName);
	return 100.00*quantity;
}
if("south indian meals"==foodName){
	System.out.println("search for the food name and quantity is  "+ foodName);
	return 110.25*quantity;
}
if("vangibath"==foodName){
	System.out.println("search for the food name and quantity is  "+ foodName);
	return 99.45;
}
if("soup"==foodName){
	System.out.println("search for the food name and quantuty is  "+ foodName);
	return 70.15*quantity;
}
if("barger"==foodName){
	System.out.println("search for the food name  and quantity is  "+ foodName);
	return 125.00*quantity;
}
if("vadapav"==foodName){
	System.out.println("search for the food name and quantity is"+ foodName);
	return 200.25*quantity;
}
if("edlivada"==foodName){
	System.out.println("search for the food name and quantity is  "+ foodName);
	return 50.00*quantity;
}
if("curd rice"==foodName){
	System.out.println("search for the food name and quantity is  "+ foodName);
	return 60.25*quantity;
}
if("vade"==foodName){
	System.out.println("search for the food name quantity is  "+ foodName);
	return 50.25*quantity;
}
return 0.0;
}
}