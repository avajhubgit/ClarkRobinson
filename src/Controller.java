public class Controller {
  //model
  private Model model;
  //view
  private View view;

  public Controller(Model model, View view){
    this.model = model;
    this.view = view;
  }

  public void run(){
    //загрузка сотрудников из БД
    view.showAllEmployee(model.getEmployeeSet());//вывести список всех сотрудников для просмотра
    
    view.showAllDepartment(model.getDepartmentSet());//вывести список всех отделов для просмотра
    login();//authorization employee
    register();//register employee
    editProfile();//edit your profile by employee
  }
  
  //authorization employee
  private void login(){
  }

  //register employee
  private void register(){
    //check username   
    //create new user
    /*  
    Employee e = new Employee(employeeFirstName,
                  employeeLastName,
                  employeeLogin,
                  employeePassword,
                  employeeEmail,
                  departmentID,
                  employeePhone,
                  employeePosition
                  );
    model.addEmployee(Employee employee);
    */        
  }

  //edit your profile by employee
  private void editProfile(){
    //addNewEmployee();
    //removeEmployee();
  }
}
