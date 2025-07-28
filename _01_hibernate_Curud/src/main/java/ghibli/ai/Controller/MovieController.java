package ghibli.ai.Controller;

import ghibli.ai.Model.Movie;
import ghibli.ai.Service.MovieService;

import java.util.List;

public class MovieController {

    private MovieService movieService=new MovieService();

    public void addMovie(Movie movie) {
        movieService.addMovie(movie);
    }
    public void UpdateMovie(Movie movie) {
        movieService.UpdateMovie(movie);
    }
    public void deleteMovie(Movie movie) {
        movieService.deleteMovie(movie);
    }
    public  Movie getMovie(int id) {
        return movieService.getMovie(id);
    }
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

}
