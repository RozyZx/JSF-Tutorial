package ajax;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class Ajax {
	private int pressed = -1, scoreIndex = 0;
	private String val1 = "0", val2 = "0";
	private String[] scores = {"A","B","C","Victory", "Defeat"};
	
	public Date getTime() {
		return (new Date());
	}
	
	public int getPressed() {
		++pressed;
		return pressed;
	}
	
	public void setVal1(String num) {
		val1 = num;
	}
	
	public String getVal1() {
		return val1;
	}
	
	public void setVal2(String num) {
		val2 = num;
	}
	
	public String getVal2() {
		return val2;
	}
	
	public double getSum() {
		return ( Double.parseDouble(val1) + Double.parseDouble(val2) );
	}
	
	public String getScore() {
		return scores[scoreIndex];
	}
	
	public void scoreTry() {
		if(scoreIndex < 3) {
			if(chance(0.5)) {
				++scoreIndex;
			}
			else {
				scoreIndex = 4;
			}
		}
		else {};
		
	}
	
	public void scoreReset() {
		scoreIndex = 0;
	}
	
	private boolean chance(double A) {
		if(Math.random() < A) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//dropdown menu
	
	
}
