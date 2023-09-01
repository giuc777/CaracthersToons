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
import java.awt.Component;

import java.awt.Dimension;
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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicSliderUI;
import javax.swing.text.Position;
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
   private JButton jButton1;
   private JButton jButton2;
   private JScrollPane jScrollPane1;
   private JTextPane jTextPane1;
   
   
   private int Position = 0;
//Objetos de Personajes
   private Caracthers PanteraRosa = new Caracthers(
           "Pantera Rosa",
           "400N", "300N", 
           "/Imagenes/panter.png", 
           "Melodía magica:", 
           "La música icónica de la Pantera Rosa puede desorientar temporalmente a sus enemigos, dándole una ventaja estratégica",
           244, 154, 193);
   private Caracthers PabloCientifico = new Caracthers("Pablo el científico", "500N", "200N", "/Imagenes/PabloCinetific.png", "Portal Cinetifico", "Coloca un portal en un lugar estratégico del escenario. Pablo puede teletransportarse instantáneamente a través de este portal, lo que le permite moverse rápidamente y sorprender a sus oponentes.", 249, 227, 76);
        
   private Caracthers Shaggy = new Caracthers("Shaggy", "400N", "250N", "/Imagenes/Shaggy.png", "Ultra instinct", "Shaggy se vuelve invencible por 6 segundos y aumenta su ataque en un 10%. En este estado, tiene saltos infinitos, pero pierde agilidad.", 167, 212, 1);
   private Caracthers VacaYPollito = new Caracthers("Vaca y Pollito", "500N", "150N", "/Imagenes/VacaPollito.png","Combo de Hermanos" ,"La Vaca carga hacia adelante con el Pollito enfrente a gran velocidad, embistiendo a los oponentes en su camino. Los oponentes golpeados por el Pollito sufren daño y son lanzados al aire. Luego, rematan en el aire a los oponentes.", 250, 233, 160);
   private Caracthers Dexter = new Caracthers("Dexter", "500N", "200N", "/Imagenes/Dexter.png", "Campo de Fuerza","Dexter puede activar un campo de fuerza temporal que lo protege de los ataques entrantes y reduce el daño recibido en un 50% mientras está activo. Si está en equipo, todos sus integrantes reciben el escudo. El campo de fuerza dura 8 segundos.", 248, 157, 0);
   private Caracthers Tom = new Caracthers("Tom", "500N", "300N", "/Imagenes//Tom.png","Colocación de Trampas" ,"Tom puede colocar trampas en el suelo o en lugares estratégicos del escenario. Estas trampas pueden variar desde trampas de ratón clásicas hasta trampas más elaboradas, como redes o cañones.", 147, 154, 162);
   private Caracthers Jerry = new Caracthers("Jerry", "600N", "100N", "/Imagenes/Jerry.png","Movimiento Rápido", "Jerry puede moverse a gran velocidad durante un corto período de tiempo, esquivando todo a su paso. Puede dar saltos super largos y la activación de Escudo es más rápida. Por último, lanza pedazos de queso que ralentizan a los rivales en un breve periodo de tiempo. La habilidad dura 6 segundos.", 254, 209, 123);
   private Caracthers Gumball = new Caracthers("Gumball", "600N", "200N", "/Imagenes/Gumballpng.png", "Transformación Aleatoria", "Gumball se transforma en un personaje aleatorio por un breve período de tiempo, cada transformación otorga diferentes habilidades y ataques especiales. Puede transformarse en varios personajes de la serie, como un globo, un dinosaurio, o cualquier otra cosa inesperada de Elmore.", 82, 202, 220);
   private Caracthers JorgeCurioso = new Caracthers("Jorge el Curioso", "700N", "100N", "/Imagenes/Jorge.png", "Selva Curiosa", "Convierte temporalmente el entorno en una selva exuberante y misteriosa, creando un nuevo campo de batalla. Liadas aparecen en la selva, permitiendo a Jorge columpiarse rápidamente de una liana a otra. Esto aumenta significativamente su movilidad y le permite moverse rápidamente por el campo de batalla.", 152, 90, 68);
   private Caracthers Lich = new Caracthers("Lich", "600N", "400N", "/Imagenes/Lich.png", "Maldición Oscura", "Todos los oponentes cercanos quedan malditos, lo que reduce temporalmente su velocidad y precisión, además de infligir daño gradual. En el estado de maldito un ataque del Lich multiplica el daño por 2. Si un enemigo tiene un daño grave la maldición lo saca de combate", 126, 205, 107);
   private Caracthers Aang = new Caracthers("Aang", "800N", "100N", "/Imagenes/Avatar_Aang.png", "Dominio de los cuatro elementos", "Puede realizar ataques especiales únicos basados en cada elemento. Por ejemplo, puede crear olas de agua gigantes, lanzar rocas gigantes con telequinesis, generar ráfagas de fuego ardiente o crear tornados de aire devastadores. Mientras está en este estado, Aang gradualmente recupera salud. Duración de 7 segundos.", 149, 190, 228);
   private Caracthers Popeye = new Caracthers("Popeye", "500N", "500N", "/Imagenes/Popeye.png", "Energía de Espinaca", "Después de comer su espinaca obtiene una gran fuerza multiplicando su fuerza por 3 y el daño se reducido a 0.Sin embargo, si puede llegar a sufrir daño, pero su resistencia aumenta. Su fuerza dura 4 segundos.", 239, 65, 48);
   private Caracthers SamuraiJack = new Caracthers("Samurai Jack", "800N", "100N", "/Imagenes/SamuraiJack.png", "Maestro de la Espada", "Después de comer su espinaca obtiene una gran fuerza multiplicando su fuerza por 3 y el daño se reducido a 0.Sin embargo, si puede llegar a sufrir daño, pero su resistencia aumenta. Su fuerza dura 4 segundos", 240, 229, 159);
   private Caracthers Billy = new Caracthers("Billy", "400N", "600N", "/Imagenes/billy.png", "Grito Sónico ", "El grito de Billy puede aturdir temporalmente por 3 segundos a los oponentes cercanos, aumenta su fuerza en un 20%.  Si Billy tiene aliados en el juego, su grito puede otorgarles un aumento temporal de velocidad o fuerza de 7 segundos", 248, 25, 34);
   private Caracthers Mandy = new Caracthers("Mandy", "600N", "600N", "/Imagenes/mandy.png", "Mirada Penetrante", "Mandy manda un hechizo con su mirada que desorienta completamente a los enemigos, haciendo que sus movimientos cambien por completo por 5 segundos. ¿Porque golpeas y no saltas? ", 254, 231, 117);
   private Caracthers Huesos = new Caracthers("Huesos", "800N", "100N", "/Imagenes/huesos1.png", "Guadaña de la muerte", "La poderosa guadaña de Huesos se vuelve gigante que puede hacer un gran daño en área esta puede dar dos golpes. ¿Podrás escapar? ", 245, 205, 107);
   private Caracthers Bugsbunny = new Caracthers("Bugs Bunny", "700N", "300N", "/Imagenes/Bugs-Bunny.png", "¿Quién soy?", "Crea clones de sí mismo por todo el campo de batalla, los cuales lo ayudaran a derrotar a los enemigos además de ganar agilidad por 8 segundos. Aun fuera de batalla sus clones siguen a menos que los derrotes. Los clones se eliminarán al terminar los 8 segundos ", 151, 151, 151);
   private Caracthers Clifford = new Caracthers("Clifford El Gran Perro", "900N", "50N", "/Imagenes/clifford.png", "¡Que gigante!", "Clifford reduce el tamaña de todos los enemigos por un tiempo en el cual sus atributos son bajos considerablemente. Su habilidad dura 5 segundos.", 225, 58, 62);
   private Caracthers BobConstructor = new Caracthers("Bob el Constructor", "500N", "700N", "/Imagenes/BobConstructor.png", "Construcción Maestra", "Toma a los enemigos más cercanos y construye una casa con dinamita la cual infligirá un daño masivo sobre los enemigos, al terminar de la casa salen ítems de los cuales cualquier personaje puede tomar.", 255, 229, 39);
   private Caracthers Rex = new Caracthers("Rex", "800N", "300N", "/Imagenes/Rex.png", "Rayo Cibernético", "El rayo láser puede atravesar múltiples objetivos en línea recta antes de explotar en un área, lo que permite dañar a varios oponentes a la vez. Los enemigos alcanzados por el rayo se vuelven lentos por un periodo de 5 segundos. Aunque hayan muerto.", 126, 205, 107);
   private Caracthers Barney = new Caracthers("Barney", "700N", "400N", "/Imagenes/Barney.png", "Abrazo de Amistad", "Todos los aliados cercanos experimentan una curación gradual de su salud durante la duración de la habilidad y los hace más resistentes a efectos negativos como aturdimiento o debilitamiento. La habilidad dura 5 segundos.", 202, 48, 144);
   private Caracthers Pocoyo = new Caracthers("Pocoyo", "500N", "500N", "/Imagenes/Pocoyo.png", "El Globo de Pocoyo: ", "Pocoyo infla un globo gigante con su aliento y lo lanza contra su oponente, causándole daño y empujándolo hacia atrás. Existen tres tipos de Globos, Rojo: Daño mortal capaz de KO a los enemigos, Azul: Daño menor pero restauración de vida a los oponentes, Verde: Daño menor pero con aturdimiento a los enemigos.", 84, 164, 214);
   private Caracthers Finn = new Caracthers("Finn", "800N", "100N", "/Imagenes/Finn.png", "Espada de Pasto", "Aparece la espada de pasto y Finn usa la espada de pasto para crear diferentes formas y ataques con ella, como una lanza, un escudo, una red, una cuerda, etc. Por 7 segundos", 255, 255, 255);
   private Caracthers Bluey = new Caracthers("Bluey", "1000N", "1000N", "/Imagenes/Bluey.png", "Ha llegado Kamisama", "Bluey destruye todo a su paso porque es Good XD", 217, 185, 84);
   private Caracthers Coraje = new Caracthers("Coraje", "500N", "500N", "/Imagenes/Coraje.png", "Grito de Coraje", "Coraje emite un grito tan fuerte y agudo que puede romper objetos, aturdir a sus enemigos y mutiplica su fuerza por 2 por 6 segundos", 255, 183, 206);
   private Caracthers Pulga = new Caracthers("La Pulga", "800N", "200N", "/Imagenes/Pulga.png", "Piquete de Pulga", " La pulga cambia su ataque el cual consiste en que cada vez que un enemigo es picado, obtiene sangrado lo que hace daño constante y aumenta el daño en un 5% de otros ataques. Por cada piquete aumenta otros 5% y puede llegar hasta 50%. Además la Pulga recupera vida por el porcentaje de sangrado. Su habilidad dura 7 segundos", 174, 163, 141);


   //Plantilla
   private Caracthers Plantilla = new Caracthers("Aang", "800N", "100N", "/Imagenes/Avatar_Aang.png", "", "", 126, 205, 107);
   //24 ultimo conteo
   //faltan 1
   
   private Caracthers[] personajes = new Caracthers[]{Barney, Shaggy, VacaYPollito, Dexter, Tom, Jerry, Gumball, JorgeCurioso, Lich, PanteraRosa, Aang, Popeye, SamuraiJack, Billy, Mandy, Huesos, Bugsbunny, Clifford, BobConstructor, Rex, PabloCientifico, Pocoyo, Finn, Coraje, Pulga, Bluey};
   private Caracthers prueba = personajes[Position];
   
   
