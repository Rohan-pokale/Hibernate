package ghibli.ai;

import ghibli.ai.Dao.CourseDao;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {

        CourseDao dao=new CourseDao();
        dao.getAllMovies().forEach(System.out::println);


    }
}

