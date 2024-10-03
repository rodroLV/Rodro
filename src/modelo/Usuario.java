package modelo;

/**
 * Clase Usuario que representa a un usuario con un nombre y una contraseña.
 */
public class Usuario {
    // Atributos privados que almacenan el nombre y la contraseña del usuario
    private String nombre;
    private String contraseña;

    /**
     * Constructor por defecto de la clase Usuario.
     * Crea una instancia de Usuario sin inicializar los atributos.
     */
    public Usuario() {
    }

    /**
     * Constructor que inicializa un objeto Usuario con un nombre y una contraseña.
     * @param nombre El nombre del usuario.
     * @param contraseña La contraseña del usuario.
     */
    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre; // Asigna el nombre del usuario
        this.contraseña = contraseña; // Asigna la contraseña del usuario
    }

    /**
     * Método getter para obtener el nombre del usuario.
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para asignar el nombre del usuario.
     * @param nombre El nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener la contraseña del usuario.
     * @return La contraseña del usuario.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Método setter para asignar la contraseña del usuario.
     * @param contraseña La nueva contraseña del usuario.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}


