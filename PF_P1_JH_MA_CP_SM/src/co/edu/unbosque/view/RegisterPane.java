package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class RegisterPane extends JPanel {
	
	private JTextField txt_name;
	private JTextField txt_last;
	private JTextField txt_id;
	private JTextField txt_email;
	private JComboBox cbx_gender;
	private JComboBox cbx_program;
	private JComboBox cbx_borned;
	private JComboBox cbx_n;
	private JLabel img_back;
	private JButton btn_save;
	private JButton btn_cancel;
	
	
	public RegisterPane() {
		
		setBounds(0,0,1980,1080);
		setVisible(true);
		setLayout(null);
		setBorder(new TitledBorder(""));
		setBackground(Color.WHITE);
		repaint();
		initComponents();
	}

	private void initComponents() {
		
		txt_name = new JTextField();
		txt_name.setVisible(true);
		txt_name.setBackground(null);
		txt_name.setBorder(null);
		txt_name.setBounds(720,150,320,20);
		add(txt_name);
		
		txt_last = new JTextField();
		txt_last.setVisible(true);
		txt_last.setBackground(null);
		txt_last.setBorder(null);
		txt_last.setBounds(720,200,320,20);
		add(txt_last);
		
		txt_id = new JTextField();
		txt_id.setVisible(true);
		txt_id.setBounds(720,280,320,20);
		add(txt_id);
		
		txt_email = new JTextField();
		txt_email.setVisible(true);
		txt_email.setBounds(720,350,320,20);
		add(txt_email);
		
		cbx_gender = new JComboBox();
		cbx_gender.setVisible(true);
		cbx_gender.setBounds(720,420,320,20);
		add(cbx_gender);
		
		cbx_program = new JComboBox();
		cbx_program.setVisible(true);
		cbx_program.setBounds(720,480,320,20);
		add(cbx_program);
		

		
		cbx_n = new JComboBox();
		cbx_n.setVisible(true);
		cbx_n.setBounds(750,550,350,20);
		cbx_n.setActionCommand("RECHARGE");
		add(cbx_n);
		
		cbx_borned = new JComboBox();
		cbx_borned.setVisible(true);
		cbx_borned.setBounds(750,640,350,20);
		add(cbx_borned);
		
		btn_save = new JButton("GUARDAR");
		btn_save.setVisible(true);
		btn_save.setBorder(null);
		btn_save.setIcon(new ImageIcon("icons\\BtnSav.png"));
		btn_save.setBounds(140,465,200,40);
		btn_save.setActionCommand("SAVE");
		add(btn_save);
		
		btn_cancel = new JButton("CANCELAR");
		btn_cancel.setVisible(true);
		btn_cancel.setBorder(null);
		btn_cancel.setIcon(new ImageIcon("icons\\BtnCan.png"));
		btn_cancel.setBounds(140,600,200,40);
		btn_cancel.setActionCommand("CANCEL");
		add(btn_cancel);
		
		img_back = new JLabel();
		img_back.setIcon(new ImageIcon("icons\\10.png"));
		img_back.setBounds(0,0,1366,768);
		add(img_back);
	}

	public JTextField getTxt_name() {
		
		return txt_name;
	}

	public void setTxt_name(JTextField txt_name) {
		this.txt_name = txt_name;
	}


	public JTextField getTxt_id() {
		return txt_id;
	}

	public void setTxt_id(JTextField txt_id) {
		this.txt_id = txt_id;
	}

	public JTextField getTxt_email() {
		return txt_email;
	}

	public void setTxt_email(JTextField txt_email) {
		this.txt_email = txt_email;
	}

	public JComboBox getCbx_gender() {
		return cbx_gender;
	}

	public void setCbx_gender(JComboBox cbx_gender) {
		this.cbx_gender = cbx_gender;
	}

	public JComboBox getCbx_program() {
		return cbx_program;
	}

	public void setCbx_program(JComboBox cbx_program) {
		this.cbx_program = cbx_program;
	}


	public JComboBox getCbx_borned() {
		return cbx_borned;
	}

	public void setCbx_borned(JComboBox cbx_borned) {
		this.cbx_borned = cbx_borned;
	}

	public JComboBox getCbx_n() {
		return cbx_n;
	}

	public void setCbx_n(JComboBox cbx_n) {
		this.cbx_n = cbx_n;
	}

	public JButton getBtn_save() {
		return btn_save;
	}

	public void setBtn_save(JButton btn_save) {
		this.btn_save = btn_save;
	}

	public JButton getBtn_cancel() {
		return btn_cancel;
	}

	public void setBtn_cancel(JButton btn_cancel) {
		this.btn_cancel = btn_cancel;
	}
	
	
	
	
	


}
