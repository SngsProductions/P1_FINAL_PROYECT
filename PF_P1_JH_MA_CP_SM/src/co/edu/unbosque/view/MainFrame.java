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
	private RegisterPane rp;
	private JButton btn_exit;
	private JButton btn_reg;
	
	
	public MainFrame() {
		setTitle("SISTEMA GESTION ACADEMICA UEB");
		
		setIconImage(new ImageIcon("icons\\logo.png").getImage());
		setSize(1376,805);
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
		
		rp = new RegisterPane();
		rp.setVisible(false);
		getContentPane().add(rp);
		repaint();
			
		
		mp = new MainPane();
		getContentPane().add(mp);
		repaint();
		
		
	}
	
	


	public MainPane getMp() {
		return mp;
	}
	
	public RegisterPane getRp() {
		return rp;
	}
	

	public void setMp(MainPane mp) {
		this.mp = mp;
	}

	public void setRp(RegisterPane rp) {
		this.rp = rp;
	}


	

	
	
}
