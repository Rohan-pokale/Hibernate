package ghibli.ai;

import ghibli.ai.Dao.StudentDao;
import ghibli.ai.Model.ContractStudent;
import ghibli.ai.Model.Student;
import ghibli.ai.Model.FullTimeStudent;

public class App 
{
    public static void main( String[] args )
    {

        StudentDao employeeDao = new StudentDao();

        Student employee = new Student();
        employee.setName("Vaibhav Rakshe");
        employeeDao.addEmployee(employee);

        FullTimeStudent fullTimeEmployee = new FullTimeStudent();
        fullTimeEmployee.setName("Rohan Pokale");
        fullTimeEmployee.setScore(91.83);
        employeeDao.addEmployee(fullTimeEmployee);

        ContractStudent contractemp = new ContractStudent();
        contractemp.setName("Vikas Adhe");
        contractemp.setGrade("A");
        employeeDao.addEmployee(contractemp);
    }
}

