/**
 * 
 */
/**
 * @author mohan
 *
 */
package collection;

import java.util.List;
import java.util.Set;

public class empBean{
	
	private Set empDetails;
	private List empList;
	private String showDetails;
	
	public void setEmpDetails(Set empDetails){
			this.empDetails = empDetails;
	}
	
	public void setEmpList(List empList){
		this.empList = empList;
		
	}
	
	public void show(){
		
		System.out.println(empList);		
	}
	

}