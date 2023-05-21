package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.Arrays;

import javax.swing.JComboBox;

import co.edu.unbosque.view.RegisterPane;

public class Student extends Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RegisterPane rp;
	private String []gender = {"Masculino" ,"Femenino"};
	private String []program = {"ING.SISTEMAS" ,"ING.SISTEMAS NOCTURNA",  "ING.ELECTRONICA"};
	private String []nation = {"Nacional", "Internacional"};
	private String []borned_nat = {"Distrito Capital (Bogotá)","Amazonas",
			 "Antioquia", "Arauca", "Atlántico", "Bolívar", "Boyacá", "Caldas"
			, "Caquetá", "Casanare", "Cauca", "Cesar"
			, "Chocó", "Córdoba", "Cundinamarca", "Guainía", "La Guajira"
			, "Guaviare", "Huila", "Magdalena", "Meta", "Nariño"
			, "Norte de Santander", "Putumayo", "Quindío"
			, "Risaralda", "San Andrés y Providencia"
			, "Santander", "Sucre", "Tolima", "Valle del Cauca",
			"Vaupés", "Vichada"} ;
	private String []borned_int = {"Colombia", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", 
		    "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bahréin", "Bangladesh", "Barbados", "Bélgica", "Belice", "Benín", "Bielorrusia", 
		    "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", 
		    "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Comoras", "Congo", 
		    "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", 
		    "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", 
		    "Etiopía", "Fiji", "Filipinas", "Finlandia", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", 
		    "Guinea", "Guinea-Bisáu", "Guinea Ecuatorial", "Guyana", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", 
		    "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", 
		    "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", 
		    "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", 
		    "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", 
		    "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", 
		    "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa","Republica Democratica del congo"}; 
	
	
	
	public Student(String name,String lastname, String id, String email, String gen, String prog, String borned, String nat,
			String times) {
		super(name,lastname, id, email, gen, prog, borned, nat, times);
		
		
	}
	@Override
	public String toString() {
		return "Student [Identificacion :" + id + "]" + "Nombre : " +name  + " Apellido: "+ lastname+ "Genero : "+ gen+
	 "\r\n"+ "Correo : "+email+ "[Programa: "+prog+" ]"+"Franja horaria: "+ times+ " Lugar de nacimiento"+borned+"\r\n";
				
	}
	
	
	public void pushData(JComboBox cbx_n, JComboBox cbx_borned, JComboBox cbx_gender, JComboBox cbx_program) {
		
		for (int g = 0 ; g< gender.length; g++) {
			cbx_gender.addItem(gender[g].toString());
		}
		for (int b = 0 ; b< nation.length; b++) {
			cbx_n.addItem(nation[b].toString());
		}
		for (int p = 0 ; p< program.length; p++) {
			cbx_program.addItem(program[p].toString());
		}	
		
	}
	public RegisterPane getRp() {
		return rp;
	}
	public void setRp(RegisterPane rp) {
		this.rp = rp;
	}
	public String[] getGender() {
		return gender;
	}
	public void setGender(String[] gender) {
		this.gender = gender;
	}
	public String[] getProgram() {
		return program;
	}
	public void setProgram(String[] program) {
		this.program = program;
	}
	public String[] getNation() {
		return nation;
	}
	public void setNation(String[] nation) {
		this.nation = nation;
	}
	public String[] getBorned_nat() {
		return borned_nat;
	}
	public void setBorned_nat(String[] borned_nat) {
		this.borned_nat = borned_nat;
	}
	public String[] getBorned_int() {
		return borned_int;
	}
	public void setBorned_int(String[] borned_int) {
		this.borned_int = borned_int;
	}


	



	


	


	
	
	
	
	
}
