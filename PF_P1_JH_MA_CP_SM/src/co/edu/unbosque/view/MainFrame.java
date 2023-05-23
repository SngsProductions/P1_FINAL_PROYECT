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
	private ActivatePane ap;
	private IncomePane ip;
	private JButton btn_exit;
	private JButton btn_reg;
	
	
	public MainFrame() {
		setTitle("SISTEMA GESTION ACADEMICA UEB");
		
		setIconImage(new ImageIcon("icons\\logo.png").getImage());
		setSize(1280,750);
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
		
		ap = new ActivatePane();
		ap.setVisible(false);
		getContentPane().add(ap);
		repaint();
		
		ip = new IncomePane();
		ip.setVisible(false);
		getContentPane().add(ip);
		repaint();
		
		mp = new MainPane();
		getContentPane().add(mp);
		repaint();
		
		
	}
	
	


	public IncomePane getIp() {
		return ip;
	}

	public void setIp(IncomePane ip) {
		this.ip = ip;
	}

	public ActivatePane getAp() {
		return ap;
	}

	public void setAp(ActivatePane ap) {
		this.ap = ap;
	}

	public JButton getBtn_exit() {
		return btn_exit;
	}

	public void setBtn_exit(JButton btn_exit) {
		this.btn_exit = btn_exit;
	}

	public JButton getBtn_reg() {
		return btn_reg;
	}

	public void setBtn_reg(JButton btn_reg) {
		this.btn_reg = btn_reg;
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
