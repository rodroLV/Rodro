package principal; // Paquete que contiene la clase principal de la aplicación

// Importaciones de las clases necesarias para el funcionamiento de la aplicación
import vista.Login;  // Importa la clase FormInicio, que podría ser el formulario inicial del juego o aplicación.

public class Principal {

    // Método principal que sirve como punto de entrada para la ejecución del programa.
    public static void main(String[] args) {
        // Crea una instancia de la clase Login y la muestra en pantalla.
        Login login = new Login();
        login.setVisible(true); // Establece la visibilidad de la ventana de inicio de sesión.
    }
    
}