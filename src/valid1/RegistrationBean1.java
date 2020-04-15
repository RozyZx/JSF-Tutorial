package valid1;

import javax.faces.bean.*;

@ManagedBean
public class RegistrationBean1 {
  private String firstName, middleName, lastName, employeeId;
  private Integer buildingNumber;
  
  public String getFirstName() {
    return(firstName);
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public String getMiddleName() {
    return(middleName);
  }
  
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }
  
  public String getLastName() {
    return(lastName);
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public String getEmployeeId() {
    return(employeeId);
  }
  
  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }
  
  public Integer getBuildingNumber() {
    return(buildingNumber);
  }
  
  public void setBuildingNumber(Integer buildingNumber) {
    this.buildingNumber = buildingNumber;
  }
  
  public String doRegistration() {
    return("confirm-registration");
  }
}
