class Multiplication{

public static void main(String multiple[]){

System.out.println("start mulgtification");
//onvolk 
multi(5,6);
multi(4,19);
multi(10,13);
multi(45,2);
multi(12,6);
multi(14,6);
multi(8,9);
multi(15,15);
multi(9,15);
multi(75,6);

multi(5,6,1);
multi(4,19,14);
multi(10,13,12);
multi(45,2,58);
multi(12,6,25);
multi(14,6,5);
multi(8,9,4);
multi(15,15,3);
multi(9,15,2);
multi(75,6,5);

}
public static void multi(int a,int b){

System.out.println(a*b);
}
public static void multi(int a,int b,int c){

System.out.println(a*b*c);
}
}