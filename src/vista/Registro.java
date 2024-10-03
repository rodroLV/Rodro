
package vista;

import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.UsuarioService;

public class Registro extends javax.swing.JFrame {

    // Constructor de la clase Registro
    public Registro() {
        init(); // Llama al método init para configurar la ventana
    }

    // Método que configura la ventana
    public void init() {
        setUndecorated(true); // Elimina el borde de la ventana
        initComponents(); // Inicializa los componentes gráficos de la ventana
        setResizable(false); // No permite cambiar el tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        // Inicialización de los componentes de la ventana
        panelRegistro = new javax.swing.JPanel(); // Panel de registro
        lblCierre = new javax.swing.JLabel(); // Etiqueta para cerrar la ventana
        jLabel2 = new javax.swing.JLabel(); // Etiqueta con el título "Registro de Usuario"
        txtUsuario = new javax.swing.JTextField(); // Campo de texto para confirmar el usuario
        nuevoUsuario = new javax.swing.JTextField(); // Campo de texto para ingresar el nuevo usuario
        contraseñaNueva = new javax.swing.JTextField(); // Campo de texto para ingresar la nueva contraseña
        lblUsuario = new javax.swing.JLabel(); // Etiqueta "USUARIO"
        lblUsuario1 = new javax.swing.JLabel(); // Etiqueta "CONTRASEÑA" (confirmar contraseña)
        lblUsuario3 = new javax.swing.JLabel(); // Etiqueta "CONTRASEÑA"
        lblUsuario2 = new javax.swing.JLabel(); // Etiqueta "CONFIRMAR"
        jButton1 = new javax.swing.JButton(); // Botón para guardar el registro
        jButton2 = new javax.swing.JButton(); // Botón para cancelar el registro

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); // Configura la operación de cierre de la ventana

        // Configuración del panel principal
        panelRegistro.setBackground(new java.awt.Color(14, 19, 49)); // Color de fondo del panel
        panelRegistro.setPreferredSize(new java.awt.Dimension(416, 315)); // Dimensiones del panel
        panelRegistro.setLayout(null); // Layout nulo para poder posicionar elementos con coordenadas

