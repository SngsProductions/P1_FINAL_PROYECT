package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class IncomeTeacher extends JPanel {
	
	private JLabel img_ing;
	private JButton btn_exit;
	private JPanel datos,sarch,info;
	private JComboBox busqueda;
	private String[] search= {"Orden alfabetico A-Z","Orden alfabetico Z-A","Actividad/Inactividad estudiantes","Programas con mayor estudiantes ",
			"Programas con mas estudiantes ","Informe de datos"};
	
	public IncomeTeacher() {
		setBounds(0,0,1980,1080);
		setVisible(true);
		setLayout(null);
		setBorder(new TitledBorder(""));
		setBackground(Color.WHITE);
		repaint();
		initComponents();
		
	}
	
	private void initComponents() {
		
		busqueda = new JComboBox(search);
		busqueda.setBounds(200, 350, 200, 30);
		add(busqueda);
		
		datos = new JPanel();
		datos.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		add(datos);
		
		sarch = new JPanel();
		sarch.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		add(sarch);
		
		info = new JPanel();
		info.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		add(info);
				
		
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

	
	

}
