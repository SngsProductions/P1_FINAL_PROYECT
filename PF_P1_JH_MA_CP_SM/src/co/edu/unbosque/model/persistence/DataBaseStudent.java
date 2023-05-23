package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


import co.edu.unbosque.model.Student;
import co.edu.unbosque.model.StudentDTO;

public class DataBaseStudent {
private File file;
private StudentDAO std;
private StudentDTO stdto;


public DataBaseStudent() {
	file= new File("Data\\datosEst.csv");
	stdto= new StudentDTO();
std= new StudentDAO(stdto.getFileSt());
}

public ArrayList<Student> Reader() {
	ArrayList<Student> Students= new ArrayList<>();
	try {
		FileReader fr= new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
	String line_read;
	while ((line_read= br.readLine())!= null){
		String []line_writed =line_read.split(";");
		String id= line_writed[0];
		String Name= line_writed[1];
		String lastname=line_writed[2];
		String email=line_writed[3];
		String gender=line_writed[4];
		String Program=line_writed[5];
		String Borned=line_writed[6];
		String Nation=line_writed[7];
		String times=line_writed[8];
		
		std.addStudentString(id,Name,lastname, email, gender, Program, Borned, Nation, times,stdto.getStudents(),stdto.getFile());
	}
	fr.close();
	br.close();
	
	
	}catch(IOException e) {
		String rta="";
		rta="Error al leer estudiante";
	}
	return Students;
	
}
}
