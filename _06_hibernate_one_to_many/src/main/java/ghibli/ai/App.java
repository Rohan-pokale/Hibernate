package ghibli.ai;

import ghibli.ai.Dao.TeacherDao;
import ghibli.ai.Model.Address;
import ghibli.ai.Model.Teacher;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {

        TeacherDao employeeDao = new TeacherDao();

        Teacher teacher=new Teacher();
        Address address1=new Address();
        Address address2=new Address();

        address1.setCity("Nagpur");
        address1.setStreet("Ghansawangi");
        address1.setCountry("India");
        address1.setZip(15672);

        address2.setCity("Pune");
        address2.setStreet("Shivajinagar");
        address2.setCountry("India");
        address2.setZip(23456);

        teacher.setName("Rohan Pokale");
        teacher.setSalary(1200000);
        teacher.setAddresses(List.of(address1,address2));

        employeeDao.addEmployee(teacher);



    }
}

