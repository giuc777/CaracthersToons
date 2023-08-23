/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caractherstoons;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
/**
 *
 * @author Gadiel Us
 */
public class CaracthersToons extends JFrame{
    private JPanel Jpanel1;
    private JLabel Jlabel1;// Declaración de JPanel
    private JLabel ImageJLabel;
    private JLabel Attack;
    private String Letter = "Montserrat";
    private int red = 21;
    private int green = 59;
    private int blue = 80;
    private String AttackCaracter = "400 N";
        
   
    
 public CaracthersToons(){
    setTitle("Ventana completa");
     setSize(700, 500);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setBackground(new java.awt.Color(21, 59, 80));
     Color miColor = new Color(red, green, blue);
     Jpanel1 = new JPanel();
    setTitle("Ventana completa");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crea un JPanel con BorderLayout (puede contener otros componentes)
        Jpanel1 = new JPanel(new BorderLayout());
        Jpanel1.setBackground(new java.awt.Color(21, 59, 80));

        // Nombre del personaje
        Jlabel1 = new JLabel("Pantera rosa");
        Jlabel1.setFont(new java.awt.Font(Letter, 0, 40));
        Jlabel1.setForeground(new java.awt.Color(244, 154, 193));
        Jlabel1.setHorizontalAlignment(0);
        Jlabel1.setVerticalAlignment(1);
        //Insertamos la imagen
        ImageJLabel = new JLabel();
        ImageJLabel.setHorizontalAlignment(SwingConstants.LEFT);
        
        Icon pantera = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/panter.png")).getImage()
                .getScaledInstance(300, 300, Image.SCALE_SMOOTH));
        ImageJLabel.setIcon(pantera);
        //Ataque del personaje 
        Attack = new JLabel("Ataque: "+ AttackCaracter);
        Attack.setHorizontalAlignment(SwingConstants.CENTER);
        Attack.setFont(new java.awt.Font(Letter, 0, 25));
        Attack.setForeground(new java.awt.Color(61, 147, 156));
        
        
        // Crea un nuevo JPanel con un GridLayout de 1 fila y 2 columnas
        JPanel panelDeAtaque = new JPanel(new GridLayout(1, 2));
        panelDeAtaque.setBackground(miColor);
        
        
        //Organizar los paneles
        panelDeAtaque.add(ImageJLabel);
        panelDeAtaque.add(Attack);
        
        Jpanel1.add(Jlabel1, BorderLayout.NORTH);
        Jpanel1.add(panelDeAtaque);
        
        
        
       

        // Agrega el JPanel al JFrame
        add(Jpanel1);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         CaracthersToons ventana = new CaracthersToons();
        
        // Hacer visible la ventana
        ventana.setVisible(true);
    }
    
}