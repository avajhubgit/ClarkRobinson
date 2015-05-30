import java.util.HashSet;
import java.util.Set;

public class Model {
  private Set<Employee> employeeSet;
  private Set<Department> departmentSet;
  public Model(){
    employeeSet = new HashSet<Employee>();
    departmentSet = new HashSet<Department>();
  }
  //add new employee to set
  public void addEmployee(Employee employee){
      employeeSet.add(employee);
  }
    
  public Set<Employee> getEmployeeSet(){
    return employeeSet;
  }

  public Set<Department> getDepartmentSet(){
    return departmentSet;
  }          
}