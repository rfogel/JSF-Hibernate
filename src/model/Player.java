package model;

import java.io.Serializable;

public class Player implements Serializable 
{
	private static final long serialVersionUID = -9170272704529644017L;
	
	private String name;
	private Integer number;
	private String photo;
	private String position;
		
	public Player(String name, Integer number, String photo, String position)
	{
		super();
		this.name = name;
		this.number = number;
		this.photo = photo;
		this.position = position;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Integer getNumber()
	{
		return number;
	}
	public void setNumber(Integer number)
	{
		this.number = number;
	}
	public String getPhoto()
	{
		return photo;
	}
	public void setPhoto(String photo)
	{
		this.photo = photo;
	}
	public String getPosition()
	{
		return position;
	}
	public void setPosition(String position)
	{
		this.position = position;
	}
}
