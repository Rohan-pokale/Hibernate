package ghibli.ai;

import ghibli.ai.Dao.TeacherDao;
import ghibli.ai.Model.Address;
import ghibli.ai.Model.Teacher;

public class App 
{
    public static void main( String[] args )
    {

        TeacherDao employeeDao = new TeacherDao();

        Teacher teacher=new Teacher();
        Address address=new Address();

        address.setCity("Nagpur");
        address.setStreet("Ghansawangi");
        address.setCountry("India");
        address.setZip(15672);

        teacher.setName("Vikas Adhe");
        teacher.setSalary(1200000);
        teacher.setAddress(address);

        employeeDao.addEmployee(teacher);



    }
}

