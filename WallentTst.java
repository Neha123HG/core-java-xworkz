class WallentTst{

public static  void main(String arg[]){

wallet w=new wallet();
w.name="zxc";
w.price=100;
w.colour="black";
w.quality="good";
System.out.println(w.name+ " "+w.price+ " "+w.colour);
System.out.println("````````````````````````````````");

wallet w1=new wallet();
w1.name="mnb";
w1.price=200;
w1.colour="white";
w1.quality=" not good";
System.out.println(w1.name+ " "+w1.price+ " "+w1.colour);
System.out.println("````````````````````````````````");

wallet w2=new wallet();
w2.name="hgf";
w2.price=150;
w2.colour="green";
w2.quality="nice";
w2.toWallent();
System.out.println(w2.name+ " "+w2.price+ " "+w2.colour);
System.out.println("````````````````````````````````");

wallet w3=new wallet();
w3.name="zxc";
w3.price=100;
w3.colour="black";
w3.quality="good";
w3.toWallent();
System.out.println(w3.name+ " "+w3.price+ " "+w3.colour);
System.out.println("````````````````````````````````");

wallet w4=new wallet();
w4.name="rtyu";
w4.price=150;
w4.colour="blue";
w4.quality="medium";
w4.toWallent();
System.out.println(w4.name+ " "+w4.price+ " "+w4.colour);
System.out.println("````````````````````````````````");

wallet w5=new wallet();
w5.name="asd";
w5.price=200;
w5.colour="red";
w5.quality="good";
w5.toWallent();
System.out.println(w5.name+ " "+w5.price+ " "+w5.colour);
System.out.println("````````````````````````````````");

wallet w6=new wallet();
w6.name="jhg";
w6.price=350;
w6.colour="cement";
w6.quality="not bad";
w6.toWallent();
System.out.println(w6.name+ " "+w6.price+ " "+w6.colour);
System.out.println("````````````````````````````````");

wallet w7=new wallet();
w7.name="poi";
w7.price=210;
w7.colour="grey";
w7.quality="verygood";
w7.toWallent();
System.out.println(w7.name+ " "+w7.price+ " "+w7.colour);
System.out.println("````````````````````````````````");

wallet w8=new wallet();
w8.name="zxc";
w8.price=100;
w8.colour="black";
w8.quality="good";
w8.toWallent();
System.out.println(w8.name+ " "+w8.price+ " "+w8.colour);
System.out.println("````````````````````````````````");

wallet w9=new wallet();
w9.name="zxc";
w9.price=100;
w9.colour="black";
w9.quality="good";
w9.toWallent();
System.out.println(w9.name+ " "+w9.price+ " "+w9.colour);
System.out.println("````````````````````````````````");
}
}