package Dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
	public Employees() {
		
	}
	@Id
	String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + "]";
	}
	public Employees(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	String name;
	
	
	
}
