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
   private JPanel jPanel1;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JLabel jLabel5;
   private JLabel jLabel6;
   private JLabel jLabel7;
   private JLabel jLabel8;
   private JLabel jLabel9;
   private JLabel jLabel10;
   private JLabel jLabel12;
   private int red = 21;
   private int green = 59;
   private int blue = 80;
        
   
    
 public CaracthersToons(){

   

        // Crea un JPanel con BorderLayout (puede contener otros componentes)
        
        setTitle("Ventana completa");
     setSize(700, 500);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setBackground(new java.awt.Color(21, 59, 80));
     Color miColor = new Color(red, green, blue);
     jPanel1 = new JPanel();

        jPanel1.setBackground(new java.awt.Color(21, 59, 80));
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel(); 
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel12 = new JLabel();
        
        
        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 154, 193));
        jLabel1.setText("Melodía magica:");

        // Carga la imagen original
        ImageIcon panteraIcon = new ImageIcon(getClass().getResource("/Imagenes/panter.png"));

        // Escala la imagen al tamaño deseado
        ImageIcon scaledPanteraIcon = new ImageIcon(
            panteraIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)
        );
        jLabel2.setIcon(scaledPanteraIcon);

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(69, 166, 173));
        jLabel3.setText("Ataque:");

        jLabel4.setFont(new java.awt.Font("Lato", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 230, 223));
        jLabel4.setText("400N");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(69, 166, 173));
        jLabel5.setText("Defensa:");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(69, 166, 173));
        jLabel7.setText("Habilidad especial:");

        jLabel8.setBackground(new java.awt.Color(0, 204, 204));
        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(244, 154, 193));
        jLabel8.setText("Pantera Rosa");

        jLabel9.setFont(new java.awt.Font("Lato", 0, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(229, 230, 223));
        jLabel9.setText("300N");

        jLabel6.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(229, 230, 223));
        jLabel6.setText("<html>La música icónica de la Pantera Rosa puede desorientar temporalmente a sus enemigos, dándole una ventaja estratégica</html>");

        ImageIcon FlechaIzquierda = new ImageIcon(getClass().getResource("/Imagenes/FlechaIzquierda.png"));

        // Escala la imagen al tamaño deseado
        ImageIcon scaledFlechaIzquierda = new ImageIcon(
            FlechaIzquierda.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH)
        );
        jLabel10.setIcon(scaledFlechaIzquierda);

        ImageIcon FlechaDerecha = new ImageIcon(getClass().getResource("/Imagenes/FlechaDerecha.png"));

        // Escala la imagen al tamaño deseado
        ImageIcon scaledFlechaDerecha = new ImageIcon(
            FlechaDerecha.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH)
        );
        jLabel12.setIcon(scaledFlechaDerecha);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(362, 362, 362))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(131, 131, 131)
                                            .addComponent(jLabel9))))
                                .addContainerGap(170, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel7)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
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