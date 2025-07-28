package ghibli.ai.Service;

import ghibli.ai.Dao.MovieDao;
import ghibli.ai.Model.Movie;

import java.util.List;

public class MovieService {

    MovieDao movieDao=new MovieDao();

    public void addMovie(Movie movie) {
    movieDao.addMovie(movie);
    }
    public void UpdateMovie(Movie movie) {
    movieDao.UpdateMovie(movie);
    }
    public void deleteMovie(Movie movie) {
    movieDao.deleteMovie(movie);
    }
    public  Movie getMovie(int id) {
        return movieDao.getMovie(id);
    }
    public List<Movie> getAllMovies() {
        return movieDao.getAllMovies();
    }

}
