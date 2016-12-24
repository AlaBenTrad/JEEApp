import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import metier.entities.Livre;
import metier.sessions.IBibRemote;


public class Menu extends JFrame{
	JPanel Fenetre = new JPanel(new BorderLayout());
	JLabel ab = new JLabel ("Gestion des promotions ");
	JLabel code  = new JLabel ("Code Promotion ");
	JLabel titre  = new JLabel ("Date Début");
	JLabel mon_auteur  = new JLabel ("Date fin");
	
	JTextField Tcode = new JTextField("");
	JTextField Tday1 = new JTextField("");
	JTextField TMonth1 = new JTextField("");
	JTextField TYear1 = new JTextField("");
	
	JTextField Tday2 = new JTextField("");
	JTextField TMonth2 = new JTextField("");
	JTextField TYear2 = new JTextField("");
	
	JButton ajouter = new JButton("Ajouter");
	
	JButton consulter = new JButton("Consulter");
	JButton supprimer = new JButton("Supprimer");
	JButton quitter = new JButton("Quiter");
	
	JRadioButton ctous= new JRadioButton ("Consulter promotion");
	JRadioButton ccode= new JRadioButton ("Consulter promotion par code ");
	
	ButtonGroup g = new ButtonGroup();
	JTextArea Tbd = new JTextArea("");
	
	
	
	public Menu ()
	{  setBounds(100, 100, 450, 300);
	
	Fenetre.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(Fenetre);
	Fenetre.add(code);
	Fenetre.add(ab);
	Fenetre.add(titre);
	Fenetre.add(mon_auteur);
	Fenetre.add(Tcode);
	Fenetre.add(Tday1);
	Fenetre.add(TMonth1);
	Fenetre.add(TYear1);
	Fenetre.add(Tday2);
	Fenetre.add(TMonth2);
	Fenetre.add(TYear2);
	Fenetre.add(ajouter);
	Fenetre.add(ajouter);
	Fenetre.add(supprimer);
	Fenetre.add(consulter);
	Fenetre.add(quitter);
//
	Fenetre.add(ccode);
	Fenetre.add(Tbd);
		this.setTitle("Gestion Des promotions");
		this.setSize(1000,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(null);
		this.setLocale(java.util.Locale.getDefault());
		ab.setForeground(Color.BLUE);
		ab.setFont(new java.awt.Font("Algerien",3,18));
		ab.setBounds(new Rectangle(200, 0, 250, 50));
		code.setForeground(Color.black);
		code.setFont(new java.awt.Font("Algerien",3,18));
		code.setBounds(new Rectangle(100, 80, 150, 20));
		mon_auteur.setForeground(Color.black);
		mon_auteur.setFont(new java.awt.Font("Algerien",3,18));
		mon_auteur.setBounds(new Rectangle(100, 160, 100, 40));
		titre.setForeground(Color.black);
		titre.setFont(new java.awt.Font("Algerien",3,18));
		titre.setBounds(new Rectangle(100, 120, 100, 20));
		
		Tcode.setBounds(new Rectangle(250, 80, 196, 21));
		Tcode.setForeground(Color.black);
		Tcode.setFont(new java.awt.Font("Algerien",3,18));
		
		Tday1.setBounds(new Rectangle(250, 125, 50, 21));
		Tday1.setForeground(Color.black);
		Tday1.setFont(new java.awt.Font("Algerien",3,18));
		TMonth1.setBounds(new Rectangle(310, 125, 50, 21));
		TMonth1.setForeground(Color.black);
		TMonth1.setFont(new java.awt.Font("Algerien",3,18));
		TYear1.setBounds(new Rectangle(370, 125, 75, 21));
		TYear1.setForeground(Color.black);
		TYear1.setFont(new java.awt.Font("Algerien",3,18));
		Tday2.setBounds(new Rectangle(250, 170, 50, 21));
		Tday2.setForeground(Color.black);
		Tday2.setFont(new java.awt.Font("Algerien",3,18));
		TMonth2.setBounds(new Rectangle(310, 170, 50, 21));
		TMonth2.setForeground(Color.black);
		TMonth2.setFont(new java.awt.Font("Algerien",3,18));
		TYear2.setBounds(new Rectangle(370, 170, 75, 21));
		TYear2.setForeground(Color.black);
		TYear2.setFont(new java.awt.Font("Algerien",3,18));
		ajouter.setBounds(new Rectangle(460, 80, 196, 25));
		ajouter.setForeground(Color.black);
		ajouter.setFont(new java.awt.Font("Algerien",3,14));
		supprimer.setBounds(new Rectangle(460, 125, 196, 25));
		supprimer.setForeground(Color.black);
		supprimer.setFont(new java.awt.Font("Algerien",3,14));
		quitter.setBounds(new Rectangle(460, 165, 196, 25));
		quitter.setForeground(Color.black);
		quitter.setFont(new java.awt.Font("Algerien",3,14));
		consulter.setBounds(new Rectangle(700, 80, 196, 25));
		consulter.setForeground(Color.black);
		consulter.setFont(new java.awt.Font("Algerien",3,14));
		ctous.setBounds(new Rectangle(700, 150, 196, 25));
		ctous.setForeground(Color.black);
		ctous.setFont(new java.awt.Font("Algerien",3,14));
		ccode.setBounds(new Rectangle(700, 180, 250, 25));
		ccode.setForeground(Color.black);
		ccode.setFont(new java.awt.Font("Algerien",3,14));
		Tbd.setBounds(new Rectangle(700, 220, 200, 150));
		Tbd.setForeground(Color.black);
		Tbd.setFont(new java.awt.Font("Algerien",5,10));
		
	}
		
}