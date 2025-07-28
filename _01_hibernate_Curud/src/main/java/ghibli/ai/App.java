package ghibli.ai;

import ghibli.ai.Controller.MovieController;
import ghibli.ai.Model.Movie;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      MovieController movieController=new MovieController();
      Movie movie=new Movie();

      movie.setTitle("sanam teri kasam");
      movie.setYear("2010");
      movie.setDescription("this is love story");
      movie.setActors(List.of("Rohan","Vikas","Rohit"));
      movieController.addMovie(movie);   // adding new movie

//        movie.setId(1);
//        movie.setTitle("jawan");
//        movie.setYear("2009");
//        movie.setDescription("this is SRK movie");
//        movieController.UpdateMovie(movie);   // update existing movie

//        movie.setId(2);
//        System.out.println(movieController.getMovie(2)); //get existing movie

//        movie.setId(52);
//        movie.setTitle("sanam teri kasam");
//        movie.setYear("2010");
//        movie.setDescription("this is love story");
//        movieController.deleteMovie(movie);   // deleting existing movie
    }
}
