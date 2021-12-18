package org.jyothi;

import java.util.ArrayList;
import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	                                         //@OneToMany(mappedBy="alien")  //LAZY LOADING
	@OneToMany(mappedBy="alien",fetch=FetchType.EAGER)   //fetching eagerly
	private Collection<Laptop> laptop=new ArrayList<Laptop>();
	public Alien() {
		
	}
	
	public Alien(int aid, String aname, Collection<Laptop> laptop) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.laptop = laptop;
	}

	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Collection<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(Collection<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	
	

}
