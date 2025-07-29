package ghibli.ai.Dao;

import ghibli.ai.Model.Employee;
import ghibli.ai.Util.hibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDao {

    public void addEmployee(Employee employee) {
        Session session=hibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.persist(employee);
        tx.commit();
        session.close();
        System.out.println("Employee added successfully");
    }  //adding new movie

    public void UpdateMovie(Employee employee) {
        Session session=hibernateUtil.getSessionFactory().openSession();

        Employee fetchedMovie=session.find(Employee.class, employee.getId());
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

    public void deleteMovie(Employee employee) {
        Session session=hibernateUtil.getSessionFactory().openSession();

        Employee fetchedEmployee=session.find(Employee.class, employee.getId());
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

    public  Employee getEmployee(int id) {
        Session session=hibernateUtil.getSessionFactory().openSession();

        Employee fetchedEmployee=session.find(Employee.class, id);
        session.close();
        return fetchedEmployee;
    } //getting existing movie

}
