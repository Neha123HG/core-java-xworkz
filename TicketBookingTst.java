class TicketBookingTst{

public static void main(String args[]){


TicketBooking ref=new TicketBooking();

ref.setBookingId(6);
System.out.println(ref.getBookingId());


ref.setNoOfSeats(20);
System.out.println(ref.getNoOfSeats());


ref.setsource("Hassan");
System.out.println(ref.getsource());


ref.setDestination("mysore");
System.out.println(ref.getDestination());

ref.setDate("6-01-2024");
System.out.println(ref.getDate());


ref.setTiming("7-30am");
System.out.println(ref.getTiming());


ref.setPrn("neha");
System.out.println(ref.getPrn());


ref.setPrice(1500.00);
System.out.println(ref.getPrice());



}

}