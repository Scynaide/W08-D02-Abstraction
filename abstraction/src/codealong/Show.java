package codealong;

public abstract class Show{

    private String title;
    private int releaseYear;
    private double rating;
    private String actors;
    private boolean isOnNetflix = false;

    public Show(String title, int releaseYear, double rating, String actors, boolean isOnNetflix){
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating= rating;
        this.actors = actors;
        this.isOnNetflix = isOnNetflix;
    }

    // setters

    public void setTitle(String title) {
        if (!title.isEmpty() || title != null) {
            this.title = title;
        } else {
            System.out.println("Title must not be empty");
        }
    }

    public void setReleaseYear(int releaseYear) {
        if (releaseYear > 0 && releaseYear < 2014) {
            this.releaseYear = releaseYear;
        } else {
            System.out.println("please add the release Year");
        }
    }

    public void setRating(double rating) {
        if (rating < 10 && rating > 0)
        {
            this.rating = rating;
            this.rating++;
        }
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public void setIsOnNetflix(boolean isOnNetflix) {
        this.isOnNetflix = false;
    }

    // getters

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public String getActors() {
        return actors;
    }

    public boolean getIsOnNetflix() {
        return isOnNetflix;
    }

    public void displayShowInfo(){
        System.out.println("title: " + title + ", releaseYear: " + releaseYear + ", rating:" + rating + ", actors" + actors + ", isOnNetflix" + isOnNetflix);
    }

    public String toString(){
        return "title: " + title + ", releaseYear: " + releaseYear + ", rating:" + rating + ", actors" + actors + ", isOnNetflix" + isOnNetflix;
    }
}