public void setAumentPosition(int max){
    if(Position == max -1 ){
        Position = 0;
    }else{
        Position = Position + 1;
    }
    
    updateCharacterDetails();
};

public void setDecrementPosition(int max) {
    if(Position == 0 ){
        Position = max -1;
    }else{
        Position = Position - 1;
    }
        updateCharacterDetails();
        
};

public void updateCharacterDetails() {
        Caracthers personajeActual = personajes[Position];
       
        jLabel8.setText(personajeActual.getName());
        // Actualiza otros componentes con datos del personaje actual
        // ...

        // Actualiza la imagen
        ImageIcon panteraIcon = new ImageIcon(getClass().getResource(personajeActual.getImagen()));
        ImageIcon scaledPanteraIcon = new ImageIcon(
            panteraIcon.getImage().getScaledInstance(300, 350, Image.SCALE_SMOOTH)
        );
        jLabel2.setIcon(scaledPanteraIcon);
        
        jLabel2.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
               ImageIcon scaledTemp = new ImageIcon(
            panteraIcon.getImage().getScaledInstance(330, 390, Image.SCALE_SMOOTH)
                );
                jLabel2.setIcon(scaledTemp);
            }
            public void  mouseExited(MouseEvent e){
                ImageIcon normal = new ImageIcon(
            panteraIcon.getImage().getScaledInstance(300, 350, Image.SCALE_SMOOTH)
                );
                jLabel2.setIcon(normal);
            }
        
        });

        // Actualiza el texto de Ataque y Defensa
        jLabel4.setText(personajeActual.getAtaque());
        jLabel9.setText(personajeActual.getDefensa());

        // Actualiza la Habilidad Especial
        jLabel1.setText(personajeActual.getTituloAtaqueEspecial());
        jLabel6.setText("<html>" + personajeActual.getAtaqueEspecial() + "</html>");

        // Cambia el color de algunos componentes
        Color miColor = new Color(personajeActual.getRed(), personajeActual.getGreen(), personajeActual.getBlue());
        jLabel8.setForeground(miColor);
        jLabel1.setForeground(miColor);
        
        
    }
   

