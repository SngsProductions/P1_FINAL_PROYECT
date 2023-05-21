package co.edu.unbosque.model;

import java.util.ArrayList;
import java.io.File;
import co.edu.unbosque.model.persistence.FileStudent;
import co.edu.unbosque.model.persistence.StudentDAO;

public class StudentDTO {
	 private ArrayList<Student> students;
	    private StudentDAO Studentdao;
	    private File file = new File("Data/Students.dat");
	    private FileStudent FileSt;
	    
	    public StudentDTO(){
	        students = new ArrayList<Student>();
	        FileSt = new FileStudent(file);
	        Studentdao = new StudentDAO (FileSt);
	        students = FileSt.ReadFile(file);
	    }

		public ArrayList<Student> getStudents() {
			return students;
		}

		public void setStudents(ArrayList<Student> students) {
			this.students = students;
		}

		public StudentDAO getStudentdao() {
			return Studentdao;
		}

		public void setStudentdao(StudentDAO studentdao) {
			Studentdao = studentdao;
		}

		public File getFile() {
			return file;
		}

		public void setFile(File file) {
			this.file = file;
		}

		public FileStudent getFileSt() {
			return FileSt;
		}

		public void setFileSt(FileStudent fileSt) {
			FileSt = fileSt;
		}
}
