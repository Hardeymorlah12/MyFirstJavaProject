package Assignment;

public class MovieTestDrive {
    public static void main (String[] args){
        Movie newMovie = new Movie();
        newMovie.genre = "Tragedy";
        newMovie.rating = 50;
        newMovie.title = "Ayinla";

        newMovie.playIt();
    }
}
