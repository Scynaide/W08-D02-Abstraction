package codealong;


public class Movie extends Show{

    private String director;
    private int runtime;

    public Movie(String title, int releaseYear, double rating, String actors, boolean isOnNetflix){
        super(title, releaseYear, rating, actors, isOnNetflix);
        this.director = director;
        this.runtime = runtime;
    }


    public void displayShowInfo() {
        super.displayShowInfo();
        System.out.println(", director: " + director + ", runtime: " + runtime);
    }










}
