package Frame;

import java.net.URL;
import javax.swing.*;
import javax.swing.event.*;

import panel.PageDowload;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
 
public class FrameTelechargement {
 
  public static void main(String[] args) {
    final JEditorPane editeur;
    BorderLayout bl = new BorderLayout();
    PageDowload pd = new PageDowload();

    
    
    JFrame f = new JFrame("ma fenetre");
    f.setBackground(new Color(0,0,0));
    f.setSize(800, 600);
    f.setLayout(bl);
    
    f.getContentPane().add(pd, BorderLayout.CENTER);
    f.pack();
    f.setVisible(true);
    
  }
}