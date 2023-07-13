class ChatAngadi{

public static void main(String chat[]){

String chatNames[]={"panipuri","noodles","masalpuri"};
//invole logic(method)
getchatName(chatNames);//invoking method is -getchatName;and chatName is arguments

}
public static void getchatName(String chatNames[])//String chatNames[] is parameter
{
System.out.println("started");
for(String chatname:chatNames)
{
System.out.println(chatname);
}
}
}

//public static void getchatName(String chatNames[])---it is signature of a method 
/*public static void getchatName(String chatNames[])//String chatNames[] is parameter
{
System.out.println("started");
for(String chatname:chatNames){
System.out.println(chatname);
}
}*/ //it is declaration