package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.management.loading.ClassLoaderRepository;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{

	private MainPane mp;
	private JButton btn_exit;
	private JButton btn_reg;
	
	
	public MainFrame() {
		setTitle("SISTEMA GESTION ACADEMICA UEB");
		
		setIconImage(new ImageIcon("icons\\logo.png").getImage());
		setSize(1280,720);
		setVisible(true);
		setLayout(null);
		setResizable(false);
		setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultCloseOperation(0);
		initComponents();
	}

	private void initComponents() {
		
		
		
		mp = new MainPane();
		getContentPane().add(mp);
		repaint();
			
	}
	
	


	public MainPane getMp() {
		return mp;
	}

	public void setMp(MainPane mp) {
		this.mp = mp;
	}

	public JButton getBtn_reg() {
		return btn_reg;
	}

	public void setBtn_reg(JButton btn_reg) {
		this.btn_reg = btn_reg;
	}

	public JButton getBtn_exit() {
		return btn_exit;
	}

	public void setBtn_exit(JButton btn_exit) {
		this.btn_exit = btn_exit;
	}
	
}
