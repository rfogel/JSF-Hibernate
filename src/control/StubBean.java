package control;

import java.io.Serializable;  

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class StubBean implements Serializable 
{    
	private static final long serialVersionUID = -5021667350842860280L;
	
	private String firstname;  
      
    public String getFirstname() {  
        return firstname;  
    }  
  
    public void setFirstname(String firstname) {  
        this.firstname = firstname;  
    }  
}
