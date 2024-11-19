package codealong;

public class Main{
    public static void main(String[] args) {


        Actor actor1 = new Actor("Leo Dicaprio",45, "leo@gmail.com","American",true,1999,null);

        actor1.displayUserInfo();

        Movie movie = new Movie("Matrix",1999,9, " Keanu Reeves Carrie-Anne Moss Laurence Fishburne",false);

        movie.displayShowInfo();




    }
}