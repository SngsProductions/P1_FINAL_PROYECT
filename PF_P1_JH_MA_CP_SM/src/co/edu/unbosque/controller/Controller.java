package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.mail.MessagingException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.Email;
import co.edu.unbosque.model.Person;
import co.edu.unbosque.model.Student;
import co.edu.unbosque.model.StudentDTO;
import co.edu.unbosque.model.persistence.DataBaseStudent;
import co.edu.unbosque.model.persistence.StudentDAO;
import co.edu.unbosque.view.IncomePane;
import co.edu.unbosque.view.MainFrame;
import co.edu.unbosque.view.MainPane;
import co.edu.unbosque.view.RegisterPane;

public class Controller implements ActionListener {
	
	private MainFrame mf;
	private RegisterPane rp;
	private MainPane mp;
	private IncomePane ip;
	private Email e;
	private Student st;
	private String command;
	private String option;
	private String horario;
	private DataBaseStudent f;
	private StudentDAO std;
	private StudentDTO sdto;
	private Person p;
	private boolean active_c;
	private boolean all;
	
	public Controller() {
	f= new DataBaseStudent();
	sdto= new StudentDTO();
	
	std= new StudentDAO(sdto.getFileSt());
	st=new Student();
	initListeners();
	System.out.println(std.ViewList(sdto.getFile()).toString());
	}

	private void initListeners() {
		
		mf= new MainFrame();
		rp = new RegisterPane();
		
		mf.getMp().getBtn_exit().addActionListener(this);
		mf.getMp().getBtn_reg().addActionListener(this);
		mf.getRp().getBtn_cancel().addActionListener(this);
		mf.getRp().getBtn_save().addActionListener(this);
		mf.getRp().getCbx_n().addActionListener(this);
		mf.getRp().getCbx_program().addActionListener(this);
		mf.getMp().getBtn_ing().addActionListener(this);
		mf.getIp().getBtn_cancel().addActionListener(this);
		mf.getAp().getBtn_cancel().addActionListener(this);
		mf.getMp().getBtn_act().addActionListener(this);
		mf.getAp().getBtn_activate().addActionListener(this);
		mf.getIp().getBtn_income().addActionListener(this);
		
		
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		command = e.getActionCommand();
		
		System.out.println(command);
		switch(command) {
		case "ACTIVATE":
			giveCode();
			mf.getAp().setVisible(false);
			mf.getMp().setVisible(true);
			break;
			
		case "ACT":
			mf.getAp().setVisible(true);
			mf.getMp().setVisible(false);
			break;
				
		case "ING":
			mf.getIp().setVisible(true);
			mf.getMp().setVisible(false);
			break;
			
		case "RECHARGE":
			recharge();
			rp.repaint();
			break;
			
		case "SAVE":
			if(true == isAllInfo()) {
				mf.getRp().setVisible(false);
				mf.getMp().setVisible(true);
				saveData();
				clearReg();
			}else {
				//REMPLAZAR POR JOPTION PANE
				System.out.println("Por favor complete todos los espacios");
				break;
			}
			break;	
			
			
		case "CANCEL_IP":
		mf.getIp().setVisible(false);
		mf.getMp().setVisible(true);
			break;
			
		case "CANCEL_AP":
			mf.getAp().setVisible(false);
			mf.getMp().setVisible(true);
			break;
			
		case "CANCEL":
			mf.getRp().setVisible(false);
			mf.getMp().setVisible(true);
			clearReg();
			break;
			
		case "REG":
			pushData(mf.getRp().getCbx_n(),mf.getRp().getCbx_borned(),mf.getRp().getCbx_gender(), mf.getRp().getCbx_program());	
			mf.getMp().setVisible(false);
			mf.getRp().setVisible(true);
			mf.getRp().repaint();
			break;
		
		case "EXIT":
			System.exit(0);
			break;
		case "INCOME":
			mf.getIpt().setVisible(true);
			mf.getMp().setVisible(false);
		}
	}

