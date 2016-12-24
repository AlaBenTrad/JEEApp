package com.jmdoudoux.test.swing.menu;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestMenuSwing1 extends JMenuBar {

  public TestMenuSwing1() {

    // Listener g�n�rique qui affiche l'action du menu utilis�
    ActionListener afficherMenuListener = new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        System.out.println("El�ment de menu [" + event.getActionCommand()
            + "] utilis�.");
      }
    };

    // Cr�ation du menu livre
    JMenu livreMenu = new JMenu("Livre");
    JMenuItem item = new JMenuItem("Ajouter");
    item.addActionListener(afficherMenuListener);
    livreMenu.add(item);
    
    item = new JMenuItem("Consulter");
    item.addActionListener(afficherMenuListener);
    livreMenu.add(item);


    // Cr�ation du menu promotion
    JMenu promoMenu = new JMenu("Promotion");
    item = new JMenuItem("Ajouter");
    item.addActionListener(afficherMenuListener);
    promoMenu.add(item);
    
    item = new JMenuItem("Consulter");
    item.addActionListener(afficherMenuListener);
    promoMenu.add(item);
    
    // Cr�ation du menu Client
    JMenu cliMenu = new JMenu("Client");
    item = new JMenuItem("Ajouter");
    item.addActionListener(afficherMenuListener);
    cliMenu.add(item);
    
    item = new JMenuItem("Consulter");
    item.addActionListener(afficherMenuListener);
    cliMenu.add(item);
    
 // Cr�ation du menu autre
    JMenu autMenu = new JMenu("Autre");
    autMenu.add(item);
    
    // ajout des menus � la barre de menus
    add(livreMenu);
    add(promoMenu);
    add(cliMenu);
    add(autMenu);
  }

  public static void main(String s[]) {
    JFrame frame = new JFrame("Gestion de biblioth�que");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setJMenuBar(new TestMenuSwing1());
    frame.setSize(1000, 800);
    frame.pack();
    frame.setVisible(true);
    
  }
}