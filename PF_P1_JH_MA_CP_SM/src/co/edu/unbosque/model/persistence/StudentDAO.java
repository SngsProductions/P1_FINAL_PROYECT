package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Student;

public class StudentDAO {
	 private FileStudent FileSt;

	    public StudentDAO(FileStudent FileSt) {
	        this.FileSt = FileSt;
	    }

	    public boolean addStudentString (String name,String lastname, String id, String email, String gen, String prog, String borned, String nat,
		String times, ArrayList<Student> students, File file) {
			
	        Student New = new Student(id,name,lastname,email,gen,prog,borned,nat,times);
	        if ( SearchStudent(id, students) == null) {
	            students.add(New);
	            FileSt.WriteFile(students, file);
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public Student SearchStudent(String name, ArrayList<Student> students) {
	        Student find = null;

	        if (!students.isEmpty()) {
	           
	            for (Student s : students) {
	                if (name.equals(s.getName())) {
	                    find = s;
	                }
	            }
	        }

	        return find;
	    }

	    public boolean DeleteStudent(String id, ArrayList<Student> students, File file) {
	        try {
	            Student s = SearchStudent(id,students);
	            if (s == null) {
	                return false;
	            } else {
	                students.remove(s);
	                file.delete();
	                file.createNewFile();
	               FileSt.WriteFile(students, file);
	                return true;
	            }
	        } catch (IOException ex) {
	            ex.printStackTrace();
	            return false;
	        }
	    }

	    public boolean ModifyStudent(String name,String name2,String lastname, String id, String email, String gen, String prog, String borned, String nat,
	    		String times, ArrayList<Student> students, File file) {
	        Student find = SearchStudent(id,students);
	        try {
	            if (find!= null) {
	                DeleteStudent(id, students, file);
	                find.setName(name2);
	                find.setId(id);
	                find.setGen(gen);
	                find.setBorned(borned);
	                find.setEmail(email);
	                find.setNat(nat);
	                find.setProg(prog);
	                find.setTimes(times);
	                find.setLastname(lastname);
	                students.add(find);
	                file.delete();
	                file.createNewFile();
	                FileSt.WriteFile(students, file);
	                return true;
	            } else {
	                return false;
	            }
	        } catch (IOException ex) {
	            ex.printStackTrace();
	            return false;
	        }
	    }

	    public String ViewList(File file) {
	        ArrayList<Student> students = FileSt.ReadFile(file);
	        String List = "";
	        for (Student s :  students) {
	            List = List.concat(s.toString() + "\n");
	        }
	        return List;
	    }
}
