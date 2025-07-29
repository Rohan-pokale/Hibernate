package ghibli.ai.Dao;

import ghibli.ai.Model.Student;
import ghibli.ai.Util.hibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {

    public void addEmployee(Student employee) {
        Session session=hibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.persist(employee);
        tx.commit();
        session.close();
        System.out.println("Employee added successfully");
    }  //adding new movie

    public void UpdateMovie(Student employee) {
        Session session=hibernateUtil.getSessionFactory().openSession();

        Student fetchedMovie=session.find(Student.class, employee.getId());
        if(fetchedMovie!=null){
            Transaction tx=session.beginTransaction();
            session.merge(employee);
            tx.commit();
            System.out.println("Employee Updated successfully");
        }
        else{
            System.out.println("Employee not found");
        }
        session.close();
    } //updating existing movie

    public void deleteMovie(Student employee) {
        Session session=hibernateUtil.getSessionFactory().openSession();

        Student fetchedEmployee=session.find(Student.class, employee.getId());
        if(fetchedEmployee!=null){
            Transaction tx=session.beginTransaction();
            session.remove(employee);
            tx.commit();
            System.out.println("Employee deleted successfully");
        }
        else {
            System.out.println("Movie not found");
        }
        session.close();
    } //deleting existing movie

    public Student getEmployee(int id) {
        Session session=hibernateUtil.getSessionFactory().openSession();

        Student fetchedEmployee=session.find(Student.class, id);
        session.close();
        return fetchedEmployee;
    } //getting existing movie

}
