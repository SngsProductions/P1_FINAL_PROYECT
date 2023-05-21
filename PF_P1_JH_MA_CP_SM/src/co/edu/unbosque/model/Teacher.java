package co.edu.unbosque.model;

import java.io.Serializable;

public class Teacher extends Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Teacher(String name,String lastname, String id, String email, String gen, String prog, String borned, String nat,
			String times) {
		super(name, id, email, gen, prog, borned, nat, times, lastname);
		// TODO Auto-generated constructor stub
	}

}
