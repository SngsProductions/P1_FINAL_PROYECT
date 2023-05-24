package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class IncomeStudent extends JPanel  {
	
	private JLabel img_ing;
	private JButton btn_exit;
	private JPanel datos;
	
	public IncomeStudent() {
		setBounds(0,0,1980,1080);
		setVisible(true);
		setLayout(null);
		setBorder(new TitledBorder(""));
		setBackground(Color.WHITE);
		repaint();
		initComponents();
		
	}
	
	private void initComponents() {
		
		datos = new JPanel();
		datos.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		add(datos);
		
		btn_exit = new JButton();
		btn_exit.setActionCommand("EXIT");
		btn_exit.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		add(btn_exit);
		
		img_ing = new JLabel();
		img_ing.setIcon(new ImageIcon("icons\\fdp.png"));
		img_ing.setBounds(0, 0, 1280, 720);
		add(img_ing);
		
		
	}

	public JLabel getImg_ing() {
		return img_ing;
	}

	public void setImg_ing(JLabel img_ing) {
		this.img_ing = img_ing;
	}

	public JButton getBtn_exit() {
		return btn_exit;
	}

	public void setBtn_exit(JButton btn_exit) {
		this.btn_exit = btn_exit;
	}

	public JPanel getDatos() {
		return datos;
	}

	public void setDatos(JPanel datos) {
		this.datos = datos;
	}
	
	

}
