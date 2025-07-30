package ghibli.ai.Dao;

import ghibli.ai.Model.Movie;
import ghibli.ai.Util.hibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class CourseDao {

    public List<Movie> getAllMovies() {
        Session session= hibernateUtil.getSessionFactory().openSession();
        Query<Movie> query=session.createQuery("from Movie", Movie.class);
        List<Movie> movies = query.getResultList();
        return movies;
    }
}
