package vista;

import java.awt.Color; // Importación para manejar colores
import javax.swing.JLabel; // Importación de JLabel para etiquetas de texto
import modelo.Imagen; // Importación de la clase Imagen para manejar imágenes de los jugadores
import modelo.Jugador; // Importación de la clase Jugador
import modelo.Tablero; // Importación de la clase Tablero para el tablero del juego
import modelo.TipoImagen; // Importación para manejar tipos de imagen (por ejemplo, X y O)

/**
 * Clase FormTikTacToe que extiende JFrame, representando la ventana principal del juego Tic-Tac-Toe.
 */
public class FormTikTacToe extends javax.swing.JFrame {

    // Variables estáticas para manejar las imágenes y etiquetas de los jugadores
    public static Imagen imgJugadorEquis; 
    public static Imagen imgJugadorCirculo;
    public static JLabel nombreJugadorEquis;
    public static JLabel nombreJugadorCirculo;
    public static JLabel puntajeEquis;
    public static JLabel puntajeCirculo;
    
    // Variables privadas para representar los jugadores y el tablero del juego
    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;

    /**
     * Constructor que inicializa el formulario con los jugadores.
     * Se asignan las imágenes, nombres y puntajes de los jugadores.
     * @param jugador1 Representa al primer jugador (X).
     * @param jugador2 Representa al segundo jugador (O).
     */
    public FormTikTacToe(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1; // Asigna el primer jugador
        this.jugador2 = jugador2; // Asigna el segundo jugador
        init(); // Llama al método init para configurar el formulario
        imgJugadorEquis = jugadorEquis; // Asigna la imagen del jugador X
        imgJugadorCirculo = jugadorCirculo; // Asigna la imagen del jugador O
        nombreJugadorEquis = lblNombreJ1; // Asigna la etiqueta con el nombre del jugador X
        nombreJugadorCirculo = lblNombreJ2; // Asigna la etiqueta con el nombre del jugador O
        puntajeEquis = lblPuntajeJ1; // Asigna la etiqueta con el puntaje del jugador X
        puntajeCirculo = lblPuntajeJ2; // Asigna la etiqueta con el puntaje del jugador O
        tablero.cambiarEstilos(TipoImagen.EQUIS); // Cambia los estilos del tablero para que inicie con X
    }

    /**
     * Método init que inicializa los componentes y configuraciones del formulario.
     * Configura las propiedades visuales del formulario, como su transparencia, tamaño y posición.
     */
    public void init() {
        setUndecorated(true); // Elimina la decoración de la ventana (barra de título)
        initComponents(); // Inicializa los componentes gráficos generados por el editor de diseño
        setResizable(false); // Evita que la ventana sea redimensionada
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        panelFondo.setOpaque(false); // Hace transparente el panel de fondo
        setBackground(new Color(0, 0, 0, 0)); // Hace la ventana completamente transparente

        // Establece los nombres de los jugadores en las etiquetas correspondientes
        lblNombreJ1.setText(jugador1.getNombre());
        lblNombreJ2.setText(jugador2.getNombre());

        // Inicializa y configura el tablero
        tablero = new Tablero(); // Crea una nueva instancia del tablero
        tablero.setJugador1(jugador1); // Asigna el jugador 1 al tablero
        tablero.setJugador2(jugador2); // Asigna el jugador 2 al tablero
        tablero.setAlturaCI(100); // Define la altura de las celdas del tablero
        tablero.setAnchoCI(100); // Define el ancho de las celdas del tablero
        tablero.setMargen(5); // Define el margen entre las celdas
        tablero.setColorCI(new Color(14, 19, 43)); // Define el color de las celdas
        tablero.setColorTablero(new Color(239, 180, 255)); // Define el color de fondo del tablero
        tablero.setLocation(40, 150); // Establece la posición del tablero dentro del panel
        tablero.crearTablero(); // Crea el tablero con las configuraciones anteriores
        tablero.setVisible(true); // Hace visible el tablero

        panelFondo.add(tablero); // Añade el tablero al panel de fondo
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        // Definición de los componentes gráficos que forman la interfaz del juego
        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jugadorCirculo = new modelo.Imagen();
        jugadorEquis = new modelo.Imagen();
        lblNombreJ2 = new javax.swing.JLabel();
        lblNombreJ1 = new javax.swing.JLabel();
        lblPuntajeJ2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPuntajeJ1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); // Cierra la ventana al salir

