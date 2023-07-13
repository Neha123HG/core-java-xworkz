class AmazonPrime
{
static String kannadaM[]={"kutumba","kabzza","kotoraveera surasundaranga jana","upii2","buddivanta","topival","upendra","kalpana","i love u","mukunda murari",
                            "googli", "ramachari","veera","veera madakari","rajakumara","rajadhani","veera kannadiga","KGF","milana","moggina manasu",
							"santu starite forward","gajakesari","gaja" ,"natasarvabowma","aras","basava"};
static String hindiM[]={"Pathaan","kgf1","kgf2 ","jabariya jodi","brediya","bholaa","shehzada","brahmastra","mission manju","vikram vedha",
                            "2.0", "tanhaji","mohenjo daro","jaan","selfiee","sanju","war","sultan","kabir sing","dhoom3",
							"drishyam2","the kerala story","kick" ,"krrish3","3idiots"};	

static String teluguM[]={"Sankarabharnsm","bommarullu","geethanjali","manam","shiva","manmadhudu","arya","okkadu","indra","tholiprema",
                            "dollor dreams", "malliswari","baahubali","baahubali 2","drushyam","rajadhani","tagore","magadharu","eega","moggina manasu",
							"spokira","arundhathi","rajanna" ,"mahsnati","vedam","simhadri"};

static String malayalamM[]={"2018","the great indian kitchen","salute","pada","hridayam","drishyam","kaalapani","the ornate lock","devasuram","unda",
                            "iratta", "aathmakatha","munnariyippu","bahubali2","romacham","jo and jo","jallikattu","premam","indian rupee","bangalore days",
							"the address","gpathemari","artist" ,"joji","koode","virus"};
	
/*static String englishM[]={"sisu","the exorcist","evildead rise","inception","buddivanta","americon beauty","the prestige","the dark knight","the godfather part2","12 angry men",
                            "pulp fiction", "the good ,the birld and the ugle","veera","forrest gump","fight club","inceptioni","the matrix","rajani","goodfellas","se7en",
							"city of god","interstellar","parasity" ,"natasarvabowma","the pianist","back of the future"};*/
							
							
public static void main(String prime[]){
	
 String englishM[]={"sisu","the exorcist","evildead rise","inception","buddivanta","americon beauty","the prestige","the dark knight","the godfather part2","12 angry men",
                            "pulp fiction", "the good ,the birld and the ugle","veera","forrest gump","fight club","inceptioni","the matrix","rajani","goodfellas","se7en",
							"city of god","interstellar","parasity" ,"natasarvabowma","the pianist","back of the future"};
							
	getenglishM(englishM);

/*System.out.println(kannadaM[0]+ ","+ kannadaM[1]+ ","+ kannadaM[2]+ " "+kannadaM[3]+ " "+kannadaM[4]+ " ,"+kannadaM[5]+ ","+kannadaM[6]+ ","+kannadaM[7]+ ","+kannadaM[8]+ ","+kannadaM[9]+ ","+kannadaM[10]+" "+
                  kannadaM[11]+ ","+ kannadaM[12]+ ","+ kannadaM[13]+ " "+kannadaM[14]+ " "+kannadaM[15]+ " ,"+kannadaM[16]+ ","+kannadaM[17]+ ","+kannadaM[18]+ ","+kannadaM[19]+ ","+kannadaM[20]+ ","+kannadaM[21]+" "+ 
				   kannadaM[22]+ ","+ kannadaM[23]+ ","+ kannadaM[24]);
			   System.out.println(kannadaM.length);

System.out.println(hindiM[0]+ ","+ hindiM[1]+ ","+ hindiM[2]+ " "+hindiM[3]+ " "+hindiM[4]+ " ,"+hindiM[5]+ ","+hindiM[6]+ ","+hindiM[7]+ ","+hindiM[8]+ ","+hindiM[9]+ ","+hindiM[10]+" "+
                  hindiM[11]+ ","+ hindiM[12]+ ","+ hindiM[13]+ " "+hindiM[14]+ " "+hindiM[15]+ " ,"+hindiM[16]+ ","+hindiM[17]+ ","+hindiM[18]+ ","+hindiM[19]+ ","+hindiM[20]+ ","+hindiM[21]+" "+ 
				   hindiM[22]+ ","+ hindiM[23]+ ","+ hindiM[24]);
							   System.out.println(hindiM.length);
   
System.out.println(teluguM[0]+ ","+ teluguM[1]+ ","+ teluguM[2]+ " "+teluguM[3]+ " "+teluguM[4]+ " ,"+teluguM[5]+ ","+teluguM[6]+ ","+teluguM[7]+ ","+teluguM[8]+ ","+teluguM[9]+ ","+teluguM[10]+" "+
                  teluguM[11]+ ","+ teluguM[12]+ ","+ teluguM[13]+ " "+teluguM[14]+ " "+teluguM[15]+ " ,"+teluguM[16]+ ","+teluguM[17]+ ","+teluguM[18]+ ","+teluguM[19]+ ","+teluguM[20]+ ","+teluguM[21]+" "+ 
				   teluguM[22]+ ","+ teluguM[23]+ ","+ teluguM[24]);
							   System.out.println(teluguM.length);
   
System.out.println(malayalamM[0]+ ","+ malayalamM[1]+ ","+ malayalamM[2]+ " "+malayalamM[3]+ " "+malayalamM[4]+ " ,"+malayalamM[5]+ ","+malayalamM[6]+ ","+malayalamM[7]+ ","+malayalamM[8]+ ","+malayalamM[9]+ ","+malayalamM[10]+" "+
                  malayalamM[11]+ ","+ malayalamM[12]+ ","+ malayalamM[13]+ " "+malayalamM[14]+ " "+malayalamM[15]+ " ,"+malayalamM[16]+ ","+malayalamM[17]+ ","+malayalamM[18]+ ","+malayalamM[19]+ ","+malayalamM[20]+ ","+malayalamM[21]+" "+ 
				   malayalamM[22]+ ","+ malayalamM[23]+ ","+ malayalamM[24]);
				   			   System.out.println(malayalamM.length);

System.out.println(englishM[0]+ ","+ englishM[1]+ ","+ englishM[2]+ " "+englishM[3]+ " "+englishM[4]+ " ,"+englishM[5]+ ","+englishM[6]+ ","+englishM[7]+ ","+englishM[8]+ ","+englishM[9]+ ","+englishM[10]+" "+
                  englishM[11]+ ","+ englishM[12]+ ","+ englishM[13]+ " "+englishM[14]+ " "+englishM[15]+ " ,"+englishM[16]+ ","+englishM[17]+ ","+englishM[18]+ ","+englishM[19]+ ","+englishM[20]+ ","+englishM[21]+" "+ 
				   englishM[22]+ ","+ englishM[23]+ ","+ englishM[24]);
				   			   System.out.println(englishM.length);

}*/

getkannadaM();
System.out.println("------------------");
gethindiM();
System.out.println("------------------");
getteluguM();
System.out.println("------------------");
getmalayalamM();
System.out.println("------------------");
//getenglishM();
}

public static void getkannadaM(){
System.out.println("inside getkannadaM");
for(String kan : kannadaM){
	System.out.println(kan);
}
}
public static void gethindiM(){
	System.out.println("inside gethindi");
	for(String hin :hindiM){
		System.out.println(hin);
	}
}
public static void getteluguM(){
	System.out.println("inside getteluguM");
	for(String tel :teluguM){
		System.out.println(tel);
	}
}
public static void getmalayalamM(){
	System.out.println("inside getmalayalamM");
	for(String malay :malayalamM){
		System.out.println(malay);
	}
}
public static void getenglishM(String englishM[]){
	System.out.println("inside getenglishM");
	for(String eng :englishM){
		System.out.println(eng);
	}
}
}