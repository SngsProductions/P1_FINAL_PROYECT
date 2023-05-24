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
	    //Revisar metodo inster creado a base de este 
	    public boolean addStudentString (String name,String lastname, String id, String email, String gen, String prog, String borned, String nat,
		String times, ArrayList<Student> students, File file) {
			
	        Student New = new Student(id,name,lastname,email,gen,prog,borned,nat,times, times, false);
	        if ( searchStudent(id, students) == null) {
	            students.add(New);
	            FileSt.WriteFile(students, file);
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public Student searchStudent(String name, ArrayList<Student> students) {
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
	    
	    public Student searchStudent(String email,String code, ArrayList<Student> students) {
	        Student find = null;
	        System.out.println(email +"\n"+ code );
	        if (!students.isEmpty()) {
	        	
	            for (Student s : students) {
	                if (email.equals(s.getEmail())) {
	                	if(code.equals(s.getCode())) {
	                		s.setActive_c(true);
	                		find = s;
	                	}
	                }
	            }
	        }

	        return find;
	    }

	    public boolean DeleteStudent(String id, ArrayList<Student> students, File file) {
	        try {
	            Student s = searchStudent(id,students);
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
	        Student find = searchStudent(id,students);
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

	
		public boolean isAdded(String id, ArrayList<Student> find) {
			Student s = searchStudent(id,find);
			return (s!=null? true:false);
		}

		

		public void insert(ArrayList<Student> students, File file, Student newStudent) {
			if(searchStudent(newStudent.getName(),students)==null) {
				students.add(newStudent);
				FileSt.WriteFile(students, file);
			}else {
				System.out.println("No se pudo guardar la persona");
			}
		}


}
