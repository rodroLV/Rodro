package vista;

import java.awt.Color; // Importa la clase para manejar los colores en la interfaz.
import java.io.IOException; // Importa la clase para manejar errores de entrada y salida.
import javax.swing.JOptionPane; // Importa la clase para mostrar cuadros de diálogo.
import modelo.Usuario; // Importa la clase Usuario desde el modelo.
import modelo.UsuarioService; // Importa la clase UsuarioService para gestionar usuarios.


public class Login extends javax.swing.JFrame {

    // Constructor de la clase Login que inicializa los componentes de la interfaz gráfica.
    public Login() {
        init(); // Llama al método para inicializar los componentes.
    }

    // Método personalizado para la configuración inicial de la ventana.
    public void init(){
        setUndecorated(true); // Quita los bordes y botones de la ventana.
        initComponents(); // Inicializa los componentes de la interfaz gráfica.
        setResizable(false); // Desactiva la opción de redimensionar la ventana.
        setLocationRelativeTo(null); // Centra la ventana en la pantalla.
    }

    @SuppressWarnings("unchecked")
    // Este bloque contiene código generado automáticamente por el entorno de desarrollo para inicializar los componentes de la interfaz.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        // Creación e inicialización de los componentes de la interfaz.
        panelLogin = new javax.swing.JPanel(); // Panel principal del login.
        lblCierre = new javax.swing.JLabel(); // Etiqueta que actúa como botón de cierre.
        jLabel2 = new javax.swing.JLabel(); // Etiqueta para el título del formulario.
        txtUsuario = new javax.swing.JTextField(); // Campo de texto para ingresar el nombre de usuario.
        Password = new javax.swing.JPasswordField(); // Campo de texto para ingresar la contraseña.
        lblContraseña = new javax.swing.JLabel(); // Etiqueta para indicar el campo de la contraseña.
        lblUsuario = new javax.swing.JLabel(); // Etiqueta para indicar el campo del usuario.
        btnEntrar = new javax.swing.JButton(); // Botón para enviar los datos e iniciar sesión.
        jButton1 = new javax.swing.JButton(); // Botón para redirigir a la ventana de registro.

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); // Configura el comportamiento de cierre de la ventana.

        // Configuración del panel de fondo (Login).
        panelLogin.setBackground(new java.awt.Color(14, 19, 49)); // Establece el color de fondo del panel.
        panelLogin.setPreferredSize(new java.awt.Dimension(416, 315)); // Define las dimensiones del panel.
        panelLogin.setLayout(null); // Establece el layout del panel a null para posicionar componentes manualmente.

        // Configuración del botón de cierre (X).
        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // Establece la fuente y el tamaño del texto.
        lblCierre.setForeground(new java.awt.Color(240, 192, 255)); // Establece el color de la letra.
        lblCierre.setText("X"); // Texto del botón.
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Cambia el cursor al pasar sobre el botón.
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() { // Listener para manejar eventos de clic y mouse.
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt); // Llama al método que cierra la ventana.
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt); // Llama al método que cambia el color al pasar el mouse.
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt); // Llama al método que restaura el color al salir el mouse.
            }
        });
        panelLogin.add(lblCierre); // Añade el botón de cierre al panel.
        lblCierre.setBounds(380, 10, 30, 30); // Establece la posición y tamaño del botón de cierre.

        // Configuración de la etiqueta de título "Inicio de Sesión".
        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // Establece la fuente del título.
        jLabel2.setForeground(new java.awt.Color(230, 251, 255)); // Establece el color del texto del título.
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); // Alinea el texto al centro.
        jLabel2.setText("INICIO DE SESION"); // Texto del título.
        panelLogin.add(jLabel2); // Añade el título al panel.
        jLabel2.setBounds(0, 50, 420, 45); // Establece la posición y tamaño del título.

        // Configuración del campo de texto para el nombre de usuario.
        txtUsuario.setBackground(new java.awt.Color(214, 252, 249)); // Establece el color de fondo del campo.
        txtUsuario.setFont(new java.awt.Font("Montserrat", 1, 22)); // Establece la fuente y tamaño del texto.
        txtUsuario.setForeground(new java.awt.Color(101, 175, 245)); // Establece el color del texto.
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER); // Alinea el texto al centro del campo.
        txtUsuario.setBorder(null); // Elimina el borde del campo.
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() { // Listener para eventos de foco.
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt); // Método llamado cuando el campo gana el foco.
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt); // Método llamado cuando el campo pierde el foco.
            }
        });
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() { // Listener para eventos de mouse.
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseEntered(evt); // Método llamado cuando el mouse entra al campo.
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseExited(evt); // Método llamado cuando el mouse sale del campo.
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() { // Listener para eventos de teclado.
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt); // Método llamado cuando se teclea algo en el campo.
            }
        });
        panelLogin.add(txtUsuario); // Añade el campo de texto al panel.
        txtUsuario.setBounds(160, 140, 150, 30); // Establece la posición y tamaño del campo de texto.

        // Configuración del campo de contraseña.
        Password.setBackground(new java.awt.Color(202, 105, 220)); // Establece el color de fondo del campo de contraseña.
        Password.setFont(new java.awt.Font("Montserrat", 1, 20)); // Establece la fuente y tamaño del texto.
        Password.addActionListener(new java.awt.event.ActionListener() { // Listener para manejar eventos de acción.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt); // Método llamado cuando se presiona Enter en el campo de contraseña.
            }
        });
        panelLogin.add(Password); // Añade el campo de contraseña al panel.
        Password.setBounds(160, 180, 150, 30); // Establece la posición y tamaño del campo de contraseña.

        // Configuración de la etiqueta "Contraseña".
        lblContraseña.setFont(new java.awt.Font("Montserrat", 1, 14)); // Establece la fuente y tamaño del texto.
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255)); // Establece el color del texto.
        lblContraseña.setText("CONTRASEÑA"); // Texto de la etiqueta.
        panelLogin.add(lblContraseña); // Añade la etiqueta al panel.
        lblContraseña.setBounds(50, 190, 110, 18); // Establece la posición y tamaño de la etiqueta.

        // Configuración de la etiqueta "Usuario".
        lblUsuario.setFont(new java.awt.Font("Montserrat", 1, 14)); // Establece la fuente y tamaño del texto.
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255)); // Establece el color del texto.
        lblUsuario.setText("USUARIO"); // Texto de la etiqueta.
        panelLogin.add(lblUsuario); // Añade la etiqueta al panel.
        lblUsuario.setBounds(70, 150, 90, 18); // Establece la posición y tamaño de la etiqueta.

        // Configuración del botón "Entrar".
        btnEntrar.setText("ENTRAR"); // Texto del botón.
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() { // Listener para eventos de mouse.
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt); // Método llamado cuando se hace clic en el botón.
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() { // Listener para manejar eventos de acción.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt); // Método llamado cuando se ejecuta la acción del botón.
            }
        });
        panelLogin.add(btnEntrar); // Añade el botón al panel.
        btnEntrar.setBounds(280, 240, 75, 23); // Establece la posición y tamaño del botón.

        // Configuración del botón "Registrarse".
        jButton1.setText("REGISTRARSE"); // Texto del botón.
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() { // Listener para eventos de mouse.
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt); // Método llamado cuando se hace clic en el botón.
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() { // Listener para manejar eventos de acción.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt); // Método llamado cuando se ejecuta la acción del botón.
            }
        });
        panelLogin.add(jButton1); // Añade el botón al panel.
        jButton1.setBounds(60, 240, 100, 23); // Establece la posición y tamaño del botón.

        // Configuración del layout del panel principal.
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); // Define el layout para la ventana principal.
        getContentPane().setLayout(layout); // Aplica el layout al contenido de la ventana.
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack(); // Ajusta el tamaño de la ventana según los componentes.
    }// </editor-fold>//GEN-END:initComponents

    // Método que cierra la aplicación cuando se hace clic en el botón de cierre.
    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0); // Cierra la aplicación.
    }//GEN-LAST:event_lblCierreMouseClicked

    // Método que cambia el color del botón de cierre cuando se pasa el mouse sobre él.
    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED); // Cambia el color del texto a rojo.
    }//GEN-LAST:event_lblCierreMouseEntered

    // Método que restaura el color del botón de cierre cuando el mouse sale de él.
    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255)); // Restaura el color original del texto.
    }//GEN-LAST:event_lblCierreMouseExited

    // Método que se ejecuta cuando el campo de usuario gana el foco (se selecciona).
    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioFocusGained

    // Método que se ejecuta cuando el campo de usuario pierde el foco.
    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioFocusLost

    // Método que se ejecuta cuando el mouse entra en el campo de usuario.
    private void txtUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioMouseEntered

    // Método que se ejecuta cuando el mouse sale del campo de usuario.
    private void txtUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioMouseExited

    // Método que se ejecuta cuando se escribe en el campo de usuario.
    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyTyped

    // Método que se ejecuta cuando se presiona Enter en el campo de contraseña.
    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    // Método que se ejecuta cuando se presiona el botón de entrar.
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

    // Método que se ejecuta cuando se hace clic en el botón de entrar.
    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
         String nombreIngresado = txtUsuario.getText();         // Nombre de usuario ingresado.
    String contraseñaIngresada = new String(Password.getPassword());  // Contraseña ingresada.

    // Crear el objeto Usuario con los datos ingresados.
    Usuario usuario1 = new Usuario(nombreIngresado, contraseñaIngresada);

    // Instanciar el servicio de usuarios para manejar la validación.
    UsuarioService usuarioService = new UsuarioService();

    try {
        // Verificar si el usuario y contraseña ingresados existen en el archivo de persistencia.
        if (usuarioService.iniciarSesion(usuario1)) {
            // Si la validación es correcta, iniciar la siguiente ventana.
            FormInicio formInicio = new FormInicio();
            formInicio.setVisible(true); // Mostrar la ventana de inicio.
            dispose();  // Cerrar la ventana actual.
        } else {
            // Si la validación falla, mostrar mensaje de error.
            JOptionPane.showMessageDialog(this, "Usuario/Contraseña incorrecta", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
    } catch (IOException e) {
        // En caso de error al acceder al archivo de usuarios, mostrar mensaje de error.
        JOptionPane.showMessageDialog(this, "Error al acceder a los datos de usuarios", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // Imprimir la traza del error en la consola.
    }
    }//GEN-LAST:event_btnEntrarMouseClicked

    // Método que se ejecuta cuando se presiona el botón de registro.
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    // Método que se ejecuta cuando se hace clic en el botón de registro.
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Registro registro=new Registro(); // Crear una nueva instancia de la ventana de registro.
        registro.setVisible(true); // Mostrar la ventana de registro.
        dispose(); // Cerrar la ventana actual.
    }//GEN-LAST:event_jButton1MouseClicked

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password; // Campo de contraseña.
    private javax.swing.JButton btnEntrar; // Botón de entrar.
    private javax.swing.JButton jButton1; // Botón de registro.
    private javax.swing.JLabel jLabel2; // Etiqueta para el título.
    private javax.swing.JLabel lblCierre; // Etiqueta que actúa como botón de cierre.
    private javax.swing.JLabel lblContraseña; // Etiqueta para el campo de contraseña.
    private javax.swing.JLabel lblUsuario; // Etiqueta para el campo de usuario.
    private javax.swing.JPanel panelLogin; // Panel principal de la interfaz de login.
    private javax.swing.JTextField txtUsuario; // Campo de texto para ingresar el nombre de usuario.
    // End of variables declaration//GEN-END:variables
}
