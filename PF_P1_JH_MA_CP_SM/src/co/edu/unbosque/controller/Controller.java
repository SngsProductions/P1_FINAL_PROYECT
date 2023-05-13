package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.MainFrame;
import co.edu.unbosque.view.MainPane;
import co.edu.unbosque.view.RegisterPane;

public class Controller implements ActionListener {
	
	private MainFrame mf;
	private MainPane mp;
	private String command;
	
	public Controller() {
	
		initListeners();
	}

	private void initListeners() {
		mf= new MainFrame();
		mf.getMp().getBtn_exit().addActionListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		command = e.getActionCommand();
		
		switch(command) {
		case "REGISTER":
			break;
		
		case "EXIT":
			System.out.println(command);
			System.exit(0);
			break;
		}
	}
}
