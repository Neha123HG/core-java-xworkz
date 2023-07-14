class ProjectorTest{

	public static void main(String s[]){
	//object creation in java
	//ClassName referenceVariable=new CalssName();
	System.out.println("Creating 1st copy of the projector");
	Projectors projector=new Projectors();
	projector.brandName="BENQ";
	projector.price=19111;
	projector.brightness="1000 lumens";
	projector.contrastRatio="2200:1";
	projector.aspectRatio="4:19";
	projector.toSet();
	System.out.println(projector.brandName+" "+projector.price+" "+projector.brightness+" "+projector.contrastRatio+" "+projector.aspectRatio+" ");
	
	System.out.println("Creating 2nd copy of the projector");
	Projector projector1=new Projector();
	projector1.brandName="zeb";
	projector1.price=178511;
	projector1.brightness="1000 lumens";
	projector1.contrastRatio="5000:1";
	projector1.aspectRatio="5:19";
	projector1.toSet();
	System.out.println(projector1.brandName+" "+projector1.price+" "+projector1.brightness+" "+projector1.contrastRatio+" "+projector1.aspectRatio+" ");
	
	System.out.println("Creating 3rd copy of the projector");
	Projector projector2=new Projector();
	projector2.brandName="zebronics";
	projector2.price=18611;
	projector2.brightness="4000 lumens";
	projector2.contrastRatio="5600:1";
	projector2.aspectRatio="7:8";
	projector2.toSet();
	System.out.println(projector2.brandName+" "+projector2.price+" "+projector2.brightness+" "+projector2.contrastRatio+" "+projector2.aspectRatio+" ");
	
	System.out.println("Creating 4th copy of the projector");
	Projector projector3=new Projector();
	projector3.brandName="xelectron";
	projector3.price=13451;
	projector3.brightness="6000 lumens";
	projector3.contrastRatio="2200:1";
	projector3.aspectRatio="7:19";
	projector3.toSet();
	System.out.println(projector3.brandName+" "+projector3.price+" "+projector3.brightness+" "+projector3.contrastRatio+" "+projector3.aspectRatio+" ");
	
	System.out.println("Creating 5th copy of the projector");
	Projector projector4=new Projector();
	projector4.brandName="BENQ";
	projector4.price=19111;
	projector4.brightness="1000 lumens";
	projector4.contrastRatio="2200:1";
	projector4.aspectRatio="4:19";
	projector4.toSet();
	System.out.println(projector4.brandName+" "+projector4.price+" "+projector4.brightness+" "+projector4.contrastRatio+" "+projector4.aspectRatio+" ");
	
	System.out.println("Creating 6th copy of the projector");
	Projector projector5=new Projector();
	projector5.brandName="BENQ Ek";
	projector5.price=520011;
	projector5.brightness="5000 lumens";
	projector5.contrastRatio="2200:1";
	projector5.aspectRatio="4:19";
	projector5.toSet();
	System.out.println(projector5.brandName+" "+projector5.price+" "+projector5.brightness+" "+projector5.contrastRatio+" "+projector5.aspectRatio+" ");
	
	System.out.println("Creating 7th copy of the projector");
	Projector projector6=new Projector();
	projector6.brandName="epson pro";
	projector6.price=19111;
	projector6.brightness="1000 lumens";
	projector6.contrastRatio="2200:1";
	projector6.aspectRatio="4:19";
	projector6.toSet();
	System.out.println(projector6.brandName+" "+projector6.price+" "+projector6.brightness+" "+projector6.contrastRatio+" "+projector6.aspectRatio+" ");
	
	System.out.println("Creating 8th copy of the projector");
	Projector projector7=new Projector();
	projector7.brandName="samsung";
	projector7.price=188111;
	projector7.brightness="7855 lumens";
	projector7.contrastRatio="18648:1";
	projector7.aspectRatio="5:19";
	projector7.toSet();
	System.out.println(projector7.brandName+" "+projector7.price+" "+projector7.brightness+" "+projector7.contrastRatio+" "+projector7.aspectRatio+" ");
	
	System.out.println("Creating 9th copy of the projector");
	Projector projector8=new Projector();
	projector8.brandName="sony";
	projector8.price=27111;
	projector8.brightness="7690 lumens";
	projector8.contrastRatio="19900:1";
	projector8.aspectRatio="3:1";
	projector8.toSet();
	System.out.println(projector8.brandName+" "+projector8.price+" "+projector8.brightness+" "+projector8.contrastRatio+" "+projector8.aspectRatio+" ");
	
	System.out.println("Creating 10th copy of the projector");
	Projector projector9=new Projector();
	projector9.brandName="epson";
	projector9.price=26111;
	projector9.brightness="1300 lumens";
	projector9.contrastRatio="15000:1";
	projector9.aspectRatio="4:19";
	projector9.toSet();
	System.out.println(projector9.brandName+" "+projector9.price+" "+projector9.brightness+" "+projector9.contrastRatio+" "+projector9.aspectRatio+" ");
	
	}

}