        // Configuración del botón de cierre (X)
        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // Establece la fuente y tamaño del texto
        lblCierre.setForeground(new java.awt.Color(240, 192, 255)); // Establece el color del texto
        lblCierre.setText("X"); // Establece el texto a mostrar en la etiqueta
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Cambia el cursor cuando se pasa el mouse por encima
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() { // Agrega eventos de mouse
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt); // Llama al método cuando se hace clic en "X"
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt); // Cambia el color cuando el mouse entra
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt); // Cambia el color cuando el mouse sale
            }
        });
        panelRegistro.add(lblCierre); // Añade el componente al panel de registro
        lblCierre.setBounds(380, 10, 30, 30); // Posición y tamaño del componente

        // Configuración del título "Registro de Usuario"
        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 28)); // Establece la fuente y tamaño del texto
        jLabel2.setForeground(new java.awt.Color(202, 105, 220)); // Establece el color del texto
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); // Alineación centrada del texto
        jLabel2.setText("Registro de Usuario"); // Texto a mostrar
        panelRegistro.add(jLabel2); // Añade el componente al panel de registro
        jLabel2.setBounds(10, 60, 410, 36); // Posición y tamaño del componente

        // Configuración del campo de texto para confirmar el usuario
        txtUsuario.setBackground(new java.awt.Color(214, 252, 249)); // Color de fondo
        txtUsuario.setFont(new java.awt.Font("Montserrat", 1, 22)); // Fuente y tamaño del texto
        txtUsuario.setForeground(new java.awt.Color(101, 175, 245)); // Color del texto
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER); // Alineación del texto al centro
        txtUsuario.setBorder(null); // Sin borde
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() { // Agrega eventos de enfoque
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt); // Llama al método cuando el campo obtiene el foco
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt); // Llama al método cuando el campo pierde el foco
            }
        });
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() { // Agrega eventos de mouse
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseEntered(evt); // Llama al método cuando el mouse entra en el campo
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseExited(evt); // Llama al método cuando el mouse sale del campo
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() { // Agrega eventos de teclado
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt); // Llama al método cuando se escribe en el campo
            }
        });
        panelRegistro.add(txtUsuario); // Añade el componente al panel de registro
        txtUsuario.setBounds(160, 200, 150, 20); // Posición y tamaño del componente

        // Configuración del campo de texto para el nuevo usuario
        nuevoUsuario.setBackground(new java.awt.Color(214, 252, 249)); // Color de fondo
        nuevoUsuario.setFont(new java.awt.Font("Montserrat", 1, 22)); // Fuente y tamaño del texto
        nuevoUsuario.setForeground(new java.awt.Color(101, 175, 245)); // Color del texto
        nuevoUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER); // Alineación del texto al centro
        nuevoUsuario.setBorder(null); // Sin borde
        nuevoUsuario.addFocusListener(new java.awt.event.FocusAdapter() { // Agrega eventos de enfoque
            public void focusGained(java.awt.event.FocusEvent evt) {
                nuevoUsuarioFocusGained(evt); // Llama al método cuando el campo obtiene el foco
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                nuevoUsuarioFocusLost(evt); // Llama al método cuando el campo pierde el foco
            }
        });
        nuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() { // Agrega eventos de mouse
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevoUsuarioMouseEntered(evt); // Llama al método cuando el mouse entra en el campo
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevoUsuarioMouseExited(evt); // Llama al método cuando el mouse sale del campo
            }
        });
        nuevoUsuario.addKeyListener(new java.awt.event.KeyAdapter() { // Agrega eventos de teclado
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nuevoUsuarioKeyTyped(evt); // Llama al método cuando se escribe en el campo
            }
        });
        panelRegistro.add(nuevoUsuario); // Añade el componente al panel de registro
        nuevoUsuario.setBounds(160, 120, 150, 20); // Posición y tamaño del componente

        // Configuración del campo de texto para la nueva contraseña
        contraseñaNueva.setBackground(new java.awt.Color(214, 252, 249)); // Color de fondo
        contraseñaNueva.setFont(new java.awt.Font("Montserrat", 1, 22)); // Fuente y tamaño del texto
        contraseñaNueva.setForeground(new java.awt.Color(101, 175, 245)); // Color del texto
        contraseñaNueva.setHorizontalAlignment(javax.swing.JTextField.CENTER); // Alineación del texto al centro
        contraseñaNueva.setBorder(null); // Sin borde
        contraseñaNueva.addFocusListener(new java.awt.event.FocusAdapter() { // Agrega eventos de enfoque
            public void focusGained(java.awt.event.FocusEvent evt) {
                contraseñaNuevaFocusGained(evt); // Llama al método cuando el campo obtiene el foco
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                contraseñaNuevaFocusLost(evt); // Llama al método cuando el campo pierde el foco
            }
        });
        contraseñaNueva.addMouseListener(new java.awt.event.MouseAdapter() { // Agrega eventos de mouse
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contraseñaNuevaMouseEntered(evt); // Llama al método cuando el mouse entra en el campo
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                contraseñaNuevaMouseExited(evt); // Llama al método cuando el mouse sale del campo
            }
        });
        contraseñaNueva.addKeyListener(new java.awt.event.KeyAdapter() { // Agrega eventos de teclado
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contraseñaNuevaKeyTyped(evt); // Llama al método cuando se escribe en el campo
            }
        });
        panelRegistro.add(contraseñaNueva); // Añade el componente al panel de registro
        contraseñaNueva.setBounds(160, 160, 150, 20); // Posición y tamaño del componente

        // Configuración de las etiquetas "USUARIO", "CONTRASEÑA" y "CONFIRMAR"
        lblUsuario.setFont(new java.awt.Font("Montserrat", 1, 14)); // Fuente y tamaño del texto
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255)); // Color del texto
        lblUsuario.setText("USUARIO"); // Texto de la etiqueta
        panelRegistro.add(lblUsuario); // Añade el componente al panel de registro
        lblUsuario.setBounds(60, 120, 90, 20); // Posición y tamaño del componente

        lblUsuario1.setFont(new java.awt.Font("Montserrat", 1, 12)); // Fuente y tamaño del texto
        lblUsuario1.setForeground(new java.awt.Color(255, 255, 255)); // Color del texto
        lblUsuario1.setText("CONTRASEÑA"); // Texto de la etiqueta (confirmar contraseña)
        panelRegistro.add(lblUsuario1); // Añade el componente al panel de registro
        lblUsuario1.setBounds(50, 210, 110, 15); // Posición y tamaño del componente

        lblUsuario3.setFont(new java.awt.Font("Montserrat", 1, 14)); // Fuente y tamaño del texto
        lblUsuario3.setForeground(new java.awt.Color(255, 255, 255)); // Color del texto
        lblUsuario3.setText("CONTRASEÑA"); // Texto de la etiqueta
        panelRegistro.add(lblUsuario3); // Añade el componente al panel de registro
        lblUsuario3.setBounds(50, 160, 110, 18); // Posición y tamaño del componente

        lblUsuario2.setFont(new java.awt.Font("Montserrat", 1, 12)); // Fuente y tamaño del texto
        lblUsuario2.setForeground(new java.awt.Color(255, 255, 255)); // Color del texto
        lblUsuario2.setText("CONFIRMAR"); // Texto de la etiqueta
        panelRegistro.add(lblUsuario2); // Añade el componente al panel de registro
        lblUsuario2.setBounds(60, 190, 100, 20); // Posición y tamaño del componente

        // Configuración del botón "GUARDAR"
        jButton1.setText("GUARDAR"); // Texto del botón
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() { // Evento de clic del botón
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt); // Llama al método cuando se hace clic en el botón
            }
        });
        
        panelRegistro.add(jButton1); // Añade el botón al panel
        jButton1.setBounds(270, 250, 90, 23); // Establece la posición y tamaño del botón

        // Configuración del botón "CANCELAR"
        jButton2.setText("CANCELAR"); // Texto del botón
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() { // Evento de clic del botón
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt); // Llama al método cuando se hace clic en el botón
            }
        });
        panelRegistro.add(jButton2); // Añade el botón al panel
        jButton2.setBounds(50, 250, 90, 23); // Posición y tamaño del botón

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); // Crea el layout del contenedor principal
        getContentPane().setLayout(layout); // Establece el layout para el contenido
        layout.setHorizontalGroup( // Establece el grupo horizontal del layout
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup( // Establece el grupo vertical del layout
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack(); // Empaqueta los componentes dentro de la ventana
    }// </editor-fold>//GEN-END:initComponents

    // Método que se llama cuando se hace clic en la etiqueta "X" para cerrar la ventana
    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0); // Cierra la aplicación
    }

    // Método que cambia el color de la etiqueta "X" cuando el mouse entra
    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {
        lblCierre.setForeground(Color.RED); // Cambia el color del texto a rojo
    }

    // Método que restaura el color de la etiqueta "X" cuando el mouse sale
    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {
        lblCierre.setForeground(new Color(240, 192, 255)); // Restaura el color original del texto
    }

    // Eventos de enfoque, mouse y teclado para los campos de texto (vacíos en este ejemplo)
    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {}
    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {}
    private void txtUsuarioMouseEntered(java.awt.event.MouseEvent evt) {}
    private void txtUsuarioMouseExited(java.awt.event.MouseEvent evt) {}
    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {}
    private void nuevoUsuarioFocusGained(java.awt.event.FocusEvent evt) {}
    private void nuevoUsuarioFocusLost(java.awt.event.FocusEvent evt) {}
    private void nuevoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {}
    private void nuevoUsuarioMouseExited(java.awt.event.MouseEvent evt) {}
    private void nuevoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {}
    private void contraseñaNuevaFocusGained(java.awt.event.FocusEvent evt) {}
    private void contraseñaNuevaFocusLost(java.awt.event.FocusEvent evt) {}
    private void contraseñaNuevaMouseEntered(java.awt.event.MouseEvent evt) {}
    private void contraseñaNuevaMouseExited(java.awt.event.MouseEvent evt) {}
    private void contraseñaNuevaKeyTyped(java.awt.event.KeyEvent evt) {}

    // Método que se ejecuta cuando se hace clic en el botón "GUARDAR"
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        Usuario usuario1 = new Usuario(); // Crea un nuevo objeto Usuario
        usuario1.setNombre(nuevoUsuario.getText()); // Establece el nombre de usuario con el texto del campo
        usuario1.setContraseña(contraseñaNueva.getText()); // Establece la contraseña con el texto del campo

        // Instancia de UsuarioService para manejar la persistencia de datos
        UsuarioService usuarioService = new UsuarioService();

        try {
            // Intenta registrar el nuevo usuario
            usuarioService.registrarUsuario(usuario1);
            System.out.println("Usuario registrado: " + usuario1.getNombre() + " con contraseña: " + usuario1.getContraseña());
        } catch (IOException e) {
            // Si ocurre un error, se muestra un mensaje y se imprime el stack trace
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al registrar usuario.");
        }

        // Una vez registrado el usuario, se muestra la ventana de Login y se cierra la ventana actual
        Login login = new Login(); // Crea una nueva ventana de Login
        login.setVisible(true); // Hace visible la ventana de Login
        dispose(); // Cierra la ventana actual
    }

    // Método que se ejecuta cuando se hace clic en el botón "CANCELAR"
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
        Login login = new Login(); // Crea una nueva ventana de Login
        login.setVisible(true); // Hace visible la ventana de Login
        dispose(); // Cierra la ventana actual
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contraseñaNueva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JTextField nuevoUsuario;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
