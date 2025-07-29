package ghibli.ai;

import ghibli.ai.Dao.TeacherDao;
import ghibli.ai.Model.ContractTeacher;
import ghibli.ai.Model.Teacher;
import ghibli.ai.Model.FullTimeTeacher;

public class App 
{
    public static void main( String[] args )
    {

        TeacherDao employeeDao = new TeacherDao();

        Teacher employee = new Teacher();
        employee.setName("Vaibhav Rakshe");
        employeeDao.addEmployee(employee);

        FullTimeTeacher fullTimeEmployee = new FullTimeTeacher();
        fullTimeEmployee.setName("Rohan Pokale");
        fullTimeEmployee.setSalary(1200000.88);
        employeeDao.addEmployee(fullTimeEmployee);

        ContractTeacher contractemp = new ContractTeacher();
        contractemp.setName("Vikas Adhe");
        contractemp.setContractAmount(1200000.0);
        employeeDao.addEmployee(contractemp);

        System.out.println(employeeDao.getEmployee(1));
    }
}

