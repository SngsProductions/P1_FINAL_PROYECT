package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.Student;



public class FileStudent {
	 private ObjectInputStream Input;
	    private ObjectOutputStream output;

	    public FileStudent (File file) {
	        if (!file.exists()) {
	            try {
	                file.createNewFile();
	            } catch (IOException ex) {

	            }
	        }
	    }

	    public void WriteFile(ArrayList<Student> students, File file) {
	        try {
	            output = new ObjectOutputStream(new FileOutputStream(file));
	            output.writeObject(students);
	            output.close();
	        } catch (FileNotFoundException ex) {
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }

	    public ArrayList<Student> ReadFile(File file) {
	        ArrayList<Student> students = new ArrayList<Student>();
	        if (file.length() != 0) {
	            try {
	                Input = new ObjectInputStream(new FileInputStream(file));
	                students = (ArrayList<Student>) Input.readObject();
	                Input.close();
	            } catch (FileNotFoundException ex) {
	                ex.printStackTrace();
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            } catch (ClassNotFoundException ex) {
	                ex.printStackTrace();
	            }
	        }
	        return students;
	    }

		public ObjectInputStream getInput() {
			return Input;
		}

		public void setInput(ObjectInputStream input) {
			Input = input;
		}

		public ObjectOutputStream getOutput() {
			return output;
		}

		public void setOutput(ObjectOutputStream output) {
			this.output = output;
		}

	    
	   
	}

