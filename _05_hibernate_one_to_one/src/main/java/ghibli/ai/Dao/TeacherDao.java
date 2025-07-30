package ghibli.ai.Dao;

import ghibli.ai.Model.Teacher;
import ghibli.ai.Util.hibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TeacherDao {

    public void addEmployee(Teacher employee) {
        Session session=hibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.persist(employee);
        tx.commit();
        session.close();
        System.out.println("Employee added successfully");
    }  //adding new movie

    public void UpdateMovie(Teacher employee) {
        Session session=hibernateUtil.getSessionFactory().openSession();

        Teacher fetchedMovie=session.find(Teacher.class, employee.getTeacherId());
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

    public void deleteMovie(Teacher employee) {
        Session session=hibernateUtil.getSessionFactory().openSession();

        Teacher fetchedEmployee=session.find(Teacher.class, employee.getTeacherId());
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

    public Teacher getEmployee(int id) {
        Session session=hibernateUtil.getSessionFactory().openSession();

        Teacher fetchedEmployee=session.find(Teacher.class, id);
        session.close();
        return fetchedEmployee;
    } //getting existing movie

}
