package converter;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import model.Player;

@FacesConverter(forClass=Player.class)
public class PlayerConverter implements Converter
{
	public static List<Player> playerDB; 
	
	static
	{
		playerDB = new ArrayList<Player>();  
		  
		playerDB.add(new Player("Messi", 10, "messi.jpg", "CF"));  
		playerDB.add(new Player("Xavi", 6, "xavi.jpg", "CM"));  
		playerDB.add(new Player("Puyol", 5, "puyol.jpg", "CB"));  
	}
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2)
	{
		if (arg2.trim().equals("")) {  
            return null;  
        } 
		else 
		{  
            try 
            {  
                String player = arg2;  
  
                for (Player p : playerDB) 
                {  
                    if (p.getName().equals(player)) 
                    {  
                        return p;  
                    }  
                }  
  
            } catch(NumberFormatException exception) {  
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid player"));  
            }  
        }  
  
        return null;  
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2)
	{
		return ((Player)arg2).getName();
	}

}
