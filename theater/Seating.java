package theater;

class Seating{
    String ShowName;
    String Timming;
    String SeatPreference;
    String Status;
    int price;
    Seating(String ShowName, String Timming, String SeatingPreference, String Status,int price){
        this.ShowName = ShowName;
        this.Timming = Timming;
        this.SeatPreference = SeatingPreference;
        this.Status=Status;
        this.price = price;
    }
}