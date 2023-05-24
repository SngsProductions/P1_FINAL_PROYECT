package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class IncomePane extends JPanel{
	
	private JTextField txt_email;
	private JTextField txt_pasword;
	private JLabel img_ing;
	private JButton btn_cancel;
	private JButton btn_income;
	
	public IncomePane() {
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
		txt_email.setBorder(null);
		txt_email.setBounds(755,310,370,20);
		add(txt_email);
		
		txt_pasword = new JTextField();
		txt_pasword.setVisible(true);
		txt_pasword.setBorder(null);
		txt_pasword.setBounds(755,395,370,20);
		add(txt_pasword);
		
	
		
		btn_cancel = new JButton();
		btn_cancel.setVisible(true);
		btn_cancel.setBorder(null);
		btn_cancel.setIcon(new ImageIcon("icons\\BtnCan.png"));
		btn_cancel.setBounds(170,490,200,40);
		
		btn_cancel.setBorderPainted(false);
		btn_cancel.setOpaque(false);
		btn_cancel.setContentAreaFilled(false);
		 
		btn_cancel.setActionCommand("CANCEL_IP");
		add(btn_cancel);
		
		btn_income = new JButton();
		btn_income.setVisible(true);
//		btn_income.setBorder(null);
		//btn_income.setIcon(new ImageIcon("icons\\BtnIng.png"));
		btn_income.setBounds(160,400,200,40);
//		btn_income.setBorderPainted(false);
//		btn_income.setOpaque(false);
//		btn_income.setContentAreaFilled(false);
//		btn_income.setBorderPainted(false); 
		btn_income.setBackground(Color.black);
		btn_income.setActionCommand("INCOME");
		add(btn_income);
		
		
		img_ing = new JLabel();
		img_ing.setIcon(new ImageIcon("icons\\4.png"));
		img_ing.setBounds(0, 0, 1280, 720);
		add(img_ing);
		
		
	}
	public JTextField getTxt_email() {
		return txt_email;
	}
	public void setTxt_email(JTextField txt_email) {
		this.txt_email = txt_email;
	}
	public JTextField getTxt_pasword() {
		return txt_pasword;
	}
	public void setTxt_pasword(JTextField txt_pasword) {
		this.txt_pasword = txt_pasword;
	}
	public JLabel getImg_ing() {
		return img_ing;
	}
	public void setImg_ing(JLabel img_ing) {
		this.img_ing = img_ing;
	}
	public JButton getBtn_cancel() {
		return btn_cancel;
	}
	public void setBtn_cancel(JButton btn_cancel) {
		this.btn_cancel = btn_cancel;
	}
	public JButton getBtn_income() {
		return btn_income;
	}
	public void setBtn_income(JButton btn_income) {
		this.btn_income = btn_income;
	}

}
