package ghibli.ai.Dao;

import ghibli.ai.Model.Movie;
import ghibli.ai.Util.hibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class MovieDao {

    public void addMovie(Movie movie) {
        Session session=hibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.persist(movie);
        tx.commit();
        session.close();
        System.out.println("Movie added successfully");
    }  //adding new movie

    public void UpdateMovie(Movie movie) {
        Session session=hibernateUtil.getSessionFactory().openSession();

        Movie fetchedMovie=session.find(Movie.class, movie.getId());
        if(fetchedMovie!=null){
            Transaction tx=session.beginTransaction();
            session.merge(movie);
            tx.commit();
            System.out.println("Movie Updated successfully");
        }
        else{
            System.out.println("Movie not found");
        }
        session.close();
    } //updating existing movie

    public void deleteMovie(Movie movie) {
        Session session=hibernateUtil.getSessionFactory().openSession();

        Movie fetchedMovie=session.find(Movie.class, movie.getId());
        if(fetchedMovie!=null){
            Transaction tx=session.beginTransaction();
            session.remove(movie);
            tx.commit();
            System.out.println("Movie deleted successfully");
        }
        else {
            System.out.println("Movie not found");
        }
        session.close();
    } //deleting existing movie

    public  Movie getMovie(int id) {
        Session session=hibernateUtil.getSessionFactory().openSession();

        Movie fetchedMovie=session.find(Movie.class, id);
        session.close();
        return fetchedMovie;
    } //getting existing movie

    public List<Movie> getAllMovies() {
//        Session session=hibernateUtil.getSessionFactory().openSession();
//
//        Movie fetchedMovie=session.findMultiple(Movie.class, id);
//        session.close();
//        return fetchedMovie;
        return null;
    } //getting all existing movie
}
