class Bookst{

public static void main(String args[]){

Books books=new Books();
books.name="ramayana";
books.type="writing";
books.author="abe";
books.price=500;
books.publicationName="aravinda";
books.noOfPages=5000;
books.toknowledge();
System.out.println(books.name+ "  "+books.type+ "  "+books.author+" "+ books.price+ " "+books.publicationName+" "+books.noOfPages);

Books books1=new Books();
books1.name="mahabarath";
books1.type="writ";
books1.author="neee";
books1.price=550;
books1.publicationName="virat institute";
books1.noOfPages=550;
books1.toknowledge();
System.out.println(books1.name+ "  "+books1.type+ "  "+books1.author+" "+ books1.price+ " "+books1.publicationName+" "+ books1.noOfPages);

}

}