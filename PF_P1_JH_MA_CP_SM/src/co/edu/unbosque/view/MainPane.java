package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class MainPane extends JPanel {

	private JButton btn_exit;
	private JLabel	img_sup;
	private JButton btn_reg;
	
	public MainPane() {
		setLayout(null);
		setSize(1980,1080);
		setBounds(0,0,1376,798);
		setBackground(Color.WHITE);
		
		setVisible(true);
		setBorder(null);
		initComponents();
	}

	private void initComponents() {
		
		btn_reg = new JButton();
		btn_reg.setVisible(true);
		btn_reg.setBackground(null);
		btn_reg.setBorder(null);
		btn_reg.setBounds(190,445,300,60);
		btn_reg.setIcon(new ImageIcon("icons\\BtnReg.png"));
		btn_reg.setActionCommand("REG");
		add(btn_reg);
		
		
		btn_exit = new JButton(); 
		btn_exit.setVisible(true);
		btn_exit.setBorder(null);
		btn_exit.setIcon(new ImageIcon("icons\\exitBtn.png"));
		btn_exit.setBounds(1300,10,60,50);
		btn_exit.setActionCommand("EXIT");
		add(btn_exit);
		
		img_sup = new JLabel();
		img_sup.setIcon(new ImageIcon("icons\\1.png"));
		img_sup.setBounds(0,0,1366,768);
		add(img_sup);
	}

	public JButton getBtn_exit() {
		return btn_exit;
	}

	public void setBtn_exit(JButton btn_exit) {
		this.btn_exit = btn_exit;
	}

	public JLabel getImg_sup() {
		return img_sup;
	}

	public void setImg_sup(JLabel img_sup) {
		this.img_sup = img_sup;
	}

	public JButton getBtn_reg() {
		return btn_reg;
	}

	public void setBtn_reg(JButton btn_reg) {
		this.btn_reg = btn_reg;
	}
	
}
