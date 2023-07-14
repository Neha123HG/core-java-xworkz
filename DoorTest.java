class DoorTest{

	public static void main(String s[]){
	//object creation in java
	//ClassName referenceVariable=new CalssName();
	System.out.println("Creating 1st copy of the Door");
	Door door=new Door();
	door.branchName="classic";
	door.price=10986;
	door.color="grey";
	door.material="steel";
	door.toSet();
	System.out.println(door.branchName+" "+door.price+" "+door.color+" "+door.material+" ");
	
	System.out.println("Creating 2nd copy of the Door");
	Door door1=new Door();
	door1.branchName="alsunnah";
	door1.price=10564;
	door1.color="black";
	door1.material="steel";
	door1.toSet();
	System.out.println(door1.branchName+" "+door1.price+" "+door1.color+" "+door1.material+" ");
	
	System.out.println("Creating 3rd copy of the Door");
	Door door2=new Door();
	door2.branchName="bonkso";
	door2.price=1032;
	door2.color="blue";
	door2.material="zinc";
	door2.toSet();
	System.out.println(door2.branchName+" "+door2.price+" "+door2.color+" "+door2.material+" ");
	
	System.out.println("Creating 4th copy of the Door");
	Door door3=new Door();
	door3.branchName="bonkso";
	door3.price=34550;
	door3.color="blue";
	door3.material="steel";
	door3.toSet();
	System.out.println(door3.branchName+" "+door3.price+" "+door3.color+" "+door3.material+" ");
	
	System.out.println("Creating 5th copy of the Door");
	Door door4=new Door();
	door4.branchName="lg";
	door4.price=10;
	door4.color="grey";
	door4.material="gold";
	door4.toSet();
	System.out.println(door4.branchName+" "+door4.price+" "+door4.color+" "+door4.material+" ");
	
	System.out.println("Creating 6th copy of the Door");
	Door door5=new Door();
	door5.branchName="doors";
	door5.price=10;
	door5.color="green";
	door5.material="gold";
	door5.toSet();
	System.out.println(door5.branchName+" "+door5.price+" "+door5.color+" "+door5.material+" ");
	
	System.out.println("Creating 7th copy of the Door");
	Door door6=new Door();
	door6.branchName="lapo";
	door6.price=10;
	door6.color="blue";
	door6.material="Fiber";
	door6.toSet();
	System.out.println(door6.branchName+" "+door6.price+" "+door6.color+" "+door6.material+" ");
	
	System.out.println("Creating 8th copy of the Door");
	Door door7=new Door();
	door7.branchName="winplus";
	door7.price=3420;
	door7.color="blue";
	door7.material="Fiber";
	door7.toSet();
	System.out.println(door7.branchName+" "+door7.price+" "+door7.color+" "+door7.material+" ");
	
	System.out.println("Creating 9th copy of the Door");
	Door door8=new Door();
	door8.branchName="zureni";
	door8.price=3456;
	door8.color="white";
	door8.material="gold";
	door8.toSet();
	System.out.println(door8.branchName+" "+door8.price+" "+door8.color+" "+door8.material+" ");
	
	System.out.println("Creating 10th copy of the Door");
	Door door9=new Door();
	door9.branchName="nirmala";
	door9.price=10;
	door9.color="blue";
	door9.material="silver";
	door9.toSet();
	System.out.println(door9.branchName+" "+door9.price+" "+door9.color+" "+door9.material+" ");
	
	}

}