	private void giveCode() {
	ArrayList<Student>find = new ArrayList<Student>();
	find.addAll(sdto.getStudents());
	
	Student s = sdto.getStudentdao().searchStudent(mf.getAp().getTxt_email().getText(),mf.getAp().getTxt_code().getText(), find);
	if(s!=null) {
		
		JOptionPane.showMessageDialog(mp, "Se activo con exito!");
	}else {
		System.out.println("No se pudo activar");
		mf.getAp().getTxt_code().setText("");
		mf.getAp().getTxt_email().setText("");
		}
	}

	

	private void pushData(JComboBox cbx_n, JComboBox cbx_borned, JComboBox cbx_gender, JComboBox cbx_program) {
		for (int g = 0 ; g< st.getGender().length; g++) {
			cbx_gender.addItem(st.getGender()[g].toString());
		}
		for (int b = 0 ; b< st.getNation().length; b++) {
			cbx_n.addItem(st.getNation()[b].toString());
		}
		for (int p = 0 ; p< st.getProgram().length; p++) {
			cbx_program.addItem(st.getProgram()[p].toString());
		}	
		
	}

	private void recharge() {
		try {
			 option = mf.getRp().getCbx_n().getSelectedItem().toString();
			}catch(Exception NullPointerException){
			}
			mf.getRp().getCbx_borned().removeAllItems();
			if(option.equals("Nacional")) {
					for (int n = 0 ; n< st.getBorned_nat().length; n++) {
						mf.getRp().getCbx_borned().addItem(st.getBorned_nat()[n].toString());
					}
				}else {
					mf.getRp().getCbx_borned().removeAllItems();
					for (int i = 0 ; i< st.getBorned_int().length; i++) {
						mf.getRp().getCbx_borned().addItem(st.getBorned_int()[i].toString());
					}
					
			}
	}

	

	private void saveData() {
		
		ArrayList<Student>find = new ArrayList<Student>();
		
			if(	mf.getRp().getCbx_program().getSelectedItem().toString().equals("ING.SISTEMAS NOCTURNA")){
				horario = "Nocturna";
			}else {
				horario = "Diurna";
			}
			
			
			
			if(sdto.getStudentdao().isAdded(mf.getRp().getTxt_id().getText(),find)) {
				System.out.println("Ya existe una persona con estos datos");
			}else {
				String email = mf.getRp().getTxt_email().getText();
				e = new Email(email);
				sdto.getStudentdao().insert(sdto.getStudents(),sdto.getFile(),st = new Student(mf.getRp().getTxt_name().getText(),mf.getRp().getTxt_name().getText(),
						mf.getRp().getTxt_id().getText(),
						mf.getRp().getTxt_email().getText().toLowerCase(),
						mf.getRp().getCbx_program().getSelectedItem().toString(),
						mf.getRp().getCbx_n().getSelectedItem().toString(),
						mf.getRp().getCbx_borned().getSelectedItem().toString(),
						mf.getRp().getCbx_gender().getSelectedItem().toString(),horario,
						e.getCode(),active_c));
				
				
				System.out.println(e.getCode());
				
				
				active_c = false;
			}
			
																//aca va a ir el txt last name 
			
			
			
	
	}


	

	

	private boolean isAllInfo() {
		
		if(mf.getRp().getTxt_name().getText().equals("")){
			return false;
		}else if(mf.getRp().getTxt_id().getText().equals("")){
			return false;
		}else if(mf.getRp().getTxt_email().getText().equals("")){
			return false;
		}else if(mf.getRp().getCbx_program().getSelectedItem().toString().equals("")) {
			return false;
		}else if(mf.getRp().getCbx_n().getSelectedItem().toString().equals("")) {
			return false;
		}else if(mf.getRp().getCbx_borned().getSelectedItem().toString().equals("")) {
			return false;
		}else if(mf.getRp().getCbx_gender().getSelectedItem().toString().equals("")) {
			return false;
		}
		
		return true;
		
	}

	private void clearReg() {
		mf.getRp().getTxt_email().setText("");
		mf.getRp().getTxt_id().setText("");
		mf.getRp().getTxt_name().setText("");
		mf.getRp().getCbx_borned().removeAllItems();
		mf.getRp().getCbx_n().removeAllItems();
		mf.getRp().getCbx_gender().removeAllItems();
		mf.getRp().getCbx_program().removeAllItems();
	
		
	}
}
