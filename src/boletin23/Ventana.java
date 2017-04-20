/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author acomesanavila
 */
public class Ventana {
     private JFrame marco;
    private JPanel panel1, panel2;
    private JLabel nome,contra;
    private JTextField areaTexto1;
    private JTextArea areaTexto2;
    private JPasswordField contrasinal;
    private JButton premer, limpar, boton;
    private JList<String> lista;
    private String nomes[]= {"ElementoLista 1","ElementoLista 2" ,"ElementoLista 3"};  
    public Ventana() {

    }

    public void verVentana() {
        marco = new JFrame("Boletin 23");
        marco.setLayout(null);
        marco.setSize(400, 600);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Panel1
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setSize(300, 250);
        panel1.setLocation(50,25);
        panel1.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        
        //Panel 2
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setSize(300,250);
        panel2.setLocation(50,300);
        panel2.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        
        //Labels
        nome = new JLabel("nombre");
        contra = new JLabel("Contrasinal");
        nome.setSize(100, 20);
        nome.setLocation(20,20);
        contra.setSize(100, 20);
        contra.setLocation(20,50);
        panel1.add(nome);
        panel1.add(contra);
        //TextField
        areaTexto1 = new JTextField("nombre");
        areaTexto1.setSize(100, 20);
        areaTexto1.setLocation(170, 20);
        panel1.add(areaTexto1);
        
        //PassworField
        contrasinal = new JPasswordField("contrasinal");
        contrasinal.setSize(100, 20);
        contrasinal.setLocation(170,50);
        panel1.add(contrasinal);
        
        //Premer e limpiar
        premer = new JButton("Premer");
        premer.setSize(100,20);
        premer.setLocation(35,200);
        
        limpar = new JButton("Limpar");
        limpar.setSize(100,20);
        limpar.setLocation(165,200);
        panel1.add(premer);
        panel1.add(limpar);
        
        //JList
        lista = new JList<>(nomes);
        lista.setSize(119, 100);
        lista.setLocation(5,50);
        lista.setBorder(BorderFactory.createLineBorder(Color.red, 1));
        panel2.add(lista);
        
        //Boton
        boton = new JButton("Boton");
        boton.setSize(76,20);
        boton.setLocation(140,100);
        panel2.add(boton);
        
        //TextArea 2
        areaTexto2 = new JTextArea();
        areaTexto2.setSize(60, 100);
        areaTexto2.setLocation(230, 50);
        areaTexto2.setBorder(BorderFactory.createLineBorder(Color.red, 1));
        panel2.add(areaTexto2);
        
        
        marco.add(panel1);
        marco.add(panel2);
        marco.setVisible(true);
    }
}
