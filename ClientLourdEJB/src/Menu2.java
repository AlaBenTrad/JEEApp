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


public class Menu2 extends JFrame{
	JPanel Fenetre = new JPanel(new BorderLayout());
	JLabel ab = new JLabel ("Gestion des Clients ");
	JLabel code  = new JLabel ("Code Client ");
	JLabel titre  = new JLabel ("Nom Client ");
	JLabel mon_auteur  = new JLabel ("Adresse Client");
	
	JTextField Tcode = new JTextField("");
	JTextField Ttitre = new JTextField("");
	JTextField Tnomauteur = new JTextField("");
	
	JButton ajouter = new JButton("Ajouter");
	JButton consulter = new JButton("Consulter");
	JButton supprimer = new JButton("Supprimer");
	JButton quitter = new JButton("Quiter");
	
	JRadioButton ctous= new JRadioButton ("Consulter Client");
	JRadioButton ccode= new JRadioButton ("Consulter Client par code ");
	
	ButtonGroup g = new ButtonGroup();
	JTextArea Tbd = new JTextArea("");
	
	
	
	public Menu2 ()
	{  setBounds(100, 100, 450, 300);
	
	Fenetre.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(Fenetre);
	Fenetre.add(code);
	Fenetre.add(ab);
	Fenetre.add(titre);
	Fenetre.add(mon_auteur);
	Fenetre.add(Tcode);
	Fenetre.add(Ttitre);
	Fenetre.add(Tnomauteur);
	Fenetre.add(ajouter);
	Fenetre.add(supprimer);
	Fenetre.add(consulter);
	Fenetre.add(quitter);

	Fenetre.add(ccode);
	Fenetre.add(Tbd);
		this.setTitle("Gestion Des Clients");
		this.setSize(1000,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(null);
		this.setLocale(java.util.Locale.getDefault());
		ab.setForeground(Color.BLUE);
		ab.setFont(new java.awt.Font("Algerien",3,18));
		ab.setBounds(new Rectangle(170, 0, 200, 50));
		code.setForeground(Color.black);
		code.setFont(new java.awt.Font("Algerien",3,18));
		code.setBounds(new Rectangle(100, 80, 150, 20));
		mon_auteur.setForeground(Color.black);
		mon_auteur.setFont(new java.awt.Font("Algerien",3,18));
		mon_auteur.setBounds(new Rectangle(100, 160, 150, 40));
		titre.setForeground(Color.black);
		titre.setFont(new java.awt.Font("Algerien",3,18));
		titre.setBounds(new Rectangle(100, 120, 100, 20));
		
		Tcode.setBounds(new Rectangle(240, 80, 196, 21));
		Tcode.setForeground(Color.black);
		Tcode.setFont(new java.awt.Font("Algerien",2,13));
		
		Ttitre.setBounds(new Rectangle(240, 125, 196, 21));
		Ttitre.setForeground(Color.black);
		Ttitre.setFont(new java.awt.Font("Algerien",2,13));
		Tnomauteur.setBounds(new Rectangle(240, 170, 196, 21));
		Tnomauteur.setForeground(Color.black);
		Tnomauteur.setFont(new java.awt.Font("Algerien",2,13));
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
		ccode.setBounds(new Rectangle(700, 180, 220, 25));
		ccode.setForeground(Color.black);
		ccode.setFont(new java.awt.Font("Algerien",3,14));
		Tbd.setBounds(new Rectangle(700, 220, 200, 150));
		Tbd.setForeground(Color.black);
		Tbd.setFont(new java.awt.Font("Algerien",5,10));
		
		try 
		{
			Properties p = new Properties();
			p.put(Context.URL_PKG_PREFIXES, "org.jboss.client.naming");
			Context ctx =new InitialContext(p);
			
			final IBibRemote stub =(IBibRemote) ctx.lookup("workspace:/Koja/Koja!metier.sessions.IBibRemote");
			//AJOUTER UN Livre
			ActionListener EcouteurB4 = new ActionListener()
			{
				public void actionPerformed (ActionEvent e)
				{
					stub.addLivre(new Livre(Long.parseLong(Tcode.getText()),Ttitre.getText(),Tnomauteur.getText()));
				   Tcode.setText("");
				   Ttitre.setText("");
				   Tnomauteur.setText("");
				}
			
				};
			ajouter.addActionListener(EcouteurB4);
			
			//SUPPRIMER UN Livre
			ActionListener EcouteurB5=new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					long a=Long.parseLong(Tcode.getText());
					stub.supprimerLivre(a);
				}
			};
			supprimer.addActionListener(EcouteurB5);
			//QUITTER
			ActionListener EcouteurB6 = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.exit(0);
				}
			};
			quitter.addActionListener(EcouteurB6);
 		} catch (NamingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
		
}