class Modules{

public static void main(String multiple[]){

System.out.println("start modules");

Mod(5,6);
Mod(4,19);
Mod(10,13);
Mod(45,2);
Mod(12,6,4);
Mod(14,6,3);
Mod(8,9,3);
Mod(15,15,4);
Mod(9,15,3);
Mod(75,6,2);

}
public static void Mod(int a,int b){

System.out.println(a%b);
}
public static void Mod(int a,int b,int c){

System.out.println(a%b%c);
}
}