class TicketBooking{

private int bookingId;
private int noOfSeats;
private String source;
private String destination;
private String date;
private String timing;
private String prn;
private double price;

public void setBookingId(int bookingId){
this.bookingId=bookingId;

}
public int getBookingId(){
return bookingId;
}
public void setNoOfSeats(int noOfSeats){
this.noOfSeats=noOfSeats;
}
public int getNoOfSeats(){
	return noOfSeats;
}

public void setsource(String source){
this.source=source;	
	
}
public String getsource(){
	return source;
	
}
public void setDestination(String destination){
	this.destination=destination;
}
public String getDestination(){
	return destination;
}
public void setDate(String date){
	this.date=date;
}
public String getDate(){
	return date;
}
public void setTiming(String timing){
	this.timing=timing;
}
public String getTiming(){
	return timing;
}
public void setPrn(String prn){
	this.prn=prn;
}
public String getPrn(){
	return prn;
}
public void setPrice(double price){
	this.price=price;
}
public double getPrice(){
	return price;
}


}