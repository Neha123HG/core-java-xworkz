class KfcTester
{
public static void main(String zomatofood[])
{

	double priceOfFoodName=Kfc.search("Chicken Popcorn-Medium");
	System.out.println("The price is "+priceOfFoodName);
	
	double priceOfFoodName01=Kfc.search("Chicken Popcorn-Medium",2);
	System.out.println("The price is "+priceOfFoodName01);
	
	

	double priceOfFoodName1=Kfc.search("Chicken Popcorn-Large");
	System.out.println("The price is "+priceOfFoodName1);
	
	double priceOfFoodName11=Kfc.search("Chicken Popcorn-Large",2);
	System.out.println("The price is "+priceOfFoodName11);
	
	
	double priceOfFoodName2=Kfc.search("Regular Popcorn");
	System.out.println("The price is "+priceOfFoodName2);

	double priceOfFoodName3=Kfc.search("Classic Zinger",2);
	System.out.println("The price is "+priceOfFoodName3);
	
	
	double priceOfFoodName4=Kfc.search("Hot Chicken Wings");
	System.out.println("The price is "+priceOfFoodName4);
	
	
	double priceOfFoodName44=Kfc.search("Hot Chicken Wings",2);
	System.out.println("The price is "+priceOfFoodName4);
	
	String foodName5="Ultimate Savings Bucket";
	double priceOfFoodName5=Kfc.search(foodName5);
	System.out.println("The price is "+priceOfFoodName5);
	
	//String foodName6="Peri Peri 6pc Chicken Strips";
	double priceOfFoodName6=Kfc.search("Peri Peri 6pc Chicken Strips");
	System.out.println("The price is "+priceOfFoodName6);
	
	double priceOfFoodName66=Kfc.search("Peri Peri 6pc Chicken Strips",2);
	System.out.println("The price is "+priceOfFoodName66);
	
	//String foodName7="Big 12 Bucket";
	double priceOfFoodName7=Kfc.search("Big 12 Bucket");
	System.out.println("The price is "+priceOfFoodName7);
	
	double priceOfFoodName77=Kfc.search("Big 12 Bucket",2);
	System.out.println("The price is "+priceOfFoodName77);
	
	//String foodName8="Bucket for Two";
	double priceOfFoodName8=Kfc.search("Bucket for Two");
	System.out.println("The price is "+priceOfFoodName8);
	
	double priceOfFoodName88=Kfc.search("Bucket for Two",2);
	System.out.println("The price is "+priceOfFoodName88);
	
	
	//String foodName9="Popcorn And Fries Bucket";
	double priceOfFoodName9=Kfc.search("Popcorn And Fries Bucket");
	System.out.println("The price is "+priceOfFoodName9);
	
	double priceOfFoodName99=Kfc.search("Popcorn And Fries Bucket",2);
	System.out.println("The price is "+priceOfFoodName99);
	
	
	double priceOfFoodName10=Kfc.search("French Fries-Large");
	System.out.println("The price is "+priceOfFoodName10);
	
	double priceOfFoodName101=Kfc.search("French Fries-Large",2);
	System.out.println("The price is "+priceOfFoodName101);
	
	
	String foodName112="Hot and Crispy Chicken";
	double priceOfFoodName112=Kfc.search(foodName112);
	System.out.println("The price is "+priceOfFoodName112);
	
	String foodName12="Classic and Chicken Roll";
	double priceOfFoodName12=Kfc.search(foodName12);
	System.out.println("The price is "+priceOfFoodName12);
	
	String foodName13="Classic Chicken Roll";
	double priceOfFoodName13=Kfc.search(foodName13);
	System.out.println("The price is "+priceOfFoodName13);
	
	String foodName14="Double Chicken Roll";
	double priceOfFoodName14=Kfc.search(foodName14);
	System.out.println("The price is "+priceOfFoodName14);
	
	String foodName15="5 Leg Pc and 2 Dips Bucket";
	double priceOfFoodName15=Kfc.search(foodName15);
	System.out.println("The price is "+priceOfFoodName15);
	
	String foodName16="Stay Home Bucket";
	double priceOfFoodName16=Kfc.search(foodName16);
	System.out.println("The price is "+priceOfFoodName16);
	
	String foodName17="Mingles Bucket Meal";
	double priceOfFoodName17=Kfc.search(foodName17);
	System.out.println("The price is "+priceOfFoodName17);
	
	String foodName18="Family Feast";
	double priceOfFoodName18=Kfc.search(foodName18);
	System.out.println("The price is "+priceOfFoodName18);
	
	String foodName19="Classic Biriyani Combo";
	double priceOfFoodName19=Kfc.search(foodName19);
	System.out.println("The price is "+priceOfFoodName19);
}
}