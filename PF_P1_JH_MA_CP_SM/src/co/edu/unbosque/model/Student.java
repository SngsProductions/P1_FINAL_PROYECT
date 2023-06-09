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
	private String []program = {"ING.SISTEMAS" ,"ING.SISTEMAS NOCTURNA",  "ING.ELECTRONICA","ING.AMBIENTAL","BIOINGIENERIA","ING.INDUSTRIAL" };
	private String []nation = {"Nacional", "Internacional"};
	private String []borned_nat = {"Distrito Capital (Bogot�)","Amazonas",
			 "Antioquia", "Arauca", "Atl�ntico", "Bol�var", "Boyac�", "Caldas"
			, "Caquet�", "Casanare", "Cauca", "Cesar"
			, "Choc�", "C�rdoba", "Cundinamarca", "Guain�a", "La Guajira"
			, "Guaviare", "Huila", "Magdalena", "Meta", "Nari�o"
			, "Norte de Santander", "Putumayo", "Quind�o"
			, "Risaralda", "San Andr�s y Providencia"
			, "Santander", "Sucre", "Tolima", "Valle del Cauca",
			"Vaup�s", "Vichada"} ;
	private String []borned_int = {"Colombia", "Afganist�n", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", 
		    "Australia", "Austria", "Azerbaiy�n", "Bahamas", "Bahr�in", "Bangladesh", "Barbados", "B�lgica", "Belice", "Ben�n", "Bielorrusia", 
		    "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brun�i", "Bulgaria", "Burkina Faso", "Burundi", "But�n", 
		    "Cabo Verde", "Camboya", "Camer�n", "Canad�", "Catar", "Chad", "Chile", "China", "Chipre", "Comoras", "Congo", 
		    "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", 
		    "Egipto", "El Salvador", "Emiratos �rabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "Espa�a", "Estados Unidos", "Estonia", 
		    "Etiop�a", "Fiji", "Filipinas", "Finlandia", "Francia", "Gab�n", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", 
		    "Guinea", "Guinea-Bis�u", "Guinea Ecuatorial", "Guyana", "Hait�", "Honduras", "Hungr�a", "India", "Indonesia", "Irak", "Ir�n", 
		    "Irlanda", "Islandia", "Islas Marshall", "Islas Salom�n", "Israel", "Italia", "Jamaica", "Jap�n", "Jordania", "Kazajist�n", 
		    "Kenia", "Kirguist�n", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "L�bano", "Liberia", "Libia", "Liechtenstein", "Lituania", 
		    "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Mal�", "Malta", "Marruecos", "Mauricio", 
		    "Mauritania", "M�xico", "Micronesia", "Moldavia", "M�naco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", 
		    "Nicaragua", "N�ger", "Nigeria", "Noruega", "Nueva Zelanda", "Om�n", "Pa�ses Bajos", "Pakist�n", "Palaos", "Panam�", "Pap�a Nueva Guinea", 
		    "Paraguay", "Per�", "Polonia", "Portugal", "Reino Unido", "Rep�blica Centroafricana", "Rep�blica Checa","Republica Democratica del congo"}; 
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String name,String lastname, String id, String email, String gen, String prog, String borned, String nat,
			String times, String code, boolean active_c) {
		
		super(name,lastname, id, email, gen, prog, borned, nat, times,code ,active_c);
		
		
	}
	
	

	@Override
	public String toString() {
		return "Student [Identificacion :" + id + "]" + "Nombre : " +name  + " Apellido: "+ lastname+ "Genero : "+ gen+
	 "\r\n"+ "Correo : "+email+ "[Programa: "+prog+" ]"+"Franja horaria: "+ times+ " Lugar de nacimiento"+borned+"\r\n";
				
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