        // Configura el panel de fondo del juego
        panelFondo.setBackground(new java.awt.Color(14, 19, 43));
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 500));
        panelFondo.setLayout(null); // Configura el layout nulo para posicionar los componentes manualmente

        // Configuración del botón de cierre (X)
        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // Configura la fuente
        lblCierre.setForeground(new java.awt.Color(240, 192, 255)); // Define el color del texto
        lblCierre.setText("X"); // El texto del botón es "X"
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Cambia el cursor al pasar por encima
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) { // Evento de clic
                lblCierreMouseClicked(evt); 
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) { // Evento cuando el mouse entra en el área del botón
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) { // Evento cuando el mouse sale del área del botón
                lblCierreMouseExited(evt);
            }
        });
        panelFondo.add(lblCierre); // Añade el botón de cierre al panel
        lblCierre.setBounds(360, 10, 30, 30); // Establece la posición y tamaño del botón

        // Configura la imagen del jugador O
        jugadorCirculo.setText("imagen1"); 
        jugadorCirculo.setRuta("/resources/JugadorCirculo.png"); // Establece la ruta de la imagen
        panelFondo.add(jugadorCirculo); 
        jugadorCirculo.setBounds(275, 50, 50, 50); // Establece la posición y tamaño de la imagen

        // Configura la imagen del jugador X
        jugadorEquis.setText("imagen1"); 
        jugadorEquis.setRuta("/resources/JugadorEquis.png"); // Establece la ruta de la imagen
        panelFondo.add(jugadorEquis);
        jugadorEquis.setBounds(75, 50, 50, 50); // Establece la posición y tamaño de la imagen

        // Configura los nombres de los jugadores
        lblNombreJ2.setFont(new java.awt.Font("Montserrat", 1, 12)); 
        lblNombreJ2.setForeground(new java.awt.Color(255, 200, 255)); 
        lblNombreJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); 
        lblNombreJ2.setText("NAME"); 
        panelFondo.add(lblNombreJ2);
        lblNombreJ2.setBounds(255, 100, 90, 30); 

        lblNombreJ1.setFont(new java.awt.Font("Montserrat", 1, 12)); 
        lblNombreJ1.setForeground(new java.awt.Color(180, 232, 255)); 
        lblNombreJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); 
        lblNombreJ1.setText("NAME");
        panelFondo.add(lblNombreJ1);
        lblNombreJ1.setBounds(55, 100, 90, 30); 

        // Configura los puntajes de los jugadores
        lblPuntajeJ2.setFont(new java.awt.Font("Montserrat", 1, 36)); 
        lblPuntajeJ2.setForeground(new java.awt.Color(255, 255, 255)); 
        lblPuntajeJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); 
        lblPuntajeJ2.setText("0");
        panelFondo.add(lblPuntajeJ2);
        lblPuntajeJ2.setBounds(210, 50, 60, 60); 

        // Configuración adicional del diseño
        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 26)); 
        jLabel8.setForeground(new java.awt.Color(255, 255, 255)); 
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); 
        jLabel8.setText("-");
        panelFondo.add(jLabel8);
        jLabel8.setBounds(190, 50, 20, 60); 

        lblPuntajeJ1.setFont(new java.awt.Font("Montserrat", 1, 36)); 
        lblPuntajeJ1.setForeground(new java.awt.Color(255, 255, 255)); 
        lblPuntajeJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); 
        lblPuntajeJ1.setText("0");
        panelFondo.add(lblPuntajeJ1);
        lblPuntajeJ1.setBounds(130, 50, 60, 60); 

        // Finalización del layout del formulario
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack(); // Empaqueta el formulario para ajustarlo a sus componentes
    }// </editor-fold>//GEN-END:initComponents

    // Evento de clic en el botón de cierre
    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {                                       
        System.exit(0); // Cierra la aplicación
    }                                      

    // Cambia el color del botón de cierre al rojo cuando se pasa el mouse
    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {                                       
        lblCierre.setForeground(Color.RED); 
    }                                      

    // Restablece el color del botón de cierre cuando el mouse sale del área del botón
    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {                                      
        lblCierre.setForeground(new Color(240, 192, 255)); 
    }                                     

    // Getters y setters para los jugadores
    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    // Variables de declaración - no modificar manualmente
    private javax.swing.JLabel jLabel8;
    private modelo.Imagen jugadorCirculo;
    private modelo.Imagen jugadorEquis;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblNombreJ1;
    private javax.swing.JLabel lblNombreJ2;
    private javax.swing.JLabel lblPuntajeJ1;
    private javax.swing.JLabel lblPuntajeJ2;
    private javax.swing.JPanel panelFondo;
    // Fin de la declaración de variables
}