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
	
	public MainPane() {
		
		setBounds(5,0,1250,670);
		setBackground(Color.WHITE);
		setVisible(true);
		setBorder(null);
		initComponents();
	}

	private void initComponents() {
	
		btn_exit = new JButton(""); 
		btn_exit.setVisible(true);
		btn_exit.setBorder(null);
		btn_exit.setIcon(new ImageIcon("icons\\exitBtn.png"));
		btn_exit.setBackground(Color.decode("#82ba0f"));
		btn_exit.setBounds(1190,30,60,50);
		btn_exit.setActionCommand("EXIT");
		add(btn_exit);
		
		img_sup = new JLabel();
		img_sup.setIcon(new ImageIcon("icons\\back01.png"));
		img_sup.setBounds(0,0,1400,670);
		add(img_sup);
	}

	public JButton getBtn_exit() {
		return btn_exit;
	}

	public void setBtn_exit(JButton btn_exit) {
		this.btn_exit = btn_exit;
	}
	
}
