package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class ActivatePane extends JPanel{
	
	private JTextField txt_email;
	private JTextField txt_code;
	private JLabel img_ac;
	private JButton btn_activate;
	private JButton btn_cancel;
	private JButton btn_exit;
	
	public ActivatePane() {
		setBounds(0,0,1980,1080);
		setVisible(true);
		setLayout(null);
		setBorder(new TitledBorder(""));
		setBackground(Color.WHITE);
		repaint();
		initComponents();
	}
	
	private void initComponents() {
		
		txt_email = new JTextField();
		txt_email.setVisible(true);
		txt_email.setBounds(850, 280, 360, 20);
		add(txt_email);
		
		txt_code= new JTextField();
		txt_code.setVisible(true);
		txt_code.setBounds(850,500,360,20);
		add(txt_code);
	
		
		img_ac = new JLabel();
		img_ac.setIcon(new ImageIcon("icons\\3.png"));
		img_ac.setBounds(0, 0, 1366, 768);
		add(img_ac);
		
		btn_cancel = new JButton();
		btn_cancel.setVisible(true);
		btn_cancel.setBorder(null);
		btn_cancel.setBackground(null);
		btn_cancel.setBorderPainted(false);
		btn_cancel.setOpaque(false);
		btn_cancel.setContentAreaFilled(false);
		 
		
		btn_cancel.setIcon(new ImageIcon("icons\\BtnCan.png"));
		btn_cancel.setBounds(190,550,225,40);
		btn_cancel.setActionCommand("CANCEL");
		add(btn_cancel);
		
		
		btn_activate = new JButton();
		btn_activate.setVisible(true);
		btn_activate.setBackground(null);
		btn_activate.setBounds(190, 425, 225, 50);
		btn_activate.setBorderPainted(false);
		btn_activate.setOpaque(false);
		btn_activate.setContentAreaFilled(false);
		 
		btn_activate.setActionCommand("ACTIVATE");
		add(btn_activate);
		
		
		
	}

	public JButton getBtn_activate() {
		return btn_activate;
	}

	public void setBtn_activate(JButton btn_activate) {
		this.btn_activate = btn_activate;
	}

	public JButton getBtn_cancel() {
		return btn_cancel;
	}

	public void setBtn_cancel(JButton btn_cancel) {
		this.btn_cancel = btn_cancel;
	}

	public JButton getBtn_exit() {
		return btn_exit;
	}

	public void setBtn_exit(JButton btn_exit) {
		this.btn_exit = btn_exit;
	}

	public JTextField getTxt_email() {
		return txt_email;
	}

	public void setTxt_email(JTextField txt_email) {
		this.txt_email = txt_email;
	}

	public JTextField getTxt_code() {
		return txt_code;
	}

	public void setTxt_code(JTextField txt_code) {
		this.txt_code = txt_code;
	}

	public JLabel getImg_ac() {
		return img_ac;
	}

	public void setImg_ac(JLabel img_ac) {
		this.img_ac = img_ac;
	}

}

