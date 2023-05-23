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
	private JButton btn_act;
	private JButton btn_ing;
	
	public MainPane() {
		setLayout(null);
		//setSize(1980,1080);
		setBounds(0,0,1280,720);
		setBackground(Color.WHITE);
		
		setVisible(true);
		setBorder(null);
		initComponents();
	}

	private void initComponents() {
		
		btn_ing = new JButton();
		btn_ing.setVisible(true);
		btn_ing.setBackground(Color.DARK_GRAY);
		btn_ing.setOpaque(false);  // Hace que el botón no sea opaco
	    btn_ing.setContentAreaFilled(false);  // Hace que el área de contenido del botón no esté llena
	    btn_ing.setBorderPainted(false); 
		btn_ing.setBorder(null);
		btn_ing.setBounds(800,410,280,60);
		//btn_ing.setIcon(new ImageIcon("icons\\BtnIng.png"));
		btn_ing.setActionCommand("ING");
		add(btn_ing);
		
		btn_reg = new JButton();
		btn_reg.setVisible(true);
		btn_reg.setBackground(null);
		btn_reg.setBorder(null);
		btn_reg.setBounds(180,450,300,60);
		btn_reg.setOpaque(false);  // Hace que el botón no sea opaco
		btn_reg.setContentAreaFilled(false);  // Hace que el área de contenido del botón no esté llena
		btn_reg.setBorderPainted(false); 
	//	btn_reg.setIcon(new ImageIcon("icons\\BtnReg.png"));
		btn_reg.setActionCommand("REG");
		add(btn_reg);
		
		btn_act = new JButton();
		btn_act.setVisible(true);
		btn_act.setBackground(null);
		btn_act.setBorder(null);
		btn_act.setBounds(545,510,300,60);
		btn_act.setOpaque(false);  // Hace que el botón no sea opaco
		btn_act.setContentAreaFilled(false);  // Hace que el área de contenido del botón no esté llena
		btn_act.setBorderPainted(false); 
		//btn_act.setIcon(new ImageIcon("icons\\BtnAct.png"));
		btn_act.setActionCommand("ACT");
		add(btn_act);
		
	
		
		
		btn_exit = new JButton(); 
		btn_exit.setVisible(true);
		btn_exit.setBorder(null);
		btn_exit.setIcon(new ImageIcon("icons\\exitBtn.png"));
		btn_exit.setBounds(1210,10,60,50);
		btn_exit.setActionCommand("EXIT");
		add(btn_exit);
		
		img_sup = new JLabel();
		img_sup.setIcon(new ImageIcon("icons\\1.gif"));
		img_sup.setBounds(0,0,1280,720);
		add(img_sup);
	}

	public JButton getBtn_act() {
		return btn_act;
	}

	public void setBtn_act(JButton btn_act) {
		this.btn_act = btn_act;
	}

	public JButton getBtn_ing() {
		return btn_ing;
	}

	public void setBtn_ing(JButton btn_ing) {
		this.btn_ing = btn_ing;
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
