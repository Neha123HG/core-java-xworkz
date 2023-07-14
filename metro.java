class Metro {

static String metroStationAvailable[]={null,null,null,null,null,null};
static int index;

public static boolean metro(String station){

  boolean isAdded=false;
  if(station!=0){
  metroStationAvailable[index]=station;
  isAdded=true;
  
  }else{
    System.out.println("con't not add station ");
  
  }
return isAdded;
}

public static void getAllMetroStation(){

System.out.println("invoked method");
for(int Mname=0;Mname<metroStationAvailable.length;Mname++){

String ref =metroStationAvailable[Mname];
System.out.println("Access statin name is   " + ref+ "index at  "+Mname);
}
System.out.println("method ended");
}
}