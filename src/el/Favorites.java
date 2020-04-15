package el;

import java.util.*;
import javax.faces.bean.*;

@ManagedBean
@ApplicationScoped // No state, so saves a small amount of time
public class Favorites {
  private String[] favoriteColors1 =
    { "Grey", "Cyan", "Magenta", "Lime"};
  private List<String> favoriteColors2 =
    Arrays.asList(favoriteColors1);
  
  public String[] getFavoriteColors1() {
    return(favoriteColors1);
  }
  
  public List<String> getFavoriteColors2() {
    return(favoriteColors2);
  }
  
  // Must use Integer, not int, if you will loop over values with ui:repeat.
  
  private Integer[] nums = { -3, -2, -1, 0, 1, 2, 3 };
  
  public Integer[] getNums() {
    return(nums);
  }
  
}
