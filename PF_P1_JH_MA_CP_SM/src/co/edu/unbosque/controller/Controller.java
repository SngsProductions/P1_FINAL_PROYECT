package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.mail.MessagingException;

import co.edu.unbosque.model.Email;
import co.edu.unbosque.model.Student;
import co.edu.unbosque.view.MainFrame;
import co.edu.unbosque.view.MainPane;
import co.edu.unbosque.view.RegisterPane;

public class Controller implements ActionListener {
	
	private MainFrame mf;
	private RegisterPane rp;
	private MainPane mp;
	private Email e;
	private Student st;
	private String command;
	private String option;
	private String h;
	
	
	public Controller() {
	
		initListeners();
	}

	private void initListeners() {
		mf= new MainFrame();
		rp = new RegisterPane();
		st = new Student();
		mf.getMp().getBtn_exit().addActionListener(this);
		mf.getMp().getBtn_reg().addActionListener(this);
		mf.getRp().getBtn_cancel().addActionListener(this);
		mf.getRp().getBtn_save().addActionListener(this);
		mf.getRp().getCbx_n().addActionListener(this);
		mf.getRp().getCbx_program().addActionListener(this);
		
		
		
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		command = e.getActionCommand();
		
		System.out.println(command);
		switch(command) {
		case "RECHARGE":
			recharge();
			rp.repaint();
			break;
		case "SAVE":
			saveData();
			clearReg();
			mf.getMp().setVisible(true);
			
			break;
		case "CANCEL":
			mf.getRp().setVisible(false);
			mf.getMp().setVisible(true);
			clearReg();
			break;
			
		case "REG":
			addItemsReg();
			mf.getMp().setVisible(false);
			mf.getRp().setVisible(true);
			mf.getRp().repaint();
			break;
		
		case "EXIT":
			System.exit(0);
			break;
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

	private void addItemsReg() {
		st.pushData(mf.getRp().getCbx_n(),mf.getRp().getCbx_borned(),mf.getRp().getCbx_gender(), mf.getRp().getCbx_program());	
	}

	private void saveData() {
		
		if(	mf.getRp().getCbx_program().getSelectedItem().toString().equals("ING.SISTEMAS NOCTURNA")){
			h = "Nocturna";
		}else {
			h = "Diurna";
		}
	

		st = new Student(mf.getRp().getTxt_name().getText(),
				mf.getRp().getTxt_id().getText(),
				mf.getRp().getTxt_email().getText(),
				mf.getRp().getCbx_program().getSelectedItem().toString(),
				mf.getRp().getCbx_n().getSelectedItem().toString(),
				mf.getRp().getCbx_borned().getSelectedItem().toString(),
				mf.getRp().getCbx_gender().getSelectedItem().toString(),h);
		System.out.println("Guardado con exito " +mf.getRp().getTxt_email().getText() );
		String email = mf.getRp().getTxt_email().getText();
		e = new Email(email);
		mf.getRp().setVisible(false);
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
