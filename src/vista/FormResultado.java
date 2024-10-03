package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Jugador;
import modelo.Ruta;
import modelo.Tablero;
import modelo.TipoImagen;

public class FormResultado extends javax.swing.JFrame {

    // Atributos para manejar el tablero y el jugador ganador
    private Tablero tablero;
    private TipoImagen jugadorGanador;

    // Constructor de la clase que recibe el tipo de imagen del jugador ganador y el tablero
    public FormResultado(TipoImagen jugadorGanador, Tablero tablero) {
        init();  // Inicializa la ventana y los componentes
        this.tablero = tablero;  // Asigna el tablero recibido a la variable de instancia
        this.jugadorGanador = jugadorGanador;  // Asigna el tipo de imagen del jugador ganador

        // Condicional que verifica el tipo de imagen del jugador ganador
        if(jugadorGanador == TipoImagen.EQUIS) {
            imgIzquierda.setRuta(Ruta.JUGADOREQUIS);  // Establece la imagen de la izquierda como el jugador "EQUIS"
            imgDerecha.setRuta(Ruta.EQUIS);  // Establece la imagen de la derecha como el símbolo "EQUIS"
            lblNombre.setText(FormTikTacToe.nombreJugadorEquis.getText());  // Muestra el nombre del jugador "EQUIS"
        }
        else if(jugadorGanador == TipoImagen.CIRCULO) {
            imgIzquierda.setRuta(Ruta.JUGADORCIRCULO);  // Establece la imagen de la izquierda como el jugador "CÍRCULO"
            imgDerecha.setRuta(Ruta.CIRCULO);  // Establece la imagen de la derecha como el símbolo "CÍRCULO"
            lblNombre.setText(FormTikTacToe.nombreJugadorCirculo.getText());  // Muestra el nombre del jugador "CÍRCULO"
        }
        else if(jugadorGanador == TipoImagen.EMPATE) {
            imgIzquierda.setRuta(Ruta.JUGADOREQUIS);  // Establece las imágenes de ambos jugadores en caso de empate
            imgDerecha.setRuta(Ruta.JUGADORCIRCULO);
            lblNombre.setText("EMPATE");  // Muestra "EMPATE" como resultado
        }
    }

    // Método que inicializa los componentes gráficos de la ventana
    public void init() {
        setUndecorated(true);  // Elimina los bordes de la ventana
        initComponents();  // Inicializa los componentes de la interfaz gráfica
        setResizable(false);  // Evita que la ventana sea redimensionable
        setLocationRelativeTo(null);  // Centra la ventana en la pantalla
        setBackground(new Color(0,0,0,0));  // Establece un fondo transparente
        panelFondo.requestFocus();  // Pide el foco en el panel de fondo
        panelFondo.setOpaque(false);  // Establece el panel como no opaco
    }
    
    @SuppressWarnings("unchecked")
    // Método generado automáticamente para inicializar los componentes de la interfaz gráfica
    private void initComponents() {
        panelFondo = new modelo.PanelRedondeado();  // Panel personalizado con bordes redondeados
        lblCierre = new javax.swing.JLabel();  // Etiqueta para el botón de cierre "X"
        jLabel1 = new javax.swing.JLabel();  // Etiqueta para mostrar el título "VICTORIA"
        imgIzquierda = new modelo.Imagen();  // Imagen del jugador de la izquierda
        imgDerecha = new modelo.Imagen();  // Imagen del jugador de la derecha
        lblNombre = new javax.swing.JLabel();  // Etiqueta para mostrar el nombre del jugador ganador

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  // Configura el comportamiento de la ventana al cerrarse

        // Configura propiedades del panel de fondo
        panelFondo.setBackground(new java.awt.Color(14, 19, 49));  
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315));  
        panelFondo.setLayout(null);  // Usa un layout nulo para posicionamiento absoluto

        // Configura propiedades del botón de cierre "X"
        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); 
        lblCierre.setForeground(new java.awt.Color(240, 192, 255));  
        lblCierre.setText("X");  
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));  
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);  // Define acción al hacer clic
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);  // Define acción al entrar el mouse
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);  // Define acción al salir el mouse
            }
        });
        panelFondo.add(lblCierre);  // Añade el botón de cierre al panel
        lblCierre.setBounds(380, 10, 30, 30);  // Posiciona el botón de cierre

        // Configura propiedades del título "VICTORIA"
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36));  
        jLabel1.setForeground(new java.awt.Color(230, 251, 255));  
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);  
        jLabel1.setText("VICTORIA");  
        panelFondo.add(jLabel1);  
        jLabel1.setBounds(0, 30, 420, 45);  

        // Configura las imágenes del jugador de la izquierda y derecha
        imgIzquierda.setText("imagen1");  
        imgIzquierda.setRuta("/resources/JugadorEquis.png");  
        panelFondo.add(imgIzquierda);  
        imgIzquierda.setBounds(70, 100, 40, 40);  

        imgDerecha.setText("imagen1");  
        imgDerecha.setRuta("/resources/Equis.png");  
        panelFondo.add(imgDerecha);  
        imgDerecha.setBounds(310, 100, 40, 40);  

        // Configura el nombre del jugador ganador
        lblNombre.setFont(new java.awt.Font("Montserrat", 1, 20));  
        lblNombre.setForeground(new java.awt.Color(241, 227, 252));  
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);  
        lblNombre.setText("NOMBRE");  
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));  
        panelFondo.add(lblNombre);  
        lblNombre.setBounds(0, 90, 420, 50);  

        // Configuración del layout de la ventana
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());  
        getContentPane().setLayout(layout);  
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        );

        pack();  // Ajusta el tamaño de la ventana
    }

    // Evento al hacer clic en el botón de cierre "X"
    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {  
        dispose();  // Cierra la ventana
        tablero.reiniciarTablero(jugadorGanador);  // Reinicia el tablero con base en el jugador ganador
    }

    // Evento al pasar el mouse sobre el botón de cierre
    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {  
        lblCierre.setForeground(Color.RED);  // Cambia el color del texto del botón de cierre a rojo
    }

    // Evento al salir el mouse del botón de cierre
    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {  
        lblCierre.setForeground(new Color(240,192,255));  // Restaura el color original del texto del botón de cierre
    }

    // Declaración de variables de los componentes de la interfaz gráfica
    private modelo.Imagen imgDerecha;
    private modelo.Imagen imgIzquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelFondo;
}
