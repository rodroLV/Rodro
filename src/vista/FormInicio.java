package vista; // Paquete que contiene las interfaces gráficas de la aplicación

import java.awt.Color; // Importa la clase Color para gestionar los colores en la interfaz
import javax.swing.BorderFactory; // Importa BorderFactory para crear bordes personalizados
import javax.swing.border.Border; // Importa Border para manejar los bordes de los componentes
import modelo.Jugador; // Importa la clase Jugador del modelo
import modelo.TipoImagen; // Importa la clase TipoImagen del modelo


public class FormInicio extends javax.swing.JFrame { // Clase que representa el formulario de inicio

    public FormInicio() {
        init(); // Llama al método de inicialización de componentes
    }

    public void init() {
        setUndecorated(true); // Establece que la ventana no tendrá barra de título
        initComponents(); // Inicializa los componentes del formulario
        setResizable(false); // Deshabilita la opción de redimensionar la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setBackground(new Color(0,0,0,0)); // Establece el fondo como transparente
        panelFondo.requestFocus();  // Solicita el enfoque para el panel principal
        panelFondo.setOpaque(false); // Establece el panel como transparente
        Border bordeBoton = BorderFactory.createLineBorder(new Color(243,211,246), 2); // Crea un borde personalizado para el botón
        panelBoton.setBorder(bordeBoton); // Asigna el borde personalizado al panel del botón
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        // Inicialización de componentes visuales y configuración de la interfaz
        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtJugador2 = new javax.swing.JTextField();
        txtJugador1 = new javax.swing.JTextField();
        panelBoton = new javax.swing.JPanel();
        lblInicar = new javax.swing.JLabel();
        imagen1 = new modelo.Imagen();
        imagen2 = new modelo.Imagen();
        imagen3 = new modelo.Imagen();
        imagen4 = new modelo.Imagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(14, 19, 49)); // Establece el color de fondo del panel principal
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315)); // Define el tamaño preferido del panel
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt); // Evento que se activa al presionar el mouse en el panel
            }
        });
        panelFondo.setLayout(null); // Establece el layout del panel en nulo para un posicionamiento absoluto

        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // Configura la fuente del texto
        lblCierre.setForeground(new java.awt.Color(240, 192, 255)); // Establece el color del texto
        lblCierre.setText("X"); // Establece la 'X' como texto del label para cerrar la ventana
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Establece el cursor de mano para el label
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt); // Evento que cierra la ventana cuando se hace clic en la 'X'
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt); // Evento que cambia el color del texto cuando se pasa el mouse sobre la 'X'
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt); // Evento que restaura el color del texto cuando se quita el mouse de la 'X'
            }
        });
        panelFondo.add(lblCierre); // Agrega el label al panel
        lblCierre.setBounds(380, 10, 30, 30); // Posiciona la 'X' en la esquina superior derecha

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // Configura la fuente del título
        jLabel1.setForeground(new java.awt.Color(230, 251, 255)); // Establece el color del título
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); // Centra el texto del título
        jLabel1.setText("TRES EN RAYA"); // Texto que muestra el nombre del juego
        panelFondo.add(jLabel1); // Agrega el título al panel
        jLabel1.setBounds(0, 30, 420, 45); // Posiciona el título en el panel

        // Configuración del campo de texto para el Jugador 2
        txtJugador2.setBackground(new java.awt.Color(249, 230, 254));
        txtJugador2.setFont(new java.awt.Font("Montserrat", 1, 28)); // Establece la fuente del campo de texto
        txtJugador2.setForeground(new java.awt.Color(202, 105, 220)); // Establece el color del texto
        txtJugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER); // Centra el texto dentro del campo
        txtJugador2.setText("JUGADOR2"); // Texto predeterminado en el campo
        txtJugador2.setBorder(null); // Elimina el borde por defecto del campo de texto
        txtJugador2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador2FocusGained(evt); // Evento que vacía el campo cuando obtiene el foco
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador2FocusLost(evt); // Evento que restaura el texto predeterminado cuando el campo pierde el foco
            }
        });
        txtJugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador2MouseEntered(evt); // Evento que cambia el borde cuando el mouse entra en el campo
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador2MouseExited(evt); // Evento que elimina el borde cuando el mouse sale del campo
            }
        });
        txtJugador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador2KeyTyped(evt); // Evento que limita el número de caracteres y transforma en mayúsculas
            }
        });
        panelFondo.add(txtJugador2); // Agrega el campo de texto al panel
        txtJugador2.setBounds(100, 160, 230, 40); // Posiciona el campo de texto en el panel

        // Configuración similar para el campo de texto del Jugador 1
        txtJugador1.setBackground(new java.awt.Color(214, 252, 249));
        txtJugador1.setFont(new java.awt.Font("Montserrat", 1, 28));
        txtJugador1.setForeground(new java.awt.Color(101, 175, 245));
        txtJugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador1.setText("JUGADOR1");
        txtJugador1.setBorder(null);
        txtJugador1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador1FocusLost(evt);
            }
        });
        txtJugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador1MouseExited(evt);
            }
        });
        txtJugador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador1KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador1); // Agrega el campo de texto del Jugador 1 al panel
        txtJugador1.setBounds(100, 100, 230, 40); // Posiciona el campo de texto en el panel

        // Configuración del panel para el botón "Iniciar"
        panelBoton.setBackground(new java.awt.Color(42, 22, 79));

        lblInicar.setFont(new java.awt.Font("Montserrat", 1, 20)); // Configura la fuente del texto del botón
        lblInicar.setForeground(new java.awt.Color(241, 227, 252)); // Establece el color del texto del botón
        lblInicar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); // Centra el texto dentro del botón
        lblInicar.setText("INICIAR"); // Texto del botón
        lblInicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Establece el cursor de mano para el botón
        lblInicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInicarMouseEntered(evt); // Evento que cambia el color del botón cuando se pasa el mouse
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInicarMouseExited(evt); // Evento que restaura el color del botón cuando el mouse sale
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInicarMousePressed(evt); // Evento que ejecuta la acción al presionar el botón
            }
        });

        // Añadir el layout del panel del botón y su configuración
        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelFondo.add(panelBoton); // Agrega el panel del botón al panel principal
        panelBoton.setBounds(130, 230, 160, 50); // Posiciona el panel del botón en el panel principal

        // Configuración de las imágenes que representan los jugadores y símbolos
        imagen1.setText("imagen1");
        imagen1.setRuta("/resources/Circulo.png"); // Ruta de la imagen de círculo
        panelFondo.add(imagen1); // Agrega la imagen al panel
        imagen1.setBounds(340, 160, 40, 40); // Posiciona la imagen en el panel

        imagen2.setText("imagen1");
        imagen2.setRuta("/resources/JugadorEquis.png"); // Ruta de la imagen del jugador EQUIS
        panelFondo.add(imagen2);
        imagen2.setBounds(40, 100, 40, 40); // Posiciona la imagen en el panel

        imagen3.setText("imagen1");
        imagen3.setRuta("/resources/JugadorCirculo.png"); // Ruta de la imagen del jugador CIRCULO
        panelFondo.add(imagen3);
        imagen3.setBounds(40, 160, 40, 40); // Posiciona la imagen en el panel

        imagen4.setText("imagen1");
        imagen4.setRuta("/resources/Equis.png"); // Ruta de la imagen del símbolo EQUIS
        panelFondo.add(imagen4);
        imagen4.setBounds(340, 100, 40, 40); // Posiciona la imagen en el panel

        // Layout para el contenido del JFrame
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack(); // Ajusta el tamaño de la ventana según los componentes
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0); // Cierra la aplicación cuando se hace clic en la 'X'
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED); // Cambia el color del texto a rojo cuando se pasa el mouse sobre la 'X'
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255)); // Restaura el color original cuando el mouse sale de la 'X'
    }//GEN-LAST:event_lblCierreMouseExited

    private void txtJugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(52,136,235), 2); // Crea un borde azul para el campo de texto del Jugador 1
        txtJugador1.setBorder(borde); // Asigna el borde al campo de texto
    }//GEN-LAST:event_txtJugador1MouseEntered

    private void txtJugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseExited
        txtJugador1.setBorder(null); // Elimina el borde cuando el mouse sale del campo de texto
    }//GEN-LAST:event_txtJugador1MouseExited

    private void txtJugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(165,40,174), 2); // Crea un borde púrpura para el campo de texto del Jugador 2
        txtJugador2.setBorder(borde); // Asigna el borde al campo de texto
    }//GEN-LAST:event_txtJugador2MouseEntered

    private void txtJugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseExited
        txtJugador2.setBorder(null); // Elimina el borde cuando el mouse sale del campo de texto
    }//GEN-LAST:event_txtJugador2MouseExited

    private void txtJugador1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusGained
        if (txtJugador1.getText().equals("JUGADOR1")) // Si el campo tiene el texto predeterminado "JUGADOR1"
            txtJugador1.setText(""); // Vacía el campo cuando obtiene el foco
    }//GEN-LAST:event_txtJugador1FocusGained

    private void txtJugador2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusGained
        if (txtJugador2.getText().equals("JUGADOR2")) // Si el campo tiene el texto predeterminado "JUGADOR2"
            txtJugador2.setText(""); // Vacía el campo cuando obtiene el foco
    }//GEN-LAST:event_txtJugador2FocusGained

    private void txtJugador1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusLost
        if (txtJugador1.getText().equals("")) // Si el campo está vacío al perder el foco
            txtJugador1.setText("JUGADOR1"); // Restaura el texto predeterminado "JUGADOR1"
    }//GEN-LAST:event_txtJugador1FocusLost

    private void txtJugador2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusLost
        if (txtJugador2.getText().equals("")) // Si el campo está vacío al perder el foco
            txtJugador2.setText("JUGADOR2"); // Restaura el texto predeterminado "JUGADOR2"
    }//GEN-LAST:event_txtJugador2FocusLost

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        panelFondo.requestFocus(); // Solicita el enfoque para el panel principal cuando se presiona con el mouse
    }//GEN-LAST:event_panelFondoMousePressed

    private void txtJugador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador1KeyTyped
        char caracter = Character.toUpperCase(evt.getKeyChar()); // Convierte el carácter ingresado a mayúsculas
        evt.setKeyChar(caracter); // Establece el carácter ingresado como el nuevo carácter
        if (txtJugador1.getText().length() >= 8) // Limita el número de caracteres a 8
            evt.consume(); // Descarta el carácter si se excede el límite
    }//GEN-LAST:event_txtJugador1KeyTyped

    private void txtJugador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador2KeyTyped
        char caracter = Character.toUpperCase(evt.getKeyChar()); // Convierte el carácter ingresado a mayúsculas
        evt.setKeyChar(caracter); // Establece el carácter ingresado como el nuevo carácter
        if (txtJugador2.getText().length() >= 8) // Limita el número de caracteres a 8
            evt.consume(); // Descarta el carácter si se excede el límite
    }//GEN-LAST:event_txtJugador2KeyTyped

    private void lblInicarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicarMouseEntered
        panelBoton.setBackground(new Color(126,49,196)); // Cambia el color del botón cuando el mouse pasa sobre él
    }//GEN-LAST:event_lblInicarMouseEntered

    private void lblInicarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicarMouseExited
        panelBoton.setBackground(new Color(42,22,79)); // Restaura el color original del botón cuando el mouse sale
    }//GEN-LAST:event_lblInicarMouseExited

    private void lblInicarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicarMousePressed
        this.dispose(); // Cierra la ventana actual

        Jugador jugador1 = new Jugador(TipoImagen.EQUIS); // Crea un objeto Jugador con el símbolo EQUIS
        if (txtJugador1.getText().equals("")) // Si el campo de texto del Jugador 1 está vacío
            jugador1.setNombre("JUGADOR1"); // Establece "JUGADOR1" como el nombre predeterminado
        else
            jugador1.setNombre(txtJugador1.getText()); // Establece el nombre ingresado en el campo de texto

        Jugador jugador2 = new Jugador(TipoImagen.CIRCULO); // Crea un objeto Jugador con el símbolo CIRCULO
        if (txtJugador2.getText().equals("")) // Si el campo de texto del Jugador 2 está vacío
            jugador2.setNombre("JUGADOR2"); // Establece "JUGADOR2" como el nombre predeterminado
        else
            jugador2.setNombre(txtJugador2.getText()); // Establece el nombre ingresado en el campo de texto

        FormTikTacToe tikTacToe = new FormTikTacToe(jugador1, jugador2); // Crea una nueva ventana para el juego
        tikTacToe.setVisible(true); // Muestra la ventana del juego
    }//GEN-LAST:event_lblInicarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelo.Imagen imagen1; // Imagen que representa el círculo
    private modelo.Imagen imagen2; // Imagen que representa el jugador EQUIS
    private modelo.Imagen imagen3; // Imagen que representa el jugador CIRCULO
    private modelo.Imagen imagen4; // Imagen que representa el símbolo EQUIS
    private javax.swing.JLabel jLabel1; // Título "TRES EN RAYA"
    private javax.swing.JLabel lblCierre; // Label con la 'X' para cerrar la ventana
    private javax.swing.JLabel lblInicar; // Label para iniciar el juego
    private javax.swing.JPanel panelBoton; // Panel que contiene el botón "INICIAR"
    private javax.swing.JPanel panelFondo; // Panel principal del formulario
    private javax.swing.JTextField txtJugador1; // Campo de texto para el Jugador 1
    private javax.swing.JTextField txtJugador2; // Campo de texto para el Jugador 2
    // End of variables declaration//GEN-END:variables
}
