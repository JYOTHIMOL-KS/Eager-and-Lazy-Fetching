package org.jyothi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;
	@ManyToOne
	private Alien alien;
	public Laptop() {
		
	}
	
	public Laptop(int lid, String lname, Alien alien) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.alien = alien;
	}

	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public Alien getAlien() {
		return alien;
	}
	public void setAlien(Alien alien) {
		this.alien = alien;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", alien=" + alien + "]";
	}
	

}
