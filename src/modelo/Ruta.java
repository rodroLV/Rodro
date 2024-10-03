package modelo;
/**
 * Clase Ruta que define las rutas de los archivos de imagen utilizados en el juego.
 * Almacena las rutas de las imágenes para los jugadores y las líneas del tablero.
 */
public class Ruta {
    // Rutas de imágenes estáticas finales para los jugadores y los símbolos X y O
    public static final String EQUIS = "/resources/Equis.png"; // Imagen del jugador que usa "X"
    public static final String CIRCULO = "/resources/Circulo.png"; // Imagen del jugador que usa "O"
    public static final String JUGADOREQUIS = "/resources/JugadorEquis.png"; // Imagen específica del jugador X
    public static final String JUGADORCIRCULO = "/resources/JugadorCirculo.png"; // Imagen específica del jugador O
    public static final String JUGADORAUXILLAR = "/resources/JugadorAuxillar.png"; // Imagen de un jugador auxiliar
    // Rutas dinámicas de las imágenes de las líneas que indican la victoria
    public static String LINEA1 = "/resources/CirculoLinea1.png"; 
    public static String LINEA2 = "/resources/CirculoLinea2.png";
    public static String LINEA3 = "/resources/CirculoLinea3.png";
    public static String LINEA4 = "/resources/CirculoLinea4.png";
    public static String LINEA5 = "/resources/CirculoLinea5.png";
    public static String LINEA6 = "/resources/CirculoLinea6.png";
    public static String LINEA7 = "/resources/CirculoLinea7.png";
    public static String LINEA8 = "/resources/CirculoLinea8.png";
    /**
     * Método que cambia las rutas de las imágenes de las líneas de victoria 
     * dependiendo del tipo de imagen (X o O) que se haya seleccionado.
     * @param tipoImagen El tipo de imagen que se utiliza (X o O).
     */
    public static void cambiarRutas(TipoImagen tipoImagen) {
        // Si el tipo de imagen es CIRCULO, asigna las rutas de las líneas para el símbolo O
        if (tipoImagen == TipoImagen.CIRCULO) {
           LINEA1 = "/resources/CirculoLinea1.png";
           LINEA2 = "/resources/CirculoLinea2.png";
           LINEA3 = "/resources/CirculoLinea3.png";
           LINEA4 = "/resources/CirculoLinea4.png";
           LINEA5 = "/resources/CirculoLinea5.png";
           LINEA6 = "/resources/CirculoLinea6.png";
           LINEA7 = "/resources/CirculoLinea7.png";
           LINEA8 = "/resources/CirculoLinea8.png";
        }
        // Si el tipo de imagen es EQUIS, asigna las rutas de las líneas para el símbolo X
        else if (tipoImagen == TipoImagen.EQUIS) {
            LINEA1 = "/resources/EquisLinea1.png";
            LINEA2 = "/resources/EquisLinea2.png";
            LINEA3 = "/resources/EquisLinea3.png";
            LINEA4 = "/resources/EquisLinea4.png";
            LINEA5 = "/resources/EquisLinea5.png";
            LINEA6 = "/resources/EquisLinea6.png";
            LINEA7 = "/resources/EquisLinea7.png";
            LINEA8 = "/resources/EquisLinea8.png";
        }
    }
}
