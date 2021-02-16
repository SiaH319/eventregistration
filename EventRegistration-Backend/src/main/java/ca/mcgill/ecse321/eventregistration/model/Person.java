package ca.mcgill.ecse321.eventregistration.model;

import java.util.*;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;



@Entity
public class Person{
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Id
	public String getName() {
		return this.name;
	} 


}