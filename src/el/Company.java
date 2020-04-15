package el;

import java.util.*;
import javax.faces.bean.*;

@ManagedBean
@ApplicationScoped
public class Company {
  private Map<String,String> employees = new HashMap<>();
  
  public Company() {
    employees.put("a1234", "Admiral Clarenbald");
    employees.put("a1235", "Lord Danyau");
    employees.put("a1236", "Gandalf");
  }
  
  public Map<String,String> getEmployees() {
    return(employees);
  }

}
