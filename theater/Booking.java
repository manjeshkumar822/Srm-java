package theater;

class Booking{
    String BookingDate;
    String BookingUser;
    String EventDate;
    String Status;
    String Discount;
    String Show;
    Booking(String BookingDate, String BookingUser, String EventDate, String Status, String Discount, String Show){
        this.BookingDate = BookingDate;
        this.BookingUser = BookingUser;
        this.EventDate = EventDate;
        this.Status = Status;
        this.Discount = Discount;
        this.Show = Show;
    }
}