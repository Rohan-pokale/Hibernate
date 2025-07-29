package ghibli.ai;

import ghibli.ai.Dao.EmployeeDao;
import ghibli.ai.Model.ContractEmployee;
import ghibli.ai.Model.Employee;
import ghibli.ai.Model.FullTimeEmployee;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {

        EmployeeDao employeeDao = new EmployeeDao();

        Employee employee = new Employee();
        employee.setName("Vaibhav Rakshe");
        employeeDao.addEmployee(employee);

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.setName("Vikas Adhe");
        fullTimeEmployee.setSalary(1200000.23);
        employeeDao.addEmployee(fullTimeEmployee);

        ContractEmployee contractemp = new ContractEmployee();
        contractemp.setName("Vikas Adhe");
        contractemp.setInvoiceAmount(1200000.23);
        employeeDao.addEmployee(contractemp);
    }
}

