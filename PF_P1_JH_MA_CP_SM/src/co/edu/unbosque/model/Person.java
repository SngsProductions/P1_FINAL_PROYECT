package co.edu.unbosque.model;

import java.io.Serializable;

public abstract class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String name;
	protected String id;
	protected String email;
	protected String gen;
	protected String prog;
	protected String borned;
	protected String nat;
	protected String times;
	protected String lastname;
public Person(String name,String lastname,String id,String email,String gen,String prog,String borned,String nat,String times) {
this.borned=borned;
this.name=name;
this.id=id;
this.email=email;
this.gen=gen;
this.prog=prog;
this.nat=nat;
this.times=times;
this.lastname=lastname;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGen() {
	return gen;
}
public void setGen(String gen) {
	this.gen = gen;
}
public String getProg() {
	return prog;
}
public void setProg(String prog) {
	this.prog = prog;
}
public String getBorned() {
	return borned;
}
public void setBorned(String borned) {
	this.borned = borned;
}
public String getNat() {
	return nat;
}
public void setNat(String nat) {
	this.nat = nat;
}
public String getTimes() {
	return times;
}
public void setTimes(String times) {
	this.times = times;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}

}
