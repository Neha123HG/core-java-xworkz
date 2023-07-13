class Giries
{
public static void main(String elect[])
{
	
System.out.println("main started");
String electroDevices[]={"Microware","lED","washingMachine","Ironbox","refregerator","tv"};
 System.out.println(electroDevices[0]+ " "+ electroDevices[1]);                  
 //for( int devIndex=0;devIndex<electroDevices.length;/*devIndex++*/) //0<6;true
 //{
// System.out.println(electroDevices[devIndex]);
// devIndex++ ; //(also print is write)

 //}
//System.out.println("main ended");

//}
System.out.println("list of electonic device:");
for( String electroDevice : electroDevices){
	System.out.println(electroDevice);
}
System.out.println("main ended");
}
}

