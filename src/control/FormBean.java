package control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import model.Player;

@ManagedBean
@SessionScoped
public class FormBean implements Serializable 
{
	private static final long serialVersionUID = 5446358547888432864L;
	
	private String username;
	private String password;
	private Player player;
	private String state;

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public Player getPlayer()
	{
		return player;
	}

	public void setPlayer(Player player)
	{
		this.player = player;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public List<String> complete(String query) 
	{  
        List<String> results = new ArrayList<String>();  
          
        results.add("Rio de Janeiro");
        results.add("São Paulo");
          
        return results;  
    }

	public void addInfo(ActionEvent actionEvent) {  
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Sample info message", "PrimeFaces rocks!"));  
    }  
  
    public void addWarn(ActionEvent actionEvent) {  
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Sample warn message", "Watch out for PrimeFaces!"));  
    }  
  
    public void addError(ActionEvent actionEvent) {  
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Sample error message", "PrimeFaces makes no mistakes"));  
    }  
  
    public void addFatal(ActionEvent actionEvent) {  
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Sample fatal message", "Fatal Error in System"));  
    }  
    
    public String page1() {
		return "galleria?faces-redirect=true";
	}
    
    /*
     * 
		<!-- <p:commandButton id="infoButton" value="Info" actionListener="#{formBean.addInfo}" />
		<p:commandButton id="warnButton" value="Warn" actionListener="#{formBean.addWarn}" />
		<p:commandButton id="errorButton" value="Error" actionListener="#{formBean.addError}" />
		<p:commandButton id="fatalButton" value="Fatal" actionListener="#{formBean.addFatal}" /> -->
     * */
}  

