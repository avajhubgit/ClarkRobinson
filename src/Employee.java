public class Employee {
  private int employeeID;
  private String employeeFirstName;
  private String employeeLastName;
  private String employeeLogin;
  private String employeePassword;
  private String employeeEmail;
  private int departmentID;//the department in which the employee works 
  private String employeePhone;
  private String employeePosition;//position name

  public Employee(String employeeFirstName,
                  String employeeLastName,
                  String employeeLogin,
                  String employeePassword,
                  String employeeEmail,
                  int departmentID,
                  String employeePhone,
                  String employeePosition
                  ){
    employeeID = 100;
    this.employeeFirstName = employeeFirstName;
    this.employeeLastName = employeeLastName;
    this.employeeLogin = employeeLogin;
    this.employeePassword = employeePassword;
    this.employeeEmail = employeeEmail;
    this.departmentID = departmentID;
    this.employeePhone = employeePhone;
    this.employeePosition = employeePosition;
  }    
}
