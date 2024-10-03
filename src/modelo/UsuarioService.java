package modelo;

import java.io.*; // Importaciones necesarias para trabajar con archivos
import java.util.ArrayList; // Importación para el uso de listas dinámicas
import java.util.List; // Importación de la interfaz List

/**
 * Clase UsuarioService que maneja las operaciones relacionadas con el registro, inicio de sesión y obtención de usuarios.
 * Los usuarios se almacenan en un archivo de texto.
 */
public class UsuarioService {
    // Ruta del archivo donde se almacenan los usuarios
    private static final String FILE_PATH = "usuarios.txt";

    /**
     * Método para registrar un nuevo usuario en el archivo.
     * Agrega el nombre y la contraseña del usuario en el archivo usuarios.txt.
     * @param usuario El usuario que se va a registrar.
     * @throws IOException Si ocurre un error al escribir en el archivo.
     */
    public void registrarUsuario(Usuario usuario) throws IOException {
        // FileWriter se usa para escribir en el archivo, 'true' para agregar contenido al final
        FileWriter fw = new FileWriter(FILE_PATH, true);
        BufferedWriter bw = new BufferedWriter(fw); // BufferedWriter mejora la eficiencia de escritura
        PrintWriter pw = new PrintWriter(bw); // PrintWriter permite escribir con facilidad en el archivo

        // Escribe el nombre y la contraseña del usuario en el archivo, separados por ":"
        pw.println(usuario.getNombre() + ":" + usuario.getContraseña());
        pw.close(); // Cierra el PrintWriter para liberar los recursos
    }

    /**
     * Método para verificar las credenciales del usuario y permitir el inicio de sesión.
     * Lee el archivo usuarios.txt y busca si el usuario con su contraseña existe.
     * @param usuario El usuario con las credenciales a verificar.
     * @return true si el inicio de sesión es exitoso, false en caso contrario.
     * @throws IOException Si ocurre un error al leer el archivo.
     */
    public boolean iniciarSesion(Usuario usuario) throws IOException {
        // FileReader se usa para leer el archivo
        FileReader fr = new FileReader(FILE_PATH);
        BufferedReader br = new BufferedReader(fr); // BufferedReader mejora la eficiencia de lectura
        String linea;
        boolean exito = false;

        // Lee cada línea del archivo hasta que encuentra una coincidencia con las credenciales
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(":"); // Divide la línea en nombre y contraseña
            String usuarioArchivo = datos[0]; // Nombre del usuario desde el archivo
            String contrasenaArchivo = datos[1]; // Contraseña del usuario desde el archivo

            // Verifica si el nombre y la contraseña coinciden
            if (usuarioArchivo.equals(usuario.getNombre()) && contrasenaArchivo.equals(usuario.getContraseña())) {
                exito = true;
                break; // Si se encuentra una coincidencia, se rompe el bucle
            }
        }
        br.close(); // Cierra el BufferedReader para liberar los recursos
        return exito; // Retorna si el inicio de sesión fue exitoso
    }

    /**
     * Método para obtener todos los usuarios registrados (para depuración o administración).
     * Lee el archivo usuarios.txt y devuelve una lista con todos los usuarios almacenados.
     * @return Lista de objetos Usuario con todos los usuarios registrados.
     * @throws IOException Si ocurre un error al leer el archivo.
     */
    public List<Usuario> obtenerUsuarios() throws IOException {
        List<Usuario> usuarios = new ArrayList<>(); // Lista para almacenar los usuarios
        FileReader fr = new FileReader(FILE_PATH);
        BufferedReader br = new BufferedReader(fr);
        String linea;

        // Lee cada línea del archivo y convierte los datos en objetos Usuario
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(":"); // Divide la línea en nombre y contraseña
            usuarios.add(new Usuario(datos[0], datos[1])); // Añade un nuevo Usuario a la lista
        }
        br.close(); // Cierra el BufferedReader para liberar los recursos
        return usuarios; // Retorna la lista de usuarios
    }
}