public void SearchCharacter(String Character){
   int NoPosition = -1;
   for(int i = 0; i < personajes.length; i++){
       if(personajes[i].getName().equals(Character)){
           Position = i;
           NoPosition = i;
           break;
       }
   }
   
   if(NoPosition != -1){
       updateCharacterDetails();
   }else{
       JOptionPane.showMessageDialog(null, "No se encontro al personaje " + Character);
   }
   
}

public void RandomCharacter(int max){
    Random random = new Random();
    int numRandom = random.nextInt(max);
    Position = numRandom;
    updateCharacterDetails();
    
}
   
    
 public CaracthersToons(){
   
   int Max = personajes.length;
// Crea un JPanel con BorderLayout (puede contener otros componentes)
        
     setTitle("Smash Toons");
     setSize(700, 500);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setBackground(new java.awt.Color(0, 48, 96));
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
        jButton1 = new JButton();
        jButton2 = new JButton();
        jScrollPane1 = new JScrollPane();
        jTextPane1 = new JTextPane();
        
        // Carga la imagen original
        ImageIcon panteraIcon = new ImageIcon(getClass().getResource(prueba.getImagen()));

        // Escala la imagen al tamaño deseado
        ImageIcon scaledPanteraIcon = new ImageIcon(
            panteraIcon.getImage().getScaledInstance(300, 350, Image.SCALE_SMOOTH)
        );
        //jLabel2 Imagen
        jLabel2.setIcon(scaledPanteraIcon);
        
        jLabel2.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
               ImageIcon scaledTemp = new ImageIcon(
            panteraIcon.getImage().getScaledInstance(330, 390, Image.SCALE_SMOOTH)
                );
                jLabel2.setIcon(scaledTemp);
            }
            public void  mouseExited(MouseEvent e){
                ImageIcon normal = new ImageIcon(
            panteraIcon.getImage().getScaledInstance(300, 350, Image.SCALE_SMOOTH)
                );
                jLabel2.setIcon(normal);
            }
        
        });
        
        //jLabel8 = Nombre
        jLabel8.setBackground(new java.awt.Color(0, 204, 204));
        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(prueba .getRed(), prueba.getGreen(), prueba.getBlue()));
        jLabel8.setText(prueba.getName());
        
        
        jLabel3.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(69, 166, 173));
        jLabel3.setText("Ataque:");

        //jLbel14 = Ataque
        jLabel4.setFont(new java.awt.Font("Lato", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 230, 223));
        jLabel4.setText(prueba.getAtaque());

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(69, 166, 173));
        jLabel5.setText("Defensa:");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(69, 166, 173));
        jLabel7.setText("Habilidad especial:");
        
        //jLabel 1 Ataque Especial
        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(prueba.getRed(), prueba.getGreen(), prueba.getBlue()));
        jLabel1.setText(prueba.getTituloAtaqueEspecial());


        

        //jLabel19 = defensa
        jLabel9.setFont(new java.awt.Font("Lato", 0, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(229, 230, 223));
        jLabel9.setText("300N");

        //jLabel6 = Descripción del ataque
        jLabel6.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(229, 230, 223));
        jLabel6.setText("<html>"+ prueba.getAtaqueEspecial()+"</html>");

        ImageIcon FlechaIzquierda = new ImageIcon(getClass().getResource("/Imagenes/FlechaIzquierda.png"));

        // Escala la imagen al tamaño deseado
        ImageIcon scaledFlechaIzquierda = new ImageIcon(
            FlechaIzquierda.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH)
        );
        //Retroceder
        jLabel10.setIcon(scaledFlechaIzquierda);
        jLabel10.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            setDecrementPosition(Max); // Llama al método de instancia de la clase CaracthersToons
            }
        });
        
        ImageIcon FlechaDerecha = new ImageIcon(getClass().getResource("/Imagenes/FlechaDerecha.png"));

        // Escala la imagen al tamaño deseado
        ImageIcon scaledFlechaDerecha = new ImageIcon(
            FlechaDerecha.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH)
        );
        //Avanzar
        jLabel12.setIcon(scaledFlechaDerecha);
        jLabel12.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent e) {
            setAumentPosition(Max); // Llama al método de instancia de la clase CaracthersToons
            }
        });
        //Botones
        jButton1.setBackground(new java.awt.Color(66, 158, 166));
        jButton1.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jButton1.setText("Personaje Random");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String CharactertoSearch = jTextPane1.getText();
                RandomCharacter(Max);
            }
        });
        
        
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);
        jButton2.setBackground(new java.awt.Color(204, 153, 141));
        jButton2.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String CharactertoSearch = jTextPane1.getText();
                SearchCharacter(CharactertoSearch);
            }
        });

 

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(362, 362, 362))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(131, 131, 131)
                                            .addComponent(jLabel9)))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(86, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(139, 139, 139))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
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
        
         Home ventana = new Home();
        
        // Hacer visible la ventana
        ventana.setVisible(true);
    }

   
    
}