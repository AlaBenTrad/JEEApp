package com.jmdoudoux.test.swing.menu;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestMenuSwing1 extends JMenuBar {

  public TestMenuSwing1() {

    // Listener générique qui affiche l'action du menu utilisé
    ActionListener afficherMenuListener = new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        System.out.println("Elément de menu [" + event.getActionCommand()
            + "] utilisé.");
      }
    };

    // Création du menu livre
    JMenu livreMenu = new JMenu("Livre");
    JMenuItem item = new JMenuItem("Ajouter");
    item.addActionListener(afficherMenuListener);
    livreMenu.add(item);
    
    item = new JMenuItem("Consulter");
    item.addActionListener(afficherMenuListener);
    livreMenu.add(item);


    // Création du menu promotion
    JMenu promoMenu = new JMenu("Promotion");
    item = new JMenuItem("Ajouter");
    item.addActionListener(afficherMenuListener);
    promoMenu.add(item);
    
    item = new JMenuItem("Consulter");
    item.addActionListener(afficherMenuListener);
    promoMenu.add(item);
    
    // Création du menu Client
    JMenu cliMenu = new JMenu("Client");
    item = new JMenuItem("Ajouter");
    item.addActionListener(afficherMenuListener);
    cliMenu.add(item);
    
    item = new JMenuItem("Consulter");
    item.addActionListener(afficherMenuListener);
    cliMenu.add(item);
    
 // Création du menu autre
    JMenu autMenu = new JMenu("Autre");
    autMenu.add(item);
    
    // ajout des menus à la barre de menus
    add(livreMenu);
    add(promoMenu);
    add(cliMenu);
    add(autMenu);
  }

  public static void main(String s[]) {
    JFrame frame = new JFrame("Gestion de bibliothèque");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setJMenuBar(new TestMenuSwing1());
    frame.setSize(1000, 800);
    frame.pack();
    frame.setVisible(true);
    
  }
}