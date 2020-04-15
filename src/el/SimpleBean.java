package el;

import javax.faces.bean.*;

@ManagedBean
@ApplicationScoped
public class SimpleBean {

	private String[] colors = {"red","blue","yellow"};
	
	public String getMessage() {
		return "Hello, World";
	}
	
	public String[] getColors() {
		return colors;
	}
	
	public double getRandom() {
		return Math.random();
	}

}
