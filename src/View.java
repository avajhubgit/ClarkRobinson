import java.util.Set;

public class View {
  //show list of employees
  public void showAllEmployee(Set<Employee> employeeSet){
    for(Employee e: employeeSet){
      System.out.println("FirstName");
    }
  }
  //show list of departments
  public void showAllDepartment(Set<Department> departmentSet){
    for(Department d: departmentSet){
      System.out.println("departmentName");
    }
  }
  //show profile of employee
  public void showProfile(Employee employee){
      System.out.println("FirstName");
  }
}
