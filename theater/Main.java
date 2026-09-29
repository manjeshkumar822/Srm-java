package theater;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static void addMovie(ArrayList<Movies> mov,String BranchName,String MovieName,String Language,String ShowName, String ShowTime,int TicketsAvailable){
        Branch bh = new Branch(BranchName, ShowName);
        Movies mv = new Movies(MovieName, Language);
        mov.add(mv);
        Shows sh = new Shows(MovieName, ShowTime, TicketsAvailable);

    }
    static void addDiscount(String Name, int Tickets, String validity){
        Discount dis = new Discount(Name, Tickets, validity);
    }
    static void bookMovies(int id,ArrayList<Movies> mov, String movie){
        mov.get(id).Display();
        movie=mov.get(id).getMovieName();
        System.out.println("Movie Name : "+movie);
    }
    static void addSeating(ArrayList<Seating> sea, String ShowName,String Timming,String SeatPreference,String Status,int price){

        Seating seat = new Seating(ShowName,"09:00 am","first","active",100);
        sea.add(seat);
        Seating seat1 = new Seating(ShowName,"12:00 pm","second","active",150);
        sea.add(seat1);
        Seating seat2 = new Seating(ShowName,"09:00 am","thired","active",200);
        sea.add(seat2);
    }
    static void chooseSeating(ArrayList<Seating> sea){

    }
    public static void main(String[] args) {
        ArrayList<Movies> mov = new ArrayList<>();
        ArrayList<Seating> sea = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Theater th = new Theater("PVR", "Anna Nagar", "Aakash");
        Admin ad = new Admin("Aakash", "Anna Nagar");
        addMovie(mov, "Anna Nagar", "Theri", "Tamil","Morning", "09:00 am", 12);
        addMovie(mov, "Anna Nagar", "Varisu", "Tamil","Morning", "12:00 pm", 12);
        addMovie(mov, "Anna Nagar", "Goat", "Tamil","Morning", "15:00 pm", 12);
        addDiscount("5%", 5, "true");
        
        User us = new User("Manjesh", "9691652071", "manjesh@gmail.com");
        while (true) {
            System.out.println("1. Admin\n2. User");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("welcome Admin! ");
                System.out.println("1.Total Revenue\n2.");
                n=sc.nextInt();
                // if(n==1){

                // }else if(n==2){

                // }
            }
            else if(n==2){
                System.out.println("Welcome User!");
                System.out.println("1.Book tickets\n2.Cancel Tickets");
                n=sc.nextInt();
                if(n==1){
                    int count=1;
                    for(Movies mm : mov){
                        System.out.print(count+" : ");
                        mm.Display();
                        count++;
                    }
                    n=sc.nextInt();
                    String movie="";
                    bookMovies(n-1,mov,movie);
                    System.out.println("Movie name is : "+movie);
                    // chooseSeating(sea,);
                    System.out.println("No Of tickets : ");
                    n=sc.nextInt();

                }
                // else if(n==2){

                // }
            }
        }

    }
}

