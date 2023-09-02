/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caractherstoons;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicSliderUI;
import javax.swing.text.Position;
/**
 *
 * @author Gadiel Us
 */


class FondoPanel extends JPanel {
    private Image Img;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Img = new ImageIcon(getClass().getResource("/Imagenes/Home.jpg")).getImage();
        g.drawImage(Img, 0, 0, this);
        setOpaque(false);
    }
}





public class Home extends JFrame {
    private JPanel jPanel1;
    private JLabel Inicio;
    private int timerPart = 600;
   
    private Image imageBackground;
    FondoPanel fondo = new FondoPanel();
    
    public void UptadeTime(){
        
        Timer timer = new Timer(timerPart, new ActionListener() {
            private boolean visible = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                visible = !visible; // Cambia la visibilidad en cada acción del temporizador
                Inicio.setVisible(visible); // Cambia la visibilidad del JLabel
            }
        });

        timer.start(); //
    }

     public Home() {
        super("Smash Toons");
        setSize(935, 584);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        jPanel1 = new JPanel();
        
        
        Inicio = new JLabel();
        jPanel1.add(Inicio);
        //jPanel1.setBackground(new java.awt.Color(21, 59, 80));
        jPanel1.setOpaque(false);
        
        ImageIcon IncioIcon = new ImageIcon(getClass().getResource("/Imagenes/Logo.png"));
        ImageIcon scaledInicioIcon = new ImageIcon(
            IncioIcon.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)
        );
        Inicio.setIcon(scaledInicioIcon);
        
        Inicio.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
               ImageIcon scaledTemp = new ImageIcon(
            IncioIcon.getImage().getScaledInstance(450, 450, Image.SCALE_SMOOTH)
                );
                Inicio.setIcon(scaledTemp);
            }
            public void  mouseExited(MouseEvent e){
                ImageIcon normal = new ImageIcon(
            IncioIcon.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)
                );
                Inicio.setIcon(normal);
            }
        
        });
        

        
        
        Timer afterOut;
        afterOut = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                CaracthersToons NewWindows = new CaracthersToons();
                NewWindows.setVisible(true);
                
            }
        });
        
        
        Inicio.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
             timerPart = 100;
             UptadeTime();
             afterOut.start();
             afterOut.setRepeats(false);
               
            }
        });
        
        Timer timer = new Timer(timerPart, new ActionListener() {
            private boolean visible = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                visible = !visible; // Cambia la visibilidad en cada acción del temporizador
                Inicio.setVisible(visible); // Cambia la visibilidad del JLabel
            }
        });

        timer.start(); //

        fondo = new FondoPanel();
        setContentPane(fondo);

        // Ajusta el diseño de los componentes dentro del marco
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(405, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(455, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(403, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        
     }
}
