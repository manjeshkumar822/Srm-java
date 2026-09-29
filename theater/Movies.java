package theater;

class Movies{
    String MovieName;
    String Language;
    Movies(String MovieName, String Language){
        this.MovieName = MovieName;
        this.Language = Language;
    }
    void Display(){
        System.out.println("MovieName : "+MovieName);
        System.out.println("Languages : "+Language);
    }
    String getMovieName(){
        return MovieName;
    }
}